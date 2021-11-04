package com.sumaya.hw_week06_day04

import com.sumaya.hw_week06_day04.YoutubeData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class YoutubeRepo {
    private val api = YoutubeBuilder.youtubeAPI

    suspend fun fetchInterestingList(): YoutubeData = withContext(Dispatchers.IO) {
        api.fetchVideos()
    }
}