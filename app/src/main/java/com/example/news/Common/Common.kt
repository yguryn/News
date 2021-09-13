package com.example.news.Common

import com.example.news.Interface.RetrofitServices
import com.example.news.Retrofit.RetrofitClient

object Common {
    private val BASE_URL = "https://www.simplifiedcoding.net/demos/"
    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}