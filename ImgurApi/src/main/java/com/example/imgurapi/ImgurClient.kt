package com.example.imgurapi

import com.example.imgurapi.interceptors.AuthInterceptor
import com.example.imgurapi.interfaces.ImgurApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ImgurClient {
    private val okHttp = OkHttpClient.Builder()
        .addNetworkInterceptor(AuthInterceptor())
        .build()

    private val retrofit = Retrofit.Builder()
        .client(okHttp)
        .baseUrl("https://api.imgur.com/3/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val api = retrofit.create(ImgurApi::class.java)
}