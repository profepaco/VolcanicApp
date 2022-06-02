package edu.itsco.volcanicapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import edu.itsco.volcanicapp.screens.DetailScreen
import edu.itsco.volcanicapp.screens.HomeScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(navController = navController,
        startDestination = Screen.Home.route
    ){
        composable(
            route = Screen.Home.route
        ){
            HomeScreen(navController = navController)
        }
        composable(
            route = "${Screen.Detail.route}/{vName}"
        ){
            DetailScreen(it.arguments?.getString("vName") ?: "")
        }
    }
}