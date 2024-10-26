package mx.moa.miabarroteria.model

import com.chaquo.python.PyObject
import com.chaquo.python.Python

class PythonModel {
    private val py: Python = Python.getInstance()

    fun recognizeSpeech(): String {
        return try {
            val pyObject: PyObject = py.getModule("query")
            val result: PyObject = pyObject.callAttr("generar_query_sql")
            result.toString()
        } catch (e: Exception) {
            "Error: ${e.message}"
        }
    }
}