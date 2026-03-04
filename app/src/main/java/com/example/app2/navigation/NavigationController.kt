package com.example.app2.navigation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.app2.screens.Screens

class NavigationController: ViewModel() {
    //Текущий экран
    var currentScreen by mutableStateOf(Screens.ProductsScreen)

    //Переход к экрану
    fun navigateTo(screen:Screens) {
        currentScreen = screen
    }
}