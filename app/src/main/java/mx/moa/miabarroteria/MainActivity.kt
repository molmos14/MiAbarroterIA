package mx.moa.miabarroteria

import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import mx.moa.miabarroteria.network.main
import mx.moa.miabarroteria.ui.theme.MiAbarroterIATheme
import mx.moa.miabarroteria.viewmodel.PythonViewModel

class MainActivity : ComponentActivity() {
    private val pythonViewModel: PythonViewModel by viewModels()
    private val REQUEST_RECORD_AUDIO_PERMISSION = 200
    private var permissionToRecordAccepted = false
    private var permissions: Array<String> = arrayOf("android.permission.RECORD_AUDIO")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityCompat.requestPermissions(this, permissions, REQUEST_RECORD_AUDIO_PERMISSION)
        enableEdgeToEdge()
        setContent {
            MiAbarroterIATheme {
                val navController = rememberNavController()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "initialView",
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable("initialView") {
                            InitialView(
                                modifier = Modifier.padding(innerPadding),
                                pythonViewModel = pythonViewModel,
                                navController = navController
                            )
                        }
                        composable("inventoryView") {
                            InventoryView()
                        }
                    }
                }
            }
        }
        main() // Call the main function from NetworkClient
    }

    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<String>, grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        permissionToRecordAccepted = if (requestCode == REQUEST_RECORD_AUDIO_PERMISSION) {
            grantResults[0] == PackageManager.PERMISSION_GRANTED
        } else {
            false
        }
        if (!permissionToRecordAccepted) finish()
    }
}
@Composable
fun InitialView(
    modifier: Modifier = Modifier,
    pythonViewModel: PythonViewModel,
    navController: NavHostController
) {
    var helloMessage by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "MiAbarroterIA",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 70.dp)
        )
        Button(
            onClick = { /* TODO: Handle Ventas click */ },
            colors = androidx.compose.material3.ButtonDefaults.buttonColors(containerColor = Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(vertical = 8.dp)
        ) {
            Text(text = "Ventas", fontSize = 40.sp)
        }
        Button(
            onClick = {
                helloMessage = pythonViewModel.recognizeSpeech()
                navController.navigate("inventoryView")
            },
            colors = androidx.compose.material3.ButtonDefaults.buttonColors(containerColor = Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(vertical = 8.dp)
        ) {
            Text(text = "Inventario", fontSize = 40.sp)
        }
        Button(
            onClick = { /* TODO: Handle Notificaciones click */ },
            colors = androidx.compose.material3.ButtonDefaults.buttonColors(containerColor = Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(vertical = 8.dp)
        ) {
            Text(text = "Notificaciones", fontSize = 40.sp)
        }
        if (helloMessage.isNotEmpty()) {
            Text(
                text = helloMessage,
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(top = 20.dp)
            )
        }
    }
}

@Composable
fun InventoryView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Inventario",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 70.dp)
        )
        // Aquí puedes agregar más contenido relacionado con el inventario
    }
}

@Preview(showBackground = true)
@Composable
fun InitialViewPreview() {
    MiAbarroterIATheme {
        InitialView(pythonViewModel = PythonViewModel(), navController = rememberNavController())
    }
}