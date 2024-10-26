// File: app/src/main/java/mx/moa/miabarroteria/viewmodel/PythonViewModel.kt
package mx.moa.miabarroteria.viewmodel

import androidx.lifecycle.ViewModel
import com.chaquo.python.PyObject
import com.chaquo.python.Python

class PythonViewModel : ViewModel() {
    private val py: Python = Python.getInstance()

    fun recognizeSpeech(): String {
        val pyObject: PyObject = py.getModule("script").callAttr("record_and_recognize_audio")
        return pyObject.toString()
    }
}