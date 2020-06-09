package com.example.currencyviewer.Fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.currencyviewer.Interfaces.ResponseHttpAsyncTask;
import com.example.currencyviewer.Network.HttpPostAsyncTask;
import com.example.currencyviewer.Network.RequestUrls;
import com.example.currencyviewer.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class HalykFragment extends Fragment implements ResponseHttpAsyncTask {
    private static final String TAG = "HalykFragment";

    private JSONObject responseData;

    private Button privatePersonsBtn;
    private Button legalPersonsBtn;
    private Button crossCoursesBtn;
    private Button cardsBtn;

    private TextView sellTextView, sellTextView2, sellTextView3, sellTextView4
            , sellTextView5, sellTextView6, sellTextView7;
    private TextView proportionTextView, proportionTextView2, proportionTextView3, proportionTextView4
            , proportionTextView5, proportionTextView6, proportionTextView7;
    private TextView buyTextView, buyTextView2, buyTextView3, buyTextView4
            , buyTextView5, buyTextView6, buyTextView7;
    private TextView dateTextView;

    private String privatePersons;
    private String legalPersons;
    private String crossCourses;
    private String cards;

    private JSONObject privatePersonsObject;
    private JSONObject legalPersonsObject;
    private JSONObject crossCourseObject;
    private JSONObject cardsObject;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.halyk, container, false);

        privatePersonsBtn = v.findViewById(R.id.firstPageButton);
        legalPersonsBtn = v.findViewById(R.id.secondPageButton);
        crossCoursesBtn = v.findViewById(R.id.thirdPageButton);
        cardsBtn = v.findViewById(R.id.fourthPageButton);

        sellTextView = v.findViewById(R.id.sell);
        sellTextView2 = v.findViewById(R.id.sell2);
        sellTextView3 = v.findViewById(R.id.sell3);
        sellTextView4 = v.findViewById(R.id.sell4);
        sellTextView5 = v.findViewById(R.id.sell5);
        sellTextView6 = v.findViewById(R.id.sell6);
        sellTextView7 = v.findViewById(R.id.sell7);

        proportionTextView = v.findViewById(R.id.proportion);
        proportionTextView2 = v.findViewById(R.id.proportion2);
        proportionTextView3 = v.findViewById(R.id.proportion3);
        proportionTextView4 = v.findViewById(R.id.proportion4);
        proportionTextView5 = v.findViewById(R.id.proportion5);
        proportionTextView6 = v.findViewById(R.id.proportion6);
        proportionTextView7 = v.findViewById(R.id.proportion7);

        buyTextView = v.findViewById(R.id.buy);
        buyTextView2 = v.findViewById(R.id.buy2);
        buyTextView3 = v.findViewById(R.id.buy3);
        buyTextView4 = v.findViewById(R.id.buy4);
        buyTextView5 = v.findViewById(R.id.buy5);
        buyTextView6 = v.findViewById(R.id.buy6);
        buyTextView7 = v.findViewById(R.id.buy7);

        dateTextView = v.findViewById(R.id.date);

        privatePersonsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    sellTextView.setText(privatePersonsObject.getJSONObject("USD/KZT").getString("sell"));
                    sellTextView2.setText(privatePersonsObject.getJSONObject("EUR/KZT").getString("sell"));
                    sellTextView3.setText(privatePersonsObject.getJSONObject("RUB/KZT").getString("sell"));
                    sellTextView4.setText(privatePersonsObject.getJSONObject("GBP/KZT").getString("sell"));
                    sellTextView5.setText(privatePersonsObject.getJSONObject("CHF/KZT").getString("sell"));
                    sellTextView6.setText(privatePersonsObject.getJSONObject("CNY/KZT").getString("sell"));
                    sellTextView7.setText("");

                    proportionTextView.setText("USD/KZT");
                    proportionTextView2.setText("EUR/KZT");
                    proportionTextView3.setText("RUB/KZT");
                    proportionTextView4.setText("GBP/KZT");
                    proportionTextView5.setText("CHF/KZT");
                    proportionTextView6.setText("CNY/KZT");
                    proportionTextView7.setText("");

                    buyTextView.setText(privatePersonsObject.getJSONObject("USD/KZT").getString("buy"));
                    buyTextView2.setText(privatePersonsObject.getJSONObject("EUR/KZT").getString("buy"));
                    buyTextView3.setText(privatePersonsObject.getJSONObject("RUB/KZT").getString("buy"));
                    buyTextView4.setText(privatePersonsObject.getJSONObject("GBP/KZT").getString("buy"));
                    buyTextView5.setText(privatePersonsObject.getJSONObject("CHF/KZT").getString("buy"));
                    buyTextView6.setText(privatePersonsObject.getJSONObject("CNY/KZT").getString("buy"));
                    buyTextView7.setText("");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        legalPersonsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    sellTextView.setText(legalPersonsObject.getJSONObject("USD/KZT").getString("sell"));
                    sellTextView2.setText(legalPersonsObject.getJSONObject("EUR/KZT").getString("sell"));
                    sellTextView3.setText(legalPersonsObject.getJSONObject("RUB/KZT").getString("sell"));
                    sellTextView4.setText(legalPersonsObject.getJSONObject("GBP/KZT").getString("sell"));
                    sellTextView5.setText(legalPersonsObject.getJSONObject("CHF/KZT").getString("sell"));
                    sellTextView6.setText(legalPersonsObject.getJSONObject("XAU/KZT").getString("sell"));
                    sellTextView7.setText(legalPersonsObject.getJSONObject("XAG/KZT").getString("sell"));

                    proportionTextView.setText("USD/KZT");
                    proportionTextView2.setText("EUR/KZT");
                    proportionTextView3.setText("RUB/KZT");
                    proportionTextView4.setText("GBP/KZT");
                    proportionTextView5.setText("CHF/KZT");
                    proportionTextView6.setText("XAU/KZT");
                    proportionTextView7.setText("XAG/KZT");

                    buyTextView.setText(legalPersonsObject.getJSONObject("USD/KZT").getString("buy"));
                    buyTextView2.setText(legalPersonsObject.getJSONObject("EUR/KZT").getString("buy"));
                    buyTextView3.setText(legalPersonsObject.getJSONObject("RUB/KZT").getString("buy"));
                    buyTextView4.setText(legalPersonsObject.getJSONObject("GBP/KZT").getString("buy"));
                    buyTextView5.setText(legalPersonsObject.getJSONObject("CHF/KZT").getString("buy"));
                    buyTextView6.setText(legalPersonsObject.getJSONObject("XAU/KZT").getString("buy"));
                    buyTextView7.setText(legalPersonsObject.getJSONObject("XAG/KZT").getString("buy"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        crossCoursesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    sellTextView.setText(crossCourseObject.getJSONObject("EUR/USD").getString("sell"));
                    sellTextView2.setText(crossCourseObject.getJSONObject("USD/RUB").getString("sell"));
                    sellTextView3.setText(crossCourseObject.getJSONObject("GBP/USD").getString("sell"));
                    sellTextView4.setText(crossCourseObject.getJSONObject("USD/CHF").getString("sell"));
                    sellTextView5.setText(crossCourseObject.getJSONObject("XAU/USD").getString("sell"));
                    sellTextView6.setText(crossCourseObject.getJSONObject("XAG/USD").getString("sell"));
                    sellTextView7.setText("");

                    proportionTextView.setText("EUR/USD");
                    proportionTextView2.setText("USD/RUB");
                    proportionTextView3.setText("GBP/USD");
                    proportionTextView4.setText("USD/CHF");
                    proportionTextView5.setText("XAU/USD");
                    proportionTextView6.setText("XAG/USD");
                    proportionTextView7.setText("");

                    buyTextView.setText(crossCourseObject.getJSONObject("EUR/USD").getString("buy"));
                    buyTextView2.setText(crossCourseObject.getJSONObject("USD/RUB").getString("buy"));
                    buyTextView3.setText(crossCourseObject.getJSONObject("GBP/USD").getString("buy"));
                    buyTextView4.setText(crossCourseObject.getJSONObject("USD/CHF").getString("buy"));
                    buyTextView5.setText(crossCourseObject.getJSONObject("XAU/USD").getString("buy"));
                    buyTextView6.setText(crossCourseObject.getJSONObject("XAG/USD").getString("buy"));
                    buyTextView7.setText("");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        cardsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    sellTextView.setText(cardsObject.getJSONObject("USD/KZT").getString("sell"));
                    sellTextView2.setText(cardsObject.getJSONObject("EUR/KZT").getString("sell"));
                    sellTextView3.setText(cardsObject.getJSONObject("RUB/KZT").getString("sell"));
                    sellTextView4.setText(cardsObject.getJSONObject("CNY/KZT").getString("sell"));
                    sellTextView5.setText(cardsObject.getJSONObject("KGS/KZT").getString("sell"));
                    sellTextView6.setText(cardsObject.getJSONObject("GBP/KZT").getString("sell"));
                    sellTextView7.setText("");

                    proportionTextView.setText("USD/KZT");
                    proportionTextView2.setText("EUR/KZT");
                    proportionTextView3.setText("RUB/KZT");
                    proportionTextView4.setText("CNY/KZT");
                    proportionTextView5.setText("KGS/KZT");
                    proportionTextView6.setText("GBP/KZT");
                    proportionTextView7.setText("");

                    buyTextView.setText(cardsObject.getJSONObject("USD/KZT").getString("buy"));
                    buyTextView2.setText(cardsObject.getJSONObject("EUR/KZT").getString("buy"));
                    buyTextView3.setText(cardsObject.getJSONObject("RUB/KZT").getString("buy"));
                    buyTextView4.setText(cardsObject.getJSONObject("CNY/KZT").getString("buy"));
                    buyTextView5.setText(cardsObject.getJSONObject("KGS/KZT").getString("buy"));
                    buyTextView6.setText(cardsObject.getJSONObject("GBP/KZT").getString("buy"));
                    buyTextView7.setText("");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        HttpPostAsyncTask endPoint1 = new HttpPostAsyncTask(this);
        endPoint1.execute(RequestUrls.END_POINT1);
    }

    @Override
    public void afterFinishingHttpPostAsyncTask(String response) throws JSONException {
        JSONObject responseData = new JSONObject(response);
        String dateTitle = "";

        if (responseData.getString("result").equals("true")) {
            try {
                JSONObject currencyHistory = responseData.getJSONObject("data").getJSONObject("currencyHistory");

                int i = 0;
                while (true) {
                    try {
                        if (!currencyHistory.getString(i + "").equals("")) break;
                    } catch (Exception e) {
                        i++;
                    }
                }
                String date = currencyHistory.getJSONObject(i + "").getString("date");
                dateTitle = currencyHistory.getJSONObject(i + "").getString("dateTitle");
                privatePersonsObject = currencyHistory.getJSONObject(i + "").getJSONObject("privatePersons");
                legalPersonsObject = currencyHistory.getJSONObject(i + "").getJSONObject("legalPersons");
                crossCourseObject = currencyHistory.getJSONObject(i + "").getJSONObject("crossCourses");
                cardsObject = currencyHistory.getJSONObject(i + "").getJSONObject("cards");

                i++;
                while (true) {
                    try {
                        if (!currencyHistory.getString(i + "").equals("")) break;
                    } catch (Exception e) {
                        i++;
                    }
                }
                String date2 = currencyHistory.getJSONObject(i + "").getString("date");
                String dateTitle2 = currencyHistory.getJSONObject(i + "").getString("dateTitle");
                JSONObject privatePersons2 = currencyHistory.getJSONObject(i + "").getJSONObject("privatePersons");
                JSONObject legalPersons2 = currencyHistory.getJSONObject(i + "").getJSONObject("legalPersons");
                JSONObject crossCourses2 = currencyHistory.getJSONObject(i + "").getJSONObject("crossCourses");
                JSONObject cards2 = currencyHistory.getJSONObject(i + "").getJSONObject("cards");
            } catch (JSONException e) {
                JSONArray currencyHistory = responseData.getJSONObject("data").getJSONArray("currencyHistory");

                String date = currencyHistory.getJSONObject(0).getString("date");
                dateTitle = currencyHistory.getJSONObject(0).getString("dateTitle");
                privatePersonsObject = currencyHistory.getJSONObject(0).getJSONObject("privatePersons");
                legalPersonsObject = currencyHistory.getJSONObject(0).getJSONObject("legalPersons");
                crossCourseObject = currencyHistory.getJSONObject(0).getJSONObject("crossCourses");
                cardsObject = currencyHistory.getJSONObject(0).getJSONObject("cards");

                String date2 = currencyHistory.getJSONObject(1).getString("date");
                String dateTitle2 = currencyHistory.getJSONObject(1).getString("dateTitle");
                JSONObject privatePersons2 = currencyHistory.getJSONObject(1).getJSONObject("privatePersons");
                JSONObject legalPersons2 = currencyHistory.getJSONObject(1).getJSONObject("legalPersons");
                JSONObject crossCourses2 = currencyHistory.getJSONObject(1).getJSONObject("crossCourses");
                JSONObject cards2 = currencyHistory.getJSONObject(1).getJSONObject("cards");
            }

            dateTextView.setText(dateTitle);

            sellTextView.setText(privatePersonsObject.getJSONObject("USD/KZT").getString("sell"));
            sellTextView2.setText(privatePersonsObject.getJSONObject("EUR/KZT").getString("sell"));
            sellTextView3.setText(privatePersonsObject.getJSONObject("RUB/KZT").getString("sell"));
            sellTextView4.setText(privatePersonsObject.getJSONObject("GBP/KZT").getString("sell"));
            sellTextView5.setText(privatePersonsObject.getJSONObject("CHF/KZT").getString("sell"));
            sellTextView6.setText(privatePersonsObject.getJSONObject("CNY/KZT").getString("sell"));

            buyTextView.setText(privatePersonsObject.getJSONObject("USD/KZT").getString("buy"));
            buyTextView2.setText(privatePersonsObject.getJSONObject("EUR/KZT").getString("buy"));
            buyTextView3.setText(privatePersonsObject.getJSONObject("RUB/KZT").getString("buy"));
            buyTextView4.setText(privatePersonsObject.getJSONObject("GBP/KZT").getString("buy"));
            buyTextView5.setText(privatePersonsObject.getJSONObject("CHF/KZT").getString("buy"));
            buyTextView6.setText(privatePersonsObject.getJSONObject("CNY/KZT").getString("buy"));

            JSONObject currencyTypes = responseData.getJSONObject("data").getJSONObject("currencyTypes");
            privatePersonsBtn.setText(currencyTypes.getString("privatePersons"));
            legalPersonsBtn.setText(currencyTypes.getString("legalPersons"));
            crossCoursesBtn.setText(currencyTypes.getString("crossCourses"));
            cardsBtn.setText(currencyTypes.getString("cards"));
        }
    }
}
