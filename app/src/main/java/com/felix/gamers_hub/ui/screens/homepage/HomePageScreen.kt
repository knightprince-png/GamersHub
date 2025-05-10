package com.felix.gamers_hub.ui.screens.homepage

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomePageScreen(navController: NavController){
    Column {  }


}

@Preview(showBackground = true)
@Composable
fun HomePageScreenPreview(){
    HomePageScreen(navController= rememberNavController())
}