package dka.project.akper.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dka.project.akper.databinding.UiActivityBerandaFragmentChatBinding

class ChatFragment : Fragment() {

    private lateinit var mbinding: UiActivityBerandaFragmentChatBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mbinding = UiActivityBerandaFragmentChatBinding.inflate(inflater, container, false)

        return mbinding.root
    }
}