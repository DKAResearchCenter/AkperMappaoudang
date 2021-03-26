package dka.project.akper.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import dka.project.akper.R
import dka.project.akper.databinding.UiActivityBerandaFragmentChatFotoProfilDialogfragmentBinding

class FotoProfilDialogFragment : DialogFragment() {

    private lateinit var mbinding: UiActivityBerandaFragmentChatFotoProfilDialogfragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mbinding = DataBindingUtil.inflate(
            inflater,
            R.layout.ui_activity_beranda_fragment_chat_foto_profil_dialogfragment,
            container,
            false
        )

        /*Glide.with(this)
            .load()
            .centerCrop()
            .placeholder(R.drawable.placeholder)
            .skipMemoryCache(true)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .into(holder.mbind.gambaritem)*/

        return mbinding.root
    }

}