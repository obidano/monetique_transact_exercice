package com.orange.orangetransact.pages.dashboard.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.orange.orangetransact.business.models.ActionItemData

@Composable
fun Actions(){
    val actions = listOf<ActionItemData>(
        ActionItemData("Withdraw", Icons.Default.Close),
        ActionItemData("Transfer", Icons.Default.Call),
        ActionItemData("Deposit", Icons.Default.Check),
       // "Withdraw","Transfer","Deposit",
        )

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {

        actions.forEach { action ->
            ActionsItem(action)
        }


    }
}

@Composable
fun ActionsItem(action: ActionItemData){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier.padding(horizontal = 15.dp)
                .size(50.dp).clip(CircleShape)
                .background(Color.Cyan).padding(3.dp),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                action.icon,
                contentDescription = "Icône utilisateur",
                tint = Color.White
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(action.title)
    }
}