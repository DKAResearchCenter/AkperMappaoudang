package dka.project.akper.architecture.RecyclerView

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import dka.project.akper.R
import dka.project.akper.databinding.RecycleviewLayananBinding

class LayananRecyclerView(var context: Context) :
    RecyclerView.Adapter<LayananRecyclerView.myholder>() {

    private lateinit var mbinding: RecycleviewLayananBinding
    private lateinit var i: Intent
    private var mdata: MutableList<data> = mutableListOf()

    data class data(
        var ikon: Int,
        var click: View.OnClickListener,
        var nama: String
    )

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LayananRecyclerView.myholder {
        mbinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.recycleview_layanan,
            parent,
            false
        )
        return myholder(mbinding)
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onBindViewHolder(holder: LayananRecyclerView.myholder, position: Int) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            holder.mbind.miconlayanan.setImageDrawable(
                context.resources.getDrawable(
                    mdata[position].ikon,
                    context.theme
                )
            )
        }
        holder.mbind.mnamalayanan.setText(mdata[position].nama)
        holder.mbind.mlayanancontainer.setOnClickListener(mdata[position].click)
    }

    override fun getItemCount(): Int {
        return mdata.size
    }

    inner class myholder(bind: RecycleviewLayananBinding) : RecyclerView.ViewHolder(bind.root) {
        val mbind = bind
    }

    fun dataBaru(mdata: MutableList<data> = mutableListOf()) {
        this.mdata = mdata
        notifyDataSetChanged()
    }
}