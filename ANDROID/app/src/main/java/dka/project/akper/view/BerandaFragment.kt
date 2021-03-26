package dka.project.akper.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import dka.project.akper.*
import dka.project.akper.databinding.UiActivityBerandaFragmenBerandaBinding

class BerandaFragment : Fragment() {

    private lateinit var mBinding: UiActivityBerandaFragmenBerandaBinding
    private lateinit var i: Intent

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = UiActivityBerandaFragmenBerandaBinding.inflate(inflater, container, false)

        val imageList = ArrayList<SlideModel>()

        imageList.add(
            SlideModel(
                "https://akpermpd.ac.id/wp-content/uploads/2019/02/pmb.jpg",
                ScaleTypes.CENTER_CROP
            )
        )
        imageList.add(
            SlideModel(
                "https://i0.wp.com/www.beritaupdate.id/wp-content/uploads/2020/07/IMG-20200727-WA0024.jpg?fit=1200%2C800&ssl=1",
                ScaleTypes.CENTER_CROP
            )
        )
        imageList.add(
            SlideModel(
                "https://akupintar.id/documents/20143/0/20210201084434523_57792638.jpg/cc6e82a0-73dc-f28b-ccf5-137a4e15a86b?version=1.0&t=1612169074646&imagePreview=1",
                ScaleTypes.CENTER_CROP
            )
        )

        mBinding.imageSlider.let {
            it.setImageList(imageList)
            it.startSliding(3000)
        }

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