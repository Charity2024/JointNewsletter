package com.charity.jointnewsletter.ui.theme.screens.articles

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.charity.jointnewsletter.data.ArticleTopic
import com.charity.jointnewsletter.data.MainViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "SuspiciousIndentation")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(navController: NavHostController) {
    val viewModel= viewModel<MainViewModel>()
    val searchText by viewModel.searchText.collectAsState()
    val articleTopics by viewModel.articleTopics.collectAsState()
    val isSearching by viewModel.isSearchig.collectAsState()
    /*Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Search") }
            )
        }
    ) {*/
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            TextField(
                value = searchText,
                onValueChange =  viewModel::onSearchTextChange ,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                placeholder = { Text("Search ") },
                singleLine = true
            )
            Spacer(modifier = Modifier.height(16.dp))
          /*  if (isSearching){
                Box(modifier = Modifier.fillMaxSize()){
                    CircularProgressIndicator(
                        modifier = Modifier.align(Alignment.Center)
                    )
                }

            }else {*/
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    items(articleTopics) {
                        Text(
                            text = ArticleTopic.issueName,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                        )

                    }

                }
            }
        }
    //}
//}





@Preview
@Composable
fun PreviewSearchScreen() {
    SearchScreen(rememberNavController())
}

