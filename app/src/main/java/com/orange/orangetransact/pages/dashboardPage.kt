package com.orange.orangetransact.pages

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.orange.orangetransact.pages.components.Actions
import com.orange.orangetransact.pages.components.Balance
import com.orange.orangetransact.pages.components.Header

@Composable
fun DashboardPage() {
    // TODO: VIEWMODEL
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DashboardBody() {
    Scaffold {
        Column(modifier = Modifier.fillMaxSize().padding(20.dp)) {
            // Header
            Header()

            Spacer(modifier = Modifier.height(50.dp))

            // Balance
            Balance()

            Spacer(modifier = Modifier.height(50.dp))
            // Actions
            Actions()
        }
    }
}

@Composable
@Preview
fun DashboardBodyPreview() {
    DashboardBody()
}
