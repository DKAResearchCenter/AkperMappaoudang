package dka.project.akper.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
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
                add(
                    LayananRecyclerView.data(
                        R.drawable.ic_mahasiswa,
                        KemahasiswaanActivity::class.java,
                        "Kemahasiswaan"
                    )
                )
                add(
                    LayananRecyclerView.data(
                        R.drawable.ic_jadwal,
                        JadwalActivity::class.java,
                        "Jadwal"
                    )
                )
                add(LayananRecyclerView.data(R.drawable.ic_cctv, CCTVActivity::class.java, "CCTV"))
                add(
                    LayananRecyclerView.data(
                        R.drawable.ic_lokasi,
                        LokasiActivity::class.java,
                        "Map"
                    )
                )
                add(
                    LayananRecyclerView.data(
                        R.drawable.ic_khsonline,
                        KhsActivity::class.java,
                        "KHS Online"
                    )
                )
                add(
                    LayananRecyclerView.data(
                        R.drawable.ic_transkip,
                        TranskipActivity::class.java,
                        "Transkip Nilai"
                    )
                )
                // U
                add(
                    LayananRecyclerView.data(
                        R.drawable.ic_krsonline,
                        KrsActivity::class.java,
                        "KRS Online"
                    )
                )
                add(
                    LayananRecyclerView.data(
                        R.drawable.ic_organization,
                        OrganisasiActivity::class.java,
                        "Organisasi"
                    )
                )
                add(
                    LayananRecyclerView.data(
                        R.drawable.ic_perpustakaan,
                        PerpustakaanActivity::class.java,
                        "Perpustakaan"
                    )
                )
                add(
                    LayananRecyclerView.data(
                        R.drawable.ic_paper,
                        PerpustakaanActivity::class.java,
                        "Kurikulum"
                    )
                )

            }

        }
            adapter.dataBaru(mdata)
        }
    }