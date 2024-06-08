package com.charity.jointnewsletter.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.charity.jointnewsletter.components.nav.NavItem
import com.charity.jointnewsletter.navigation.AppNavHost
import com.charity.jointnewsletter.navigation.Screen
import com.charity.jointnewsletter.ui.theme.JointNewsletterTheme

@Composable
fun BottomNavBar( ) {
    val navController = rememberNavController()
    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = currentBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentRoute != Screen.Login.route && currentRoute != Screen.Register.route&& currentRoute != Screen.Splash.route) {
                BottomNavigationBar(navController)
            }
        }
    ) { innerPadding ->
        AppNavHost(navController = navController, modifier = Modifier.padding(innerPadding))
    }
}




@Composable
fun BottomNavigationBar(navController: NavHostController){
    val navItems = listOf(NavItem.Home, NavItem.List, NavItem.Profile, NavItem.Settings)
    var selectedItem by rememberSaveable { mutableStateOf(0) }

    NavigationBar (

    ){
        navItems.forEachIndexed { index, item ->
            NavigationBarItem(
                alwaysShowLabel = true,
                icon = { Icon(item.icon, contentDescription = item.title) },
                label = { Text(item.title) },
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                    navController.navigate(item.path) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) { saveState = true }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

@Composable
fun NavBar(){
    JointNewsletterTheme {
        val navController = rememberNavController()
        Surface(modifier = Modifier.fillMaxSize()) {
            NavScreen(navController = navController)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    val navController = rememberNavController()
    JointNewsletterTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            NavScreen(navController = navController)
        }
    }
}



