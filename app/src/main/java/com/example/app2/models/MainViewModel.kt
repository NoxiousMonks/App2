package com.example.app2.models

import androidx.lifecycle.ViewModel
import com.example.app2.Product

class MainViewModel(): ViewModel() {
    val description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    val productList: List<Product> =listOf(
        Product(1, "Банан", description),
        Product(2, "Яблоко", description),
        Product(3, "Груша", description),
        Product(3, "Киви", description),
        Product(3, "Апельсин", description),
        )

    val korzinaList = mutableListOf<String>()
}