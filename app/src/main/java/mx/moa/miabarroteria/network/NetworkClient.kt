package mx.moa.miabarroteria.network

import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody

fun main() {
    val client = OkHttpClient()
    val ip = "http://172.19.12.229:5000/recognize"  // Use HTTPS

    val requestBody = "".toRequestBody("audio/wav".toMediaTypeOrNull()) // Adjust as needed

    val request = Request.Builder()
        .url(ip)
        .post(requestBody)
        .build()

    client.newCall(request).enqueue(object : Callback {
        override fun onFailure(call: Call, e: IOException) {
            println("Error: ${e.message}")
        }

        override fun onResponse(call: Call, response: Response) {
            if (response.isSuccessful) {
                println("Response: ${response.body?.string()}")
            } else {
                println("Response error: ${response.code}")
            }
        }
    })
}