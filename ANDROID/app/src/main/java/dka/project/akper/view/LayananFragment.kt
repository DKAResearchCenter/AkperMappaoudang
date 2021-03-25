package dka.project.akper.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import dka.project.akper.R
import dka.project.akper.architecture.RecyclerView.LayananRecyclerView
import dka.project.akper.databinding.UiActivityBerandaFragmentLayananBlankBinding

class LayananFragment : Fragment() {

    private lateinit var mbinding: UiActivityBerandaFragmentLayananBlankBinding

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
            R.layout.ui_activity_beranda_fragment_layanan_blank,
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
                add(LayananRecyclerView.data(R.drawable.ic_mahasiswa, "Mahasiswa"))
                add(LayananRecyclerView.data(R.drawable.ic_jadwal, "Jadwal"))
                add(LayananRecyclerView.data(R.drawable.ic_cctv, "CCTV"))
                add(LayananRecyclerView.data(R.drawable.ic_lokasi, "Map"))
                add(LayananRecyclerView.data(R.drawable.ic_khsonline, "KHS Online"))
                add(LayananRecyclerView.data(R.drawable.ic_transkip, "KHS Online"))
                add(LayananRecyclerView.data(R.drawable.ic_krsonline, "KHS Online"))
            }
            adapter.dataBaru(mdata)
        }
    }


}