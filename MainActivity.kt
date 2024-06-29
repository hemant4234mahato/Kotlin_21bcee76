package com.example.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation.ui.theme.NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
//            AppNavigation()

            ListExample()
        }
    }




    @Composable
    fun AppNavigation(){
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "Screen1" ) {
            composable( "Screen1") {
                Screen1(navController)
            }
            composable( "Screen2") {
                Screen2(navController)
            }
            composable( "Screen3") {
                Screen3(navController)
            }
            composable( "Screen4") {
                Screen4(navController, "hemant")
            }
        }
    }

    @Composable
    fun Screen1(navController: NavController){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            Text(text = "this is screen1 ", color = Color.Red)

            Button(onClick = { navController.navigate("Screen2") }) {
                Text(text = "Go to Screen 2")
            }
        }
    }

    @Composable
    fun Screen2(navController: NavController){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            Text(text = "this is screen2 ", color = Color.Blue)

            Button(onClick = { navController.navigate("Screen3") }) {
                Text(text = "Go to Screen 3")
            }
        }
    }

    @Composable
    fun Screen3(navController: NavController){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            Text(text = "this is screen3 ", color = Color.Green)

            Button(onClick = { navController.navigate("Screen4") }) {
                Text(text = "Go to Screen 4")
            }
        }
    }

    @Composable
    fun Screen4(navController: NavController, data: String){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            Text(text = "this is screen4 with $data ", color = Color.Yellow)


        }
    }

    @Composable
    fun ListExample(){
        val itemsList = List(100) { "items : $it" }
        LazyColumn(modifier = Modifier.fillMaxSize()){
            items(itemsList) { item ->
                BasicText(text = item)
            }
        }
    }


//    @Composable
//    fun Screen5(navController: NavController){
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(20.dp)
//        ) {
//            Text(text = "this is screen4 ")
//
//            Button(onClick = { navController.navigate("Screen1") }) {
//                Text(text = "Go to Screen 1")
//            }
//        }
//    }
}

