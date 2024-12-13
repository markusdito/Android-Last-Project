package com.example.tes

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ShowPartition(section: String, title: String, rating: Double, modifier: Modifier, navController: NavController) {
    //Heading Container
    Column(
        modifier = Modifier
    ) {
        header(section)
        Spacer(modifier = Modifier.height(20.dp))
        contentContainer(navController = navController)
    }
}

@Composable
fun contentContainer(navController: NavController) {
    // Body Container
    Row(
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
    ) {
        // Image Container
        for (j in 1..20) {
            content(title = "X", rating = 5.6, modifier = Modifier, navController = navController)
        }
    }
}

@Composable
fun content(title: String, rating: Double, modifier: Modifier = Modifier, navController: NavController) {
    Column(
        modifier = Modifier
            .padding(start = 16.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.gambarmie),
            contentDescription = "Test",
            modifier = Modifier
                .width(150.dp)
                .height(225.dp)
                .clickable{navController.navigate("detail")},
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
                Box(
                    modifier = Modifier
                        .width(16.dp)
                        .height(16.dp)
                        .border(1.dp, Color.Gray)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = rating.toString(),
                    fontSize = 16.sp,
                )
            }
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
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
        Text(
            text = "See all",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF008CFF)
        )
    }
}