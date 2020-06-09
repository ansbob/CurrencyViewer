package com.example.currencyviewer.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.currencyviewer.Interfaces.ResponseHttpAsyncTask;
import com.example.currencyviewer.Network.HttpPostAsyncTask;
import com.example.currencyviewer.Network.RequestUrls;
import com.example.currencyviewer.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ATFFragment extends Fragment implements ResponseHttpAsyncTask {
    private static final String TAG = "ATFFragment";

    private Button firstPageButton;
    private Button secondPageButton;
    private Button thirdPageButton;
    private Button fourthPageButton;
    private Button fifthPageButton;

    private TextView sellTextView, sellTextView2, sellTextView3, sellTextView4
            , sellTextView5;
    private TextView proportionTextView, proportionTextView2, proportionTextView3, proportionTextView4
            , proportionTextView5;
    private TextView buyTextView, buyTextView2, buyTextView3, buyTextView4
            , buyTextView5;
    private TextView dateATF;

    private JSONArray data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.atf, container, false);

        dateATF = v.findViewById(R.id.dateATF);

        sellTextView = v.findViewById(R.id.sellATF);
        sellTextView2 = v.findViewById(R.id.sell2ATF);
        sellTextView3 = v.findViewById(R.id.sell3ATF);
        sellTextView4 = v.findViewById(R.id.sell4ATF);
        sellTextView5 = v.findViewById(R.id.sell5ATF);

        proportionTextView = v.findViewById(R.id.proportionATF);
        proportionTextView2 = v.findViewById(R.id.proportion2ATF);
        proportionTextView3 = v.findViewById(R.id.proportion3ATF);
        proportionTextView4 = v.findViewById(R.id.proportion4ATF);
        proportionTextView5 = v.findViewById(R.id.proportion5ATF);

        buyTextView = v.findViewById(R.id.buyATF);
        buyTextView2 = v.findViewById(R.id.buy2ATF);
        buyTextView3 = v.findViewById(R.id.buy3ATF);
        buyTextView4 = v.findViewById(R.id.buy4ATF);
        buyTextView5 = v.findViewById(R.id.buy5ATF);

        firstPageButton = v.findViewById(R.id.firstPageButton);
        secondPageButton = v.findViewById(R.id.secondPageButton);
        thirdPageButton = v.findViewById(R.id.thirdPageButton);
        fourthPageButton = v.findViewById(R.id.fourthPageButton);
        fifthPageButton = v.findViewById(R.id.fifthPageButton);

        firstPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    dateATF.setText("страница 1");

                    sellTextView.setText(data.getJSONObject(0).getString("sell"));
                    sellTextView2.setText(data.getJSONObject(1).getString("sell"));
                    sellTextView3.setText(data.getJSONObject(2).getString("sell"));
                    sellTextView4.setText(data.getJSONObject(3).getString("sell"));
                    sellTextView5.setText(data.getJSONObject(4).getString("sell"));

                    proportionTextView.setText(data.getJSONObject(0).getString("valcode") + "/" +
                            data.getJSONObject(0).getString("valcodebas"));
                    proportionTextView2.setText(data.getJSONObject(1).getString("valcode") + "/" +
                            data.getJSONObject(1).getString("valcodebas"));
                    proportionTextView3.setText(data.getJSONObject(2).getString("valcode") + "/" +
                            data.getJSONObject(2).getString("valcodebas"));
                    proportionTextView4.setText(data.getJSONObject(3).getString("valcode") + "/" +
                            data.getJSONObject(3).getString("valcodebas"));
                    proportionTextView5.setText(data.getJSONObject(4).getString("valcode") + "/" +
                            data.getJSONObject(4).getString("valcodebas"));

                    buyTextView.setText(data.getJSONObject(0).getString("buy"));
                    buyTextView2.setText(data.getJSONObject(1).getString("buy"));
                    buyTextView3.setText(data.getJSONObject(2).getString("buy"));
                    buyTextView4.setText(data.getJSONObject(3).getString("buy"));
                    buyTextView5.setText(data.getJSONObject(4).getString("buy"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        secondPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    dateATF.setText("страница 2");

                    sellTextView.setText(data.getJSONObject(5).getString("sell"));
                    sellTextView2.setText(data.getJSONObject(6).getString("sell"));
                    sellTextView3.setText(data.getJSONObject(7).getString("sell"));
                    sellTextView4.setText(data.getJSONObject(8).getString("sell"));
                    sellTextView5.setText(data.getJSONObject(9).getString("sell"));

                    proportionTextView.setText(data.getJSONObject(5).getString("valcode") + "/" +
                            data.getJSONObject(5).getString("valcodebas"));
                    proportionTextView2.setText(data.getJSONObject(6).getString("valcode") + "/" +
                            data.getJSONObject(6).getString("valcodebas"));
                    proportionTextView3.setText(data.getJSONObject(7).getString("valcode") + "/" +
                            data.getJSONObject(7).getString("valcodebas"));
                    proportionTextView4.setText(data.getJSONObject(8).getString("valcode") + "/" +
                            data.getJSONObject(8).getString("valcodebas"));
                    proportionTextView5.setText(data.getJSONObject(9).getString("valcode") + "/" +
                            data.getJSONObject(9).getString("valcodebas"));

                    buyTextView.setText(data.getJSONObject(5).getString("buy"));
                    buyTextView2.setText(data.getJSONObject(6).getString("buy"));
                    buyTextView3.setText(data.getJSONObject(7).getString("buy"));
                    buyTextView4.setText(data.getJSONObject(8).getString("buy"));
                    buyTextView5.setText(data.getJSONObject(9).getString("buy"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        thirdPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    dateATF.setText("страница 3");

                    sellTextView.setText(data.getJSONObject(10).getString("sell"));
                    sellTextView2.setText(data.getJSONObject(11).getString("sell"));
                    sellTextView3.setText(data.getJSONObject(12).getString("sell"));
                    sellTextView4.setText(data.getJSONObject(13).getString("sell"));
                    sellTextView5.setText(data.getJSONObject(14).getString("sell"));

                    proportionTextView.setText(data.getJSONObject(10).getString("valcode") + "/" +
                            data.getJSONObject(10).getString("valcodebas"));
                    proportionTextView2.setText(data.getJSONObject(11).getString("valcode") + "/" +
                            data.getJSONObject(11).getString("valcodebas"));
                    proportionTextView3.setText(data.getJSONObject(12).getString("valcode") + "/" +
                            data.getJSONObject(12).getString("valcodebas"));
                    proportionTextView4.setText(data.getJSONObject(13).getString("valcode") + "/" +
                            data.getJSONObject(13).getString("valcodebas"));
                    proportionTextView5.setText(data.getJSONObject(14).getString("valcode") + "/" +
                            data.getJSONObject(14).getString("valcodebas"));

                    buyTextView.setText(data.getJSONObject(10).getString("buy"));
                    buyTextView2.setText(data.getJSONObject(11).getString("buy"));
                    buyTextView3.setText(data.getJSONObject(12).getString("buy"));
                    buyTextView4.setText(data.getJSONObject(13).getString("buy"));
                    buyTextView5.setText(data.getJSONObject(14).getString("buy"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        fourthPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    dateATF.setText("страница 4");

                    sellTextView.setText(data.getJSONObject(15).getString("sell"));
                    sellTextView2.setText(data.getJSONObject(16).getString("sell"));
                    sellTextView3.setText(data.getJSONObject(17).getString("sell"));
                    sellTextView4.setText(data.getJSONObject(18).getString("sell"));
                    sellTextView5.setText(data.getJSONObject(19).getString("sell"));

                    proportionTextView.setText(data.getJSONObject(15).getString("valcode") + "/" +
                            data.getJSONObject(15).getString("valcodebas"));
                    proportionTextView2.setText(data.getJSONObject(16).getString("valcode") + "/" +
                            data.getJSONObject(16).getString("valcodebas"));
                    proportionTextView3.setText(data.getJSONObject(17).getString("valcode") + "/" +
                            data.getJSONObject(17).getString("valcodebas"));
                    proportionTextView4.setText(data.getJSONObject(18).getString("valcode") + "/" +
                            data.getJSONObject(18).getString("valcodebas"));
                    proportionTextView5.setText(data.getJSONObject(19).getString("valcode") + "/" +
                            data.getJSONObject(19).getString("valcodebas"));

                    buyTextView.setText(data.getJSONObject(15).getString("buy"));
                    buyTextView2.setText(data.getJSONObject(16).getString("buy"));
                    buyTextView3.setText(data.getJSONObject(17).getString("buy"));
                    buyTextView4.setText(data.getJSONObject(18).getString("buy"));
                    buyTextView5.setText(data.getJSONObject(19).getString("buy"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        fifthPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    dateATF.setText("страница 5");

                    sellTextView.setText(data.getJSONObject(20).getString("sell"));
                    sellTextView2.setText(data.getJSONObject(21).getString("sell"));
                    sellTextView3.setText(data.getJSONObject(22).getString("sell"));
                    sellTextView4.setText(data.getJSONObject(23).getString("sell"));
                    sellTextView5.setText(data.getJSONObject(24).getString("sell"));

                    proportionTextView.setText(data.getJSONObject(20).getString("valcode") + "/" +
                            data.getJSONObject(20).getString("valcodebas"));
                    proportionTextView2.setText(data.getJSONObject(21).getString("valcode") + "/" +
                            data.getJSONObject(21).getString("valcodebas"));
                    proportionTextView3.setText(data.getJSONObject(22).getString("valcode") + "/" +
                            data.getJSONObject(22).getString("valcodebas"));
                    proportionTextView4.setText(data.getJSONObject(23).getString("valcode") + "/" +
                            data.getJSONObject(23).getString("valcodebas"));
                    proportionTextView5.setText(data.getJSONObject(24).getString("valcode") + "/" +
                            data.getJSONObject(24).getString("valcodebas"));

                    buyTextView.setText(data.getJSONObject(20).getString("buy"));
                    buyTextView2.setText(data.getJSONObject(21).getString("buy"));
                    buyTextView3.setText(data.getJSONObject(22).getString("buy"));
                    buyTextView4.setText(data.getJSONObject(23).getString("buy"));
                    buyTextView5.setText(data.getJSONObject(24).getString("buy"));
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
        HttpPostAsyncTask endPoint = new HttpPostAsyncTask(this);
        endPoint.execute(RequestUrls.END_POINT2);
    }

    @Override
    public void afterFinishingHttpPostAsyncTask(String response) throws JSONException {
        JSONObject responseData = new JSONObject(response);
        if (responseData.getString("code").equals("200")) {
            JSONArray data = responseData.getJSONArray("data");
            this.data = data;

            sellTextView.setText(data.getJSONObject(0).getString("sell"));
            sellTextView2.setText(data.getJSONObject(1).getString("sell"));
            sellTextView3.setText(data.getJSONObject(2).getString("sell"));
            sellTextView4.setText(data.getJSONObject(3).getString("sell"));
            sellTextView5.setText(data.getJSONObject(4).getString("sell"));

            proportionTextView.setText(data.getJSONObject(0).getString("valcode") + "/" +
                    data.getJSONObject(0).getString("valcodebas"));
            proportionTextView2.setText(data.getJSONObject(1).getString("valcode") + "/" +
                    data.getJSONObject(1).getString("valcodebas"));
            proportionTextView3.setText(data.getJSONObject(2).getString("valcode") + "/" +
                    data.getJSONObject(2).getString("valcodebas"));
            proportionTextView4.setText(data.getJSONObject(3).getString("valcode") + "/" +
                    data.getJSONObject(3).getString("valcodebas"));
            proportionTextView5.setText(data.getJSONObject(4).getString("valcode") + "/" +
                    data.getJSONObject(4).getString("valcodebas"));

            buyTextView.setText(data.getJSONObject(0).getString("buy"));
            buyTextView2.setText(data.getJSONObject(1).getString("buy"));
            buyTextView3.setText(data.getJSONObject(2).getString("buy"));
            buyTextView4.setText(data.getJSONObject(3).getString("buy"));
            buyTextView5.setText(data.getJSONObject(4).getString("buy"));
        }
    }
}
