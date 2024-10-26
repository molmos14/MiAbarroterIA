package mx.moa.miabarroteria.model.products

import com.google.gson.annotations.SerializedName
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Products (
    // unique product code
    @SerializedName("upc") var upc: String,
    @SerializedName("name") var name: String,
) : Parcelable
