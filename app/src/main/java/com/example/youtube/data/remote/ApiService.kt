package com.example.youtube.data.remote

import com.example.youtube.data.remote.model.Playlists
import okhttp3.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("playlists")
    fun getPlaylists (
        @Query("part") part: String,
        @Query("channelId") channelId: String,
        @Query("key") apiKey: String,
    ): retrofit2.Call<Playlists>
}