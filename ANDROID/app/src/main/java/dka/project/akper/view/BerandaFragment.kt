package dka.project.akper.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import dka.project.akper.databinding.UiActivityBerandaFragmenBerandaBinding

class BerandaFragment : Fragment() {

    private lateinit var mBinding : UiActivityBerandaFragmenBerandaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = UiActivityBerandaFragmenBerandaBinding.inflate(inflater, container, false)

        return mBinding.root
    }
}