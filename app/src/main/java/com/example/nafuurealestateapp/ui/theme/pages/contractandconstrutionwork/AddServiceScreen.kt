package com.example.nafuurealestateapp.ui.theme.pages.contractandconstrutionwork

import android.content.Context
import android.content.res.Configuration
import android.net.Uri
import android.provider.MediaStore
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
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
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
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
import com.example.nafuurealestateapp.data.ServicesRepository
import com.example.nafuurealestateapp.models.Service
import com.example.nafuurealestateapp.navigation.ROUTE_VIEW_SERVICE
import com.example.nafuurealestateapp.ui.theme.NafuuRealEstateAppTheme
import com.example.nafuurealestateapp.ui.theme.uploadService.ImagePicker

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddServiceScreen(navController: NavHostController){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        var context= LocalContext.current
        Text(
            text = "Service and Service provider ",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Red,
            modifier = Modifier.padding(20.dp),
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline
        )


        var serviceName by remember { mutableStateOf(TextFieldValue("")) }
        var serviceProviderName by remember { mutableStateOf(TextFieldValue("")) }
        var serviceDescription by remember { mutableStateOf(TextFieldValue("")) }




        OutlinedTextField(
            value = serviceName,
            onValueChange ={ serviceName = it},
            label = { Text(text = "Service name*") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = serviceProviderName,
            onValueChange ={ serviceProviderName = it},
            label = { Text(text = "Service Provider name*") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = serviceDescription,
            onValueChange ={ serviceDescription = it},
            label = { Text(text = "Description *") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )

        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            navController.navigate(ROUTE_VIEW_SERVICE)

            //-----------WRITE THE SAVE LOGIC HERE------//
            var servicesRepository = ServicesRepository(navController,context)
            servicesRepository.saveService(serviceName.text.trim(),serviceDescription.text.trim(),serviceProviderName.text.trim(),
                imageUrl = String())

        }) {
            Text(text = "Save")

        }



        Spacer(modifier = Modifier.height(20.dp))


        ImagePicker(Modifier ,context, navController, serviceName.text.trim(), serviceDescription.text.trim(), serviceProviderName.text.trim())

    }


}
@Composable
fun imagePicker(modifier: Modifier = Modifier, context:Context,navController: NavHostController, name:String, serviceProvider:String, price:String) {
    var hasImage by remember { mutableStateOf(false) }
    var imageUri by remember { mutableStateOf<Uri?>(null) }

    val imagePicker = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent(),
        onResult = { uri ->
            hasImage = uri != null
            imageUri = uri
        }
    )

    Column(modifier = modifier,) {
        if (hasImage && imageUri != null) {
            val bitmap = MediaStore.Images.Media.
            getBitmap(context.contentResolver,imageUri)
            Image(bitmap = bitmap.asImageBitmap(), contentDescription = "Selected image")
        }
        Column(
            modifier = Modifier.fillMaxWidth().padding(bottom = 32.dp), horizontalAlignment = Alignment.CenterHorizontally,) {
            Button(
                onClick = {
                    imagePicker.launch("image/*")
                },
            ) {
                Text(
                    text = "Select Image"
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {
                //-----------WRITE THE UPLOAD LOGIC HERE---------------//
                var servicesRepository = ServicesRepository(navController,context)
               servicesRepository.saveServiceWithImage(name,price,imageUri!!)


            }) {
                Text(text = "Upload")
            }
        }
    }
}
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun AddServiceScreenPreview() {
    NafuuRealEstateAppTheme {
        AddServiceScreen(rememberNavController())
    }

}