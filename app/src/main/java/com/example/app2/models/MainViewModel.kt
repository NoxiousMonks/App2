package com.example.app2.models

import androidx.lifecycle.ViewModel
import com.example.app2.Product

class MainViewModel(): ViewModel() {
    val productList: List<Product> =listOf(
        Product(0, "Банан", "Желтый вкусный"),
        Product(1, "Яблоко", "красный и зеленый богат железом"),
        Product(2, "Груша", "Сочный и мягкий"),
        Product(3, "Киви", "Снаружу цвета кака внутри красивый зеленый"),
        Product(4, "Апельсин", "Цитрусовое, кислый"),
        )

    val korzinaList = mutableListOf<String>()
}