package mx.moa.miabarroteria.model

import android.util.Log
import com.chaquo.python.PyObject
import com.chaquo.python.Python

class PythonModel {
    private val py: Python = Python.getInstance()

    fun recognizeSpeech(): String {
        return try {
            Log.d("PythonModel", "Calling Python function 'generar_query_sql'")
            val pyObject: PyObject = py.getModule("query_generator")  // Update module name
            val result: PyObject = pyObject.callAttr("generar_query_sql")
            Log.d("PythonModel", "Python function returned: ${result.toString()}")
            result.toString()
        } catch (e: Exception) {
            Log.e("PythonModel", "Error: ${e.message}")
            "Error: ${e.message}"
        }
    }
}