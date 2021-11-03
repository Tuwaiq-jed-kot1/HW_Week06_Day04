package com.sumaya.hw_week06_day04.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sumaya.hw_week06_day04.models.YouTubData
import com.sumaya.hw_week06_day04.network.YouTubeRepo
import kotlinx.coroutines.launch

class MainVM: ViewModel() {
    val repo= YouTubeRepo()
    fun youTubeInfo(): LiveData<YouTubData>{
        val vids= MutableLiveData<YouTubData>()
        viewModelScope.launch {
            try {
                vids.postValue(repo.youTubeInfo())
            } catch (e: Throwable){
                Log.e("YouTube Videos", "YouTube Videos Problem: ${e.localizedMessage}")
            }
        }
        return vids
    }
}