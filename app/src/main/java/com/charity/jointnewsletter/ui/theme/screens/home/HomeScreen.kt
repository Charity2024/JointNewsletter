package com.charity.jointnewsletter.ui.theme.screens.home

import android.annotation.SuppressLint
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.charity.jointnewsletter.R
import com.charity.jointnewsletter.components.NavBar
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@OptIn(ExperimentalPagerApi::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController =   rememberNavController()) {



        val images = listOf(
            R.drawable.img_1,
            R.drawable.logo,
            R.drawable.splash,
            R.drawable.logo2
        )
        val pagerState = rememberPagerState(
            pageCount =
            images.size
        )
        LaunchedEffect(Unit) {
            while (true) {
                delay(2000)
                val nextPage = (pagerState.currentPage + 1) % pagerState.pageCount
                pagerState.scrollToPage(nextPage)
            }
        }
        val scope = rememberCoroutineScope()

        val modifier = Modifier
        Column(
            modifier.fillMaxSize().background(Color(0xFFF3C3A3)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(modifier = modifier.wrapContentSize()) {
                HorizontalPager(
                    state = pagerState,
                    modifier
                        .wrapContentSize()

                ) { currentPage ->

                    Card(
                        modifier
                            .wrapContentSize()
                            .padding(26.dp),
                        elevation = CardDefaults.cardElevation(8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = images[currentPage]),
                            contentDescription = ""
                        )
                    }
                }
                IconButton(
                    onClick = {
                        val nextPage = pagerState.currentPage + 1
                        if (nextPage < images.size) {
                            scope.launch {
                                pagerState.scrollToPage(nextPage)
                            }
                        }
                    },
                    modifier
                        .padding(30.dp)
                        .size(48.dp)
                        .align(Alignment.CenterEnd)
                        .clip(CircleShape),
                    colors = IconButtonDefaults.iconButtonColors(
                        containerColor = Color(0x52373737)
                    )
                ) {
                    Icon(
                        imageVector = Icons.Filled.KeyboardArrowRight, contentDescription = "",
                        modifier.fillMaxSize(),
                        tint = Color.LightGray
                    )
                }
                IconButton(
                    onClick = {
                        val prevPage = pagerState.currentPage - 1
                        if (prevPage >= 0) {
                            scope.launch {
                                pagerState.scrollToPage(prevPage)
                            }
                        }
                    },
                    modifier
                        .padding(30.dp)
                        .size(48.dp)
                        .align(Alignment.CenterStart)
                        .clip(CircleShape),
                    colors = IconButtonDefaults.iconButtonColors(
                        containerColor = Color(0x52373737)
                    )
                ) {
                    Icon(
                        imageVector = Icons.Filled.KeyboardArrowLeft, contentDescription = "",
                        modifier.fillMaxSize(),
                        tint = Color.LightGray
                    )
                }
            }




            PageIndicator(
                pageCount = images.size,
                currentPage = pagerState.currentPage,
                modifier = modifier
            )


            Title()
            Homebtns()
            Title2()
            MyCard()


        }
    }





@Composable
fun PageIndicator(pageCount: Int, currentPage: Int, modifier: Modifier) {

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        repeat(pageCount){
            IndicatorDots(isSelected = it == currentPage, modifier= modifier)
        }
    }
}

@Composable
fun IndicatorDots(isSelected: Boolean, modifier: Modifier) {
    val size = animateDpAsState(targetValue = if (isSelected) 12.dp else 10.dp, label = "")
    Box(modifier = modifier
        .padding(2.dp)
        .size(size.value)
        .clip(CircleShape)
        .background(if (isSelected) Color(0xff373737) else Color(0xA8373737))
    )
}

@Composable
fun Title(){
    Text(
        text = "Popular Sections",
        fontSize = 21.sp,
        fontWeight = FontWeight.ExtraBold,
        modifier = Modifier
            .padding(vertical = 10.dp)
    )
}

@Composable
fun Homebtns() {

    val languages = listOf(
        "Flags and Festivals",
        "Poetic Expression",
        "World in Dishes",
        "Weekly Crossword",

    )
    MyApp(
        modifier = Modifier,
        languages
    )


}

