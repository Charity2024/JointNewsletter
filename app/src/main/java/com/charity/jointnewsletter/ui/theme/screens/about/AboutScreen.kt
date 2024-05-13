package com.charity.jointnewsletter.ui.theme.screens.about

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "About ",
                    fontSize = 30.sp) },

            )
        }
    ) {


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 50.dp)
                .background(Color(0xFFACDF87))
        ) {
            Text(
                text = "Joint Weekly Newsletter",
                modifier = Modifier.padding(vertical = 10.dp),
                fontSize = 30.sp

            )
            Text(
                text = "About this newsletter: " ,
                modifier = Modifier
                    .padding(vertical = 5.dp),
                color = Color.Red,
                fontSize = 20.sp
            )
            Text(
                text ="Founded in October 2023 as an in-house culture exchange project, today we are dedicated to providing a diverse, open, and inclusive platform for cultural exchange and more. With regular contributions from teens around the world, we are a one-of-a-kind international student newsletter.",
                modifier = Modifier.padding(vertical = 8.dp),
                fontSize = 17.sp
            )
            Text(
                text = "Editor-in-chief   :Jialiang Tang \n" ,
                fontSize = 20.sp,
                modifier = Modifier.padding(vertical = 2.dp)
            )

            Text(
                text =
                        "Contributing Writers: Jialiang Tang (Class 22, Grade 11, China), Diwme Vihanga (Sri Lanka), Maura Blacke (Germany), Jane (Russia), Mina (Italy),  Opy (Bangladesh), Charity (Kenya), Rui Zhong (China),  Olive (Kenya)\n" ,
                modifier = Modifier.padding(vertical = 2.dp),
                fontSize = 19.sp
            )
            Text(
                text =  "Distribution   : Jialiang Tang, Duyi Xu (Honggutan Campus), Wenjing Hu (Supu Campus)",
                modifier = Modifier.padding(vertical = 2.dp),
                fontSize = 19.sp
            )
            Spacer(modifier = Modifier.height(100.dp))
            Text(
                text = "© 2024 Joint Weekly Newsletter  App. All rights reserved.",
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
