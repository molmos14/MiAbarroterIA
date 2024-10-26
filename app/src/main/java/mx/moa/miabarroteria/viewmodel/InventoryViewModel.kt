package mx.moa.miabarroteria.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import mx.moa.miabarroteria.api.ApiService
import mx.moa.miabarroteria.model.products.Product
import mx.moa.miabarroteria.model.products.ProductList
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import okhttp3.OkHttpClient
import java.net.ConnectException
import java.util.concurrent.TimeUnit

class InventoryViewModel : ViewModel() {

    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> get() = _products

    private val apiService: ApiService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://147.182.167.192:5000/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).build())
            .build()

        apiService = retrofit.create(ApiService::class.java)
        fetchProducts()
    }

    private fun fetchProducts() {
        viewModelScope.launch {
            try {
                val productList: ProductList = apiService.getProducts()
                _products.value = productList.products
                Log.d("InventoryViewModel", "Products fetched: ${productList.products}")
            } catch (e: ConnectException) {
                Log.e("InventoryViewModel", "Network is unreachable", e)
            } catch (e: Exception) {
                e.printStackTrace()
                Log.e("InventoryViewModel", "Error fetching products", e)
            }
        }
    }
}