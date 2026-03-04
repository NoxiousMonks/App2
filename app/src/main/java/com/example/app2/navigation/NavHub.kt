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
        Screens.ProductsScreen -> ProductsScreen(viewModel, onClick = { id -> navigationController.navigateTo(Screens.ProductInfoScreen, id) })

        Screens.ProductInfoScreen -> ProductInfoScreen(
            viewModel,
            productId = navigationController.selectedProduct,
            onClick = {
//                product ->
////                val product = viewModel.productList[0]
//                viewModel.korzinaList.add(product.name)
                navigationController.navigateTo(Screens.KorzinaScreen, navigationController.selectedProduct)
            }
        )

        Screens.KorzinaScreen -> KorzinaScreen(viewModel)
    }
}