package edu.itsco.volcanicapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter

@Composable
fun TopAppBarWithImage(title: String, imageUrl: String) {
    TopAppBar(
        modifier = Modifier.height(200.dp),
        contentPadding = PaddingValues(all = 0.dp) // (1)
    ) {
        Box(modifier = Modifier.fillMaxSize()) { // (2)
            Image( // (3)
                painter = rememberImagePainter(
                    data = imageUrl
                ),
                contentDescription = "Imagen volcan",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Row( // (4)
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 4.dp) // (5)
            ) {
                CompositionLocalProvider(
                    LocalContentAlpha provides ContentAlpha.high
                ) {
                    Row(
                        modifier = Modifier
                            .width(68.dp)
                            .align(Alignment.Top) // (*)
                    ) {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Regresar")
                        }
                    }
                }

                CompositionLocalProvider(
                    LocalContentAlpha provides ContentAlpha.high,
                    LocalTextStyle provides MaterialTheme.typography.h4
                ) {
                    Text(
                        text = title,
                        maxLines = 2,
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .align(Alignment.Bottom)
                            .padding(bottom = 16.dp)
                    )
                }

            }
        }
    }
}