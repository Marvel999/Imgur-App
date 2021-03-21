package com.example.imgurapi.responses


import com.example.imgurapi.models.Comment
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AlbumCommentsResponse(
    @Json(name = "data")
    val `data`: List<Comment>?,
    @Json(name = "status")
    val status: Int,
    @Json(name = "success")
    val success: Boolean
)