package com.orange.orangetransact.pages

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomePage() {
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeBody() {
    Scaffold(containerColor = Color.White) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(modifier = Modifier.fillMaxWidth().weight(1f)) {
                Box(
                    modifier =
                        Modifier
                            .weight(1f)
                            .background(Color.Green)
                            .fillMaxHeight(),
                )

                Box(
                    modifier =
                        Modifier
                            .weight(1f)
                            .background(Color.Blue)
                            .fillMaxHeight(),
                )
            }

            // Text("Hello World")
            Box(
                modifier =
                    Modifier
                        .weight(1f)
                        .background(Color.Red)
                        .fillMaxWidth(),
            )
        }
    }
}

@Composable
@Preview
fun HomeBodyPreview() {
    HomeBody()
}
