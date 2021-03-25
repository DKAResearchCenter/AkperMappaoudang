package dka.project.akper.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dka.project.akper.*
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
                    PMBOnlineActivity::class.java
                )
                startActivity(i)
            }
            it.mbrosur.setOnClickListener() {
                i = Intent(
                    requireActivity(),
                    BrosurActivity::class.java
                )
                startActivity(i)
            }
            it.mpengumuman.setOnClickListener() {
                i = Intent(
                    requireActivity(),
                    PengumumanActivity::class.java
                )
                startActivity(i)
            }
            it.melearning.setOnClickListener() {
                i = Intent(
                    requireActivity(),
                    ELearningActivity::class.java
                )
                startActivity(i)
            }
            it.mpencarian.setOnClickListener() {
                i = Intent(requireActivity(), PencarianActivity::class.java)
                startActivity(i)
            }
            it.mlogin.setOnClickListener() {
                i = Intent(requireActivity(), LoginActivity::class.java)
                startActivity(i)
            }
        }



        return mBinding.root
    }
}