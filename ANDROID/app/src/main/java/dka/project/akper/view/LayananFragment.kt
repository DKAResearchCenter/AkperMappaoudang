package dka.project.akper.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.pixplicity.easyprefs.library.Prefs
import dka.project.akper.ApplicationController
import dka.project.akper.R
import dka.project.akper.architecture.RecyclerView.LayananRecyclerView
import dka.project.akper.databinding.UiActivityBerandaFragmentLayananBinding
import dka.project.akper.layanan.*

class LayananFragment : Fragment() {

    private lateinit var mbinding: UiActivityBerandaFragmentLayananBinding
    private lateinit var i: Intent

    private var mdata: MutableList<LayananRecyclerView.data> = mutableListOf()

    private lateinit var adapter: LayananRecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        adapter = LayananRecyclerView(requireActivity())

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        mbinding = DataBindingUtil.inflate(
            inflater,
            R.layout.ui_activity_beranda_fragment_layanan,
            container,
            false
        )

        return mbinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mbinding.mrecyclelayanan.let {
            it.layoutManager = GridLayoutManager(requireActivity(), 2)
            it.adapter = adapter

            mdata.apply {
                clear()
                /** Mengambil Data AUth Level Login **/
                val AuthLevel = Prefs.getString(ApplicationController.AUTH_LEVEL_ACCESS, ApplicationController.AUTH_LEVEL_ANONYMOUS)

                /** Mengambil Data AUth Level Login **/
                if (AuthLevel == ApplicationController.AUTH_LEVEL_ORANGTUA || AuthLevel == ApplicationController.AUTH_LEVEL_PEGAWAI){
                    add(
                            LayananRecyclerView.data(
                                    R.drawable.ic_mahasiswa,
                                    KemahasiswaanActivity::class.java,
                                    "Kemahasiswaan" // Untuk Orang Tua, Pegawai
                            )
                    )
                }

                if (AuthLevel == ApplicationController.AUTH_LEVEL_ORANGTUA || AuthLevel == ApplicationController.AUTH_LEVEL_PEGAWAI || AuthLevel == ApplicationController.AUTH_LEVEL_MAHASISWA) {
                    add(
                            LayananRecyclerView.data(
                                    R.drawable.ic_jadwal,
                                    JadwalActivity::class.java,
                                    "Jadwal" // Untuk Orang Tua, Pegawai, Mahasiswa
                            )
                    )
                }


                add(LayananRecyclerView.data(R.drawable.ic_cctv, CCTVActivity::class.java, "CCTV"))

                if (AuthLevel == ApplicationController.AUTH_LEVEL_ORANGTUA || AuthLevel == ApplicationController.AUTH_LEVEL_PEGAWAI) {
                    add(
                            LayananRecyclerView.data(
                                    R.drawable.ic_lokasi,
                                    LokasiActivity::class.java,
                                    "Map" // Untuk orangtua, Pegawai
                            )
                    )
                }

                if (AuthLevel == ApplicationController.AUTH_LEVEL_MAHASISWA) {
                    add(LayananRecyclerView.data(R.drawable.ic_khsonline, KhsActivity::class.java, "KHS Online"))
                }

                if (AuthLevel == ApplicationController.AUTH_LEVEL_ORANGTUA || AuthLevel == ApplicationController.AUTH_LEVEL_PEGAWAI || AuthLevel == ApplicationController.AUTH_LEVEL_MAHASISWA) {
                    add(LayananRecyclerView.data(R.drawable.ic_transkip, TranskipActivity::class.java, "Transkip Nilai"
                            /** untuk mahasiswa, orangtua, pegawai **/))
                }

                if (AuthLevel == ApplicationController.AUTH_LEVEL_MAHASISWA) {
                    add(LayananRecyclerView.data(R.drawable.ic_krsonline, KrsActivity::class.java, "KRS Online"))
                }

                add(LayananRecyclerView.data(R.drawable.ic_organization, OrganisasiActivity::class.java, "Organisasi"))

                add(
                    LayananRecyclerView.data(
                        R.drawable.ic_perpustakaan,
                        PerpustakaanActivity::class.java,
                        "Perpustakaan" // untuk semua
                    )
                )
                add(
                    LayananRecyclerView.data(
                        R.drawable.ic_paper,
                        KurikulumActivity::class.java,
                        "Kurikulum" // untuk semua
                    )
                )
                if (AuthLevel == ApplicationController.AUTH_LEVEL_PEGAWAI) {
                    add(
                            LayananRecyclerView.data(
                                    R.drawable.ic_tv,
                                    ElektronikActivity::class.java,
                                    "Elektronik" // untuk pegawai
                            )
                    )
                }

                add(
                    LayananRecyclerView.data(
                        R.drawable.ic_laboratory,
                        LaboratoriumActivity::class.java,
                        "Laboratorium" // untuk semua
                    )
                )

                add(
                    LayananRecyclerView.data(
                        R.drawable.ic_management,
                        FasilitasActivity::class.java,
                        "Fasilitas" // untuk semua
                    )
                )
            }

        }
            adapter.dataBaru(mdata)
        }
    }