package com.charity.jointnewsletter.ui.theme.screens.topic

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.charity.jointnewsletter.R

@Composable
fun TopicScreen(
    imageId: Array<Int>,
    names: Array<String>,
    description: Array<String>,
    navController: NavController,
    modifier: Modifier = Modifier
) {

    LazyColumn(contentPadding = PaddingValues(16.dp)) {
        val itemCount = imageId.size

        items(itemCount) {
            ColumnItem(
                modifier,
                painter = imageId,
                title = names,
                description = description,
                itemIndex = it,
                navController = navController
            )
        }
    }

}

@Composable
fun ColumnItem(
    modifier: Modifier,
    painter: Array<Int>,
    title: Array<String>,
    description: Array<String>,
    itemIndex: Int,
    navController: NavController
) {


    Card(
        modifier
            .padding(10.dp)
            .wrapContentSize()
            .clickable {
                navController.navigate( "DetailScreen/$itemIndex")
            },
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFCC6F5F)
        ),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Row(
            modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            Image(
                painter = painterResource(id = painter[itemIndex]),
                contentDescription = title[itemIndex],
                modifier.size(140.dp)
            )
            Column(modifier.padding(12.dp)) {
                Text(text = title[itemIndex],
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF0B3C49)
                )
                Text(text = description[itemIndex],
                    fontSize = 18.sp,
                    color = Color(0xFF355655),
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis,
                )

            }
        }
    }
}

/*@Preview
@Composable
fun Topicprev(){
    TopicScreen(imageId , names , description , navController )
}*/






