package com.example.nafuurealestateapp.ui.theme.pages.services

import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_NO
import androidx.compose.foundation.Image
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
import com.example.nafuurealestateapp.navigation.ROUTE_LOCATION_SERVICE
import com.example.nafuurealestateapp.ui.theme.NafuuRealEstateAppTheme
@Composable
fun LandScaping(navController: NavHostController){
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Land Scaping services",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.house),
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
                text = "This is an image of our construction consultation services. "
                        + "We offer expert guidance and advice to help you with your construction " +
                        "projects.",
                style = MaterialTheme.typography.bodySmall
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.house),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = RoundedCornerShape(4.dp))
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "This is an image of our construction consultation services. "
                        + "We offer expert guidance and advice to help you with your construction " +
                        "projects.",
                style = MaterialTheme.typography.bodySmall
            )
            Spacer(modifier = Modifier.width(16.dp))

        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.house),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = RoundedCornerShape(4.dp))
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "This is an image of our construction consultation services. "
                        + "We offer expert guidance and advice to help you with your construction " +
                        "projects.",
                style = MaterialTheme.typography.bodySmall
            )
            Spacer(modifier = Modifier.width(16.dp))

        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.house),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = RoundedCornerShape(4.dp))
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "This is an image of our construction consultation services. "
                        + "We offer expert guidance and advice to help you with your construction " +
                        "projects.",
                style = MaterialTheme.typography.bodySmall
            )
            Spacer(modifier = Modifier.width(16.dp))

        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.house),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = RoundedCornerShape(4.dp))
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "This is an image of our construction consultation services. "
                        + "We offer expert guidance and advice to help you with your construction " +
                        "projects.",
                style = MaterialTheme.typography.bodySmall
            )
            Spacer(modifier = Modifier.width(16.dp))

        }


    }
}


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun LandScapingScreenPreview() {
    NafuuRealEstateAppTheme {
       LandScaping(rememberNavController())
    }

}