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
        Screens.ProductsScreen -> ProductsScreen(viewModel,
            onClick = { id ->
                navigationController.navigateTo(Screens.ProductInfoScreen)
                navigationController.selectedProductID(id)
            })

        Screens.ProductInfoScreen -> ProductInfoScreen(
            viewModel,
            productId = navigationController.selectedProduct,
            onClick = {
//                product ->
                val product = viewModel.productList[navigationController.selectedProduct]
                viewModel.korzinaList.add(product.name)
                navigationController.selectedProductID(navigationController.selectedProduct)
                navigationController.navigateTo(Screens.KorzinaScreen)
            },
            onBack = { navigationController.navigateBack() }
        )

        Screens.KorzinaScreen -> KorzinaScreen(viewModel,
            onClick = {
                navigationController.navigateTo(Screens.ProductsScreen, )
            },
            onBack = { navigationController.navigateBack() }
        )
    }
}