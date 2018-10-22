package io.hhs.kotlin.feature.objects

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.hhs.kotlin.R
import kotlinx.android.synthetic.main.fragment_object_expression.*

/**
 * @author hhs
 * Created on 2018/10/19
 */
class ObjectExpressionFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_object_expression, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        performAdd()
    }

    private fun performAdd() {
        val args = object {
            var a: Int = 6
            var b: Int = 9
        }
        val result: Int = add(args.a, args.b)
        val text = StringBuilder()
        text.append("a is ")
        text.append(args.a)
        text.append("\n")
        text.append("b is ")
        text.append(args.b)
        text.append("\n")
        text.append("a * b is ")
        text.append(result)
        tv_text.text = text
    }

    private fun add(a: Int, b: Int): Int {
        val v = object : A(a), I {
            override fun add(b: Int) = x + b
        }
        return v.add(b)
    }

    private open class A(a: Int) {
        open val x: Int = a
    }

    private interface I {
        fun add(b: Int): Int
    }

    companion object {
        fun newInstance(): ObjectExpressionFragment {
            return ObjectExpressionFragment()
        }
    }

}