package com.example.currencyviewer.Interfaces;

import org.json.JSONException;
import org.json.JSONObject;

public interface ResponseHttpAsyncTask {
    void afterFinishingHttpPostAsyncTask(String responseData) throws JSONException;
}
