package com.example.nafuurealestateapp.ui.theme.pages.services

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import com.example.nafuurealestateapp.navigation.ROUTE_LOCATION_SERVICE
import com.example.nafuurealestateapp.ui.theme.NafuuRealEstateAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LandOnSaleScreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .background(Color.Gray)
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "lands on sale",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.land1),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = RoundedCornerShape(4.dp))
                    .clickable {
                        navController.navigate(ROUTE_LOCATION_SERVICE)
                    }
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "\n" +
                        "Land in Tigoni\n" +
                        "\n" +
                        "Tigoni, Limuru\n" +
                        "One Acre Plots For Sale in Kentmere, Tigoni\n" +
                        "MyHood Realty\n" +
                        "\n" +
                        "KSh 35,000,000\n",
                style = MaterialTheme.typography.bodySmall
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.land5),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = RoundedCornerShape(4.dp))
                    .clickable {
                        navController.navigate(ROUTE_LOCATION_SERVICE)

                    }
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "\n" +
                        "6 ac Land at Mtwapa\n" +
                        "\n" +
                        "Mtwapa\n" +
                        "A prime land of 6 acres on sale at Mtwapa\n" +
                        "Sky Miles Properties\n" +
                        "\n" +
                        "KSh 42,000,000\n",
                style = MaterialTheme.typography.bodySmall
            )
            Spacer(modifier = Modifier.width(16.dp))

        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.land2),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = RoundedCornerShape(4.dp))
                    .clickable {
                        navController.navigate(ROUTE_LOCATION_SERVICE)
                    }
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "\n" +
                        "Land Area 0 ac\n" +
                        "0.5 acres vacant land for sale in Karen (Kenya) 3KE1595068\n" +
                        "0.5 Acre Vacant Plot\n" +
                        "\n" +
                        "This plot sits is a quiet, secure, homely neighborhood minutes away from The Waterfront Mall. It is perfect for putting up your dream home.\n" +
                        "Call to view!",
                style = MaterialTheme.typography.bodySmall
            )
            Spacer(modifier = Modifier.width(16.dp))

        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.land4),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = RoundedCornerShape(4.dp))
                    .clickable {
                        navController.navigate(ROUTE_LOCATION_SERVICE)
                    }
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "\n" +
                        "0.5 ac Land in Thika Road\n" +
                        "\n" +
                        "Thika Road\n" +
                        "0.5 acres of land for sale\n" +
                        "Hold Piece Ltd\n" +
                        "\n" +
                        "KSh 80,000,000\n",
                style = MaterialTheme.typography.bodySmall

            )
            Spacer(modifier = Modifier.width(16.dp))

        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.land3),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = RoundedCornerShape(4.dp))
                    .clickable {
                        navController.navigate(ROUTE_LOCATION_SERVICE)
                    }
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "\n" +
                        "8 ac Land in Kikambala\n" +
                        "\n" +
                        "Mtwapa, Kikambala\n" +
                        "8 acres of prime land on sale at a prime area o...\n" +
                        "Benford Homes\n" +
                        "\n" +
                        "KSh 40,000,000\n" +
                        "Silver\n",
                style = MaterialTheme.typography.bodySmall
            )
            Spacer(modifier = Modifier.width(16.dp))

        }


    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun LandOnSaleScreenPreview() {
    NafuuRealEstateAppTheme {
        LandOnSaleScreen(rememberNavController())

    }

}
