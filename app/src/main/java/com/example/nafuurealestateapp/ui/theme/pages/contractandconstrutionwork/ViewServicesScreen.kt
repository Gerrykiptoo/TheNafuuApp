package com.example.nafuurealestateapp.ui.theme.pages.contractandconstrutionwork

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.nafuurealestateapp.data.ServicesRepository
import com.example.nafuurealestateapp.models.Service
import com.example.nafuurealestateapp.navigation.ROUTE_HOME
import com.example.nafuurealestateapp.ui.theme.NafuuRealEstateAppTheme

@Composable
fun ViewServicesScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        var context = LocalContext.current
        var serviceRepository = ServicesRepository(navController, context)


        val emptyServiceState = remember { mutableStateOf(Service("","","","")) }
        var emptyServicesListState = remember { mutableStateListOf<Service>() }

        var services= serviceRepository.viewServices(emptyServiceState, emptyServicesListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "All services",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp),
                modifier = Modifier.fillMaxSize()

            ){
              items(services){
                  ServiceItem(
                      serviceName = it.serviceName,
                      serviceProvider = it.serviceProvider,
                      serviceDescription = it.serviceDescription,
                      id = it.id,
                      navController =navController ,
                      servicesRepository =serviceRepository
                  )

              }
            }
        }
    }
}


@Composable
fun ServiceItem(serviceName:String, serviceProvider:String, serviceDescription:String, id:String,
                navController:NavHostController, servicesRepository:ServicesRepository) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = serviceName)
        Text(text = serviceProvider)
        Text(text =  serviceDescription)
        Button(onClick = {
            servicesRepository.deleteService(id)
        }) {
            Text(text = "Delete")
        }
        Button(onClick = {
            navController.navigate(ROUTE_HOME+"/$id")
        }) {
            Text(text = "Update")
        }
    }
}
@Composable
fun ViewServicesScreen(){
    NafuuRealEstateAppTheme {
        ViewServicesScreen(rememberNavController())
    }
}