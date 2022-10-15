package com.paweljablonski.snkrs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.paweljablonski.snkrs.components.BottomNavBar
import com.paweljablonski.snkrs.navigation.SnkrsNavigation
import com.paweljablonski.snkrs.ui.theme.SNKRSTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalComposeUiApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SNKRSTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                      val navController = rememberNavController()
                      SnkrsNavigation(navController)
                }
            }
        }
    }
}

//@Composable
//fun MainScreenView(){
//    val navController = rememberNavController()
//    Scaffold(
//        bottomBar = { BottomNavBar(navController = navController) }
//    ) {
////        SnkrsNavigation()
//        NavigationGraph(navController = navController)
//    }
//}