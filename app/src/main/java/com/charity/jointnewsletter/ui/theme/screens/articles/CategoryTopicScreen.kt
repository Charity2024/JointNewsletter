package com.charity.jointnewsletter.ui.theme.screens.articles


import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

/*@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Categories") }
            )
        }
    ) {
        CategoryList(categories = categories, onCategoryClicked = onCategoryClicked)
    }
}

@Composable
fun CategoryList(categories: List<CategoryItem>, onCategoryClicked: (CategoryItem) -> Unit) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        items(categories) { category ->
            CategoryItem(category = category, onCategoryClicked = onCategoryClicked)
        }
    }
}

@Composable
fun CategoryItem(category: CategoryItem, onCategoryClicked: (CategoryItem) -> Unit) {
    Card(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth()
            .clickable { onCategoryClicked(category) },
        elevation = 4.dp
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = category.name,
                style = MaterialTheme.typography.subtitle1
            )
        }
    }
}

@Preview
@Composable
fun PreviewCategoryScreen() {
    val categories = listOf(
        CategoryItem("Politics"),
        CategoryItem("Sports"),
        CategoryItem("Technology")
        // Add more categories as needed
    )
    CategoryScreen(rememberNavController())
}

data class CategoryItem(val name: String)
*/