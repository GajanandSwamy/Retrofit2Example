package com.example.manvish.retrofit2example;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by manvish on 1/17/18.
 */

public class Api {

    private static Retrofit retrofit = null;

    //"http://mobileappdatabase.in/"

    public static final String ITS_URL = "http://220.227.176.235:8080/doa/";//InputDoa.doa";

    public static ApiInterface getClient() {

        // change your base URL
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(ITS_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        //Creating object for our interface
        ApiInterface api = retrofit.create(ApiInterface.class);
        return api; // return the APIInterface object
    }
}
