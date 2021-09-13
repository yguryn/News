package com.example.news.Interface

import com.example.news.Model.Movie
import retrofit2.http.*
import retrofit2.Call

interface RetrofitServices {
    @GET("marvel")
    fun getMovieList(): Call<MutableList<Movie>>
}