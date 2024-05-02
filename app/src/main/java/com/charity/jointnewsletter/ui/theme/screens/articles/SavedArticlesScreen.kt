package com.charity.jointnewsletter.ui.theme.screens.articles

import android.annotation.SuppressLint
import androidx.compose.foundation.background
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
import androidx.compose.runtime.*
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
fun SavedArticlesScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Saved Articles") }
            )
        }
    ) {
        SavedArticlesList(savedArticles = savedArticles)
    }
}

@Composable
fun SavedArticlesList(savedArticles: List<Article>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        items(savedArticles) { article ->
            SavedArticleItem(article = article)
        }
    }
}

@Composable
fun SavedArticleItem(article: Article) {
    Card(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth(),
        elevation = 4.dp
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = article.title,
                style = MaterialTheme.typography.subtitle1,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = article.description,
                style = MaterialTheme.typography.body2,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2
            )
        }
    }
}

@Preview
@Composable
fun PreviewSavedArticlesScreen() {
    val savedArticles = listOf(
        Article(
            "Article Title 1", "Article Description 1", listOf(
                Article("Related Article 1", "Related Article Description 1"),
                Article("Related Article 2", "Related Article Description 2"),
                Article("Related Article 3", "Related Article Description 3")
                // Add more related articles as needed
            )
        ),
        Article(
            "Article Title 2", "Article Description 2", listOf(
                Article("Related Article 1", "Related Article Description 1"),
                Article("Related Article 2", "Related Article Description 2"),
                Article("Related Article 3", "Related Article Description 3")
                // Add more related articles as needed
            )
        ),
        Article(
            "Article Title 3", "Article Description 3", listOf(
                Article("Related Article 1", "Related Article Description 1"),
                Article("Related Article 2", "Related Article Description 2"),
                Article("Related Article 3", "Related Article Description 3")
                // Add more related articles as needed
            )
        )
        // Add more saved articles as needed
    )
    SavedArticlesScreen(rememberNavController())
}

data class Article(val title: String, val description: String)
*/