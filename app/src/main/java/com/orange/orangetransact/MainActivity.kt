package com.orange.orangetransact

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.orange.orangetransact.pages.dashboard.DashboardPage
import com.orange.orangetransact.ui.theme.OrangetransactTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OrangetransactTheme {
                DashboardPage()
            }
        }
    }
}
