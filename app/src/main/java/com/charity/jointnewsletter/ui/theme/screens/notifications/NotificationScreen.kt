package com.charity.jointnewsletter.ui.theme.screens.notifications
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch


@Composable
fun MyAppNotification() {
        NotificationScreen()

}

@Composable
fun NotificationScreen() {
    val coroutineScope = rememberCoroutineScope()
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Click to display new notifications",
            fontStyle = FontStyle.Italic,
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Icon(
            imageVector = Icons.Default.Notifications,
            contentDescription = "Info Icon",
            modifier =
            Modifier
                .clickable {
                coroutineScope.launch {
                    Toast.makeText(context, "Hello! You don't have a new notification.", Toast.LENGTH_SHORT).show()
                }
             }
                .size(width = 160.dp, height = 160.dp)
                .background(Color(0xFFF3C3A3))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyAppNotification()
}
