package com.example.youtube.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.youtube.BuildConfig
import com.example.youtube.core.common.Constant
import com.example.youtube.core.remote.RetrofitClient
import com.example.youtube.data.remote.ApiService
import com.example.youtube.data.remote.model.Playlists
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {
    private val apiService: ApiService by lazy {
        RetrofitClient.create();
    }

    fun getPlayLists(): LiveData<Playlists> {



        val data = MutableLiveData<Playlists>()

        apiService.getPlaylists(Constant.part, Constant.channelId, BuildConfig.API_KEY)
            .enqueue(object : Callback<Playlists> {
                override fun onResponse(call: Call<Playlists>, response: Response<Playlists>) {
                    if (response.isSuccessful) {
                        data.value = response.body()
                    }
                }

                override fun onFailure(call: Call<Playlists>, t: Throwable) {
                    //404  not found
                    //401 token истек 400-499
                }
            })

        return data

    }

}