package com.example.nafuurealestateapp.ui.theme.pages.home

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.icu.text.RelativeDateTimeFormatter
import android.net.Uri
import android.service.autofill.OnClickAction
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.nafuurealestateapp.R
import com.example.nafuurealestateapp.navigation.ROUTE_CONTRACTING_SERVICE
import com.example.nafuurealestateapp.navigation.ROUTE_ELECTRICAL_SERVICE
import com.example.nafuurealestateapp.navigation.ROUTE_HOUSES_ON_SALE
import com.example.nafuurealestateapp.navigation.ROUTE_INTERIOR_DESIGNING_SERVICE
import com.example.nafuurealestateapp.navigation.ROUTE_LANDSCAPING_SERVICE
import com.example.nafuurealestateapp.navigation.ROUTE_LAND_ON_SALE
import com.example.nafuurealestateapp.ui.theme.Buttonbold
import com.example.nafuurealestateapp.ui.theme.Buttonendless
import com.example.nafuurealestateapp.ui.theme.Buttonorange
import com.example.nafuurealestateapp.ui.theme.Buttonpink
import com.example.nafuurealestateapp.ui.theme.Buttonweew
import com.example.nafuurealestateapp.ui.theme.Buttonwoow
import com.example.nafuurealestateapp.ui.theme.Buttonyees
import com.example.nafuurealestateapp.ui.theme.NafuuRealEstateAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .background(Color.Black)
            .fillMaxSize()
            .padding(20.dp, 20.dp, 20.dp, 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var context = LocalContext.current
        Text(
            text = "Welcome To Nafuu Real Estate App your ideal Home of choice",
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            color = Color.Green,
            fontFamily = FontFamily.Cursive,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 0.dp, 20.dp, 20.dp)

        )


        Spacer(modifier = Modifier.height((20.dp)))
        Card(onClick = {
            navController.navigate(ROUTE_CONTRACTING_SERVICE)
        },
            modifier = Modifier
                .size(width = 240.dp, height = 200.dp)
        ) {
            Box(
                modifier = Modifier
                    .background(Color.Black)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.construction),
                    contentDescription =null,
                    modifier = Modifier.fillMaxSize()
                )
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(text = "Construction",
                        color = Color.Red,
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp)

                }

            }

        }


        Spacer(modifier = Modifier.height((20.dp)))

        Spacer(modifier = Modifier.height((20.dp)))
        Card(
            onClick = {
                      navController.navigate(ROUTE_LAND_ON_SALE)

            },
            modifier = Modifier
                .background(Color.Red)
                .size(width = 240.dp, height = 200.dp)
        ) {
            Box (modifier = Modifier
                .background(Color.Black)
            ){
                Image(
                    painter = painterResource(id = R.drawable.farmland),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Land on Sale",
                        color = Color.Red, // Set the text color
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp

                    )
                }
            }
        }

        Spacer(modifier = Modifier.height((20.dp)))

        Card(
            onClick = {
                      navController.navigate(ROUTE_HOUSES_ON_SALE)
            },
            modifier = Modifier
                .size(width = 240.dp, height = 200.dp)
        ) {
            Box (
                modifier = Modifier
                    .background(Color.Black)
            ){
                Image(
                    painter = painterResource(id = R.drawable.purchase),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Houses on sale",
                        color = Color.Red,
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp
                    )

                }
            }
        }
        Card(
            onClick = {
                navController.navigate(ROUTE_LANDSCAPING_SERVICE)
            },
            modifier = Modifier
                .size(width = 240.dp, height = 200.dp)
        ) {
            Box (
                modifier = Modifier
                    .background(Color.Black)
            ){
                Image(
                    painter = painterResource(id = R.drawable.landscaping),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Land Scaping",
                        color = Color.Red,
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp
                    )

                }
            }
        }

        Spacer(modifier = Modifier.height((20.dp)))

        }
    }


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    NafuuRealEstateAppTheme {
        HomeScreen(rememberNavController())
    }
}

