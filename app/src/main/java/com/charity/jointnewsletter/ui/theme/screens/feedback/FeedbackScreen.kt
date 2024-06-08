package com.charity.jointnewsletter.ui.theme.screens.feedback

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun FeedbackScreen(navController: NavController) {
    var feedbackText by remember { mutableStateOf("") }
    var rating by remember { mutableStateOf(0) }
    val context = LocalContext.current

    // Firebase Database reference
    val database: DatabaseReference = FirebaseDatabase.getInstance().reference

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Feedback") },
                modifier = Modifier.background(Color(0xFFF3C3A3))
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFF3C3A3))
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("How would you rate your experience on our Newsletter?")
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
                Button(onClick = {
                    val feedback = mapOf(
                        "rating" to rating,
                        "feedbackText" to feedbackText
                    )
                    database.child("feedbacks").push().setValue(feedback)
                        .addOnCompleteListener {
                            if (it.isSuccessful) {
                                Toast.makeText(context, "Thank you for your Feedback", Toast.LENGTH_SHORT).show()
                            } else {
                                Toast.makeText(context, "Failed to submit feedback", Toast.LENGTH_SHORT).show()
                            }
                        }
                }) {
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
