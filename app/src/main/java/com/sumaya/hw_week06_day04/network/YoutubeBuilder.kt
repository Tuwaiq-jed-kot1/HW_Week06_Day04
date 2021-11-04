package com.tuwaiq.restandretrofit.data.network

import com.sumaya.hw_week06_day03.network.YoutubeApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object YoutubeBuilder {
    private const val BASE_URL= "https://api.letsbuildthatapp.com/"
    private fun retrofit(): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val YoutubeAPI: YoutubeApi = retrofit().create(YoutubeApi::class.java)
}