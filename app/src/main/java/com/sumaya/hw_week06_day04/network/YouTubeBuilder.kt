package com.sumaya.hw_week06_day04.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object YouTubeBuilder {
    private const val BASE_URL= "https://api.letsbuildthatapp.com/"
    private fun retrofit(): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val youTubeAPI: YouTubeAPI = retrofit().create(YouTubeAPI::class.java)
}