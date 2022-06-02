package edu.itsco.volcanicapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import edu.itsco.volcanicapp.data.Volcano
import edu.itsco.volcanicapp.navigation.Screen

@Composable
fun VolcanicCard(
    volcano: Volcano,
    modifier: Modifier = Modifier,
    navController: NavHostController
){
    Row(
        modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(MaterialTheme.colors.surface)
            .clickable(onClick = {
                navController.navigate(
                    route = "${Screen.Detail.route}/${volcano.name}")
            })
            .padding(16.dp)
    ){
        Surface(
            modifier.size(60.dp),
            shape = CircleShape,
            color = MaterialTheme.colors.onSurface.copy(alpha = 0.2f)
        ) {
            Image(
                painter = rememberImagePainter(
                    data = volcano.url
                ),
                contentDescription = "ImagenVolcan",
                contentScale = ContentScale.FillBounds
            )
        }
        Column(
            modifier
                .padding(horizontal = 16.dp)
                .align(Alignment.CenterVertically)
        ) {
            Text(
                volcano.name,
                style = MaterialTheme.typography.h5
            )
            Text("${volcano.height} metros.", style = MaterialTheme.typography.body2)
        }
    }
}
