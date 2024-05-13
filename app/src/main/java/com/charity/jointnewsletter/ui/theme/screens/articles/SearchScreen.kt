package com.charity.jointnewsletter.ui.theme.screens.articles

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.charity.jointnewsletter.data.ArticleTopic
import com.charity.jointnewsletter.data.MainViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "SuspiciousIndentation")
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







@Preview
@Composable
fun PreviewSearchScreen() {
    SearchScreen(rememberNavController())
}

