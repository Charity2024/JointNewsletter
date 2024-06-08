package com.charity.jointnewsletter.navigation

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Register : Screen("register")
    object Home : Screen("home")
    object Settings : Screen("settings")
    object Splash : Screen("splash")
    object Detail : Screen("detail")
    object Cartegory : Screen("category")
    object Contact : Screen("contact")
    object Feedback : Screen("feedback")
    object About : Screen("about")
    object Topic : Screen("topic")
    object Policy : Screen("policy")
    object Notifications : Screen("notifications")
    object Onboarding : Screen("onboarding")
    object Profile : Screen("profile")
    object EditProfile : Screen("edit_profile")

    // Add other screens as needed
}
const val ROUTE_ARTICLE_DETAILS="detail"
const val ROUTE_TOPICS ="topic"



/*
const val ROUTE_SPLASH = "splash"
const val ROUTE_HOME = "home"
const val ROUTE_REGISTER = "register"
const val ROUTE_LOGIN = "login"
const val ROUTE_CONTACT = "contact"
const val ROUTE_ONBOARDING = "onboarding"
const val ROUTE_SETTINGS = "settings"
const val ROUTE_ABOUT = "about"
const val ROUTE_POLICY = "privacy"
const val ROUTE_FEEDBACK = "feedback"
const val ROUTE_TOPICS ="topic"
const val ROUTE_CATEGORY="category"
const val ROUTE_ARTICLE_DETAILS="detail"
const val ROUTE_NOTIFICATIONS="notifications"
*/