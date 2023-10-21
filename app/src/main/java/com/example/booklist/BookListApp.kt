package com.example.booklist

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.booklist.view.bookDetail.BookDetailScreen
import com.example.booklist.view.home.BookListScreen

@Composable
fun BookListApp(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home"){
        composable("home"){
            BookListScreen(navController = navController)
        }
        composable("detail"){
            BookDetailScreen()
        }
    }
}