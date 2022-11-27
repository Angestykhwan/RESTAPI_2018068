package com.example.restapi_2018068;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPICall {

    //https://my-json-server.typicode.com/ AnggieAngesti_20108068/  FileJson
    //https://my-json-server.typicode.com/typicode/demo/db
    //https://run.mocky.io/v3/0342a4a7-d3f0-442d-9538-d332bd941014

    @GET("v3/0342a4a7-d3f0-442d-9538-d332bd941014")
    Call<DataModel> getData();
}
