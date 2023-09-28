package com.example.nafuurealestateapp.ui.theme.pages.login

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.nafuurealestateapp.R
import com.example.nafuurealestateapp.data.AuthRepository
import com.example.nafuurealestateapp.navigation.ROUTE_HOME
import com.example.nafuurealestateapp.navigation.ROUTE_SIGNUP
import com.example.nafuurealestateapp.ui.theme.Buttonblue
import com.example.nafuurealestateapp.ui.theme.Buttonbold
import com.example.nafuurealestateapp.ui.theme.Buttonendless
import com.example.nafuurealestateapp.ui.theme.Buttonweew
import com.example.nafuurealestateapp.ui.theme.Buttonwoow
import com.example.nafuurealestateapp.ui.theme.NafuuRealEstateAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavHostController){
   Surface(modifier = Modifier
       .fillMaxSize()
       .background(Buttonendless)
       .padding(20.dp),
   ) {

       Column(modifier = Modifier
           .fillMaxSize()
           .background(Buttonbold),
           verticalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.CenterVertically),
           horizontalAlignment = Alignment.CenterHorizontally) {
           var context= LocalContext.current
           Text(
               text = "Login here",
               fontSize = 30.sp,
               fontFamily = FontFamily.Cursive,
               color = Color.Cyan,
               modifier = Modifier.padding(20.dp),
               fontWeight = FontWeight.Bold,
               textDecoration = TextDecoration.Underline
           )
           Image(painter = painterResource(id = R.drawable.sunset), contentDescription =null )

           var email by remember { mutableStateOf(TextFieldValue("")) }
           var password by remember { mutableStateOf(TextFieldValue("")) }



           OutlinedTextField(
               value = email,
               onValueChange ={ email = it},
               label = { Text(text = " Enter Email",
               )},
               keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

           )





           OutlinedTextField(
               value = password,
               onValueChange ={ password = it},
               label = { Text(text = " Enter Password")},
               keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
           )





           Button(onClick = {


               navController.navigate(ROUTE_HOME)

           },
               colors = ButtonDefaults.buttonColors(Buttonblue)) {
               Text(text = "Login",
                   fontFamily = FontFamily.Cursive,
                   fontSize = 25.sp)


           }


           Button(onClick = {
                            navController.navigate(ROUTE_SIGNUP)

           },
               colors = ButtonDefaults.buttonColors(Buttonblue)) {
               Text(text = "No account?? signup as customer",
                   fontFamily = FontFamily.Cursive,
                   fontSize = 25.sp)

           }



       }

   }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable

fun LoginScreenPreview(){
    NafuuRealEstateAppTheme {
        LoginScreen(rememberNavController())
    }

}





