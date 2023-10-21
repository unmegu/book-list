package com.example.booklist.model.network

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BookListService {
    @GET("volumes?")
    fun getBook(
        @Query("q") q: String
    ): Call<ResponseBody>
}
