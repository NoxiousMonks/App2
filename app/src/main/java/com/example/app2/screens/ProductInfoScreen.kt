package com.example.app2.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app2.models.MainViewModel

@Composable
fun ProductInfoScreen(viewModel: MainViewModel, onClick: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
         horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("ASASASS")
        val product = viewModel.prodductList[0]
        Text(product.name, fontSize = 20.sp)
        Text(product.description)

        Button(
            onClick = onClick,
            shape = CircleShape
        ) {
            Text("В корзину")
        }

    }
}