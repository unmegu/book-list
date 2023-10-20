package com.example.booklist

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.booklist.ui.theme.BookListTheme
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