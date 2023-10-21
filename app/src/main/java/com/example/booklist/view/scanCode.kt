package com.example.booklist.view

import android.util.Log
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.booklist.view.home.BookListViewModel
import com.journeyapps.barcodescanner.ScanContract
import com.journeyapps.barcodescanner.ScanIntentResult
import com.journeyapps.barcodescanner.ScanOptions

@Composable
fun ScanCodeButton(
    bookListViewModel: BookListViewModel = hiltViewModel(),
) {
    val context = LocalContext.current
    val barcodeLauncher = rememberLauncherForActivityResult(ScanContract()) {
        result: ScanIntentResult ->
        if (result.contents == null) {
            Log.e("scanCode", "err")
        } else
            Toast.makeText(context, result.contents, Toast.LENGTH_LONG).show()
            bookListViewModel.getBook(result.contents)
            Log.e("CODE SUCCESS", result.contents)
        }
    Button(onClick = { barcodeLauncher.launch(ScanOptions()) }) {
        Text(text = "QRコード読み取り")
    }
}

