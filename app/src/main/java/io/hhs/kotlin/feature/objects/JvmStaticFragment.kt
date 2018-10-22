package io.hhs.kotlin.feature.objects

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.hhs.kotlin.R

/**
 * @author hhs
 * Created on 2018/10/19
 */
class JvmStaticFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_object_jvm_static, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(): JvmStaticFragment {
            return JvmStaticFragment()
        }
    }

}