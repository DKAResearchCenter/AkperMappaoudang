package dka.project.akper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dka.project.akper.databinding.UiActivityBerandaFragmentBerandaFiturPmbonlineBinding

class PMBOnlineActivity : AppCompatActivity() {

    private lateinit var mbinding: UiActivityBerandaFragmentBerandaFiturPmbonlineBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = DataBindingUtil.setContentView(
            this,
            R.layout.ui_activity_beranda_fragment_beranda_fitur_pmbonline
        )
    }

}