package io.mountx.wutai.feature.main

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_entry.*

/**
 * @author Ha Sang
 * Created on 2018/10/22
 */
class EntryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), LayoutContainer {

    fun updateView(name: String?) {
        tv_entry.text = name
        val className: String? = getActivityClassName(name)
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
