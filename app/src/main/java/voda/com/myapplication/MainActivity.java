package voda.com.myapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;

import com.astuetz.PagerSlidingTabStrip;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    private PagerSlidingTabStrip tabs;
    private ViewPager mViewPager;
    private HomePagerAdapter homePagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        homePagerAdapter = new HomePagerAdapter(getSupportFragmentManager(),this);
        mViewPager.setAdapter(homePagerAdapter);

        final int pageMargin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 4, getResources()
                .getDisplayMetrics());
        mViewPager.setPageMargin(pageMargin);
        tabs.setViewPager(mViewPager);

        tabs.setOnPageChangeListener(this);

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        mViewPager.setCurrentItem(position);

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
