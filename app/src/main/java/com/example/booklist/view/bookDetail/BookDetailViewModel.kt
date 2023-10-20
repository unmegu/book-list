package com.example.booklist.view.bookDetail

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BookDetailViewModel @Inject constructor(): ViewModel(){
    /*TODO:コンストラクタに引数でRepository or UseCase*/
    /*memo
    * addBookでDBに本追加
    * リポジトリ経由で本参照
    * BookList, BookDetailはリポジトリにあるもの＝すべての本という認識で実装する（ここで追加の処理とかは関係ない）
  　*/
}