package com.example.imgurapi.interfaces

import com.example.imgurapi.responses.GalleryResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ImgurApi {
    @GET("gallery/t/{tag}/{sort}/{page}")
    suspend fun getGalleryByTag(
        @Path("tag") tag:String,
        @Path("sort") sorthBy:String="time",
        @Path("page") pageNum:Int=1
    ):GalleryResponse

    @GET("album/{albumHash}")
    suspend fun getAlbum(

    )
}