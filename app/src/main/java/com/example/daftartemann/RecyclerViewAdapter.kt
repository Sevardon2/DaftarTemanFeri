package com.example.daftartemann

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class RecyclerViewAdapter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_adapter)
    }
}
class RecyclerViewAdapter(private val listdata_teman: ArrayList<data_teman>, context: Context) :
      RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> (){
      private val context: Context

      inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
          val Nama: TextView
          val Alamat: TextView
          val NoHP; TextView
          val ListItem: LinearLayout

          init {
              Nama= itemView.findViewById(R.id.nama)
              Alamat= itemView.findViewById(R.id.alamat)
              NoHP = itemView.findViewById(R.id.no_hp)
              ListItem= itemView.findViewById(R.id.list_item)
          }
      }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.ViewHolder {
    val V:View = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_design,
    parent, false)
        return ViewHolder(V)
    }
    override  fun onBindViewHolder(holder: ViewHolder, position: Int){
        val Nama: String? = listdata_teman.get(position).nama
        val Alamat: String? = listdata_teman.get(position).alamat
        val NoHP: String? = listdata_teman.get(position).noHp

        holder.Nama.text = "Nama: $Nama"
        holder.Alamat.text = "Nama: $Alamat"
        holder.NoHP.text = "Nama: $NoHP"
        holder.ListItem.setOnLongClickListener(object : View.OnLongClickListener{
            override fun onLong(v: View?): Boolean {
                return true
            }
        })
    }

    override fun getItemCount(): Int {
        return listdata_teman.size
    }
    init {
        this.context = context
    }
      }