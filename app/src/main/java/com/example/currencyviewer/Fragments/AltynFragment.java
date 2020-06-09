package com.example.currencyviewer.Fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.currencyviewer.Interfaces.ResponseHttpAsyncTask;
import com.example.currencyviewer.Network.HttpPostAsyncTask;
import com.example.currencyviewer.Network.RequestUrls;
import com.example.currencyviewer.R;

import org.json.JSONArray;
import org.json.JSONException;

public class AltynFragment extends Fragment implements ResponseHttpAsyncTask {
    private static final String TAG = "AltynFragment";

    private TextView sellTextView, sellTextView2, sellTextView3, sellTextView4
            , sellTextView5;
    private TextView proportionTextView, proportionTextView2, proportionTextView3, proportionTextView4
            , proportionTextView5;
    private TextView buyTextView, buyTextView2, buyTextView3, buyTextView4
            , buyTextView5;

    private TextView dateAltyn;
    private JSONArray data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.altyn, container, false);

        dateAltyn = v.findViewById(R.id.dateAltyn);

        sellTextView = v.findViewById(R.id.sellAltyn);
        sellTextView2 = v.findViewById(R.id.sell2Altyn);
        sellTextView3 = v.findViewById(R.id.sell3Altyn);
        sellTextView4 = v.findViewById(R.id.sell4Altyn);
        sellTextView5 = v.findViewById(R.id.sell5Altyn);

        proportionTextView = v.findViewById(R.id.proportionAltyn);
        proportionTextView2 = v.findViewById(R.id.proportion2Altyn);
        proportionTextView3 = v.findViewById(R.id.proportion3Altyn);
        proportionTextView4 = v.findViewById(R.id.proportion4Altyn);
        proportionTextView5 = v.findViewById(R.id.proportion5Altyn);

        buyTextView = v.findViewById(R.id.buyAltyn);
        buyTextView2 = v.findViewById(R.id.buy2Altyn);
        buyTextView3 = v.findViewById(R.id.buy3Altyn);
        buyTextView4 = v.findViewById(R.id.buy4Altyn);
        buyTextView5 = v.findViewById(R.id.buy5Altyn);

        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        HttpPostAsyncTask endPoint = new HttpPostAsyncTask(this);
        endPoint.execute(RequestUrls.END_POINT3);
    }

    @Override
    public void afterFinishingHttpPostAsyncTask(String response) throws JSONException {
        JSONArray responseData = new JSONArray(response);
        data = responseData;

        dateAltyn.setText(responseData.getJSONObject(0).getString("validFrom"));

        sellTextView.setText(data.getJSONObject(0).getString("rateSale"));
        sellTextView2.setText(data.getJSONObject(1).getString("rateSale"));
        sellTextView3.setText(data.getJSONObject(2).getString("rateSale"));
        sellTextView4.setText(data.getJSONObject(3).getString("rateSale"));
        sellTextView5.setText(data.getJSONObject(4).getString("rateSale"));

        proportionTextView.setText(data.getJSONObject(0).getString("targetCurrencyIsoCode") + "/" +
                data.getJSONObject(0).getString("baseCurrencyIsoCode"));
        proportionTextView2.setText(data.getJSONObject(1).getString("targetCurrencyIsoCode") + "/" +
                data.getJSONObject(1).getString("baseCurrencyIsoCode"));
        proportionTextView3.setText(data.getJSONObject(2).getString("targetCurrencyIsoCode") + "/" +
                data.getJSONObject(2).getString("baseCurrencyIsoCode"));
        proportionTextView4.setText(data.getJSONObject(3).getString("targetCurrencyIsoCode") + "/" +
                data.getJSONObject(3).getString("baseCurrencyIsoCode"));
        proportionTextView5.setText(data.getJSONObject(4).getString("targetCurrencyIsoCode") + "/" +
                data.getJSONObject(4).getString("baseCurrencyIsoCode"));

        buyTextView.setText(data.getJSONObject(0).getString("ratePurchase"));
        buyTextView2.setText(data.getJSONObject(1).getString("ratePurchase"));
        buyTextView3.setText(data.getJSONObject(2).getString("ratePurchase"));
        buyTextView4.setText(data.getJSONObject(3).getString("ratePurchase"));
        buyTextView5.setText(data.getJSONObject(4).getString("ratePurchase"));
    }
}
