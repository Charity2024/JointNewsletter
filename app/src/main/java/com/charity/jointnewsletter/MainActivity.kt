package com.charity.jointnewsletter

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.charity.jointnewsletter.components.BottomNavBar
import com.charity.jointnewsletter.databinding.ActivityMainBinding
import com.charity.jointnewsletter.navigation.AppNavHost
import com.charity.jointnewsletter.ui.theme.JointNewsletterTheme
import com.google.firebase.Firebase
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.database

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Firebase.database.setPersistenceEnabled(true) // Enable offline persistence
        setContent {
            JointNewsletterTheme {
                AppNavHost()
                BottomNavBar()

               // MyArticleApp()

            }
        }
    }

}


