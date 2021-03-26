package dka.project.akper

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dka.project.akper.databinding.UiActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var mbinding: UiActivityLoginBinding
    private lateinit var i: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mbinding = DataBindingUtil.setContentView(this, R.layout.ui_activity_login)

        mbinding.let {
            it.mregist.setOnClickListener() {
                i = Intent(this, RegistrasiActivity::class.java)
                startActivity(i)
            }
            it.mlupapass.setOnClickListener() {
                i = Intent(this, PasswordActivity::class.java)
                startActivity(i)
            }

            it.mLogin.setOnClickListener() {
                i = Intent(this, BerandaActivity::class.java)
                startActivity(i)
            }
        }
    }

}