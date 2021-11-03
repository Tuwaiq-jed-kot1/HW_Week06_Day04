package com.sumaya.hw_week06_day04.dataNetwork

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object FlickrBuilder {
    private const val BASE_URL= "https://api.letsbuildthatapp.com/youtube/home_feed/"
    private fun retrofit(): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val flickrAPI: FlickrAPI = retrofit().create(FlickrAPI::class.java)
}
