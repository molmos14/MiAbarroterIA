// File: app/src/main/java/mx/moa/miabarroteria/model/PythonModel.kt
package mx.moa.miabarroteria.model

import com.chaquo.python.PyObject
import com.chaquo.python.Python

class PythonModel {
    private val py: Python = Python.getInstance()

    fun recognizeSpeech(): String {
        val pyObject: PyObject = py.getModule("script").callAttr("record_and_recognize_audio")
        return pyObject.toString()
    }
}