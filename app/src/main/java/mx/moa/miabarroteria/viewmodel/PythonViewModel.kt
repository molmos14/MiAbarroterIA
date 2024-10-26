package mx.moa.miabarroteria.viewmodel

import androidx.lifecycle.ViewModel
import mx.moa.miabarroteria.model.PythonModel

class PythonViewModel : ViewModel() {
    private val pythonModel = PythonModel()

    fun recognizeSpeech(): String {
        return pythonModel.recognizeSpeech()
    }
}