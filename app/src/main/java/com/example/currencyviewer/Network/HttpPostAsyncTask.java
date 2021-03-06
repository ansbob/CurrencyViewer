package com.example.currencyviewer.Network;

import android.os.AsyncTask;
import android.util.Log;

import com.example.currencyviewer.Interfaces.ResponseHttpAsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class HttpPostAsyncTask extends AsyncTask<String, Void, String> {

    private static final String TAG = "HttpPostAsyncTask";
    private ResponseHttpAsyncTask mDefiant;
    private static final String NOT_ACTIVATED = "not activated";
    private String URL = "";

    public HttpPostAsyncTask(ResponseHttpAsyncTask defiant) {
        mDefiant = defiant;
    }

    @Override
    protected String doInBackground(String... params) {

        try {
            URL url = new URL(params[0]);
            URL = params[0];

            Log.i(TAG, params[0]);

            //create the urlConnection
            HttpURLConnection urlConnection = (HttpURLConnection)
                    url.openConnection();

            urlConnection.setDoInput(true);

            urlConnection.setRequestProperty("Content-Type", "application/json");
            //Изменено
            urlConnection.setRequestMethod("GET");

            int statusCode = urlConnection.getResponseCode();

            Log.i(TAG, statusCode +  "");

            if (statusCode == 200) {
                InputStream inputStream = new BufferedInputStream(urlConnection.getInputStream());
                String response = convertInputStreamToString(inputStream);
                Log.i(TAG, response);
                return response;
            }

        } catch (Exception e) {
            Log.e(TAG, e.getLocalizedMessage());
        }

        return NOT_ACTIVATED;
    }

    @Override
    protected void onPostExecute(String response) {
        try {
            if (!response.equals(NOT_ACTIVATED))
                mDefiant.afterFinishingHttpPostAsyncTask(response);
            else
                mDefiant.afterFinishingHttpPostAsyncTask(null);
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage());
        }
    }

    private String convertInputStreamToString(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        String line;
        try {
            while((line = bufferedReader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
