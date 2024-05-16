package com.charity.jointnewsletter.ui.theme.screens.flags

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.charity.jointnewsletter.R

@Composable
fun FlagScreen(navController: NavController) {
    val countries = listOf(
        Country("KENYA", "United States of America"),
        Country("DANNENBERG", "United Kingdom"),
        Country("GERMANY", "France"),
        Country("RUSSIA", "Germany"),
        Country("SRI LANKA", "Japan")
    )



    LazyColumn {
        items(countries) { country ->
            FlagCard(country = country, onClick = {
                navController.navigate("country/${country.code}")
            })
        }
    }
}

@Composable
fun FlagCard(country: Country, onClick: () -> Unit) {
    val modifier = Modifier
    Card(
        modifier
            .padding(10.dp)
            .wrapContentSize()
            .clickable {
                onClick
            },
        colors = CardDefaults.cardColors(
            containerColor = Color.LightGray
        ),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Row(
            modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            Image(
                painter = painterResource(id = getCountryFlag(country.code)) ,
                contentDescription = "",
                modifier = Modifier.size(48.dp),
                contentScale = ContentScale.FillWidth
            )

            Column(modifier.padding(12.dp)) {
                // You can load images here based on country
                Text(text = country.code, modifier = Modifier.padding(end = 16.dp))
                Text(text = country.description)

            }
        }

    }
}
@Composable
fun DetailedDescriptionScreen(countryCode: String,navController: NavController) {
    val countryName = getCountryName(countryCode)
    val countryDescription = getCountryDescription(countryCode)
    val countryImageResId = getCountryFlag(countryCode)

    Column {
        Image(painter = painterResource(id = countryImageResId),
            contentDescription = "",
            contentScale = ContentScale.FillWidth
        )

        Text(text = "Country: $countryName")
        Text(text = "Description: $countryDescription")
    }
}

// Rest of the code (getCountryName, getCountryDescription) remains the same
fun getCountryName(countryCode: String): String {
    return when (countryCode) {
        "KENYA" -> "United States of America"
        "DANNENBERG" -> "United Kingdom"
        "GERMANY" -> "France"
        "RUSSIA" -> "Germany"
        "SRI LANKA" -> "Japan"
        else -> "KENYA"
    }
}

fun getCountryDescription(countryCode: String): String {
    return when (countryCode) {
        "KENYA" -> "The United States of America is a country primarily located in North America."
        "DANNENBERG" -> "The United Kingdom of Great Britain and Northern Ireland, commonly known as the United Kingdom."
        "GERMANY" -> "France, officially the French Republic, is a transcontinental country spanning Western Europe and overseas regions and territories in the Americas and the Atlantic, Pacific, and Indian Oceans."
        "RUSSIA" -> "Germany, officially the Federal Republic of Germany, is a country in Central Europe."
        "SRI LANKA" -> "Japan, officially the State of Japan, is an island country in East Asia."
        else -> "No description available"
    }
}

// Rest of the code (getCountryFlag) remains the same


fun getCountryFlag(countryCode: String): Int {
    return when (countryCode) {
        "KENYA" -> R.drawable.kenya // Replace with your image resources
        "DANNENBERG" -> R.drawable.danish
        "GERMANY" -> R.drawable.germany
        "RUSSIA" -> R.drawable.russia
        "SRI LANKA" -> R.drawable.srilanka
        else -> R.drawable.flags
    }
}

data class Country(val code: String, val description: String) {

}

@Preview
@Composable
fun PreviewFlagScreen() {
    // Assuming you pass NavController as parameter
    // val navController = rememberNavController()
    FlagScreen(navController =rememberNavController())
    DetailedDescriptionScreen("USA", navController = rememberNavController())
}
