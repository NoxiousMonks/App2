package com.example.app2.models

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.app2.Product

class MainViewModel(): ViewModel() {
    val description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    val prodductList: List<Product> =listOf(
        Product(1, "Банан", description),
        Product(2, "Яблоко", description),
        Product(3, "Груша", description)
        )

    val korzinaList = mutableListOf<String>()
}