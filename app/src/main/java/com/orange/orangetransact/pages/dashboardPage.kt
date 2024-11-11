package com.orange.orangetransact.pages

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.orange.orangetransact.models.ActionItemData

@Composable
fun DashboardPage(){
  // TODO: VIEWMODEL
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DashboardBody(){
    Scaffold(){
        Column(modifier=Modifier.fillMaxSize().padding(20.dp) ){
            // Header
            Header()

            Spacer(modifier=Modifier.height(50.dp))

            // Balance
            Balance()

            Spacer(modifier=Modifier.height(50.dp))
            // Actions
            Actions()

        }
    }
}

@Composable
fun Header(){
    Row(modifier=Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically){
        Box(modifier=Modifier.clip(CircleShape)
            .background(Color.LightGray).padding(3.dp)){
            Icon(Icons.Default.Face,
                contentDescription = "Icône utilisateur")
        }
        Spacer(modifier=Modifier.width(5.dp))
        Text("ODC Orange")
        Spacer(modifier=Modifier.weight(1f))
        Icon(Icons.Default.Notifications,
            "Icône notifications",
            tint = Color.Gray)
        Spacer(modifier=Modifier.width(15.dp))
        Icon(Icons.Default.Settings,
            "Icône paramètre",
            tint=Color.Gray)



    }
}

@Composable
fun Balance(){
    Column(modifier=Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
        Text("Account Balance", color=Color.Gray)
        Row(modifier=Modifier,
            verticalAlignment = Alignment.CenterVertically){
            Text("$")
            Text("2,000,000",
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold
                )
        }
    }
}

@Composable
fun Actions(){
    val actions = listOf<ActionItemData>(
        ActionItemData("Withdraw",Icons.Default.Close),
        ActionItemData("Transfer",Icons.Default.Call),
        ActionItemData("Deposit",Icons.Default.Check),
       // "Withdraw","Transfer","Deposit",
        )

    Row(modifier=Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center){

        actions.forEach { action->
            ActionsItem(action)
        }


    }
}

@Composable
fun ActionsItem(action: ActionItemData){
    Column(horizontalAlignment = Alignment.CenterHorizontally){
        Box(modifier=Modifier.padding(horizontal = 15.dp)
            .size(50.dp).clip(CircleShape)
            .background(Color.Cyan).padding(3.dp),
            contentAlignment = Alignment.Center){
            Icon(action.icon,
                contentDescription = "Icône utilisateur",
                tint=Color.White)
        }
        Spacer(modifier=Modifier.height(10.dp))
        Text(action.title)
    }
}

@Composable
@Preview
fun DashboardBodyPreview(){
    DashboardBody()
}