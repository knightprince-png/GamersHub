package com.felix.gamers_hub.ui.screens.phones

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.felix.gamers_hub.navigation.ROUT_ASUS
import com.felix.gamers_hub.ui.theme.Black

@Composable
fun PhoneScreen(navController: NavController){

    Column(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Image 1 + Button
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(com.felix.gamers_hub.R.drawable.image2),
                contentDescription = "img",
                modifier = Modifier.padding(10.dp)
                    .clickable(onClick = { navController.navigate(ROUT_ASUS) })
                    .width(200.dp).height(150.dp)
                    .clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /* Handle click */ }, modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally)) {
                Text("View Product")
            }
        }

        // Image 2 + Button
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(com.felix.gamers_hub.R.drawable.image2),
                contentDescription = "img",
                modifier = Modifier.padding(10.dp)
                    .clickable(onClick = { navController.navigate(ROUT_ASUS) })
                    .fillMaxWidth().height(150.dp)
                    .clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /* Handle click */ }, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Text("View Image 2")
            }
        }

        // Add more items as needed...
        // Image 2 + Button
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(com.felix.gamers_hub.R.drawable.image2),
                contentDescription = "img",
                modifier = Modifier.padding(10.dp)
                    .clickable(onClick = { navController.navigate(ROUT_ASUS) })
                    .fillMaxWidth().height(150.dp)
                    .clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /* Handle click */ }, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Text("View Image 2")
            }
        }
        // Image 2 + Button
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(com.felix.gamers_hub.R.drawable.image2),
                contentDescription = "img",
                modifier = Modifier.padding(10.dp)
                    .clickable(onClick = { navController.navigate(ROUT_ASUS) })
                    .fillMaxWidth().height(150.dp)
                    .clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /* Handle click */ }, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Text("View Image 2")
            }
        }
        // Image 2 + Button
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(com.felix.gamers_hub.R.drawable.image2),
                contentDescription = "img",
                modifier = Modifier.padding(10.dp)
                    .clickable(onClick = { navController.navigate(ROUT_ASUS) })
                    .fillMaxWidth().height(150.dp)
                    .clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /* Handle click */ }, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Text("View Image 2")
            }
        }
        // Image 2 + Button
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(com.felix.gamers_hub.R.drawable.image2),
                contentDescription = "img",
                modifier = Modifier.padding(10.dp)
                    .clickable(onClick = { navController.navigate(ROUT_ASUS) })
                    .fillMaxWidth().height(150.dp)
                    .clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /* Handle click */ }, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Text("View Image 2")
            }
        }        // Image 2 + Button
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(com.felix.gamers_hub.R.drawable.image2),
                contentDescription = "img",
                modifier = Modifier.padding(10.dp)
                    .clickable(onClick = { navController.navigate(ROUT_ASUS) })
                    .fillMaxWidth().height(150.dp)
                    .clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /* Handle click */ }, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Text("View Image 2")
            }
        }
        // Image 2 + Button
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(com.felix.gamers_hub.R.drawable.image2),
                contentDescription = "img",
                modifier = Modifier.padding(10.dp)
                    .clickable(onClick = { navController.navigate(ROUT_ASUS) })
                    .fillMaxWidth().height(150.dp)
                    .clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /* Handle click */ }, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Text("View Image 2")
            }
        }












    }


}

@Preview(showBackground = true)
@Composable
fun PhoneScreenPreview(){
    PhoneScreen(navController= rememberNavController())
}