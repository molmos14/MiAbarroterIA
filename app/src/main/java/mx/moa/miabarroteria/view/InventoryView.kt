package mx.moa.miabarroteria.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import mx.moa.miabarroteria.model.products.Product
import mx.moa.miabarroteria.viewmodel.InventoryViewModel

@Composable
fun InventoryView(viewModel: InventoryViewModel = viewModel()) {
    val products by viewModel.products.observeAsState(emptyList())

    Column {
        Row(Modifier.padding(16.dp)) {
            Text(text = "Product Name", style = MaterialTheme.typography.bodySmall, modifier = Modifier.weight(1f))
            Text(text = "Unit Price", style = MaterialTheme.typography.bodySmall, modifier = Modifier.weight(1f))
        }
        LazyColumn {
            items(products) { product ->
                ProductRow(product)
            }
        }
    }
}

@Composable
fun ProductRow(product: Product) {
    Row(Modifier.padding(8.dp)) {
        Text(text = "${product.productName}", style = MaterialTheme.typography.bodyMedium, modifier = Modifier.weight(1f))
        Text(text = "${product.unitPrice}", style = MaterialTheme.typography.bodyMedium, modifier = Modifier.weight(1f))
    }
}