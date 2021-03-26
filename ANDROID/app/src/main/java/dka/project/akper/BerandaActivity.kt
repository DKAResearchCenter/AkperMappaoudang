@file:Suppress("DEPRECATION")

package dka.project.akper

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import dka.project.akper.databinding.UiActivityBerandaFragmentBinding
import dka.project.akper.view.BerandaFragment
import dka.project.akper.view.ChatFragment
import dka.project.akper.view.LayananFragment
import dka.project.akper.view.NotificationFragment

class BerandaActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private lateinit var mBinding : UiActivityBerandaFragmentBinding
    private lateinit var mSupportFragment : FragmentManager

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.ui_activity_beranda_fragment)

        mSupportFragment = supportFragmentManager

        mBinding.mBottom.setOnNavigationItemSelectedListener(this)

        mSupportFragment.beginTransaction().replace(mBinding.mFrameContent.id, BerandaFragment()).commit()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.mBeranda -> {
                mSupportFragment
                    .beginTransaction()
                    .replace(mBinding.mFrameContent.id, BerandaFragment())
                    .commit()
                false
            }
            R.id.mnotif -> {
                mSupportFragment
                    .beginTransaction()
                    .replace(mBinding.mFrameContent.id, NotificationFragment())
                    .commit()
                false
            }
            R.id.mlayanan -> {
                mSupportFragment
                    .beginTransaction()
                    .replace(mBinding.mFrameContent.id, LayananFragment())
                    .commit()
                false
            }
            R.id.maboutus -> {

                /*mSupportFragment.beginTransaction().replace(mBinding.mFrameContent.id, AboutUsFragment()).commit()*/
                false
            }
            R.id.mchat -> {
                mSupportFragment.beginTransaction()
                    .replace(mBinding.mFrameContent.id, ChatFragment()).commit()
                false
            }
            else -> {
                false
            }
        }
    }

}