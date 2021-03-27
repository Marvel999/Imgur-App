package com.example.imgurapi

import com.example.imgurapi.ImgurClient
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class APITesting {
    @Test
    fun `Test gellary`(){
     runBlocking {
         val album= ImgurClient.api.getAlbum("OICg9SZ")
         assertEquals(album.status,200)
         assertTrue(album.success)
     }
    }
}