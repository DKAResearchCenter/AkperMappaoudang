package dka.project.akper.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pixplicity.easyprefs.library.Prefs
import dka.project.akper.ApplicationController
import dka.project.akper.databinding.UiActivityBerandaFragmentAkunBinding

class AkunFragment : Fragment() {

    private lateinit var mbinding: UiActivityBerandaFragmentAkunBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mbinding = UiActivityBerandaFragmentAkunBinding.inflate(inflater, container, false)

        mbinding.mLogout.setOnClickListener {
            Prefs.putBoolean(ApplicationController.AUTH_STATE, false)
            requireActivity().finish()
        }
        return mbinding.root
    }
}