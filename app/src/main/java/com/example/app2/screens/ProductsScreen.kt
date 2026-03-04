package com.example.app2.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.app2.models.MainViewModel

@Composable
fun ProductsScreen(viewModel: MainViewModel, onClick: (Int) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        ) {

        Text("Список продуктов", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.headlineMedium)

        LazyColumn(modifier = Modifier.padding(10.dp)) {

            items(viewModel.productList){ product ->

                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                    Text(product.name)
                    Button(
                        onClick = { onClick(product.id) },
                        shape = CircleShape
                    ) {
                        Text("info")
                    }
                }
            }
        }
    }


}