package dka.project.akper.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dka.project.akper.ChatKontakActivity
import dka.project.akper.databinding.UiActivityBerandaFragmentChatBinding

class ChatFragment : Fragment() {

    private lateinit var mbinding: UiActivityBerandaFragmentChatBinding
    private lateinit var i: Intent

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mbinding = UiActivityBerandaFragmentChatBinding.inflate(inflater, container, false)

        mbinding.let {
            it.mkontak.setOnClickListener() {
                i = Intent(requireActivity(), ChatKontakActivity::class.java)
                startActivity(i)
            }
        }

        return mbinding.root
    }
}