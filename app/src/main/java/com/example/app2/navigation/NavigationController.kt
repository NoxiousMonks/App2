package com.example.app2.navigation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.app2.Product
import com.example.app2.models.MainViewModel
import com.example.app2.screens.Screens

class NavigationController: ViewModel() {
    //Текущий экран
    var currentScreen by mutableStateOf(Screens.ProductsScreen)
    var selectedProduct by mutableStateOf<Int>(0)

    //Переход к экрану
    fun navigateTo(screen:Screens, productId: Int) {
//    fun navigateTo(screen:Screens) {
        currentScreen = screen
        selectedProduct = productId
    }
}