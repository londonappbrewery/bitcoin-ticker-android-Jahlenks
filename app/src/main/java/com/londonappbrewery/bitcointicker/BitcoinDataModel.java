package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModel {

    private String  mCurrencyAmount;

    public static BitcoinDataModel fromJson(JSONObject jsonObject) {
        try {

            BitcoinDataModel bitcoinData = new BitcoinDataModel();
            bitcoinData.mCurrencyAmount = jsonObject.getString("last");
            return bitcoinData;

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

    }

    public String getCurrencyAmount() {
        return mCurrencyAmount;
    }

}
