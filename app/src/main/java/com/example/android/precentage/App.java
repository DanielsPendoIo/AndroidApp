package com.example.android.precentage;

import android.app.Application;
import android.support.multidex.MultiDexApplication;

import java.util.HashMap;
import java.util.Map;

import sdk.insert.io.Insert;

public class App extends MultiDexApplication {
    @Override
    public void onCreate() {
        super.onCreate();

        Insert.InsertInitParams insertParams = new Insert.InsertInitParams();
        insertParams.setVisitorId("John Smith3");
        insertParams.setAccountId("Acme Inc");

//send visitor custom data
        Map<String, String> userData = new HashMap<>();
        userData.put("age", "27");
        userData.put("country", "USA");
//        insertParams.setUserData(userData);

//send account custom data
        Map<String, String> accountData = new HashMap<>();
        accountData.put("Tier", "1");
        accountData.put("Size", "Enterprise");
//        insertParams.setAccountData(accountData);


        Insert.initSDK(
                this,
                "8f25bb4b3a0e75db998d0c0f7fba52c0fdf70a41ed0bb1f78c089176627e656a7d9f6097d06f608f46d7120b849054a1ece896ec6a500fccef05e54832cc4a2b.8b46723b4f95c709d6a318206c12cbb8.bac756e88477ccdc83bc0740c02253793483f4e3167ac6d176e851007517d04f",
                "2iriseu", insertParams);
    }
}