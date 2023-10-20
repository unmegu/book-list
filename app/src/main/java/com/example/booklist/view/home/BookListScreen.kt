package com.example.booklist.view.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

@Composable
fun BookListScreen(
    bookListViewModel: BookListViewModel = hiltViewModel(),
    navController: NavController
){
    BookList(navController)
}
@Composable
fun BookList(navController: NavController){
    /*TODO:引数でBooklistを受け取る（ヌル許容）
    * TODO:LazyListStateも受け取る, 呼び出し元のrememberLazyListStateによって作成*/
    /*TODO:LazyColumに変更*/
    Column (){
        BookListItem()
        /*TODO:今は適当に詳細画面へとぶが，ISBNコードに適した詳細に飛ぶようにする*/
        Button(onClick = { navController.navigate("detail") }) {
            Text("詳細画面へ仮の遷移")
        }
    }
}

@Composable
fun BookListItem() {
    ElevatedCard( //立体カード
        elevation = CardDefaults.cardElevation( //elevation: 影の浮き上がりとデザイン
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .padding(8.dp) //padding: 余白
    ){
        Text(
            modifier = Modifier
                .padding(12.dp),
            text = "後に引数を使って，ここを本のタイトルになるようにする",
            fontSize = 16.sp
        )
    }
}