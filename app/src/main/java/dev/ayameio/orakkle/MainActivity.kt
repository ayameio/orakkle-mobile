package dev.ayameio.orakkle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.ayameio.orakkle.ui.theme.OrakkleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OrakkleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(modifier = Modifier, contentAlignment = Alignment.Center) {
                        Text(text = "Hello World!")
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomePreview() {
    Box(modifier = Modifier, contentAlignment = Alignment.Center) {
        Text(text = "Hello World!")
    }
}