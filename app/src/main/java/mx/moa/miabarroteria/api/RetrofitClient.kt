package mx.equipo6.proyectoapp.api

import mx.moa.miabarroteria.api.ApiService
import mx.moa.miabarroteria.include.Constants.Companion.API_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    // URL base de la API
    private const val BASE_URL = API_URL

    // Servicio de la API
    val apiService: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}