package com.example.imgurapi.responses


import com.example.imgurapi.models.GalleryData
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GalleryResponse(
    @Json(name = "data")
    val `data`: GalleryData?,
    @Json(name = "status")
    val status: Int,
    @Json(name = "success")
    val success: Boolean
) {
}