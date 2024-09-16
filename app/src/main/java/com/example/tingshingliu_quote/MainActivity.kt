package com.example.tingshingliu_quote

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tingshingliu_quote.ui.theme.TingShingLiuQuoteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TingShingLiuQuoteTheme {
                Greeting()
                }
            }
        }
    }

@Composable
fun Greeting() {
    val showText = remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { showText.value = !showText.value }) {
            Text(text = "Click Me")
        }
        if (!showText.value) {
            Text(listOf("You Matter!", "Today will be a better day", "Its ok to be weak But staying weak isn't", "Fighting!!").random())
        }
        if (showText.value) {
            Text(text = listOf("You Matter!", "Today will be a better day", "Its ok to be weak But staying weak isn't", "Fighting!!").random(),
                modifier = Modifier.padding(16.dp))
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TingShingLiuQuoteTheme {
        Greeting()
    }
}