package com.example.tes

import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ShowPartition(section: String, title: String, rating: Double, modifier: Modifier) {
    //Heading Container
    Column(
        modifier = Modifier
    ) {
        //Show text as row
        Row(
            modifier = modifier
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
        Spacer(modifier = Modifier.height(20.dp))

        // Body Container
        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
        ) {
            // Image Container
            for (j in 1..20) {
                Column(
                    modifier = Modifier
                        .padding(start = 16.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .height(225.dp)
                            .width(150.dp)
                            .border(1.dp, Color.Gray, shape = RoundedCornerShape(20.dp))
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
                if (j < 20) {
                    Spacer(modifier = Modifier.size(8.dp))
                }
            }
        }
    }
}