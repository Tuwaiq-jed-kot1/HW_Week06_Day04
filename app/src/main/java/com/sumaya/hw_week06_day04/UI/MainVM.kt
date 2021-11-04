package com.sumaya.hw_week06_day04.UI

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sumaya.hw_week06_day03.data.YoutubeData
import com.tuwaiq.restandretrofit.data.network.YoutubeRepo
import kotlinx.coroutines.launch

class MainVM: ViewModel() {

    val repo = YoutubeRepo()
    fun fetchVideos(): LiveData<YoutubeData>{
        val videos = MutableLiveData<YoutubeData>()
        viewModelScope.launch {
            try {
                videos.postValue(repo.fetchVideos())
            } catch (e: Throwable){
                Log.e("Youtube Video","Youtube Video Problem: ${e.localizedMessage}")
            }

        }
        return videos
    }

}

