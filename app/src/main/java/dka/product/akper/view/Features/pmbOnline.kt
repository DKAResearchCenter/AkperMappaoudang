package dka.product.akper.view.Features

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dka.product.akper.R
import dka.product.akper.databinding.UiActivityBerandaFragmentPendaftaranBinding

class pmbOnline:AppCompatActivity() {

    private lateinit var mbinding : UiActivityBerandaFragmentPendaftaranBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = DataBindingUtil.setContentView(this,
            R.layout.ui_activity_beranda_fragment_pendaftaran
        )
    }

}