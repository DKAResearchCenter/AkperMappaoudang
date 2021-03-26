package dka.project.akper.layanan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dka.project.akper.R
import dka.project.akper.databinding.UiActivityBerandaFragmenLayananCctvTampilanBinding

class CCTVActivity : AppCompatActivity() {

    private lateinit var mbinding: UiActivityBerandaFragmenLayananCctvTampilanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding =
            DataBindingUtil.setContentView(
                this,
                R.layout.ui_activity_beranda_fragmen_layanan_cctv_tampilan
            )
    }

}