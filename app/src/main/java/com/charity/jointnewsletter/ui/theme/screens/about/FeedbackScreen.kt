package com.charity.jointnewsletter.ui.theme.screens.about

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FeedbackScreen(navController: NavHostController) {
    var feedbackText by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Feedback") }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            TextField(
                value = feedbackText,
                onValueChange = { feedbackText = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                label = { Text("Enter your feedback here") },
                singleLine = false
            )
           // Button(
             //   onClick = { onSubmitClicked(feedbackText) },
            //    modifier = Modifier.fillMaxWidth()
          //  ) {
          //      Text(text = "Submit Feedback")
          //  }
        }
    }
}

@Preview
@Composable
fun PreviewFeedbackScreen() {
    FeedbackScreen(rememberNavController())
}
