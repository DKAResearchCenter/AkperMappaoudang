package dka.project.akper.layanan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dka.project.akper.R
import dka.project.akper.databinding.UiActivityBerandaFragmentLayananKemahasiswaanBinding

class KemahasiswaanActivity : AppCompatActivity() {

    private lateinit var mbinding: UiActivityBerandaFragmentLayananKemahasiswaanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = DataBindingUtil.setContentView(
            this,
            R.layout.ui_activity_beranda_fragment_layanan_kemahasiswaan
        )
    }

}