package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


interface newsApi {

   @GET("v2/top-headlines")
 Call<MyModel.Root> getTopHeadlines(
         @Query("country") String country,
         @Query("apiKey") String apiKey
   );

 }

