package com.example.app2.navigation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.app2.Product
import com.example.app2.models.MainViewModel
import com.example.app2.screens.Screens

class NavigationController: ViewModel() {
    var selectedProduct by mutableStateOf<Int>(0)
    //Текущий экран
//    var currentScreen by mutableStateOf(Screens.ProductsScreen)

    //Переход к экрану
//    fun navigateTo(screen:Screens) {
//        currentScreen = screen
//    }

    private val navStack = mutableStateListOf<Screens>(Screens.ProductsScreen)

    val currentScreen: Screens
        get() = navStack.last()

    fun navigateTo(screen:Screens) {
        navStack.add(screen)
    }

    fun navigateBack(): Boolean {
        if (navStack.size > 1){
            navStack.removeLastOrNull()
            return true
        }
        return false
    }

    fun selectedProductID (productId: Int){
        selectedProduct = productId
    }
}