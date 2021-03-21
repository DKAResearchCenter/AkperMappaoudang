package dka.project.akper.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dka.project.akper.databinding.UiActivityBerandaFragmentLayananUmumBinding

class LayananFragment : Fragment() {

    private lateinit var mbinding: UiActivityBerandaFragmentLayananUmumBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mbinding = UiActivityBerandaFragmentLayananUmumBinding.inflate(inflater, container, false)

        return mbinding.root
    }

}