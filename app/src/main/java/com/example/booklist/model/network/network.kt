package com.example.booklist.model.network

import android.util.Log
import retrofit2.Retrofit
import kotlin.concurrent.thread

fun getBookRetrofit(isbn: String){
    val base = "https://www.googleapis.com/books/v1/"
    val retrofit = Retrofit.Builder()
        .baseUrl(base)
        .build()
    val service = retrofit.create(BookListService::class.java)
    val getBook = service.getBook(isbn)

    thread {
        runCatching { getBook.clone().execute() }
            .onSuccess{ response ->
                if (response.isSuccessful) {
                    response.body()?.string()?.let { bookJson ->
                        Log.e("getBook", bookJson)
                    }
                } else {
                        val errMsg = "HTTP error. HTTP status code: ${response.code()}."
                        Log.e("getBook", errMsg)
                    }
                }
            .onFailure { t -> Log.e("getBookFailure", t.toString()) }
            }
    }


