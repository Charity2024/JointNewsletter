package com.charity.jointnewsletter.ui.theme.screens.onboarding

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.charity.jointnewsletter.R
import com.charity.jointnewsletter.data.OnboardingData
import com.charity.jointnewsletter.navigation.Screen
import com.charity.jointnewsletter.ui.theme.ButtonCardShape
import com.charity.jointnewsletter.ui.theme.ColorGreen
import com.charity.jointnewsletter.ui.theme.ColorYellow
import com.charity.jointnewsletter.ui.theme.Poppins
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnboardingScreen(navController: NavHostController){
    val items = ArrayList<OnboardingData>()
    items.add(
        OnboardingData(
            R.drawable.batman,
            backgroundColor = Color(0xFF0189C5),
            mainColor = Color(0xFF00B5EA),
            mainText = "Welcome",
            subText = "Be interested ",

        )
    )
    items.add(
        OnboardingData(
            R.drawable.onboarding_image,
            backgroundColor = Color(0xFFE4AF19),
            mainColor= ColorYellow,
            mainText = "Welcome",
            subText = "Be interested "
        )

    )
    items.add(
        OnboardingData(
            R.drawable.splash,
            backgroundColor = Color(0xFF96E172),
            mainColor = ColorGreen,
            mainText = "Welcome",
            subText = "Be interested "

        )
    )

    val pagerState= rememberPagerState(
        pageCount = { items.size },
      //  initialOffscreenLimit = 2
     //   infiniteLoop = false,
        initialPage = 0

    )
    OnboardingPager(
        item = items,
        pagerState = pagerState,
        modifier = Modifier.fillMaxWidth()
    )

}
@OptIn(ExperimentalFoundationApi::class, DelicateCoroutinesApi::class)
@Composable
fun OnboardingPager(
    item:List<OnboardingData>,
    pagerState: PagerState,
    modifier: Modifier=Modifier
) {
    Box(modifier = modifier){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            HorizontalPager(state = pagerState) {page ->
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(item[page].backgroundColor),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
                ) {
                    Image(
                        painter = painterResource(
                            id = item[page].image
                        ),
                        contentDescription = "",
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }

        Box(modifier = Modifier.align(Alignment.BottomCenter)){
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(340.dp)
                    .background(Color.White),
                shape = ButtonCardShape.large
                //elevation = 0.dp
            ){
                Box {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        PagerIndicator(items = item,currentPage = pagerState.currentPage)
                        Text(
                            text = item[pagerState.currentPage].mainText,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 20.dp, end = 30.dp),
                            color = item[ pagerState.currentPage].mainColor,
                            fontFamily = Poppins,
                            textAlign = TextAlign.Right,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold
                        )
                        Text(
                            text = item[pagerState.currentPage].subText,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 20.dp, start = 40.dp, end = 20.dp),
                            color = Color.Gray,
                            fontFamily = Poppins,
                            textAlign = TextAlign.Right,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.ExtraLight
                        )
                    }

                    Box(
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .padding(30.dp)
                    ){
                        Row (
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween

                        ){

                            if (pagerState.currentPage != 2) {
                                TextButton(onClick = {
                                    //skip
                                }) {
                                    Text(
                                        text = "Skip Now",
                                        //modifier = Modifier.clickable {
                                           // navController.navigate(ROUTE_REGISTER) },
                                        color = Color(0xFF292D32),
                                        fontFamily = Poppins,
                                        textAlign = TextAlign.Right,
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }
                                OutlinedButton(
                                    onClick = {
                                        GlobalScope.launch {
                                            pagerState.scrollToPage(
                                                pagerState.currentPage + 1,
                                               // pageOffset = 0f
                                            )
                                        }
                                    },
                                    border = BorderStroke(
                                        14.dp,
                                        item[pagerState.currentPage].mainColor
                                    ),
                                    shape = RoundedCornerShape(50), // = 50% percent
                                    //or shape = CircleShape
                                    colors = ButtonDefaults.outlinedButtonColors(contentColor = item[pagerState.currentPage].mainColor),
                                    modifier = Modifier.size(65.dp)
                                ) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_right_arrow),
                                        contentDescription = "",
                                        tint = item[pagerState.currentPage].mainColor,
                                        modifier = Modifier.size(20.dp)
                                    )
                                }
                            } else {
                                Button(
                                    onClick = {
                                        val navController = null
                                        navController.navigate(Screen.Register.route)
                                    },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .background(item[pagerState.currentPage].mainColor),

                                    contentPadding = PaddingValues(vertical = 12.dp),
                                    elevation = ButtonDefaults.elevation(
                                        defaultElevation = 0.dp
                                    )
                                ) {
                                    Text(
                                        text = "Get Started",
                                        color = Color.White,
                                        fontSize = 16.sp
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

private fun <RowScope> RowScope.Button(onClick: () -> Unit, modifier: Modifier, contentPadding: PaddingValues, elevation: Unit, content: @Composable RowScope.() -> Unit) {

}

private fun <Dp> ButtonDefaults.elevation(defaultElevation: Dp) {

}

private fun Nothing?.navigate(routeRegister: String) {

}


@Composable
fun PagerIndicator(items: List<OnboardingData>, currentPage: Int) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.padding(top = 20.dp)
    ) {
        repeat(items.size){
            Indicator(
                isSelected = it == currentPage,
                color = items[it].mainColor
            )
        }
    }

}

@Composable
fun Indicator(isSelected:Boolean,color:Color){
    val width = animateDpAsState(targetValue = if (isSelected) 40.dp else 10.dp, label = "")

    Box(
        modifier = Modifier
            .padding(4.dp)
            .height(10.dp)
            .width(width.value)
            .clip(CircleShape)
            .background(
                if (isSelected) color else Color.Gray.copy(alpha = 0.5f)
            )
    )

}

@Preview
@Composable
fun Onboardprev(){
    OnboardingScreen(rememberNavController() )
}