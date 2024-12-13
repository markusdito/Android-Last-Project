package com.example.tes

import Detail
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun MovieMain() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "Dashboard"
    ) {
        composable("Dashboard") {
            DashboardContainer(navController)
        }

        composable(
            "detail/{id}",
            arguments = listOf(navArgument("id") { type = NavType.StringType })) {
                backStackEntry ->
            val numberString = backStackEntry.arguments?.getString("id")
            val numberArray = numberString?.map { it.toString().toInt() }?.toIntArray()

            val numberCategory = numberArray?.get(0)
            val numberIteration = numberArray?.get(1)
            Detail(
                title = film()[numberCategory!!][numberIteration!!][0].toString(),
                rating = film()[numberCategory][numberIteration][1].toString(),
                poster = poster()[numberCategory][numberIteration],
                desc = film()[numberCategory][numberIteration][2].toString(),
                navController = navController)
        }
    }
}

@Composable
fun DashboardContainer(navController: NavController) {
    val kategori = listOf("Trending", "Horror", "Action")
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(top = 24.dp, bottom = 24.dp),
    ) {
        for (i in 0..2) {
            ShowPartition(
                section = kategori[i],
                index = i,
                modifier = Modifier,
                navController
            )
            if (i < 2) {
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}