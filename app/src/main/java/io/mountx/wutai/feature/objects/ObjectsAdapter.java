package io.mountx.wutai.feature.objects;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

/**
 * @author hhs
 * Created on 2018/10/22
 */
class ObjectsAdapter extends FragmentStatePagerAdapter {

    private final String[] titles = {"expression", "singleton", "companion", "jvmStatic"};

    public ObjectsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return ObjectExpressionFragment.Companion.newInstance();
            case 1:
                return SingletonFragment.Companion.newInstance();
            case 2:
                return CompanionObjectFragment.Companion.newInstance();
            default:
                return JvmStaticFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

}
