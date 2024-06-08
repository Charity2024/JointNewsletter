package com.charity.jointnewsletter.ui.theme.screens.register

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.charity.jointnewsletter.R
import com.charity.jointnewsletter.data.AuthViewModel
import com.charity.jointnewsletter.navigation.Screen


@Composable
fun RegisterScreen(navController: NavHostController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }
    var confirmpass by remember { mutableStateOf(TextFieldValue("")) }
    val context= LocalContext.current
    val gradientColorList = listOf(
        Color(0xFFFED9B7),
        Color(0xFFF07167)
    )
    val scrollState = rememberScrollState()

    Column(modifier = Modifier
        .verticalScroll(scrollState)
        .fillMaxSize()
        .background(
            brush = gradientackgroundBrush(
                isVerticalGradient = true,
                colors = gradientColorList
            )

        ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(5.dp))
        Image(painter = painterResource(id = R.drawable.logo2 ),
            contentDescription = "logo" )
        Spacer(modifier = Modifier.height(5.dp))


        Text(text = "Register here",
            color = Color.Black,
            fontFamily = FontFamily.SansSerif,
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(3.dp))

        OutlinedTextField(
            value = email, onValueChange = { email = it },
            label = { Text(text = "Enter Email", color = Color.Black) },
            leadingIcon = { Icon(imageVector = Icons.Default.MailOutline, contentDescription = "") },
            keyboardOptions = KeyboardOptions . Default . copy (imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .padding(8.dp),

            )
        Spacer(modifier = Modifier.height(1.dp))

        OutlinedTextField(value =pass , onValueChange = {pass=it},
            label = { Text(text = "Enter password", color = Color.Black) },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.height(1.dp))
        OutlinedTextField(value =confirmpass , onValueChange = {
            confirmpass=it},
            label = { Text(text = " Confirm Password", color = Color.Black) },
            leadingIcon = { Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .padding(8.dp)

        )
        Spacer(modifier = Modifier.height(1.dp))


        Button(onClick = {
            val myregister= AuthViewModel(navController,context)
            myregister.signup(email.text.trim(),pass.text.trim(),confirmpass.text.trim()) },
            border = BorderStroke(1.dp, Color.DarkGray),
            colors = ButtonDefaults.buttonColors(Color(0xFFD5A187)),
            modifier = Modifier
                .fillMaxWidth(0.4f)
        ) {
            Text(text = "Register",
                color = Color.Black
            )
        }
        Spacer(modifier = Modifier.height(3.dp))


        Text(text = "Have an Account? Click to Login",
            color = Color.Black,
            modifier = Modifier
                .clickable { navController.navigate(Screen.Login.route)}
        )
        Spacer(modifier = Modifier.height(70.dp))



    }

}

@Composable
private fun gradientackgroundBrush(
    isVerticalGradient: Boolean,
    colors:List<Color>
): Brush {
    val endOffset = if (isVerticalGradient){
        Offset(0f, Float.POSITIVE_INFINITY)
    }else{
        Offset(Float.POSITIVE_INFINITY, 0f)
    }
    return Brush.linearGradient(
        colors = colors,
        start = Offset.Zero,
        end = endOffset
    )

}

@Preview
@Composable
fun Register() {
    RegisterScreen(rememberNavController())

}