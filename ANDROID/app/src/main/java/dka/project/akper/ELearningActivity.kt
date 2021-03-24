package dka.project.akper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dka.project.akper.databinding.UiActivityBerandaFragmenBerandaFiturElearningBinding

class ELearningActivity : AppCompatActivity() {

    private lateinit var mbinding: UiActivityBerandaFragmenBerandaFiturElearningBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mbinding = DataBindingUtil.setContentView(
            this,
            R.layout.ui_activity_beranda_fragmen_beranda_fitur_elearning
        )
    }

}