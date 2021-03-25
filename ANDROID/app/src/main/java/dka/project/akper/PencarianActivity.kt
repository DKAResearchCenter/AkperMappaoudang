package dka.project.akper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dka.project.akper.databinding.UiActivityBerandaFragmentPencarianBinding

class PencarianActivity : AppCompatActivity() {

    private lateinit var mbinding: UiActivityBerandaFragmentPencarianBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mbinding =
            DataBindingUtil.setContentView(this, R.layout.ui_activity_beranda_fragment_pencarian)
    }

}