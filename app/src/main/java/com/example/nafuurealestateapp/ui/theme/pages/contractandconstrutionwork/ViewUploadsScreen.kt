package com.example.nafuurealestateapp.ui.theme.pages.contractandconstrutionwork

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.example.nafuurealestateapp.data.ServicesRepository
import com.example.nafuurealestateapp.models.Upload

@Composable
fun ViewUploadsScreen(navController: NavHostController){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        var context = LocalContext.current
        var serviceRepository = ServicesRepository(navController, context)


        val emptyUploadState = remember { mutableStateOf(Upload("","","","","")) }
        var emptyUploadsListState = remember { mutableStateListOf<Upload>() }

        var uploads = serviceRepository.viewUploads(emptyUploadState, emptyUploadsListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "All uploads",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(){
                items(uploads){
                    UploadItem(
                        serviceName = it.serviceName,
                        serviceProviderName = it.serviceProviderName,
                        imageUrl = it.imageUrl,
                        id = it.id,
                        navController = navController,
                        ServiceRepository =serviceRepository
                    )

                }
            }
        }
    }
}


@Composable
fun UploadItem(serviceName:String, imageUrl:String,serviceProviderName:String, id:String,
               navController:NavHostController,ServiceRepository:ServicesRepository) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = serviceName)
        Text(text = serviceProviderName)
        Text(text = imageUrl)
        Text(text =id)
        Image(
            painter = rememberAsyncImagePainter(imageUrl),
            contentDescription = null,
            modifier = Modifier.size(128.dp)
        )
        Button(onClick = {
            ServiceRepository.deleteService(id)
        }) {
            Text(text = "Delete")
        }
        Button(onClick = {
            navController.navigate("/$id")
        }) {
            Text(text = "Update")
        }
    }
}

