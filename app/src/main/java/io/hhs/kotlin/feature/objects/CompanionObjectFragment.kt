package io.hhs.kotlin.feature.objects

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.hhs.kotlin.R
import kotlinx.android.synthetic.main.fragment_object_companion.*

/**
 * @author hhs
 * Created on 2018/10/19
 */
class CompanionObjectFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        count()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_object_companion, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_text.text = getCount().toString()
    }

    companion object {
        private var count = 0

        private fun count() = count++

        fun getCount(): Int = count

        fun newInstance(): CompanionObjectFragment {
            return CompanionObjectFragment()
        }
    }

}