package com.example.app2.screens

import android.R
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.app2.models.MainViewModel

@Composable
fun KorzinaScreen(viewModel: MainViewModel){
    Column() {
        Text("Корзина", style = MaterialTheme.typography.headlineMedium)
        viewModel.korzinaList.forEach { product ->
        Text(product)
    }
    }
}