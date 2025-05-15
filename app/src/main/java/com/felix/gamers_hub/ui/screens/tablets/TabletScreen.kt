package com.felix.gamers_hub.ui.screens.tablets

import android.adservices.topics.Topic
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
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
import com.felix.gamers_hub.navigation.ROUT_ASUS
import com.felix.gamers_hub.navigation.ROUT_BLACK
import com.felix.gamers_hub.navigation.ROUT_HOMEPAGE
import com.felix.gamers_hub.navigation.ROUT_IPAD
import com.felix.gamers_hub.navigation.ROUT_LEGION
import com.felix.gamers_hub.navigation.ROUT_ONE
import com.felix.gamers_hub.navigation.ROUT_TAB
import com.felix.gamers_hub.navigation.ROUT_TABS
import com.felix.gamers_hub.navigation.ROUT_XIAOMI

@Composable
fun TabletScreen(navController: NavController){
    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold (
        topBar = {
            NavigationBar(
                containerColor = Color.White
            ) {
                NavigationBarItem(
                    icon = { Icon(Icons.Default.ArrowBack, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = {
                        navController.navigate(ROUT_HOMEPAGE)
                        //navController.navigate(ROUT_HOME)
                    }
                )
            }
        },
        content = {paddingValues->
            Column(
                modifier = Modifier
                    .background(Color.Black)
                    .paint(
                        painter = painterResource(com.felix.gamers_hub.R.drawable.img),
                        contentScale = ContentScale.FillBounds
                    )

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
                        painter = painterResource(com.felix.gamers_hub.R.drawable.ipad),
                        contentDescription = "img",
                        modifier = Modifier.padding(10.dp)
                            .clickable(onClick = { navController.navigate(ROUT_IPAD) })
                            .width(200.dp).height(190.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.FillBounds
                    )

                    Spacer(modifier = Modifier.height(8.dp))
                    Button(
                        onClick = { /* Handle click */ }, colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Black, contentColor = Color.Cyan
                        ), modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally)
                    ) {
                        Text("View Product")
                    }

                }

                // Image 2 + Button
                Column(
                    modifier = Modifier
                        .fillMaxWidth()

                        .padding(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(com.felix.gamers_hub.R.drawable.blackshark),
                        contentDescription = "img",
                        modifier = Modifier.padding(10.dp)
                            .clickable(onClick = { navController.navigate(ROUT_BLACK) })
                            .fillMaxWidth().height(190.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.Fit
                    )

                    Spacer(modifier = Modifier.height(8.dp))
                    Button(
                        onClick = { /* Handle click */ }, colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Black, contentColor = Color.Cyan
                        ), modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally)
                    ) {
                        Text("View Image 2")
                    }
                }

                // Add more items as needed...
                // Image 3 + Button
                Column(
                    modifier = Modifier
                        .fillMaxWidth()

                        .padding(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(com.felix.gamers_hub.R.drawable.legiontab),
                        contentDescription = "img",
                        modifier = Modifier.padding(10.dp)
                            .clickable(onClick = { navController.navigate(ROUT_LEGION) })
                            .fillMaxWidth().height(190.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.Fit
                    )

                    Spacer(modifier = Modifier.height(8.dp))
                    Button(
                        onClick = { /* Handle click */ }, colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Black, contentColor = Color.Cyan
                        ), modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally)
                    ) {
                        Text("View Image 2")
                    }
                }
                // Image 4 + Button
                Column(
                    modifier = Modifier
                        .fillMaxWidth()

                        .padding(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(com.felix.gamers_hub.R.drawable.nubia),
                        contentDescription = "img",
                        modifier = Modifier.padding(10.dp)
                            .clickable(onClick = { navController.navigate(ROUT_ASUS) })
                            .fillMaxWidth().height(190.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.Fit
                    )

                    Spacer(modifier = Modifier.height(8.dp))
                    Button(
                        onClick = { /* Handle click */ }, colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Black, contentColor = Color.Cyan
                        ), modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally)
                    ) {
                        Text("View Image 2")
                    }
                }
                // Image 5 + Button
                Column(
                    modifier = Modifier
                        .fillMaxWidth()

                        .padding(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(com.felix.gamers_hub.R.drawable.plustab),
                        contentDescription = "img",
                        modifier = Modifier.padding(10.dp)
                            .clickable(onClick = { navController.navigate(ROUT_ONE) })
                            .fillMaxWidth().height(190.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.Fit
                    )

                    Spacer(modifier = Modifier.height(8.dp))
                    Button(
                        onClick = { /* Handle click */ }, colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Black, contentColor = Color.Cyan
                        ), modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally)
                    ) {
                        Text("View Image 2")
                    }
                }
                // Image 6 + Button
                Column(
                    modifier = Modifier
                        .fillMaxWidth()

                        .padding(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(com.felix.gamers_hub.R.drawable.s10tab),
                        contentDescription = "img",
                        modifier = Modifier.padding(10.dp)
                            .clickable(onClick = { navController.navigate(ROUT_TABS) })
                            .fillMaxWidth().height(190.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.Fit
                    )

                    Spacer(modifier = Modifier.height(8.dp))
                    Button(
                        onClick = { /* Handle click */ }, colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Black, contentColor = Color.Cyan
                        ), modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally)
                    ) {
                        Text("View Image 2")
                    }
                }        // Image 7 + Button
                Column(
                    modifier = Modifier
                        .fillMaxWidth()

                        .padding(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(com.felix.gamers_hub.R.drawable.stab),
                        contentDescription = "img",
                        modifier = Modifier.padding(10.dp)
                            .clickable(onClick = { navController.navigate(ROUT_TAB) })
                            .fillMaxWidth().height(190.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.Fit
                    )

                    Spacer(modifier = Modifier.height(8.dp))
                    Button(
                        onClick = { /* Handle click */ }, colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Black, contentColor = Color.Cyan
                        ), modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally)
                    ) {
                        Text("View Image 2")
                    }
                }
                // Image 8 + Button
                Column(
                    modifier = Modifier
                        .fillMaxWidth()

                        .padding(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(com.felix.gamers_hub.R.drawable.xtab),
                        contentDescription = "img",
                        modifier = Modifier.padding(10.dp)
                            .clickable(onClick = { navController.navigate(ROUT_XIAOMI) })
                            .fillMaxWidth().height(190.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.Fit
                    )

                    Spacer(modifier = Modifier.height(8.dp))
                    Button(
                        onClick = { /* Handle click */ }, colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Black, contentColor = Color.Cyan
                        ), modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally)
                    ) {
                        Text("View Image 2")
                    }
                }


            }
        }
    )



}

@Preview(showBackground = true)
@Composable
fun TabletScreenPreview(){
    TabletScreen(navController= rememberNavController())
}