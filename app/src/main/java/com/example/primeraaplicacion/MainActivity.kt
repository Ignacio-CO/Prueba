package com.example.primeraaplicacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.primeraaplicacion.ui.theme.PrimeraAplicacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimeraAplicacionTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Ignacio",
                        from = "Nacho",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, from: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Black) {
        Text(
            text = "Buenas $name!",
            modifier = modifier.padding(13.dp),
            fontSize = 100.sp,
            lineHeight = 116.sp,
            color = Color.White
        )
    }
    Row {
        Text(
            text = from,
            textDecoration = TextDecoration.Underline,
            color = Color.Green,
        )
        Text(
            text = "Caracola",
            color = Color.White,
            
        )
    }


}


@Preview(showBackground = true)
@Composable
fun CartaDeCumpleaños() {
    PrimeraAplicacionTheme {
        Greeting("Ignacio", "Nacho")
    }
}