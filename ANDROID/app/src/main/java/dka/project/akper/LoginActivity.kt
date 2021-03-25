package dka.project.akper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dka.project.akper.databinding.UiActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var mbinding: UiActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mbinding = DataBindingUtil.setContentView(this, R.layout.ui_activity_login)
    }

}