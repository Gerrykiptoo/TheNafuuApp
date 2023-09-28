package com.example.nafuurealestateapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nafuurealestateapp.ui.theme.pages.contractandconstrutionwork.AddServiceScreen
import com.example.nafuurealestateapp.ui.theme.pages.contractandconstrutionwork.ViewServicesScreen
import com.example.nafuurealestateapp.ui.theme.pages.contractandconstrutionwork.ViewUploadsScreen
import com.example.nafuurealestateapp.ui.theme.pages.home.HomeScreen
import com.example.nafuurealestateapp.ui.theme.pages.login.LoginScreen
import com.example.nafuurealestateapp.ui.theme.pages.services.BuildingGreenScreen
import com.example.nafuurealestateapp.ui.theme.pages.services.ContractionConsultationScreen
import com.example.nafuurealestateapp.ui.theme.pages.services.ContractorsProfileScreen
import com.example.nafuurealestateapp.ui.theme.pages.services.ContractorsServiceScreen
import com.example.nafuurealestateapp.ui.theme.pages.services.GeneralConstructionScreen
import com.example.nafuurealestateapp.ui.theme.pages.services.HousesOnSaleScreen
import com.example.nafuurealestateapp.ui.theme.pages.services.LandOnSaleScreen
import com.example.nafuurealestateapp.ui.theme.pages.services.LandScaping
import com.example.nafuurealestateapp.ui.theme.pages.services.LocationServiceScreen
import com.example.nafuurealestateapp.ui.theme.pages.services.ServiceCategoryScreen
import com.example.nafuurealestateapp.ui.theme.pages.services.UploadScreen
import com.example.nafuurealestateapp.ui.theme.pages.signup.SignupScreenone
import com.example.nafuurealestateapp.ui.theme.pages.signup.SignupasOtherServiceProviders


@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               StartDestination:String= ROUTE_LOGIN) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = StartDestination
    ) {
        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUTE_SIGNUP) {
            SignupScreenone(navController)

        }
        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
        composable(ROUTE_HOUSES_ON_SALE) {
            HousesOnSaleScreen(navController)

        }
        composable(ROUTE_LANDSCAPING_SERVICE) {
            LandScaping(navController)
        }
        composable(ROUTE_CONTRACTING_SERVICE) {
            ContractorsServiceScreen(navController)

        }
        composable(ROUTE_LAND_ON_SALE) {
            LandOnSaleScreen(navController)
        }
        composable(ROUTE_CONTRACTION_CONSULTATION){
                ContractionConsultationScreen(navController)
        }
        composable(ROUTE_CONTRACTOR_PROFILE){
            ContractorsProfileScreen(navController )
        }
        composable(ROUTE_SERVICE_CATEGORIES){
            ServiceCategoryScreen(navController)
        }
        composable(ROUTE_LOCATION_SERVICE){
            LocationServiceScreen(navController)
        }
        composable(ROUTE_BUILDING_GREEN){
            BuildingGreenScreen(navController)
        }
        composable(ROUTE_GENERAL_CONSTRUCTION){
            GeneralConstructionScreen(navController)
        }
        composable(ROUTE_ADD_SERVICE){
            AddServiceScreen(navController)
        }
        composable(ROUTE_VIEW_SERVICE){
            ViewServicesScreen(navController)

        }
        composable(ROUTE_VIEW_UPLOAD){
          ViewUploadsScreen(navController)

        }
        composable(ROUTE_SIGN_UP_TWO){
            SignupasOtherServiceProviders(navController )
        }



    }
}