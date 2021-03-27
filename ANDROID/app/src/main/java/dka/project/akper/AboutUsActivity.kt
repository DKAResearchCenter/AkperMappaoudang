package dka.project.akper

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import dka.project.akper.databinding.UiActivityBerandaFragmentAboutusBinding

class AboutUsActivity : AppCompatActivity() {

    private lateinit var mFragmentManager : FragmentManager
    private lateinit var mbinding: UiActivityBerandaFragmentAboutusBinding

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mFragmentManager = supportFragmentManager
        mbinding = DataBindingUtil.setContentView(this, R.layout.ui_activity_beranda_fragment_aboutus)

        mbinding.mWebView.apply {
            loadUrl(resources.getString(R.string.app_protocol) + resources.getString(R.string.app_host))
            settings.apply {
                javaScriptEnabled = true
            }
        }


    }
}