@Composable
fun MyApp(modifier: Modifier = Modifier, languages: List<String>) {
        Column(modifier.padding(0.dp)) {
            LazyRow( ) {
                items(items = languages) { item ->
                    val navController = rememberNavController()
                    RowItem( navController = navController)
                }
            }


        }
}



@SuppressLint("InvalidColorHexValue")
@Composable
fun RowItem( navController: NavHostController) {

    Button(onClick ={ /*TODO*/ },
        border = BorderStroke(1.dp, Color.DarkGray),
        colors = ButtonDefaults.buttonColors(Color(0xFFCF7650)),
        modifier = Modifier
            .fillMaxWidth(0.4f)
            .padding(horizontal = 13.dp)
    ) {
        Text(text = "Flags and Festivals", fontSize = 14.sp, fontWeight = FontWeight.Bold,color= Color(0xFF086847))
    }
    Button(onClick = { /*TODO*/ },
        border = BorderStroke(1.dp, Color.DarkGray),
        colors = ButtonDefaults.buttonColors(Color(0xFFCF7650)),
        modifier = Modifier
            .fillMaxWidth(0.4f)
            .padding(horizontal = 13.dp)
    ) {
        Text(text = "Poetic Expression", fontSize = 14.sp, fontWeight = FontWeight.Bold,color= Color(0xFF086847))
    }
    Button(onClick = { /*TODO*/ },
        border = BorderStroke(1.dp, Color.DarkGray),
        colors = ButtonDefaults.buttonColors(Color(0xFFCF7650)),
        modifier = Modifier
            .fillMaxWidth(0.4f)
            .padding(horizontal = 13.dp)
    ) {
        Text(text = "World in Dishes", fontSize = 14.sp, fontWeight = FontWeight.Bold,color= Color(0xFF086847))
    }

    Button(
        onClick = { /*TODO*/ },
        border = BorderStroke(1.dp, Color.DarkGray),
        colors = ButtonDefaults.buttonColors(Color(0xFFCF7650)),
        modifier = Modifier
            .fillMaxWidth(0.4f)
            .padding(horizontal = 13.dp)
    ) {
        Text(text = "Weekly Crossword", fontSize = 14.sp, fontWeight = FontWeight.Bold,color= Color(0xFF086847))
    }
   /* Card(
        modifier
            .padding(10.dp)
            .fillMaxWidth()
            .height(50.dp)
            .width(90.dp)
            .clickable {
                onClick  (navController.navigate(ROUTE_HOME))
            }
            .aspectRatio(1.5f),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF6E9B2)
        ),
        shape = CardDefaults.elevatedShape,
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Box(
            modifier
                .padding(10.dp)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        )
        {
            Text(text = name, fontSize = 14.sp, fontWeight = FontWeight.Bold,color= Color(0xFF086847))

        }

    }*/

}

fun onClick(navigate: Unit) {

}

@Composable
fun Title2(){
    Text(
        text = "Latest Issue",
        fontSize = 20.sp,
        fontWeight = FontWeight.ExtraBold,
        modifier = Modifier
            .padding(vertical = 10.dp)
    )
}

@Composable
fun MyCard() {

    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {

        Card(
            modifier = Modifier
                .width(370.dp)
                .height(130.dp),
            elevation = CardDefaults.cardElevation(10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF7ABA78)
            )
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = R.drawable.ancient),
                    contentDescription = "null"
                )
                Column {
                    Text(
                        text = "Issue No.11: \"Ancient History\" Section",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(10.dp)
                    )
                    Text(
                        text = "Dives into the history of different language and how they evolved with time...",
                        fontSize = 15.sp,
                        modifier = Modifier.padding(6.dp),
                        maxLines = 3,
                        overflow = TextOverflow.Ellipsis,
                        color = Color.Gray
                    )
                }
            }

        }
    }
}



@Preview
@Composable
fun Homeprev() {
    HomeScreen(rememberNavController())
    val languages = listOf(
        "Flags and Festivals",
        "Poetic Expression",
        "World in Dishes",
        "Weekly Crossword",

    )
    MyApp(languages = languages)
}

