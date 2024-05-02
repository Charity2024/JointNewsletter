package com.charity.jointnewsletter.ui.theme.screens.settings

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.charity.jointnewsletter.R


@ExperimentalMaterialApi
@Composable
fun SettingsScreen() {
    Column() {
        HeaderText()
        ProfileCardUI()
        GeneralOptionsUI()
        SupportOptionsUI()
    }
}

annotation class ExperimentalMaterialApi


@Composable
fun HeaderText() {
    Text(
        text = "Settings",
        fontFamily = FontFamily.SansSerif,
        color = Color(0xFFF07167),
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp, bottom = 10.dp),
        fontWeight = FontWeight.ExtraBold,
        fontSize = 16.sp
    )
}

@Composable
fun ProfileCardUI() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(10.dp)
            .background(Color.White),
       // elevation = 0.dp,
        //shape = Shapes.large
    ) {
        Row(
            modifier = Modifier.padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column() {
                Text(
                    text = "Check Your Profile",
                    fontFamily = FontFamily.SansSerif,
                    color = Color(0xFFF07167),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                )

                Text(
                    text = "UI.Stack.YT@gmail.com",
                    fontFamily = FontFamily.SansSerif,
                    color = Color.Gray,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                )

                Button(modifier = Modifier.padding(top = 10.dp), onClick = {}, colors = ButtonDefaults.buttonColors(
                        // backgroundColor = PrimaryColor
                    ), contentPadding = PaddingValues(horizontal = 30.dp), elevation = ButtonDefaults.elevation(
                        defaultElevation = 0.dp,
                        pressedElevation = 2.dp
                    ), shape = Shapes.medium) {
                    Text(
                        text = "View",
                        fontFamily = FontFamily.SansSerif,
                        color = Color(0xFFF07167),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Image(
                painter = painterResource(id = R.drawable.ic_profile_card_image),
                contentDescription = "",
                modifier = Modifier.height(120.dp)
            )
        }
    }
}

@ExperimentalMaterialApi
@Composable
fun GeneralOptionsUI() {
    Column(
        modifier = Modifier
            .padding(horizontal = 14.dp)
            .padding(top = 10.dp)
    ) {
        Text(
            text = "General",
            fontFamily = FontFamily.SansSerif,
            color = Color(0xFFF07167),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(vertical = 8.dp)
        )
        GeneralSettingItem(
            icon = R.drawable.ic_rounded_notification,
            mainText = "Notifications",
            subText = "Customize notifications",
            onClick = {}
        )
        GeneralSettingItem(
            icon = R.drawable.ic_more,
            mainText = "More customization",
            subText = "Customize it more to fit your usage",
            onClick = {}
        )
//        GeneralSettingItem()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@ExperimentalMaterialApi
@Composable
fun GeneralSettingItem(icon: Int, mainText: String, subText: String, onClick: () -> Unit) {
    Card(
        onClick = { onClick() },
        modifier = Modifier
            .padding(bottom = 8.dp)
            .fillMaxWidth()
            .background(Color.White),
       // elevation = 0.dp,
    ) {
        Row(
            modifier = Modifier.padding(vertical = 10.dp, horizontal = 14.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(34.dp)
                        //.clip(shape = Shapes.medium)
                        .background(Color(0xFFFED9B7))
                ) {
                    Icon(
                        painter = painterResource(id = icon),
                        contentDescription = "",
                        tint = Color.Unspecified,
                        modifier = Modifier.padding(8.dp)
                    )
                }

                Spacer(modifier = Modifier.width(14.dp))
                Column(
                    modifier = Modifier.offset(y = (2).dp)
                ) {
                    Text(
                        text = mainText,
                        fontFamily = FontFamily.SansSerif,
                        color = Color(0xFFF07167),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                    )

                    Text(
                        text = subText,
                        fontFamily = FontFamily.SansSerif,
                        color = Color.Gray,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.offset(y = (-4).dp)
                    )
                }
            }
            Icon(
                painter = painterResource(id = R.drawable.ic_right_arrow),
                contentDescription = "",
                modifier = Modifier.size(16.dp)
            )

        }
    }
}

@ExperimentalMaterialApi
@Composable
fun SupportOptionsUI() {
    Column(
        modifier = Modifier
            .padding(horizontal = 14.dp)
            .padding(top = 10.dp)
    ) {
        Text(
            text = "Support",
            fontFamily = FontFamily.SansSerif,
            color = Color(0xFFF07167),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(vertical = 8.dp)
        )
        SupportItem(
            icon = R.drawable.ic_whatsapp,
            mainText = "Contact",
            onClick = {}
        )
        SupportItem(
            icon = R.drawable.ic_feedback,
            mainText = "Feedback",
            onClick = {}
        )
        SupportItem(
            icon = R.drawable.ic_privacy_policy,
            mainText = "Privacy Policy",
            onClick = {}
        )
        SupportItem(
            icon = R.drawable.ic_about,
            mainText = "About",
            onClick = {}
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@ExperimentalMaterialApi
@Composable
fun SupportItem(icon: Int, mainText: String, onClick: () -> Unit) {
    Card(
        onClick = { onClick() },
        modifier = Modifier
            .padding(bottom = 8.dp)
            .background(Color(0xFFFED9B7))
            .fillMaxWidth(),
       // elevation = 0.dp,
    ) {
        Row(
            modifier = Modifier.padding(vertical = 10.dp, horizontal = 14.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(34.dp)
                        // .clip(shape = Shapes.medium)
                        .background(Color(0xFFFED9B7))
                ) {
                    Icon(
                        painter = painterResource(id = icon),
                        contentDescription = "",
                        tint = Color.Unspecified,
                        modifier = Modifier.padding(8.dp)
                    )
                }

                Spacer(modifier = Modifier.width(14.dp))

                Text(
                    text = mainText,
                    fontFamily = FontFamily.SansSerif,
                    color =Color(0xFFF07167),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
            Icon(
                painter = painterResource(id = R.drawable.ic_right_arrow),
                contentDescription = "",
                modifier = Modifier.size(16.dp)
            )

        }
    }
}
@Preview
@Composable
private fun Settingsprev(){
    SettingsScreen()
}
