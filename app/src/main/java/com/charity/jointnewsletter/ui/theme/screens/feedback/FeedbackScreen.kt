package com.charity.jointnewsletter.ui.theme.screens.feedback

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun FeedbackScreen(navController: NavController) {
    var feedbackText by remember { mutableStateOf("") }
    var rating by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Feedback") },
                modifier = Modifier
                    .background(Color(0xFFF3C3A3)),

            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("How would you rate your experience?")
                Spacer(modifier = Modifier.height(16.dp))
                RatingBar(
                    rating = rating,
                    onRatingChanged = { newRating ->
                        rating = newRating
                    }
                )
                Spacer(modifier = Modifier.height(32.dp))
                TextField(
                    value = feedbackText,
                    onValueChange = { newText ->
                        feedbackText = newText
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Enter your feedback") },
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text)
                )
                Spacer(modifier = Modifier.height(32.dp))
                Button(onClick = { /* Handle submit feedback */ }) {
                    Text("Submit")
                }
            }
        }
    )
}

@Composable
fun RatingBar(rating: Int, onRatingChanged: (Int) -> Unit) {
    Row {
        (1..5).forEach { index ->
            IconButton(
                onClick = { onRatingChanged(index) },
                modifier = Modifier.size(48.dp)
            ) {
                Icon(
                    if (index <= rating) Icons.Filled.Star else Icons.Outlined.Star,
                    contentDescription = null
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FeedbackScreen(navController = rememberNavController())
}
