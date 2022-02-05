package com.breaktime.lab3.navigation

sealed class Screen(val route: String) {
    object Splash: Screen(route = "splash_screen")
    object Onboarding: Screen(route = "onboarding_screen")
    object Login: Screen(route = "login_screen")
    object Registration: Screen(route = "registration_screen")
    object Main: Screen(route = "main_screen")
    object Menu: Screen(route = "menu_screen")
    object Photo: Screen(route = "photo_screen")
    object Listen: Screen(route = "listen_screen")
    object Profile: Screen(route = "profile_screen")
}