// File: app/src/main/java/mx/moa/miabarroteria/MiAbarroteriaApplication.kt
package mx.moa.miabarroteria

import android.app.Application
import com.chaquo.python.Python
import com.chaquo.python.android.AndroidPlatform

class MiAbarroteriaApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (!Python.isStarted()) {
            Python.start(AndroidPlatform(this))
        }
    }
}