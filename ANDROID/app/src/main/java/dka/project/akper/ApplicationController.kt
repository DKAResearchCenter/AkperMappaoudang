package dka.project.akper

import android.app.Application
import android.content.ContextWrapper
import com.pixplicity.easyprefs.library.Prefs

class ApplicationController : Application() {


    companion object {
        const val AUTH_STATE = "AuthState"
        const val AUTH_LEVEL_ACCESS = "AuthLevelAccess"

        const val AUTH_LEVEL_ANONYMOUS = "AuthAnonym"
        const val AUTH_LEVEL_ORANGTUA = "AuthLevelOrangTua"
        const val AUTH_LEVEL_PEGAWAI = "AUthLevelPegawai"
        const val AUTH_LEVEL_MAHASISWA = "AuthLevelMahasiswa"

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