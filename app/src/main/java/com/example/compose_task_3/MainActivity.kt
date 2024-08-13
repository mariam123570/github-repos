@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.compose_task_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

    }
}

@Composable
fun AppBar(){
    Surface(
        color = Color.White,
        modifier = Modifier.fillMaxSize()
    ) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        CenterAlignedTopAppBar(
            title = { Text("Github Repositories") }
        )


        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.error), // Replace with your image resource
                contentDescription = "An error occured",
                modifier = Modifier.size(200.dp) // Adjust size as needed
            )
            Text(
                text = "Something went wrong...",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                modifier = Modifier.padding(16.dp)
            )
            Spacer(modifier = Modifier.height(4.dp)) // Adjust height as needed
            Text(
                text = "Network Error",
                color = Color.Gray,
            )
        }
        Button(
            onClick = { /* Handle button click */ },
            //modifier = Modifier.shape(RoundedCornerShape(0.dp)),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White
            )
        ) {
            Text(
                text ="Retry",
                color = Color.Black,
                fontSize = 30.sp
            )
        }
    }
}}

@Preview
@Composable
fun MyAppBarPreview() {
    AppBar()
}

