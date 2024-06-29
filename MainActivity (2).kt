package com.example.architecture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CounterView()
        }
    }

    @Composable
    fun CounterView(counterVM: CounterViewModel =  viewModel()) {
        val counterState = counterVM.counter.value
        Column {
            Text(text = "current counter value :  ${counterState.count}")
        }
    }
}

// Model Class
data class Counter(val count: int)

class int {

}

data class User(val username: String, val password: String)


//viewModel class

class CounterViewModel : ViewModel(){
    private val _counter = mutableStateOf(Counter(0))
    val counter: State<Counter> = _counter

    fun incrementCounter(){
        _counter.value = Counter(_counter.value.count + 1)
    }

    fun decrementCounter(){
        _counter.value = Counter(_counter.value.count - 1)
    }
}

