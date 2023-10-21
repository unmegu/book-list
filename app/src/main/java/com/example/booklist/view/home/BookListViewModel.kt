package com.example.booklist.view.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.booklist.model.network.getBookRetrofit
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BookListViewModel @Inject constructor(): ViewModel(){
    /*TODO:コンストラクタに引数でRepository or UseCase*/
    /*TODO:Listにbookを追加する処理?*/
    /*TODO：リポジトリから保存済みの本全取得*/

    fun getBook(isbnCode: String){
        viewModelScope.launch{
            getBookRetrofit(isbn = isbnCode)
        }
    }
}