package dka.project.akper.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dka.project.akper.databinding.UiActivityBerandaFragmentNotifikasiBinding

class NotificationFragment : Fragment() {

    private lateinit var mBinding : UiActivityBerandaFragmentNotifikasiBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = UiActivityBerandaFragmentNotifikasiBinding.inflate(inflater, container, false)

        return mBinding.root
    }
}