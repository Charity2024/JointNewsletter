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
            R.drawable.literature,
            R.drawable.music,
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
            "Introduces the national flags of several countries and some local festivals",
            "Describes the education systems of several countries from  students' perspectives",
            "Tempts readers with delicious dishes from various countries",
            "Introduces the geographic and climatic features of various countries and regions",
            "Recounts stories about some of the world's most famous music legends, including Taylor ",
            "Introduces famous literary figures from various countries",
            "Features classical and contemporary artists and artworks from a wide range of sources",
            "Retells the mournful or inspiring stories from a difficult time for all humanity",
            "Explores the pros and cons of this emerging technology.",
            "",
            ""

        )
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "MainScreen") {
            composable(route = "MainScreen") {
                TopicScreen(imageId, names, description, navController)
            }
            composable(route = "DetailScreen/{index}",
                arguments = listOf(
                    navArgument(name = "index") {
                        type = NavType.IntType
                    }
                )
            ) { index ->
                DetailScreen(
                    images = imageId,
                    names = names,
                    description = description,
                    itemIndex = index.arguments?.getInt("index"),

                )
            }
        }

    }
}

fun DetailScreen(images: Array<Int>, names: Array<String>, description: Array<String>, itemIndex: Int?) {

}




