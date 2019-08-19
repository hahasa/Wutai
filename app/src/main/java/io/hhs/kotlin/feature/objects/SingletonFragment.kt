package io.hhs.kotlin.feature.objects

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.hhs.kotlin.R
import kotlinx.android.synthetic.main.fragment_object_singleton.*

/**
 * @author hhs
 * Created on 2018/10/19
 */
class SingletonFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_object_singleton, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_text.text = ObjectsDataHelper.getTag()
    }

    companion object {
        fun newInstance(): SingletonFragment {
            return SingletonFragment()
        }
    }

}