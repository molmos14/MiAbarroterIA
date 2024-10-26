package mx.moa.miabarroteria.model.products

import com.google.gson.annotations.SerializedName
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product(
    @SerializedName("productID") var productID: Int,
    @SerializedName("barcodeUDP") var barcodeUDP: Int,
    @SerializedName("productName") var productName: String?,
    @SerializedName("unitCost") var unitCost: Double?,
    @SerializedName("unitPrice") var unitPrice: Double?,
    @SerializedName("image") var image: String?
) : Parcelable