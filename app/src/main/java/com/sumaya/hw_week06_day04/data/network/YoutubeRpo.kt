package com.sumaya.hw_week06_day04.data.network


import com.sumaya.hw_week06_day04.data.models.Json4Kotlin_Base
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class YoutubeRpo {
    private val api = YoutubeBuilder.youtubeApi

    suspend fun fetchInterestingList(): Json4Kotlin_Base = withContext(Dispatchers.IO) {

        //URL
        api.fetchYoutube()
    }
}