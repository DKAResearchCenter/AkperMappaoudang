package dka.project.akper

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pixplicity.easyprefs.library.Prefs
import dka.project.akper.databinding.UiActivitySplashscreenBinding

class splashScreen : AppCompatActivity() {

    private lateinit var i: Intent
    private lateinit var mbinding: UiActivitySplashscreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = DataBindingUtil.setContentView(this, R.layout.ui_activity_splashscreen)

        if (Prefs.getBoolean(ApplicationController.AUTH_STATE, false)){
            Handler().postDelayed({
                i = Intent(this, BerandaActivity::class.java)
                startActivity(i)
                finish()
            }, 2000)
        }else{
            Handler().postDelayed({
                i = Intent(this, LoginActivity::class.java)
                startActivity(i)
                finish()
            }, 2000)
        }


    }

}