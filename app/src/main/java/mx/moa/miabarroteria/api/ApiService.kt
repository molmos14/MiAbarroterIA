package mx.moa.miabarroteria.api

import mx.moa.miabarroteria.model.products.ProductList
import retrofit2.http.GET

interface ApiService {
    @GET("products") // Asegúrate de que el endpoint sea correcto
    suspend fun getProducts(): ProductList
}