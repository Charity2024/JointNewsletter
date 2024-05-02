package com.charity.jointnewsletter.ui.theme.screens.about

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "About") }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "News App",
             //   style = MaterialTheme.typography.h5,
                modifier = Modifier.padding(vertical = 16.dp)
            )
            Text(
                text = "Version 1.0",
             //   style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            Text(
                text = "This is a simple news app built with Jetpack Compose.",
              //  style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            Text(
                text = "© 2024 News App. All rights reserved.",
              //  style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(vertical = 8.dp)
            )
        }
    }
}

@Preview
@Composable
fun PreviewAboutScreen() {
    AboutScreen(rememberNavController())
}
