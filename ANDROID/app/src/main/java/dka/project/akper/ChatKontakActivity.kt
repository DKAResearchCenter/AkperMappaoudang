package dka.project.akper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dka.project.akper.databinding.UiActivityBerandaFragmentChatKontakBinding
import dka.project.akper.view.FotoProfilDialogFragment

class ChatKontakActivity : AppCompatActivity() {

    private lateinit var mbinding: UiActivityBerandaFragmentChatKontakBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mbinding =
            DataBindingUtil.setContentView(this, R.layout.ui_activity_beranda_fragment_chat_kontak)

        mbinding.image1.setOnClickListener {
            var dialog = FotoProfilDialogFragment()

            dialog.show(supportFragmentManager, "customDialog")
        }
    }
}