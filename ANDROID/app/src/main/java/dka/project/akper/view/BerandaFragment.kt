package dka.project.akper.view

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.universalvideoview.UniversalVideoView
import dka.project.akper.*
import dka.project.akper.databinding.UiActivityBerandaFragmenBerandaBinding

class BerandaFragment : Fragment() {

    private lateinit var mBinding: UiActivityBerandaFragmenBerandaBinding
    private lateinit var i: Intent

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = UiActivityBerandaFragmenBerandaBinding.inflate(inflater, container, false)

        val imageList = ArrayList<SlideModel>()

        imageList.add(
            SlideModel(
                "https://akpermpd.ac.id/wp-content/uploads/2019/02/pmb.jpg",
                ScaleTypes.CENTER_CROP
            )
        )
        imageList.add(
            SlideModel(
                "https://i0.wp.com/www.beritaupdate.id/wp-content/uploads/2020/07/IMG-20200727-WA0024.jpg?fit=1200%2C800&ssl=1",
                ScaleTypes.CENTER_CROP
            )
        )
        imageList.add(
            SlideModel(
                "https://akupintar.id/documents/20143/0/20210201084434523_57792638.jpg/cc6e82a0-73dc-f28b-ccf5-137a4e15a86b?version=1.0&t=1612169074646&imagePreview=1",
                ScaleTypes.CENTER_CROP
            )
        )

        mBinding.imageSlider.let {
            it.setImageList(imageList)
            it.startSliding(3000)
        }

        mBinding.let {
            it.pmbonline.setOnClickListener {
                i = Intent(
                    requireActivity(),
                    PMBOnlineActivity::class.java
                )
                startActivity(i)
            }
            it.mpengumuman.setOnClickListener {
                i = Intent(
                    requireActivity(),
                    PengumumanActivity::class.java
                )
                startActivity(i)
            }
            it.melearning.setOnClickListener {
                i = Intent(
                    requireActivity(),
                    ELearningActivity::class.java
                )
                startActivity(i)
            }
            it.mpencarian.setOnClickListener {
                i = Intent(requireActivity(), PencarianActivity::class.java)
                startActivity(i)
            }
            it.mlogin.setOnClickListener {
                i = Intent(requireActivity(), LoginActivity::class.java)
                startActivity(i)
            }
            it.maboutus.setOnClickListener {
                i = Intent(
                    requireActivity(),
                    AboutUsActivity::class.java
                )
                startActivity(i)
            }
            it.malbumkegiatan.setOnClickListener {
                i = Intent(requireActivity(), AlbumKegiatanActivity::class.java)
                startActivity(i)
            }
        }

        mBinding.videoView.setMediaController(mBinding.mediaController)
        mBinding.videoView.apply {
            setVideoPath("https://r1---sn-npoe7ner.googlevideo.com/videoplayback?expire=1616902172&ei=vKNfYIulMZ6B0u8PnumkQA&ip=68.55.25.235&id=o-AKszCcrxbQ3fl8tjPNyj5klxNnCZgCM61EFKez5R9vow&itag=22&source=youtube&requiressl=yes&vprv=1&mime=video%2Fmp4&ns=b_ccdtEL2dhmXbEsi0vCqzEF&ratebypass=yes&dur=240.187&lmt=1549696105205139&fvip=1&fexp=24001373,24007246&c=WEB&txp=2216222&n=kUJrfjOcWmrFWYwGYzcG-&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cns%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIgJGl1lHsmPKK0BruQ6l2Y8dcUxJl7j_7VUWhuRxcIkW4CIQD50enHP5Gikb0CFHdyg3Iel5K3aHSeJy7S5bCIzNOdhA%3D%3D&title=PROFIL%20AKPER%20MAPPA%20OUDANG%20MAKASSAR&rm=sn-vgqeld7e&req_id=371e6dbb056ca3ee&cm2rm=sn-2uuxa3vh-02br7e,sn-nposz7e&ipbypass=yes&redirect_counter=3&cms_redirect=yes&mh=Cj&mip=125.162.208.132&mm=34&mn=sn-npoe7ner&ms=ltu&mt=1616880511&mv=m&mvi=1&pl=21&lsparams=ipbypass,mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRgIhAKGNX5nkaDvfa8h1kefftZLwl9LUzdZiQgnkvXnzYhGpAiEAoy8EzekevpgauLZbR6L1fj-iKzxVUVE2eITQSAHtqrs%3D")
        }
        mBinding.videoView.setVideoViewCallback(object : UniversalVideoView.VideoViewCallback {
            override fun onScaleChange(isFullscreen: Boolean) {
                if (isFullscreen) {
                    val layoutParams: ViewGroup.LayoutParams = mBinding.videoLayout.layoutParams
                    layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT
                    layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
                    mBinding.videoLayout.layoutParams = layoutParams
                    //GONE the unconcerned views to leave room for video and controller
                    /*mBottomLayout.setVisibility(View.GONE)*/
                } else {
                    val layoutParams: ViewGroup.LayoutParams = mBinding.videoLayout.layoutParams
                    layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT
                    mBinding.videoLayout.layoutParams = layoutParams
                    /*mBottomLayout.setVisibility(View.VISIBLE)*/
                }
            }

            override fun onPause(mediaPlayer: MediaPlayer?) {

            }

            override fun onStart(mediaPlayer: MediaPlayer?) {

            }

            override fun onBufferingStart(mediaPlayer: MediaPlayer?) {

            }

            override fun onBufferingEnd(mediaPlayer: MediaPlayer?) {

            }

        })

        return mBinding.root

    }
}