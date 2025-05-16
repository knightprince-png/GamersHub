package com.felix.gamers_hub.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.felix.gamers_hub.R

import com.felix.gamers_hub.navigation.ROUT_HOMEPAGE
import com.felix.gamers_hub.navigation.ROUT_PHONE
import com.felix.gamers_hub.navigation.ROUT_TAB
import com.felix.gamers_hub.navigation.ROUT_TABLET


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {


    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = Color.Black,
                contentColor = Color.Cyan
            ) {
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home", modifier = Modifier.padding(10.dp)) },
                    selected = selectedIndex == 0,
                    onClick = {
                        navController.navigate(ROUT_HOMEPAGE)
                        //navController.navigate(ROUT_HOME)
                    }
                )
            }
        },


        content = {paddingValues ->

            Column(
                modifier = Modifier
                    .paint(painter = painterResource(com.felix.gamers_hub.R.drawable.img), contentScale = ContentScale.FillBounds)

                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(paddingValues),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Image 1 + Button
                Column(
                    modifier = Modifier
                        .fillMaxWidth()

                        .padding(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.phones),
                        contentDescription = "Image 1",
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .width(200.dp)
                            .height(200.dp)
                            .clip(RoundedCornerShape(12.dp)),
                        )
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(onClick = {navController.navigate(ROUT_PHONE) }, colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black, contentColor = Color.Cyan
                    ), modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally)) {
                        Text("Tap to view products")
                    }
                }

                // Image 2 + Button
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Black)
                        .padding(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.tabletred),
                        contentDescription = "Image 2",
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .width(200.dp)
                            .height(200.dp)
                            .clip(RoundedCornerShape(12.dp)),


                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(onClick = {navController.navigate(ROUT_TABLET)}, colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black, contentColor = Color.Cyan
                    ), modifier = Modifier.align(Alignment.CenterHorizontally)) {
                        Text("View Products")
                    }
                }

                // Add more items as needed...
            }




        }


    )
}















@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())}

