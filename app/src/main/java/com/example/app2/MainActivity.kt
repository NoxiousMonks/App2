package com.example.app2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.app2.models.MainViewModel
import com.example.app2.navigation.NavHub
import com.example.app2.navigation.NavigationController
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

