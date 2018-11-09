package se.an3ll.spender

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

class SampleAdapter(
        private val context: Context?,
        private val items: List<String>) : RecyclerView.Adapter<SampleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(context))
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    class ViewHolder(val view: TextView) : RecyclerView.ViewHolder(view) {
        fun bind(item: String) {
            view.text = item
        }
    }
}