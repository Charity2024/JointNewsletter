package com.charity.jointnewsletter.ui.theme.screens.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.charity.jointnewsletter.R
import com.charity.jointnewsletter.ui.theme.screens.topic.ColumnItem

@Composable
fun DetailScreen(
    modifier: Modifier = Modifier,
    photos: Array<Int>,
    names: Array<String>,
    description: Array<String>,
    itemIndex: Int?
) {
    LazyColumn(contentPadding = PaddingValues(16.dp)) {

        val itemCount = photos.size

        items(itemCount) {
            DetailItems(
                modifier,
                photos = photos,
                names = names,
                description = description,
                itemIndex = it,

            )
        }
    }

}


@Composable
fun DetailItems(
    modifier: Modifier,
    photos: Array<Int>,
    names: Array<String>,
    description: Array<String>,
    itemIndex: Int,

){
    Column(
        modifier
            .fillMaxSize()
            .padding(25.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {

        Box(modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            Image(painter = painterResource(id = photos[itemIndex!!]),
                contentDescription = names[itemIndex],
                modifier.clip(RoundedCornerShape(16.dp))
            )
        }
        Text(text = names[itemIndex!!], fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Text(text = description[itemIndex], fontSize = 18.sp)
    }
}



@Preview
@Composable
fun Detailprev(){
    DetailScreen(navController = rememberNavController())
}

fun DetailScreen(navController: NavHostController) {

}
