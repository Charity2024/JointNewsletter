package com.charity.jointnewsletter.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.charity.jointnewsletter.ui.theme.screens.about.AboutScreen
import com.charity.jointnewsletter.ui.theme.screens.about.ContactScreen
import com.charity.jointnewsletter.ui.theme.screens.articles.Categories
import com.charity.jointnewsletter.ui.theme.screens.home.HomeScreen
import com.charity.jointnewsletter.ui.theme.screens.login.LoginScreen
import com.charity.jointnewsletter.ui.theme.screens.login.RegisterScreen
import com.charity.jointnewsletter.ui.theme.screens.onboarding.OnboardingScreen
import com.charity.jointnewsletter.ui.theme.screens.settings.SettingsScreen
import com.charity.jointnewsletter.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination:String= ROUTE_HOME) {

    NavHost(navController = navController, modifier = modifier, startDestination = startDestination ){
        composable(ROUTE_SPLASH){
            SplashScreen(navController )
        }

        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }

        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT){
            AboutScreen(navController )
        }
        composable(ROUTE_ARTICLE_DETAILS){
           //DetailScreen(navController )
        }
        composable(ROUTE_CATEGORY){
            Categories(navController)

        }
        composable(ROUTE_CONTACT){
            ContactScreen(navController,)
        }
        composable(ROUTE_ONBOARDING){
            OnboardingScreen(navController )
        }
        composable(ROUTE_TOPIC){
           // TopicScreen(navController )
        }
        composable(ROUTE_POLICY){
            //SearchScreen(navController )
        }
        composable(ROUTE_SETTINGS){
            SettingsScreen(navController )

        }
    }

}