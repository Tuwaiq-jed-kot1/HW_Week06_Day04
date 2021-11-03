package com.sumaya.hw_week06_day04.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sumaya.hw_week06_day04.Repo
import com.sumaya.hw_week06_day04.YTRoot
import kotlinx.coroutines.launch

class VMVideos:ViewModel() {
    val repo= Repo()
    fun fetchIntrestingList(): LiveData<YTRoot> {
        val photos= MutableLiveData<YTRoot> ()
        viewModelScope.launch {
            try{
                photos.postValue(repo.fetshVideos())}
            catch (e : Throwable){
                Log.e("youtube","videos Problem ${e.localizedMessage}")

            }

        }
        return photos
    }
}