package edu.itsco.volcanicapp.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import edu.itsco.volcanicapp.components.ListVolcanoes

@Composable
fun HomeScreen(
    navController: NavHostController
){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Volcanes de México") }
            )
        }
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            ListVolcanoes(navController = navController)
        }
    }

}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    ListVolcanoes(navController = rememberNavController())
}