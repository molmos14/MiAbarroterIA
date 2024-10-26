// File: app/src/main/java/mx/moa/miabarroteria/InventoryView.kt
package mx.moa.miabarroteria

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InventoryView() {
    var inventoryMessage by remember { mutableStateOf("Inventory List") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = inventoryMessage,
            fontSize = 30.sp,
            modifier = Modifier.padding(bottom = 20.dp)
        )
        // Add more UI components for inventory management here
    }
}