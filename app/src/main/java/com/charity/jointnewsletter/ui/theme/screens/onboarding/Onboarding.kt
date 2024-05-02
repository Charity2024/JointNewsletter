package com.charity.jointnewsletter.ui.theme.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.charity.jointnewsletter.navigation.ROUTE_HOME
import com.charity.jointnewsletter.R


@Composable
fun OnboardingScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(id = R.drawable.onboarding_image),
            contentDescription = "Onboarding Image",
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
        )
        Text(
            text = "Welcome to our News App!",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = "Get the latest news and updates right at your fingertips.",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 32.dp)
        )

        Button(onClick = {
            navController.navigate(ROUTE_HOME)
        },modifier = Modifier.fillMaxWidth()) {
            Text(text = "Continue")
        }

    }
}

@Preview
@Composable
fun PreviewOnboardingScreen() {
    OnboardingScreen(rememberNavController())
}

