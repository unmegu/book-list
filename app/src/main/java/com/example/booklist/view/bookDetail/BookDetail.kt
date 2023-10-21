package com.example.booklist.view.bookDetail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun BookDetailScreen(
    bookDetailViewModel: BookDetailViewModel = hiltViewModel(),
    ){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
    ){
        Text(
            text = "ここに書籍情報などが追加されてく．パーツを作ってここに入れてくスタイルでやるよ",
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
        )
    }
}