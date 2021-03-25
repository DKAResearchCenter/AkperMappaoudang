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

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

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
                add(LayananRecyclerView.data(R.drawable.ic_mahasiswa, {
                    i = Intent(requireActivity(), KemahasiswaanActivity::class.java)
                    startActivity(i)
                }, "Kemahasiswaan"))
                add(LayananRecyclerView.data(R.drawable.ic_jadwal, {
                    i = Intent(requireActivity(), JadwalActivity::class.java)
                    startActivity(i)
                }, "Jadwal"))
                add(LayananRecyclerView.data(R.drawable.ic_cctv, {
                    i = Intent(requireActivity(), CCTVActivity::class.java)
                    startActivity(i)
                }, "CCTV"))
                add(LayananRecyclerView.data(R.drawable.ic_lokasi, {
                    i = Intent(requireActivity(), LokasiActivity::class.java)
                    startActivity(i)
                }, "Map"))
                add(LayananRecyclerView.data(R.drawable.ic_khsonline, {
                    i = Intent(requireActivity(), KhsActivity::class.java)
                    startActivity(i)
                }, "KHS Online"))
                add(LayananRecyclerView.data(R.drawable.ic_transkip, {
                    i = Intent(requireActivity(), TranskipActivity::class.java)
                    startActivity(i)
                }, "Transkip Nilai"))
                add(LayananRecyclerView.data(R.drawable.ic_krsonline, {
                    i = Intent(requireActivity(), KrsActivity::class.java)
                    startActivity(i)
                }, "KRS Online"))
                add(LayananRecyclerView.data(R.drawable.ic_organization, {
                    i = Intent(requireActivity(), OrganisasiActivity::class.java)
                    startActivity(i)
                }, "Organisasi"))
                add(LayananRecyclerView.data(R.drawable.ic_perpustakaan, {
                    i = Intent(requireActivity(), PerpustakaanActivity::class.java)
                    startActivity(i)
                }, "Perpustakaan"))
            }

        }
            adapter.dataBaru(mdata)
        }
    }