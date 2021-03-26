package dka.project.akper

import android.app.Application
import android.content.ContextWrapper
import com.pixplicity.easyprefs.library.Prefs

class ApplicationController : Application() {


    companion object {
        const val AUTH_STATE = "AuthState"
        const val AUTH_LEVEL_ACCESS = "AuthLevelAccess"
    }

    override fun onCreate() {
        super.onCreate()

        Prefs.Builder()
            .setContext(this)
            .setMode(ContextWrapper.MODE_PRIVATE)
            .setPrefsName(packageName)
            .setUseDefaultSharedPreference(true)
            .build()
    }
}