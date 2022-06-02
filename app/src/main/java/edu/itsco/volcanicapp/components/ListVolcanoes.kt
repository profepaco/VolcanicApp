package edu.itsco.volcanicapp.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import edu.itsco.volcanicapp.data.Volcano
import edu.itsco.volcanicapp.data.Volcanoes

@Composable
fun ListVolcanoes(volcanoes: List<Volcano> = Volcanoes.volcanoes,navController: NavHostController){
    LazyColumn{
        items(items = volcanoes){ volcano->
            VolcanicCard(volcano = volcano, navController = navController)
        }
    }
}