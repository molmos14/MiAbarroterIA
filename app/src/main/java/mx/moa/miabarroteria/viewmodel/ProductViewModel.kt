import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import mx.moa.miabarroteria.model.products.Product

class ProductViewModel : ViewModel() {
    val products = MutableLiveData<List<Product>>()

    fun fetchProducts() {
        viewModelScope.launch {
            try {
                val productList = RetrofitClient.apiService.getProducts()
                products.postValue(productList.products)
            } catch (e: Exception) {
                // Handle the error
            }
        }
    }
}