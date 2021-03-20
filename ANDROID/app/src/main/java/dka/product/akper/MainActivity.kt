package dka.product.akper

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dka.product.akper.databinding.UiActivityBerandaBinding
import dka.product.akper.view.Features.cctvActivity
import dka.product.akper.view.Features.pmbOnline

class MainActivity : AppCompatActivity() {

    private lateinit var mbinding: UiActivityBerandaBinding
    private lateinit var i: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = DataBindingUtil.setContentView(this, R.layout.ui_activity_beranda)

        mbinding.let {
            it.pmbonline.setOnClickListener {
                i = Intent(this, pmbOnline::class.java)
                startActivity(i)
            }
            it.mcctvbutton.setOnClickListener {
                i = Intent(this, cctvActivity::class.java)
                startActivity(i)
            }
        }

    }

}