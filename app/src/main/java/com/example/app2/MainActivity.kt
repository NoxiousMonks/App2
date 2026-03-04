package com.example.app2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.app2.models.MainViewModel
import com.example.app2.navigation.NavHub
import com.example.app2.navigation.NavigationController
import com.example.app2.screens.ProductsScreen
import com.example.app2.ui.theme.App2Theme

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()
    private val navigationController: NavigationController by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App2Theme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//
//                }
                NavHub(viewModel, navigationController)
            }
        }
    }
}

data class Product(
    val id: Int,
    val name: String,
    val description: String
)