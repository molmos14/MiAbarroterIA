package mx.moa.miabarroteria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.moa.miabarroteria.ui.theme.MiAbarroterIATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiAbarroterIATheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    InitialView(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun InitialView(modifier: Modifier = Modifier) {
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
            onClick = { /* TODO: Handle Inventario click */ },
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
    }
}

@Preview(showBackground = true)
@Composable
fun InitialViewPreview() {
    MiAbarroterIATheme {
        InitialView()
    }
}