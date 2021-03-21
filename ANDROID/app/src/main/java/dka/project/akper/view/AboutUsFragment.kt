package dka.project.akper.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dka.project.akper.databinding.UiActivityBerandaFragmentAboutusBinding

class AboutUsFragment : Fragment() {

    private lateinit var mbinding: UiActivityBerandaFragmentAboutusBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mbinding = UiActivityBerandaFragmentAboutusBinding.inflate(inflater, container, false)

        return mbinding.root
    }
}