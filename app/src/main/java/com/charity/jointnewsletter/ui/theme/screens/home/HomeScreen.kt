package com.charity.jointnewsletter.ui.theme.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


/*@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    val newsList = remember { mutableStateListOf(
        NewsItem("News Title 1", "News Description 1"),
        NewsItem("News Title 2", "News Description 2"),
        NewsItem("News Title 3", "News Description 3")
    )}

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "News App") }
            )
        }
    ) {
        NewsList(newsList = newsList)
    }
}

@Composable
fun NewsList(newsList: List<NewsItem>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        items(newsList) { newsItem ->
            NewsItem(newsItem = newsItem)
        }
    }
}

@Composable
fun NewsItem(newsItem: NewsItem) {
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
                text = newsItem.title,
               // style = MaterialTheme.typography.subtitle1,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = newsItem.description,
                //style = MaterialTheme.typography.body2,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }
    }
}

@Preview
@Composable
fun PreviewNewsApp() {
    HomeScreen(rememberNavController())
}
*/