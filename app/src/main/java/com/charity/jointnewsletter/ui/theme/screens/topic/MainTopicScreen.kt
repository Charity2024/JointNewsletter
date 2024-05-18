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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
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
        items(imageId.indices.toList()) { index ->
            ColumnItem(
                modifier = modifier,
                imageId = imageId[index],
                title = names[index],
                description = description[index],
                itemIndex = index,
                navController = navController
            )
        }
    }
}

@Composable
fun ColumnItem(
    modifier: Modifier = Modifier,
    imageId: Int,
    title: String,
    description: String,
    itemIndex: Int,
    navController: NavController
) {
    Card(
        modifier = modifier
            .padding(10.dp)
            .wrapContentSize()
            .clickable {
                navController.navigate("DetailScreen/$itemIndex")
            },
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFCC6F5F)
        ),
        elevation = CardDefaults.cardElevation(10.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = title,
                modifier = Modifier.size(140.dp)
            )
            Column(modifier = Modifier.padding(12.dp)) {
                Text(
                    text = title,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF0B3C49)
                )
                Text(
                    text = description,
                    fontSize = 18.sp,
                    color = Color(0xFF355655),
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopicScreenPreview() {
    val imageIds = arrayOf(
        R.drawable.flags,
        R.drawable.school,
        R.drawable.food,
        R.drawable.climate,
        R.drawable.music,
        R.drawable.literature,
        R.drawable.art,
        R.drawable.covid,
        R.drawable.ai,
        R.drawable.teaching,
        R.drawable.ancient,
    )
    val titles = arrayOf(
        "Issue No.1: \"Flags & Festivals\" Section",
        "Issue No.2: \"Schools & Curriculums\" Section",
        "Issue No.3: \"World in Dishes\" Section",
        "Issue No.4: \"Local Climates\" Section",
        "Issue No.5: \"Global Music\" Section",
        "Issue No.6: \"World Literature\" Section",
        "Issue No.7: \"World Art\" Section",
        "Issue No.8: \"Covid Tales\" Section",
        "Issue No.9: \"Artificial intelligence\" Section",
        "Issue No.10: \"Teaching Methods\" Section",
        "Issue No.11: \"Ancient History\" Section",
    )
    val descriptions = arrayOf(
        "Introduces the national flags of several countries and some local festivals"+
                "Dannebrog (the Danish flag) is the oldest flag still in use as of today. According to the popular myth as to how it came to be, it is said that on the 19th of June 1219, when King Valdemar was leading a crusade on Estonia, at Lyndanisse their army had been surrounded and it looked like they were going to be defeated. However, the priest that the Danish army had brought raised his hands in prayer, and when he finally lowered them the flag fell from the sky and the Danes won the battle.\n" +
                "We still “celebrate” Valdemarsdag to this day, though the myth, of course, has been disputed and widely discussed since. "+
                "This is one possible interpretation of the legend of the German flag development.\n" +
                "GERMANY :  In the first half of the 19th century, Germany was in fact split into a lot of small territories. But when Napoleon attacked Germany, many of the little states had to unify again. Germany got the German Bund. And to have at least a chance to defeat Napoleon, they also had to stay together in their offensive. They needed uniform uniforms. Although there were several ones, they had to color them equally. The only color that was possible for doing that was black. So, they had black uniforms. Step by step they added red coats and gold insignia. The German flag: Black-Red-Gold (yellow today) was inspired by these uniforms. Black was the major color, so it was placed at the top of the order, red in the middle, and gold at the bottom."+
                "I'm from the United States. My country is quite diverse in all aspects of it. With all the different cultures, there are so many different things to do and try and so many different people to meet. Also all the different places and settings you can visit. In just my state, there's a bit of everything- snow, beaches, deserts, and so many more. With all the different food places to activities, not one thing is the same. I think that's what I like most about my country.",





        "Describes the education systems of several countries from  students' perspectives",
        "Tempts readers with delicious dishes from various countries",
        "Introduces the geographic and climatic features of various countries and regions",
        "Recounts stories about some of the world's most famous music legends, including Taylor ",
        "Introduces famous literary figures from various countries",
        "Features classical and contemporary artists and artworks from a wide range of sources",
        "Retells the mournful or inspiring stories from a difficult time for all humanity",
        "Explores the pros and cons of this emerging  AI technology.",
        "We will explore different teaching methods and how they affect the teaching and learning process.",
        "Dives into the history of different language and how they evolved with time...",


        )
    val navController = rememberNavController()

    TopicScreen(
        imageId = imageIds,
        names = titles,
        description = descriptions,
        navController = navController
    )
}




