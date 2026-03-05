package com.example.app2.screens

import android.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.app2.models.MainViewModel

@Composable
fun KorzinaScreen(viewModel: MainViewModel, onClick: () -> Unit, onBack: () -> Unit){
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        IconButton(
            onClick = onBack,
//            modifier = Modifier.padding(10.dp )
        ) {
            Icon(
                painter = painterResource(android.R.drawable.ic_menu_revert),
                contentDescription = "Go back to previous screen",
                tint = Color.Green
            )
        }

        Text("Корзина", style = MaterialTheme.typography.headlineMedium)
        viewModel.korzinaList.forEach { product ->
        Text(product)
    }
        Button(onClick = onClick) {
            Text("Продолжить покупки")
        }
    }
}