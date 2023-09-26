package com.example.nafuurealestateapp.ui.theme.pages.signup

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
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
import com.example.nafuurealestateapp.navigation.ROUTE_LOGIN
import com.example.nafuurealestateapp.ui.theme.Buttonblue
import com.example.nafuurealestateapp.ui.theme.NafuuRealEstateAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen(navController: NavHostController){
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally) {
        var context= LocalContext.current
        Text(
            text = "Register here as a Service Provider",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Blue ,
            modifier = Modifier.padding(20.dp),
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline
        )
        Image(painter = painterResource(id = R.drawable.sunset), contentDescription =null)


                Spacer(modifier = Modifier.height(16.dp))


        var name by remember { mutableStateOf(TextFieldValue("")) }
        var email by remember { mutableStateOf(TextFieldValue("")) }
        var password by remember { mutableStateOf(TextFieldValue("")) }
        var credential by remember { mutableStateOf(TextFieldValue("")) }
        var contact by remember { mutableStateOf(TextFieldValue("")) }
        var certificate by remember { mutableStateOf(TextFieldValue("")) }



        OutlinedTextField(
            value = name,
            onValueChange ={ name = it},
            label = { Text(text = "Name") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = email,
            onValueChange ={ email = it},
            label = { Text(text = " Enter Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = contact,
            onValueChange ={ contact = it},
            label = { Text(text = "Enter contact") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Spacer(modifier = Modifier.height(10.dp))
        
        OutlinedTextField(
            value = credential,
            onValueChange ={ credential = it},
            label = { Text(text = "Enter credential") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = password,
            onValueChange ={ password = it},
            label = { Text(text = " Enter Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )



        Button(onClick = {
            navController.navigate(ROUTE_LOGIN)

        },
            colors = ButtonDefaults.buttonColors(Buttonblue),
            shape = CutCornerShape(10.dp)
        ) {
            Text(text = "signup",
                fontFamily = FontFamily.Cursive,
                fontSize = 25.sp)

        }
        Spacer(modifier = Modifier.height(10.dp))


        Button(onClick = {
                         navController.navigate(ROUTE_LOGIN)

            //logic

        },
            colors = ButtonDefaults.buttonColors(Buttonblue),
            shape = CutCornerShape(10.dp)) {
            Text(text = "Have account? login",
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp)
        }



    }


}
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun SignupScreenPreview() {
    NafuuRealEstateAppTheme {
        SignupScreen(rememberNavController())
    }

}
