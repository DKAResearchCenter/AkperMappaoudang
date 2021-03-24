package dka.project.akper.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dka.project.akper.R
import dka.project.akper.databinding.UiActivityBerandaFragmenBerandaBinding

class BerandaFragment : Fragment() {

    private lateinit var mBinding: UiActivityBerandaFragmenBerandaBinding
    private lateinit var i: Intent

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = UiActivityBerandaFragmenBerandaBinding.inflate(inflater, container, false)



        mBinding.let {
            it.pmbonline.setOnClickListener() {
                i = Intent(
                    requireActivity(),
                    R.layout.ui_activity_beranda_fragment_beranda_fitur_pmbonline::class.java
                )
                startActivity(i)
            }
            it.mbrosur.setOnClickListener() {
                i = Intent(
                    requireActivity(),
                    R.layout.ui_activity_beranda_fragment_beranda_fitur_brosur::class.java
                )
                startActivity(i)
            }
            it.mpengumuman.setOnClickListener() {
                i = Intent(
                    requireActivity(),
                    R.layout.ui_activity_beranda_fragmen_beranda_fitur_pengumuman::class.java
                )
                startActivity(i)
            }
            it.melearning.setOnClickListener() {
                i = Intent(
                    requireActivity(),
                    R.layout.ui_activity_beranda_fragmen_beranda_fitur_elearning::class.java
                )
                startActivity(i)
            }
        }



        return mBinding.root
    }
}