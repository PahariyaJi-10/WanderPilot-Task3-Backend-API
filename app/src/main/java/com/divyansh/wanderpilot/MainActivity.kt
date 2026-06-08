package com.divyansh.wanderpilot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.divyansh.wanderpilot.ui.home.HomeScreen
import com.divyansh.wanderpilot.ui.theme.WanderPilotTheme
import com.divyansh.wanderpilot.ui.destination.DestinationDetailsScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WanderPilotTheme {
                DestinationDetailsScreen()
            }
        }
    }
}