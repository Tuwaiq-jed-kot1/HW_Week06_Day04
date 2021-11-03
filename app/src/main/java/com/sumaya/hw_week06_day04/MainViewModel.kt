package com.sumaya.hw_week06_day04

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sumaya.hw_week06_day04.data.models.YouTubeData
import com.sumaya.hw_week06_day04.data.network.YouTubeRepo
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val repo : YouTubeRepo = YouTubeRepo()


    fun fetchVideos():LiveData<YouTubeData> {
        val videos = MutableLiveData<YouTubeData>()
        viewModelScope.launch {
            try {
            videos.postValue(repo.fetchVideos())
            } catch (e:Throwable) {
                Log.e("flickr image", "YouTube Video Problem: ${e.localizedMessage}")
            }
        }
        return videos
    }
}