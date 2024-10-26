package mx.moa.miabarroteria.api

import mx.moa.miabarroteria.model.products.ProductList
import retrofit2.http.GET

interface ApiService {
    @GET("api/products")
    suspend fun getProducts(): ProductList
}