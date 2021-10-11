package com.ozgurerdogan.kotlin_jetpackcomposestatemanagement

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OtherScreen() {

    Surface(color= Color.LightGray) {
        Column(
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            var myString= remember { mutableStateOf("Android text deneme") }

            TextField(value = myString.value, onValueChange ={
                myString.value=it
            } )

            Text(text = "Hello!",
                fontSize = 45.sp,
                color= Color.Blue)

            Spacer(modifier = Modifier.padding(10.dp))

            Button(onClick = {
                println("clicked")
            }) {
                Text(text ="Button")
                Text(text = "Text")
            }
            Spacer(modifier = Modifier.padding(10.dp))

            Image(bitmap = ImageBitmap.imageResource(id = R.drawable.ayasofya2),
                contentDescription ="ayasofya")

            Spacer(modifier = Modifier.padding(10.dp))

            Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_background),
                contentDescription = "")

        }



    }


}