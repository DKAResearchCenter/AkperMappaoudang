package dka.project.akper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dka.project.akper.databinding.UiActivityBerandaFragmentBerandaFiturBrosurBinding

class BrosurActivity : AppCompatActivity() {


    private lateinit var mbinding: UiActivityBerandaFragmentBerandaFiturBrosurBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mbinding = DataBindingUtil.setContentView(
            this,
            R.layout.ui_activity_beranda_fragment_beranda_fitur_brosur
        )
    }
}