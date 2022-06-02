package edu.itsco.volcanicapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import edu.itsco.volcanicapp.navigation.SetupNavGraph
import edu.itsco.volcanicapp.ui.theme.VolcanicAppTheme

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            navController = rememberNavController()
            VolcanicAppTheme {
                // A surface container using the 'background' color from the theme
                SetupNavGraph(navController = navController)
            }
        }
    }
}
