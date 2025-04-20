package com.example.movieapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val retrofit = Retrofit.Builder().baseUrl("http://api.tvmaze.com/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val movieServices = retrofit.create(ApiServices::class.java)

interface ApiServices {

    @GET("shows")
    suspend fun getCategories(): List<Content>
}