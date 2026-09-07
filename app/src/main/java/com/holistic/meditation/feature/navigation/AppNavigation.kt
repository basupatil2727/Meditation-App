package com.holistic.meditation.feature.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.holistic.meditation.feature.history.HistoryScreen
import com.holistic.meditation.feature.meditate.MeditationScreen
import com.holistic.meditation.feature.settings.SettingsScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Meditate.route
    ){
        composable(Screen.Meditate.route) {
            MeditationScreen()
        }
        composable (Screen.History.route) {
            HistoryScreen()
        }
        composable(Screen.Settings.route) {
            SettingsScreen()
        }
    }

}
