package com.felix.gamers_hub.ui.screens.home



import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.felix.gamers_hub.ui.theme.Blue
import com.felix.gamers_hub.ui.theme.White
import com.felix.gamers_hub.R



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize()){
        Spacer(modifier = Modifier.height(40.dp))

        Image(painter = painterResource(R.drawable.logo),
            contentDescription = "img",
            modifier = Modifier.fillMaxWidth().height(350.dp),
            contentScale = ContentScale.FillBounds)

                    Spacer(modifier = Modifier.height(30.dp))
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //start of row
            Row (modifier = Modifier.padding(start = 25.dp)){
                Image(painter = painterResource(R.drawable.image1),
                    contentDescription = "img",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(
                        text = "Brand new PS 5",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "The best brand for all gamers",
                        fontSize = 10.sp,

                        )
                    Text(
                        text = "Ksh.50,000",
                        fontSize = 20.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Ksh.40,000",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    Button(onClick = {


                    },
                        colors = ButtonDefaults.buttonColors(Blue),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text( text = "Contact us ")
                    }


                }

            }
            //end of row
            //start of row
            Row (modifier = Modifier.padding(start = 25.dp)){
                Image(painter = painterResource(R.drawable.image2),
                    contentDescription = "img",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(
                        text = "Brand new ROG STRIK LAPTOP",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "The best brand for all gamers",
                        fontSize = 10.sp,

                        )
                    Text(
                        text = "Ksh.120,000",
                        fontSize = 20.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Ksh.100,000",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    Button(onClick = {

                    },
                        colors = ButtonDefaults.buttonColors(Blue),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text( text = "Contact us ")
                    }


                }

            }
            //end of row
            //start of row
            Row (modifier = Modifier.padding(start = 25.dp)){
                Image(painter = painterResource(R.drawable.image2),
                    contentDescription = "img",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(
                        text = "Brand new PS 5",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "The best brand for all gamers",
                        fontSize = 10.sp,

                        )
                    Text(
                        text = "Ksh.50,000",
                        fontSize = 20.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Ksh.40,000",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    Button(onClick = {

                    },
                        colors = ButtonDefaults.buttonColors(Blue),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text( text = "Contact us ")
                    }


                }

            }
            //end of row


        }



    }
}







@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}