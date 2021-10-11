package com.ozgurerdogan.kotlin_jetpackcomposestatemanagement

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}
@Composable
fun MainScreen(){
    var myString= remember {
        mutableStateOf("")
    }

    androidx.compose.material.Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color.Gray
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(7.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SpecielText( "Android")
            Spacer(modifier = Modifier.padding(7.dp))
            SpecielText( "Özgür")
            Spacer(modifier = Modifier.padding(7.dp))
            SpecielFieldText(string = myString.value){
                myString.value=it
            }

        }
    }
}

@Composable
fun SpecielText(string: String){
    Text(text = string,
        fontSize = 24.sp,
        fontStyle = FontStyle.Italic,
        fontFamily = FontFamily.SansSerif)
}
@Composable
fun SpecielFieldText(string: String,function:(String)->Unit){
    TextField(
        value = string,
        onValueChange = function,
        modifier = Modifier.padding(7.dp))

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

}