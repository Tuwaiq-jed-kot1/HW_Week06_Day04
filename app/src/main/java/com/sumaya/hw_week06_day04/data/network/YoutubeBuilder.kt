package com.sumaya.hw_week06_day04.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object YoutubeBuilder {
    private const val BASE_URL = "https://api.letsbuildthatapp.com/youtube/home_feed/"
    private fun retrofit(): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    //local API to call global API
    val youtubeAPI: YoutubeAPI = retrofit().create(YoutubeAPI::class.java)
}