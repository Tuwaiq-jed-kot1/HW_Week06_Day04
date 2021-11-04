package com.sumaya.hw_week06_day04

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class YoutubeRepo {
    private val tag ="YoutubeRepo"
    val api = YoutubeBuilder.youtubeApi

    suspend fun fetchInterestingList(): YoutubeData = withContext(Dispatchers.IO) {
        api.fetchVideos()
    }
}