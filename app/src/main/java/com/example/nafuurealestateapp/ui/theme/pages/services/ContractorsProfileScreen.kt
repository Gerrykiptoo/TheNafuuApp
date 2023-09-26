package com.example.nafuurealestateapp.ui.theme.pages.services

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.nafuurealestateapp.ui.theme.NafuuRealEstateAppTheme

@Composable
fun ContractorsProfileScreen(navController: NavHostController){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        var context = LocalContext
        Text(text = "Contractor`s profile")

    }

}


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun ContractorsProfileScreen() {
    NafuuRealEstateAppTheme {
        ContractorsProfileScreen(rememberNavController())
    }
}
