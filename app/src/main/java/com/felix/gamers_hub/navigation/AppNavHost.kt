package com.felix.gamers_hub.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.felix.gamers_hub.repository.UserRepository
import com.felix.gamers_hub.ui.screens.about.AboutScreen
import com.felix.gamers_hub.ui.screens.auth.RegisterScreen
import com.felix.gamers_hub.ui.screens.home.HomeScreen
import com.felix.gamers_hub.ui.screens.homepage.HomePageScreen
import com.felix.gamers_hub.ui.screens.landing.LandingScreen
import com.felix.gamers_hub.ui.screens.phones.PhoneScreen
import com.felix.gamers_hub.ui.screens.products.AsusPageScreen
import com.felix.gamers_hub.ui.screens.products.BlackPageScreen
import com.felix.gamers_hub.ui.screens.products.IpadPageScreen
import com.felix.gamers_hub.ui.screens.products.IphonePageScreen
import com.felix.gamers_hub.ui.screens.products.LegionPageScreen
import com.felix.gamers_hub.ui.screens.products.OnePageScreen
import com.felix.gamers_hub.ui.screens.products.PixelPageScreen
import com.felix.gamers_hub.ui.screens.products.TabPageScreen
import com.felix.gamers_hub.ui.screens.products.TabsPageScreen
import com.felix.gamers_hub.ui.screens.products.VivoPageScreen
import com.felix.gamers_hub.ui.screens.products.XiaomiPageScreen
import com.felix.gamers_hub.ui.screens.splash.SplashScreen
import com.felix.gamers_hub.ui.screens.tablets.TabletScreen
import com.felix.gamers_hub.viewmodel.AuthViewModel
import com.felix.harakamall.data.UserDatabase
import com.felix.harakamall.ui.Screens.auth.LoginScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH


) {

    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen  (authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_LANDING) {
            LandingScreen(navController)
        }
        composable(ROUT_HOMEPAGE){
            HomePageScreen(navController)
        }
        composable(ROUT_ASUS){
            AsusPageScreen(navController)
        }
        composable(ROUT_VIVO){
            VivoPageScreen(navController)
        }
        composable(ROUT_IPHONE){
            IphonePageScreen(navController)
        }

        composable(ROUT_PIXEL){
            PixelPageScreen(navController)
        }
        composable(ROUT_PHONE){
            PhoneScreen(navController)
        }
        composable(ROUT_TAB){
            TabPageScreen(navController)
        }
        composable(ROUT_BLACK){
            BlackPageScreen(navController)
        }
        composable(ROUT_LEGION){
            LegionPageScreen(navController)
        }
        composable(ROUT_IPAD){
            IpadPageScreen(navController)
        }
        composable(ROUT_TABS){
            TabsPageScreen(navController)
        }
        composable(ROUT_XIAOMI){
            XiaomiPageScreen(navController)
        }
        composable(ROUT_ONE){
            OnePageScreen(navController)
        }
        composable(ROUT_TABLET){
            TabletScreen(navController)
        }













    }
}