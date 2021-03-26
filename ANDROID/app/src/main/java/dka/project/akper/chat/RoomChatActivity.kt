package dka.project.akper.chat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dka.project.akper.R
import dka.project.akper.databinding.UiActivityBerandaFragmentChatRoomchatBinding

class RoomChatActivity : AppCompatActivity() {

    private lateinit var mbinding: UiActivityBerandaFragmentChatRoomchatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mbinding = DataBindingUtil.setContentView(
            this,
            R.layout.ui_activity_beranda_fragment_chat_roomchat
        )
    }

}