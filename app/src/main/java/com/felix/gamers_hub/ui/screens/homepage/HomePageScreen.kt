package com.felix.gamers_hub.ui.screens.homepage

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.felix.gamers_hub.R
import com.felix.gamers_hub.model.Products
import com.felix.gamers_hub.navigation.ROUT_HOME
import com.felix.gamers_hub.navigation.ROUT_HOMEPAGE
import com.felix.gamers_hub.navigation.ROUT_PHONE
import com.felix.gamers_hub.ui.theme.Blue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePageScreen(navController: NavController){

    Column (modifier = Modifier.fillMaxSize()){
        val mContext = LocalContext.current


        Image(painter = painterResource(R.drawable.promo),
            contentDescription = "img",
            modifier = Modifier
                .clickable(onClick = {})
                .fillMaxWidth(),
            contentScale = ContentScale.FillBounds
        )
        Spacer(modifier = Modifier.height(10.dp))
        Image(painter = painterResource(R.drawable.gamers),
            contentDescription = "img",
            modifier = Modifier
                .height(600.dp)
                .clickable(onClick = {navController.navigate(ROUT_HOME)})
                .fillMaxWidth(),
            contentScale = ContentScale.FillBounds
        )



        }



    }









@Preview(showBackground = true)
@Composable
fun HomePageScreenPreview(){
    HomePageScreen(navController= rememberNavController())
}