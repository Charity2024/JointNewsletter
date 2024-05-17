package com.charity.jointnewsletter

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.charity.jointnewsletter.components.NavBar
import com.charity.jointnewsletter.navigation.AppNavHost
import com.charity.jointnewsletter.ui.theme.JointNewsletterTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JointNewsletterTheme {
                AppNavHost()
                NavBar()
               // MyArticleApp()

            }
        }
    }
}


