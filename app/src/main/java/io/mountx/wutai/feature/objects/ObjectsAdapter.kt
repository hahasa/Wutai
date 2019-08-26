package io.mountx.wutai.feature.objects

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

/**
 * @author Ha Sang
 * Created on 2018/10/22
 */
class ObjectsAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val titles = arrayOf("expression", "singleton", "companion", "jvmStatic")

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> ObjectExpressionFragment.newInstance()
            1 -> SingletonFragment.newInstance()
            2 -> CompanionObjectFragment.newInstance()
            else -> JvmStaticFragment.newInstance()
        }
    }

    override fun getCount(): Int {
        return titles.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }
}
