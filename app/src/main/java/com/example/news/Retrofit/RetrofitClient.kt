package com.example.news.Retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitClient {
    private var retrrofit: Retrofit? = null

    fun getClient(baseURL: String): Retrofit {
        if(retrrofit == null) {
            retrrofit = Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return  retrrofit!!
    }
}