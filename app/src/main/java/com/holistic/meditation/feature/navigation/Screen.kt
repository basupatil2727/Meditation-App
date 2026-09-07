package com.holistic.meditation.feature.navigation

sealed class Screen(val route: String){
    object Meditate: Screen("meditate")
    object History: Screen("history")
    object Settings : Screen("settings")
}