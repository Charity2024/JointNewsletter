package com.charity.jointnewsletter.ui.theme.screens.contact

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContactScreen(navController: NavHostController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Contact") }
            )
        }
    ) {

        val modifier= Modifier
        Card(
            modifier
                .padding(vertical = 80.dp, horizontal = 27.dp)
                .wrapContentSize(),

            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFFED9B7)

            ),
            elevation = CardDefaults.cardElevation(10.dp),

        ) {
            Column(modifier.padding(12.dp)) {
                Text(text = "You can contact us through  :", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                Text(text = "Skype: Jialiang Tang\n" +
                        "Instagram: Plethora 2007\n" +
                        "QQ: 2057830352\n" +
                        "WeChat: j2057830352\n" +
                        "E-mail:\n" +
                        "plethora2007@qq.com\n" +
                        "jialiang.tang@foxmail.com\n" +
                        "j2057830352@gmail.com", fontSize = 20.sp)

            }
            


        }
    }
}

@Preview
@Composable
fun PreviewContactScreen() {
    ContactScreen(rememberNavController(),)
}
