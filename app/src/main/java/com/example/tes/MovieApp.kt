package com.example.tes

import Detail
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun MovieMain() {
    val navController = rememberNavController()

//    Column() {
//        ShowPartition(
//            section = "Trending", title = "Hello Panda", rating = 5.6, modifier = Modifier
//        )
//        Spacer(modifier = Modifier.size(16.dp))
//        ShowPartition("Horor", title = "Insidious", rating = 8.1, modifier = Modifier)
//    }

    NavHost(
        navController = navController,
        startDestination = "Dashboard"
    ) {
        composable("Dashboard") {
            ShowPartition(section = "Trending", title = "Movie A", rating = 5.6, modifier = Modifier, navController)
        }
        composable("detail") {
            Detail(name = "Endgame", navController = navController)
        }
    }
}