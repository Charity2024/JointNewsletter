package com.charity.jointnewsletter.ui.theme.screens.notification

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotificationScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Notifications") }
            )
        }
    ) {
       // NotificationList(notificationList = notificationList)
    }
}

@Composable
fun NotificationList(notificationList: List<Notification>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        items(notificationList) { notification ->
            NotificationItem(notification = notification)
        }
    }
}

@Composable
fun NotificationItem(notification: Notification) {
    Card(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth(),
        //elevation = 4.dp
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = notification.title,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = notification.message,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }
    }
}

@Preview
@Composable
fun PreviewNotificationScreen() {
    val notificationList = listOf(
        Notification("Breaking News", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."),
        Notification("New Article", "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.")
        // Add more notifications as needed
    )
    NotificationScreen(rememberNavController())
}

data class Notification(val title: String, val message: String)
