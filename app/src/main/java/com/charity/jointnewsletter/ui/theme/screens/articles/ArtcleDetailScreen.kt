package com.charity.jointnewsletter.ui.theme.screens.articles

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.charity.jointnewsletter.data.article

/*@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ArticleDetailsScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Article Details") }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {

            Text(
                text = article.title,
                style = MaterialTheme.typography.h5,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            Text(
                text = article.description,
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Divider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
            Text(
                text = "Related Articles",
                style = MaterialTheme.typography.subtitle1,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            RelatedArticlesList(relatedArticles = article.relatedArticles)
        }
    }
}

@Composable
fun RelatedArticlesList(relatedArticles: List<Article>) {
    LazyColumn {
        items(relatedArticles) { article ->
            RelatedArticleItem(article = article)
        }
    }
}

@Composable
fun RelatedArticleItem(article: Article) {
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
                text = article.title,
              //  style = MaterialTheme.typography.subtitle1,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = article.description,
               // style = MaterialTheme.typography.body2,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2
            )
        }
    }
}

@Preview
@Composable
fun PreviewArticleDetailsScreen() {
    val article = Article(
        title = "Article Title",
        description = "Article Description",
        relatedArticles = listOf(
            Article(
                "Related Article 1", "Related Article Description 1", listOf(
                    Article("Related Article 1", "Related Article Description 1"),
                    Article("Related Article 2", "Related Article Description 2"),
                    Article("Related Article 3", "Related Article Description 3")
                    // Add more related articles as needed
                )
            ),

        )
    )
    ArticleDetailsScreen(rememberNavController())
}

*/