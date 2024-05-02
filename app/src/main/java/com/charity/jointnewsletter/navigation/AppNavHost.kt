package com.charity.jointnewsletter.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.charity.jointnewsletter.ui.theme.screens.about.AboutScreen
import com.charity.jointnewsletter.ui.theme.screens.about.FeedbackScreen
import com.charity.jointnewsletter.ui.theme.screens.articles.SearchScreen
import com.charity.jointnewsletter.ui.theme.screens.login.LoginScreen
import com.charity.jointnewsletter.ui.theme.screens.login.RegisterScreen
import com.charity.jointnewsletter.ui.theme.screens.notification.NotificationScreen
import com.charity.jointnewsletter.ui.theme.screens.onboarding.OnboardingScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController(), startDestination:String= ROUTE_LOGIN) {

    NavHost(navController = navController, modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }

        composable(ROUTE_HOME){
           // HomeScreen(navController)
        }
        composable(ROUTE_ABOUT){
            AboutScreen(navController )
        }
        composable(ROUTE_ARTICLE_DETAILS){
           // ArticleDetailsScreen(navController )
        }
        composable(ROUTE_CATEGORY_TOPIC){
           // CategoryScreen(navController )
        }
        composable(ROUTE_FEEDBACK){
            FeedbackScreen(navController )
        }
        composable(ROUTE_ONBOARDING){
            OnboardingScreen(navController )
        }
        composable(ROUTE_SAVED){
           // SavedArticlesScreen(navController )
        }
        composable(ROUTE_SEARCH){
            SearchScreen(navController )
        }




    }

}