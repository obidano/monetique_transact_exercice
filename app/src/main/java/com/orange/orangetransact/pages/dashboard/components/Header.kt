package com.orange.orangetransact.pages.dashboard.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Header(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier.clip(CircleShape)
                .background(Color.LightGray).padding(3.dp)
        ) {
            Icon(
                Icons.Default.Face,
                contentDescription = "Icône utilisateur"
            )
        }
        Spacer(modifier = Modifier.width(5.dp))
        Text("ODC Orange")
        Spacer(modifier = Modifier.weight(1f))
        Icon(
            Icons.Default.Notifications,
            "Icône notifications",
            tint = Color.Gray
        )
        Spacer(modifier = Modifier.width(15.dp))
        Icon(
            Icons.Default.Settings,
            "Icône paramètre",
            tint = Color.Gray
        )


    }
}