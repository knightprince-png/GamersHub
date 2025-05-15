package com.felix.gamers_hub.ui.screens.landing

import android.R.style
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.decode.ImageSource
import com.felix.gamers_hub.R
import com.felix.gamers_hub.navigation.ROUT_HOME
import com.felix.gamers_hub.navigation.ROUT_REGISTER
import com.felix.gamers_hub.ui.theme.Black
import com.felix.gamers_hub.ui.theme.Darkblue
import com.felix.gamers_hub.ui.theme.Green

@Composable
fun LandingScreen(navController: NavController){
    Column (
        modifier = Modifier
            .background(color = Black)
            .fillMaxSize()
            .padding(5.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(R.drawable.game2),
            contentDescription = "img",
            modifier = Modifier.fillMaxWidth().height(600.dp),
            contentScale = ContentScale.FillWidth
            )
        Spacer(modifier = Modifier.height(25.dp))

        Text(text="Shop gaming products now",
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Green,
                textAlign = TextAlign.Center

            ))
        Spacer(modifier = Modifier.height(25.dp))


        Button(onClick = {
            navController.navigate (ROUT_HOME)
        },
            modifier = Modifier.fillMaxWidth().height(40.dp),
            colors = ButtonDefaults.buttonColors(Darkblue),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text( text = "GET STARTED",
                style = TextStyle(
                    color = Green,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                ))
        }






    }


}

@Preview(showBackground = true)
@Composable
fun LandingScreenPreview(){
    LandingScreen(navController= rememberNavController())
}