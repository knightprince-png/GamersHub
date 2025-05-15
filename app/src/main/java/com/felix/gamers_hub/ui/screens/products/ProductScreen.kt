package com.felix.gamers_hub.ui.screens.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.felix.gamers_hub.R
import com.felix.gamers_hub.ui.theme.Green


@Composable
fun AsusPageScreen(navController: NavController) {
    val mContext =LocalContext.current
    Column(modifier = Modifier.fillMaxSize().paint(painter = painterResource(com.felix.gamers_hub.R.drawable.img), contentScale = ContentScale.FillBounds)
    ) {
        Spacer(modifier = Modifier
            .height(40.dp))

        Image(
            painter = painterResource(R.drawable.redmagic),
            contentDescription = "img",
            modifier = Modifier.fillMaxWidth().height(350.dp).padding(10.dp)
                .clip(shape = RoundedCornerShape(10.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(30.dp))

        Column (modifier = Modifier.padding(20.dp)){
           Text( "6.78\" AMOLED, 165Hz refresh", color = Color.Green, fontSize = 15.sp)
           Text( "Snapdragon 8 Gen 3", color = Color.Green, fontSize = 15.sp)
            Text("18GB RAM, 512GB Storage", color = Color.Green, fontSize = 15.sp)
            Text("6000mAh, 65W fast charge", color = Color.Green, fontSize = 15.sp)
            Text ("Triple cam: 50MP + 13MP + 5MP", color = Color.Green, fontSize = 15.sp)
            Text("32MP selfie cam", color = Color.Green, fontSize = 15.sp)
            Text("AirTriggers (gaming sensors)", color = Color.Green, fontSize = 15.sp)
            Text("Dual USB-C, RGB lights", color = Color.Green, fontSize = 15.sp)
            Text("Android 14, ROG UI", color = Color.Green, fontSize = 15.sp)


        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {            val simToolKitLaunchIntent =
            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        }
            , colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black, contentColor = Color.Cyan)
            , modifier = Modifier.fillMaxWidth()) {
            Text(text = "Buy at $50000")
        }


        }



    }


@Composable
fun PixelPageScreen(navController: NavController){
    val mContext =LocalContext.current
    Column(modifier = Modifier.fillMaxSize().paint(painter = painterResource(com.felix.gamers_hub.R.drawable.img), contentScale = ContentScale.FillBounds)
    ) {
        Spacer(modifier = Modifier
            .height(40.dp))

        Image(
            painter = painterResource(R.drawable.pixel),
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
        Button(onClick = {            val simToolKitLaunchIntent =
            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        }
            , colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black, contentColor = Color.Cyan)
            , modifier = Modifier.fillMaxWidth()) {
            Text(text = "Buy at $50000")
        }


    }



}
@Composable
fun IphonePageScreen(navController: NavController){
    val mContext =LocalContext.current
    Column(modifier = Modifier.fillMaxSize().paint(painter = painterResource(com.felix.gamers_hub.R.drawable.img), contentScale = ContentScale.FillBounds)
    ) {
        Spacer(modifier = Modifier
            .height(40.dp))

        Image(
            painter = painterResource(R.drawable.iphon),
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
        Button(onClick = {            val simToolKitLaunchIntent =
            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        }
            , colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black, contentColor = Color.Cyan)
            , modifier = Modifier.fillMaxWidth()) {
            Text(text = "Buy at $50000")
        }


    }



}
@Composable
fun VivoPageScreen(navController: NavController) {
    val mContext =LocalContext.current
    Column(modifier = Modifier.fillMaxSize().paint(painter = painterResource(com.felix.gamers_hub.R.drawable.img), contentScale = ContentScale.FillBounds)
    ) {
        Spacer(modifier = Modifier
            .height(40.dp))

        Image(
            painter = painterResource(R.drawable.vivo),
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
        Button(onClick = {            val simToolKitLaunchIntent =
            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        }
            , colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black, contentColor = Color.Cyan)
            , modifier = Modifier.fillMaxWidth()) {
            Text(text = "Buy at $50000")
        }


    }



}
@Composable
fun TabPageScreen(navController: NavController) {
    val mContext =LocalContext.current
    Column(modifier = Modifier.fillMaxSize().paint(painter = painterResource(com.felix.gamers_hub.R.drawable.img), contentScale = ContentScale.FillBounds)
    ) {
        Spacer(modifier = Modifier
            .height(40.dp))

        Image(
            painter = painterResource(R.drawable.s10tab),
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
        Button(onClick = {            val simToolKitLaunchIntent =
            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        }
            , colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black, contentColor = Color.Cyan)
            , modifier = Modifier.fillMaxWidth()) {
            Text(text = "Buy at $50000")
        }


    }



}@Composable
fun BlackPageScreen(navController: NavController) {
    val mContext =LocalContext.current
    Column(modifier = Modifier.fillMaxSize().paint(painter = painterResource(com.felix.gamers_hub.R.drawable.img), contentScale = ContentScale.FillBounds)
    ) {
        Spacer(modifier = Modifier
            .height(40.dp))

        Image(
            painter = painterResource(R.drawable.blackshark),
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
        Button(onClick = {            val simToolKitLaunchIntent =
            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        }
            , colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black, contentColor = Color.Cyan)
            , modifier = Modifier.fillMaxWidth()) {
            Text(text = "Buy at $50000")
        }


    }



}
@Composable
fun XiaomiPageScreen(navController: NavController) {
    val mContext =LocalContext.current
    Column(modifier = Modifier.fillMaxSize().paint(painter = painterResource(com.felix.gamers_hub.R.drawable.img), contentScale = ContentScale.FillBounds)
    ) {
        Spacer(modifier = Modifier
            .height(40.dp))

        Image(
            painter = painterResource(R.drawable.xtab),
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
        Button(onClick = {            val simToolKitLaunchIntent =
            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        }
            , colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black, contentColor = Color.Cyan)
            , modifier = Modifier.fillMaxWidth()) {
            Text(text = "Buy at $50000")
        }


    }



}
@Composable
fun LegionPageScreen(navController: NavController) {
    val mContext =LocalContext.current
    Column(modifier = Modifier.fillMaxSize().paint(painter = painterResource(com.felix.gamers_hub.R.drawable.img), contentScale = ContentScale.FillBounds)
    ) {
        Spacer(modifier = Modifier
            .height(40.dp))

        Image(
            painter = painterResource(R.drawable.legiontab),
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
        Button(onClick = {            val simToolKitLaunchIntent =
            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        }
            , colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black, contentColor = Color.Cyan)
            , modifier = Modifier.fillMaxWidth()) {
            Text(text = "Buy at $50000")
        }


    }



}
@Composable
fun TabsPageScreen(navController: NavController) {
    val mContext =LocalContext.current
    Column(modifier = Modifier.fillMaxSize().paint(painter = painterResource(com.felix.gamers_hub.R.drawable.img), contentScale = ContentScale.FillBounds)
    ) {
        Spacer(modifier = Modifier
            .height(40.dp))

        Image(
            painter = painterResource(R.drawable.s10tab),
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
        Button(onClick = {            val simToolKitLaunchIntent =
            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        }
            , colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black, contentColor = Color.Cyan)
            , modifier = Modifier.fillMaxWidth()) {
            Text(text = "Buy at $50000")
        }


    }



}
@Composable
fun OnePageScreen(navController: NavController) {
    val mContext =LocalContext.current
    Column(modifier = Modifier.fillMaxSize().paint(painter = painterResource(com.felix.gamers_hub.R.drawable.img), contentScale = ContentScale.FillBounds)
    ) {
        Spacer(modifier = Modifier
            .height(40.dp))

        Image(
            painter = painterResource(R.drawable.plustab),
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
        Button(onClick = {            val simToolKitLaunchIntent =
            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        }
            , colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black, contentColor = Color.Cyan)
            , modifier = Modifier.fillMaxWidth()) {
            Text(text = "Buy at $50000")
        }


    }



}
@Composable
fun IpadPageScreen(navController: NavController) {
    val mContext =LocalContext.current
    Column(modifier = Modifier.fillMaxSize().paint(painter = painterResource(com.felix.gamers_hub.R.drawable.img), contentScale = ContentScale.FillBounds)
    ) {
        Spacer(modifier = Modifier
            .height(40.dp))

        Image(
            painter = painterResource(R.drawable.ipad),
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
        Button(onClick = {            val simToolKitLaunchIntent =
            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        }
            , colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black, contentColor = Color.Cyan)
            , modifier = Modifier.fillMaxWidth()) {
            Text(text = "Buy at $50000")
        }


    }



}
















