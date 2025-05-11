package com.felix.gamers_hub.ui.screens.products

import android.content.Intent
import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavController
import com.felix.gamers_hub.R
import com.felix.gamers_hub.navigation.ROUT_HOME
import com.felix.gamers_hub.ui.theme.Blue


@Composable
fun AsusPageScreen(navController: NavController) {
    Column() {
        Spacer(modifier = Modifier.height(40.dp))

        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "img",
            modifier = Modifier.fillMaxWidth().height(350.dp).padding(10.dp)
                .clip(shape = RoundedCornerShape(10.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "The REDMAGIC 9 Pro is a gaming-focused smartphone known for its powerful performance and advanced cooling system, designed for intense gaming sessions. It features a 6.8-inch FHD+ AMOLED display with a high refresh rate (up to 120Hz), a Snapdragon 8 Gen 3 processor, and a multi-dimensional cooling system including a high-speed turbofan and various heat dissipation components. ",
                color = Color.Blue,
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.CenterHorizontally),




                style = MaterialTheme.typography.bodyLarge
            )
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Buy at $50000")
        }


        }



    }


@Composable
fun PixelPageScreen(navController: NavController){
    Column() {
        Spacer(modifier = Modifier.height(40.dp))

        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "img",
            modifier = Modifier.fillMaxWidth().height(350.dp).padding(10.dp)
                .clip(shape = RoundedCornerShape(10.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "The REDMAGIC 9 Pro is a gaming-focused smartphone known for its powerful performance and advanced cooling system, designed for intense gaming sessions. It features a 6.8-inch FHD+ AMOLED display with a high refresh rate (up to 120Hz), a Snapdragon 8 Gen 3 processor, and a multi-dimensional cooling system including a high-speed turbofan and various heat dissipation components. ",
            color = Color.Blue,
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.CenterHorizontally),




            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Buy at $50000")
        }


    }

}
@Composable
fun IphonePageScreen(navController: NavController){
    Column() {
        Spacer(modifier = Modifier.height(40.dp))

        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "img",
            modifier = Modifier.fillMaxWidth().height(350.dp).padding(10.dp)
                .clip(shape = RoundedCornerShape(10.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "The REDMAGIC 9 Pro is a gaming-focused smartphone known for its powerful performance and advanced cooling system, designed for intense gaming sessions. It features a 6.8-inch FHD+ AMOLED display with a high refresh rate (up to 120Hz), a Snapdragon 8 Gen 3 processor, and a multi-dimensional cooling system including a high-speed turbofan and various heat dissipation components. ",
            color = Color.Blue,
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.CenterHorizontally),




            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Buy at $50000")
        }


    }

}
@Composable
fun LenovoPageScreen(navController: NavController) {
    Column() {
        Spacer(modifier = Modifier.height(40.dp))

        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "img",
            modifier = Modifier.fillMaxWidth().height(350.dp).padding(10.dp)
                .clip(shape = RoundedCornerShape(10.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "The REDMAGIC 9 Pro is a gaming-focused smartphone known for its powerful performance and advanced cooling system, designed for intense gaming sessions. It features a 6.8-inch FHD+ AMOLED display with a high refresh rate (up to 120Hz), a Snapdragon 8 Gen 3 processor, and a multi-dimensional cooling system including a high-speed turbofan and various heat dissipation components. ",
            color = Color.Blue,
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.CenterHorizontally),




            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Buy at $50000")
        }


    }

}



