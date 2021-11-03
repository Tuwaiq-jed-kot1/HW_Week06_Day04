package com.sumaya.hw_week06_day04

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class youtubeRepo {
    private val tag= "youtubeRepo"
    private val api = youtubeBuilder.youtubeApi

    suspend fun fetchInterestingList(): youtubeData = withContext(Dispatchers.IO) {
        api.fetchVideos()
    }
}