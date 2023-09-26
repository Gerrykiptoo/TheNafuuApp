package com.example.nafuurealestateapp.ui.theme.pages.services

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.nafuurealestateapp.navigation.ROUTE_BUILDING_GREEN
import com.example.nafuurealestateapp.navigation.ROUTE_CONTRACTION_CONSULTATION
import com.example.nafuurealestateapp.navigation.ROUTE_CONTRACTOR_PROFILE
import com.example.nafuurealestateapp.navigation.ROUTE_GENERAL_CONSTRUCTION
import com.example.nafuurealestateapp.navigation.ROUTE_LOCATION_SERVICE
import com.example.nafuurealestateapp.navigation.ROUTE_SERVICE_CATEGORIES
import com.example.nafuurealestateapp.ui.theme.NafuuRealEstateAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContractorsServiceScreen(navController: NavHostController){
    Column(modifier = Modifier.fillMaxSize()
        .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally) {
        var context = LocalContext.current
        Text(
            text = "welcome to our Contracting services feel free to enjoy our services  ",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Red,
            modifier = Modifier.padding(20.dp),
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline
        )
        Button(onClick = {

        }) {
            Text(text = "Contractors  services")

        }

        Spacer(modifier = Modifier.height((20.dp))
        )

       Button(onClick = {
           navController.navigate(ROUTE_CONTRACTION_CONSULTATION)

       }) {
           FeatureButton(
               label = "Contraction consultant",
               description = "Get our ready available consultants ready to assist you ",
               navController = navController
           )

       }
        Spacer(modifier = Modifier.height(50.dp))

        Button(onClick = {
            navController.navigate(ROUTE_BUILDING_GREEN)

        }) {
            FeatureButton(
                label = "Building green",
                description = "Get to know more information on how to make you home ECO  friendly to all",
                navController = navController
            )
            
        }

        Spacer(modifier = Modifier.height(50.dp))

        Button(onClick = {
            navController.navigate(ROUTE_GENERAL_CONSTRUCTION)
        }) {
            FeatureButton(
                label = "General construction ",
                description = "Explore our superior services with  an experiences team and high quality  materials that we use.",
                navController = navController
            )
            
        }
        Spacer(modifier = Modifier.height(50.dp))

       Button(onClick = {
           navController.navigate(ROUTE_LOCATION_SERVICE)
       }) {
           FeatureButton(
               label = "Location Services",
               description = "Find contractors near you with geolocation and get directions to their locations.",
               navController = navController
           )
           
       }

        Spacer(modifier = Modifier.height(50.dp))
    }
}

@Composable
fun FeatureButton(label: String, description: String, navController: NavHostController) {
    Button(
        onClick = {
            when (label) {
                "Contractor consultation" -> {
                    navController.navigate(ROUTE_CONTRACTION_CONSULTATION)
                }
                "Building Green" -> {
                    navController.navigate(ROUTE_BUILDING_GREEN)
                }
                "General Construction" -> {
                    navController.navigate(ROUTE_GENERAL_CONSTRUCTION)
                }
                "Location Services" -> {
                    navController.navigate(ROUTE_LOCATION_SERVICE)
                }
                else -> {
                }
            }
        }
    ) {
        Column {
            Text(text = label)
            Text(text = description,
                fontSize = 13.sp,
                color = Color.Black)
        }
    }
}



@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun ContractorsServiceScreenPreview() {
    NafuuRealEstateAppTheme {
       ContractorsServiceScreen(rememberNavController())
    }

}

//
