package com.charity.jointnewsletter.components

import android.annotation.SuppressLint
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.charity.jointnewsletter.navigation.AppNavHost


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NavScreen(navController: NavHostController) {
    Scaffold(bottomBar = {
        BottomAppBar { BottomNavigationBar(navController = navController) }
    }) { AppNavHost(navController = navController) }
}