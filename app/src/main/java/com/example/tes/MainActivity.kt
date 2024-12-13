package com.example.tes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tes.ui.theme.TesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column() {
                        ShowPartition(
                            section = "Trending", title = "Hello Panda", rating = 5.6, modifier = Modifier
                        )
                        Spacer(modifier = Modifier.size(16.dp))
                        ShowPartition("Horor", title = "Insidious", rating = 8.1, modifier = Modifier)
                    }
                }
            }
        }
    }
}