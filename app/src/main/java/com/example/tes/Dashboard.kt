package com.example.tes

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.*

@Composable
fun ShowPartition(section: String, index: Int, modifier: Modifier, navController: NavController) {
    //Heading Container
    Column(
        modifier = Modifier
    ) {
        header(section)
        Spacer(modifier = Modifier.height(20.dp))
        contentContainer(index, navController = navController)
    }
}

@Composable
fun contentContainer(index: Int, navController: NavController) {
    val film = film()
    // Body Container
    Row(
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
    ) {
        // Image Container
        for (i in 0 until film[0].size) {
            content(id = arrayOf(index, i), title = film[index][i][0].toString(), rating = film[index][i][1] as Double, image = poster()[index][i],  modifier = Modifier, navController = navController)
        }
    }
}

@Composable
fun content(id: Array<Int>, title: String, rating: Double, image: Int, modifier: Modifier = Modifier, navController: NavController) {
    Column(
        modifier = Modifier
            .padding(start = 16.dp)
    ) {
        val number = "${id[0]}" + "${id[1]}"
        Image(
            painter = painterResource(image),
            contentDescription = "Test",
            modifier = Modifier
                .width(150.dp)
                .height(225.dp)
                .clickable{navController.navigate("detail/$number")},
        )
        Spacer(modifier = Modifier.height(8.dp))
        //Body Container
        Column(
            modifier = Modifier
                .padding(start = 16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
            ) {
                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "Rating",
                    tint = Color.Yellow,
                    modifier = Modifier.padding(end = 4.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = rating.toString(),
                    fontSize = 16.sp,
                )
            }
            Text(
                text = title,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .width(150.dp)
            )
        }
    }
}

@Composable
fun header(section: String) {
//Show text as row
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = section,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}