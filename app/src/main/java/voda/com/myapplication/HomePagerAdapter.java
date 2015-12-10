package voda.com.myapplication;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Apalya on 12/3/2015.
 */
public class HomePagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private String[] names = {"Tv Guide","Videos","phani"};

    public HomePagerAdapter(FragmentManager supportFragmentManager, Context mainActivity) {
        super(supportFragmentManager);
        mContext = mainActivity;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        fragment = Fragment.instantiate(mContext, TvGuideFragment.class.getName());

       /* switch (position) {
            case 0:
                fragment = Fragment.instantiate(mContext, TvGuideFragment.class.getName());

                break;
            case 1:
                fragment = Fragment.instantiate(mContext, VideoFragment.class.getName());

                break;
        }
*/

        return fragment;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return names[position];
    }
}
