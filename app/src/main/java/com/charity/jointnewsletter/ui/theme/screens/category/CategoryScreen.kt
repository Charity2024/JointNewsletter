package com.charity.jointnewsletter.ui.theme.screens.category

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.charity.jointnewsletter.R
import com.charity.jointnewsletter.ui.theme.screens.detail.DetailScreen
import com.charity.jointnewsletter.ui.theme.screens.topic.TopicScreen


@Composable
fun Categories(navController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        val imageId = arrayOf(
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

        val names = arrayOf(
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

        val description = arrayOf(
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
        TopicScreen(imageId , names, description , navController )
        val navController = rememberNavController()
      /*  NavHost(navController = navController, startDestination = "TopicScreen") {
            composable(route = "TopicScreen") {
                TopicScreen(imageId, names, description, navController)
            }
            composable(route = "DetailScreen/{index}",
                arguments = listOf(
                    navArgument(name = "index") {
                        type = NavType.IntType
                    }
                )
            ) {index->
                DetailScreen(
                    photos = imageId ,
                    names = names,
                    description = description,
                    itemIndex =index.arguments?.getInt("index")
                )


            }
        }*/

    }
}
