package com.example.app2.navigation

import androidx.compose.runtime.Composable
import com.example.app2.models.MainViewModel
import com.example.app2.screens.KorzinaScreen
import com.example.app2.screens.ProductInfoScreen
import com.example.app2.screens.ProductsScreen
import com.example.app2.screens.Screens

@Composable
fun NavHub(viewModel: MainViewModel, navigationController: NavigationController){
    val screen = navigationController.currentScreen

    when(screen){
        Screens.ProductsScreen -> ProductsScreen(viewModel, onClick = { navigationController.navigateTo(Screens.ProductInfoScreen) })
        Screens.ProductInfoScreen -> ProductInfoScreen(
            viewModel,
            onClick = {
                val product = viewModel.prodductList[0]
                viewModel.korzinaList.add(product.name)
                navigationController.navigateTo(Screens.KorzinaScreen)
            })

        Screens.KorzinaScreen -> KorzinaScreen(viewModel)
    }
}