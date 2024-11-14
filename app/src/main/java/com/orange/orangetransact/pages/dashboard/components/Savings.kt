package com.orange.orangetransact.pages.dashboard.components

import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Savings() {
   Column(modifier=Modifier.fillMaxWidth()){
       Text("Targeted Savings")
       Row(modifier = Modifier.horizontalScroll(rememberScrollState())){
           SavingsItem()
           SavingsItem()
           SavingsItem()
       }
   }

}

@Composable
fun SavingsItem(){
    Card(modifier= Modifier
        .width(300.dp)
        .padding(8.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFCBC6C6)
        )){

        Row(modifier=Modifier.fillMaxWidth()){
            Box(contentAlignment = Alignment.Center,
                modifier=Modifier.padding(10.dp)) {
                CircularProgressIndicator(
                    progress={ 0.8f },
                    modifier = Modifier.size(50.dp),
                    color = Color(0xFF3B8BF6),
                    strokeWidth = 5.dp,
                    strokeCap = StrokeCap.Round
                )
                Text("40%")
            }

            Column(modifier= Modifier.weight(1f).padding(5.dp)){
                Text("Summer Vacation",
                    color=Color(0xFF000000), fontWeight = FontWeight.Light)
                Row {
                    Text("$", fontSize = 9.sp)
                    Text("2000", fontWeight = FontWeight.Bold)
                }
                Spacer(Modifier.height(10.dp))

                Text("Goal: $3000",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.End)
            }
        }
    }
}

@Composable
@Preview(device= Devices.PIXEL_6, showBackground = true)
fun SavingsPreview(){
    Savings()
}