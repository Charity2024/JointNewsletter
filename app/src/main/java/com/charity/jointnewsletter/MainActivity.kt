package com.charity.jointnewsletter

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.charity.jointnewsletter.components.NavScreen
import com.charity.jointnewsletter.navigation.AppNavHost
import com.charity.jointnewsletter.ui.theme.JointNewsletterTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JointNewsletterTheme {
                AppNavHost()
                val navController = rememberNavController()
                Surface(modifier = Modifier.fillMaxSize()) {
                    NavScreen(navController = navController)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    val navController = rememberNavController()
    JointNewsletterTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            NavScreen(navController = navController)
        }
    }
}
