package com.example.nafuurealestateapp.ui.theme.pages.services

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.nafuurealestateapp.R
import com.example.nafuurealestateapp.navigation.ROUTE_ELECTRICAL_SERVICE
import com.example.nafuurealestateapp.navigation.ROUTE_LOCATION_SERVICE
import com.example.nafuurealestateapp.ui.theme.NafuuRealEstateAppTheme

@Composable
fun HousesOnSaleScreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .background(Color.Black )
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Houses on sale",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(bottom = 16.dp)
        )



        Spacer(modifier = Modifier.height(16.dp))
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.house1),
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                        .clip(shape = RoundedCornerShape(4.dp))
                )

                Spacer(modifier = Modifier.width(16.dp))

                Text(
                    text = "\n" +
                            "5 Bed House with En Suite at Westland\n" +
                            "\n" +
                            "01, nyari, Westland, Nyari, Westlands\n" +
                            "Beautiful 5 Bedroom House for Sale Nyari, Westl...\n" +
                            "Geoscape Global Limited\n" +
                            "\n" +
                            "KSh 130,000,000\n " ,
                    style = MaterialTheme.typography.bodyLarge
                )

                Spacer(modifier = Modifier.width(16.dp))

            }

            Button(onClick = {
                             navController.navigate(ROUTE_LOCATION_SERVICE)
            },
                modifier = Modifier.width(150.dp)) {
                Text(text = "View more")
            }


        }
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.house2),
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                        .clip(shape = RoundedCornerShape(4.dp))
                )

                Spacer(modifier = Modifier.width(16.dp))

                Text(
                    text = "\n" +
                            "01, lavington, Nairobi, Lavington\n" +
                            "Modern 5 bedroom Townhouse for sale Lavington,...\n" +
                            "Geoscape Global Limited\n" +
                            "\n" +
                            "KSh 95,000,000\n",
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.width(16.dp))

            }

            Button(onClick = {
                             navController.navigate(ROUTE_LOCATION_SERVICE)
            },
                modifier = Modifier.width(150.dp)) {
                Text(text = "View more")
            }


        }
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.house3),
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                        .clip(shape = RoundedCornerShape(4.dp))
                )

                Spacer(modifier = Modifier.width(16.dp))

                Text(
                    text = "\n" +
                            "02, loresho, westland, Loresho, Westlands\n" +
                            "Modern 5 Bedroom House for Sale Loresho, Westla...\n" +
                            "Geoscape Global Limited\n" +
                            "\n" +
                            "KSh 120,000,000\n",
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.width(16.dp))

            }

            Button(onClick = {
                             navController.navigate(ROUTE_LOCATION_SERVICE)
            },
                modifier = Modifier.width(150.dp)) {
                Text(text = "View more")
            }


        }
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.house4),
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                        .clip(shape = RoundedCornerShape(4.dp))
                )

                Spacer(modifier = Modifier.width(16.dp))

                Text(
                    text = "\n" +
                            "\n" +
                            "La-marina, Mtwapa\n" +
                            "Mtwapa,Luxury Villa with pool on sale\n",
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.width(16.dp))

            }

            Button(onClick = {
                             navController.navigate(ROUTE_LOCATION_SERVICE)
            },
                modifier = Modifier.width(150.dp)) {
                Text(text = "View more")
            }


        }
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.house6),
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                        .clip(shape = RoundedCornerShape(4.dp))
                )

                Spacer(modifier = Modifier.width(16.dp))

                Text(
                    text = "\n" +
                            "\n" +
                            "Lower Kabete, Westlands\n" +
                            "APPROVED VALUE FOR MONEY! BUY THIS MODERN 5 BED...\n" +
                            "\n" +
                            "KSh 90,000,000\n",
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.width(16.dp))

            }

            Button(onClick = {
                             navController.navigate(ROUTE_LOCATION_SERVICE)
            },
                modifier = Modifier.width(150.dp)) {
                Text(text = "View more")
            }


        }
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.house7),
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                        .clip(shape = RoundedCornerShape(4.dp))
                )

                Spacer(modifier = Modifier.width(16.dp))

                Text(
                    text = "\n" +
                            "5 Bed Townhouse with En Suite in Runda\n" +
                            "\n" +
                            "Runda, Westlands\n" +
                            "5 bedroom townhouse for sale in runda with dsq\n" +
                            "Sarabi Listings\n" +
                            "\n" +
                            "KSh 55,000,000\n",
                    style = MaterialTheme.typography.bodySmall
                )
                Spacer(modifier = Modifier.width(16.dp))

            }

            Button(onClick = {
                             navController.navigate(ROUTE_LOCATION_SERVICE)
            },
                modifier = Modifier.width(150.dp)) {
                Text(text = "View more")
            }


        }





    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HousesOnSaleScreenPreview() {
    NafuuRealEstateAppTheme {
        HousesOnSaleScreen(rememberNavController())
    }

}