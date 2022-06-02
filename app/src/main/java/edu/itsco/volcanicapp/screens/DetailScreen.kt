package edu.itsco.volcanicapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import edu.itsco.volcanicapp.components.TopAppBarWithImage

@Composable
fun DetailScreen(volcanoName: String) {
    Scaffold(
        topBar = {
            TopAppBarWithImage(
                title = volcanoName,
                imageUrl = "https://phantom-marca.unidadeditorial.es/d4f3150cfd2951a170aa73d03fff874d/resize/828/f/webp/assets/multimedia/imagenes/2021/09/28/16328549198511.jpg"
            )
        }
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),

        ){
            Text(volcanoName, style = MaterialTheme.typography.h5)
        }
    }
}