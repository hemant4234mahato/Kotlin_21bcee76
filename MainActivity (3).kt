package com.example.scaffold

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AssistChip
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalBottomSheetDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.scaffold.ui.theme.ScaffoldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {


//            ScaffoldSample()
//            CardExample()
//            ChipExample()

//            BottomCardExample()

//            CounterButton()
TextFieldSAmple()

//            var showBottomSheet  remember {
//                mutableStateOf(value = false)
//            }








//            ScaffoldTheme {
//                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }





        }
    }

    @Composable
    fun AlertDialogFunction(
        onConfirmation: () -> Unit
    ) {
        AlertDialog(title = {
            Text(text = "i am alert")
        },
            text = {
                Text(text = "Please Acknowledge")
            },
            onDismissRequest = { /*TODO*/ }, confirmButton = {
                Button(onClick = { onConfirmation()
                }) {
                    Text(text = "Ok")
                }
            })
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun ScaffoldSample() {
        Scaffold(
            topBar = {
                TopAppBar(
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        titleContentColor = MaterialTheme.colorScheme.primary

                    ),
                    title = {
                        Text(text = "My top App bar")
                    }
                )
            },



            bottomBar = {
                BottomAppBar (
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    contentColor = MaterialTheme.colorScheme.primary

                ){
                    Text(text = "this is my bottom bar")
                }

            },
            floatingActionButton = {FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.AccountBox, contentDescription = "Add Account")
            }
    }
        ) {
            it ->

            Column(modifier = Modifier.padding((it))) {



            }
        }
    }
    
    @Composable
    fun CardExample(){
        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.Red

            ),
            modifier = Modifier
                .size(width = 300.dp, height = 150.dp)
                .padding(16.dp)
        ) {
            Text(text = "Sample card example")
        }
    }

    @Composable
    fun ChipExample(){
        AssistChip(onClick = { /*TODO*/ }, label = {
        Text(text = "i am assist chip")
        }, leadingIcon = {
            Icon(
                Icons.Filled.Menu,
                contentDescription = ""

            )
        })
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun BottomCardExample(){

        var showBottomSheet by remember {
            mutableStateOf(value = false)
        }
        val sheetState = rememberModalBottomSheetState(
            skipPartiallyExpanded = false
        )
        Column {
            Button(onClick = {
                showBottomSheet = true
            }) {
                Text(text = "show bottom card")
            }
            if (showBottomSheet)
            {
                ModalBottomSheet(modifier = Modifier.fillMaxHeight(),sheetState = sheetState,onDismissRequest = { showBottomSheet = false }) {
                    Text(text = "i Am inside bottom sheet", modifier = Modifier.padding(20.dp))
                }            }
        }

    }

    @Composable
    fun CounterButton(){
        var count by remember{
            mutableStateOf(value =0 )
        }
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            Text(text = "count value: $count")
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { count++ }) {
                Text(text = "increment Count")

            }

            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { count-- }) {
                Text(text = "decrement Count")

            }
        }
    }
    
    @Composable
    fun TextFieldSAmple(){
        var text by remember {
            mutableStateOf(value = "")
        }
        Column(modifier = Modifier.padding(20.dp)) {
            TextField(value = text, onValueChange = {newText ->
                println("i am getting changed")
                text = newText
            }, label = {
                Text(text = "Enter Anything")
            }, modifier = Modifier.fillMaxWidth(),
                placeholder = {
                    Text(text = "Placeholder")
                }
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "hello from user input $text")
        }
    }

}

