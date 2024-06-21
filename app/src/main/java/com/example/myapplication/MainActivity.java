package com.example.myapplication;

import android.os.Bundle;
import android.provider.DocumentsContract;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;

import javax.xml.transform.Source;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<MyModel.Article>
            list = new ArrayList<>();
    private static final String BASE_URL = "https://newsapi.org/";
    private static final String API_KEY = "7cd86bf3ebcb44c9ac8e1fe3492829da";
    private Retrofit retrofit;
    private newsApi newsApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();

        newsApi = retrofit.create(com.example.myapplication.newsApi.class);
        fetchTopHeadlines();
    }

    private void fetchTopHeadlines() {
        Call<MyModel.Root> call = newsApi.getTopHeadlines("in", API_KEY);
        call.enqueue(new Callback<MyModel.Root>() {


            @Override
            public void onResponse(Call<MyModel.Root> call, Response<MyModel.Root> response) {
                if (response.isSuccessful() && response.body() != null) {
                    list.addAll(response.body().getArticles());
                    recyclerView.setAdapter(new NewsAdapter(list));
                    Toast.makeText(MainActivity.this, "News fetched", Toast.LENGTH_SHORT).show();
                } else {
                    Log.e("error", "response fail" + response.message());

                }
            }

            @Override
            public void onFailure(Call<MyModel.Root> call, Throwable t) {
                Log.e("error", "request failed" + t.getMessage());


            }
        });

    }


}