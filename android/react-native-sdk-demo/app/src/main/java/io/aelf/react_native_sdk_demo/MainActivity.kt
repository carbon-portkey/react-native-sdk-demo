package io.aelf.react_native_sdk_demo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.aelf.react_native_sdk_demo.ui.theme.ReactnativesdkdemoTheme
import io.aelf.rn_sdk.ReactNativeActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReactnativesdkdemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(::jumpToSDKActivity)
                }
            }
        }
    }

    private fun jumpToSDKActivity() {
        val intent = Intent(this@MainActivity, ReactNativeActivity::class.java)
        startActivity(intent)
    }
}

@Composable
fun Greeting(callback: () -> Unit) {
    Button(onClick = callback) {
        Text(text = "Jump!")
    }
}

