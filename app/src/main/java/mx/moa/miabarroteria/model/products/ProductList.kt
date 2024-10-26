package mx.moa.miabarroteria.model.products

import com.google.gson.annotations.SerializedName

data class ProductList(
    @SerializedName("products") val products: List<Product>
)