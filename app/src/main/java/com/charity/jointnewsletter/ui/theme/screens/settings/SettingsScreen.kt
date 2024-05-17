package com.charity.jointnewsletter.ui.theme.screens.settings

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.charity.jointnewsletter.R
import com.charity.jointnewsletter.navigation.ROUTE_ABOUT
import com.charity.jointnewsletter.navigation.ROUTE_CONTACT
import com.charity.jointnewsletter.navigation.ROUTE_FEEDBACK
import com.charity.jointnewsletter.navigation.ROUTE_POLICY
import com.charity.jointnewsletter.navigation.ROUTE_REGISTER
import com.charity.jointnewsletter.ui.theme.Poppins


@SuppressLint("InvalidColorHexValue")
@ExperimentalMaterialApi
@Composable
fun SettingsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .background(Color(0xFFF3C3A3))
    ) {
        HeaderText()
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
        color = Color.Black,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp, bottom = 2.dp),
        fontWeight = FontWeight.ExtraBold,
        fontSize = 25.sp
    )
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
            color = Color(0xFF0B3C49),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(vertical = 18.dp)
        )
        GeneralSettingItem(
            icon = R.drawable.ic_rounded_notification,
            mainText = "Notifications",
            subText = "Customize notifications",
            onClick = {

            }
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
                        color = Color(0xFF0B3C49),
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
            color = Color(0xFF0B3C49),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(vertical = 28.dp)

        )
        SupportItem(
            icon = R.drawable.ic_whatsapp,
            mainText = "Contact",
            onClick = {
                val navController = rememberNavController()
                navController.navigate(ROUTE_CONTACT)
            }
        )
        SupportItem(
            icon = R.drawable.ic_feedback,
            mainText = "Feedback",
            onClick = {
                val navController = rememberNavController()
                navController.navigate(ROUTE_FEEDBACK)
            }
        )
        SupportItem(
            icon = R.drawable.ic_privacy_policy,
            mainText = "Privacy Policy",
            onClick = {
                val navController = rememberNavController()
                navController.navigate(ROUTE_POLICY)
            }
        )
        SupportItem(
            icon = R.drawable.ic_about,
            mainText = "About",
            onClick = {
                val navController = rememberNavController()
                navController.navigate(ROUTE_ABOUT)
            }
        )
    }
}

@ExperimentalMaterialApi
@Composable
fun SupportItem(icon: Int, mainText: String, onClick: @Composable () -> Unit) {
    Card(
        onClick = { onClick},
        modifier = Modifier
            .padding(bottom = 15.dp)
            .background(Color(0xFFFED9B7))
            .fillMaxWidth(),

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
                    fontFamily = Poppins,
                    color =Color(0xFFD5A187),
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
    SettingsScreen(navController = rememberNavController())


}
