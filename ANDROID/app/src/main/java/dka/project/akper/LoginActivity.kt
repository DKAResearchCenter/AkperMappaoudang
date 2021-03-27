package dka.project.akper

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pixplicity.easyprefs.library.Prefs
import dka.project.akper.databinding.UiActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    private lateinit var mbinding: UiActivityLoginBinding
    private lateinit var i: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mbinding = DataBindingUtil.setContentView(this, R.layout.ui_activity_login)

        mbinding.let {
            it.mLoginWithoutLogin.setOnClickListener() {

                Prefs.putBoolean(ApplicationController.AUTH_STATE, true)
                Prefs.putString(ApplicationController.AUTH_LEVEL_ACCESS, ApplicationController.AUTH_LEVEL_ANONYMOUS)

                i = Intent(this, BerandaActivity::class.java)
                startActivity(i)
            }
            it.mlupapass.setOnClickListener() {
                i = Intent(this, PasswordActivity::class.java)
                startActivity(i)
            }

            it.mLogin.setOnClickListener() {

                i = Intent(this, BerandaActivity::class.java)

                when {
                    mbinding.mUserName.text.toString() == "2021" && mbinding.mPassword.text.toString() == "mahasiswa" -> {

                        Prefs.putBoolean(ApplicationController.AUTH_STATE, true)
                        Prefs.putString(ApplicationController.AUTH_LEVEL_ACCESS, ApplicationController.AUTH_LEVEL_MAHASISWA)

                        startActivity(i)
                    }
                    mbinding.mUserName.text.toString() == "2021" && mbinding.mPassword.text.toString() == "orangtua" -> {

                        Prefs.putBoolean(ApplicationController.AUTH_STATE, true)
                        Prefs.putString(ApplicationController.AUTH_LEVEL_ACCESS, ApplicationController.AUTH_LEVEL_ORANGTUA)

                        startActivity(i)
                    }
                    mbinding.mUserName.text.toString() == "2021" && mbinding.mPassword.text.toString() == "pegawai" -> {
                        Prefs.putBoolean(ApplicationController.AUTH_STATE, true)
                        Prefs.putString(ApplicationController.AUTH_LEVEL_ACCESS, ApplicationController.AUTH_LEVEL_PEGAWAI)

                        startActivity(i)
                    }
                    else -> {
                        Prefs.putBoolean(ApplicationController.AUTH_STATE, false)
                    }
                }

            }
        }
    }

}