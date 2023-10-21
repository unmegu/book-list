package com.example.booklist.model.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "books_table")
data class Book(
    @PrimaryKey val isbn: String,
    /*ある程度形になったらサムネイルも追加してみる*/
    val title: String,
    val authors: String,
    val publishedDate: String,
    val description: String,
    val publisher: String,
)
