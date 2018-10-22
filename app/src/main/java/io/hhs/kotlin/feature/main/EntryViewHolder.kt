package io.hhs.kotlin.feature.main

import android.content.Intent
import android.support.annotation.NonNull
import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_entry.*

/**
 * @author hhs
 * Created on 2018/10/22
 */
class EntryViewHolder(@NonNull itemView: View) : RecyclerView.ViewHolder(itemView), LayoutContainer {

    fun updateView(name: String?) {
        tv_entry.text = name
        val className: String? = EntryAdapter.getActivityClassName(name)
        if (className != null) {
            itemView.setOnClickListener {
                val context = itemView.context
                val intent = Intent(context, Class.forName(className))
                context.startActivity(intent)
            }
        }
    }

    override val containerView: View?
        get() = itemView

}
