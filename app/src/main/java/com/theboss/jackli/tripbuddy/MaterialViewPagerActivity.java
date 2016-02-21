package com.theboss.jackli.tripbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;
import com.theboss.jackli.tripbuddy.fragment.RecyclerViewFragment;
import com.theboss.jackli.tripbuddy.model.TripAdvisorLocation;
import com.theboss.jackli.tripbuddy.model.pojo.TripAdvisorResponse;
import com.theboss.jackli.tripbuddy.splashes.OnboardingWithPlaceholderActivity;

import java.util.ArrayList;
import java.util.List;

public class MaterialViewPagerActivity extends AppCompatActivity {

    private MaterialViewPager mViewPager;

    public static final List<TripAdvisorLocation> landmarks = new ArrayList<>();
    public static final List<TripAdvisorLocation> sighttours = new ArrayList<>();
    public static final List<TripAdvisorLocation> nightlifes = new ArrayList<>();
    public static final List<TripAdvisorLocation> fooddrinks = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_view_pager);

        mViewPager = (MaterialViewPager) findViewById(R.id.materialViewPager);

        mViewPager.getViewPager().setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {

            @Override
            public Fragment getItem(int position) {
                RecyclerViewFragment recyclerViewFragment;

                switch (position % 4) {
                    case 0:
                        recyclerViewFragment =  RecyclerViewFragment.newInstance(landmarks.size(), 0);
                        return recyclerViewFragment;
                    case 1:
                        recyclerViewFragment =  RecyclerViewFragment.newInstance(sighttours.size(), 1);
                        return recyclerViewFragment;
                    case 2:
                        recyclerViewFragment =  RecyclerViewFragment.newInstance(nightlifes.size(), 2);
                        return recyclerViewFragment;
                    case 3:
                        recyclerViewFragment =  RecyclerViewFragment.newInstance(fooddrinks.size(), 3);
                        return recyclerViewFragment;
                    default:
                        return null;
                }
            }

            @Override
            public int getCount() {
                return 4;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                switch (position % 4) {
                    case 0:
                        return "Landmarks";
                    case 1:
                        return "Sightseeing";
                    case 2:
                        return "Night Life";
                    case 3:
                        return "Food & Drink";
                }
                return "";
            }
        });

        mViewPager.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {
                switch (page) {
                    case 0:
                        return HeaderDesign.fromColorResAndUrl(
                                R.color.green,
                                "https://fs01.androidpit.info/a/63/0e/android-l-wallpapers-630ea6-h900.jpg");
                    case 1:
                        return HeaderDesign.fromColorResAndUrl(
                                R.color.blue,
                                "http://cdn1.tnwcdn.com/wp-content/blogs.dir/1/files/2014/06/wallpaper_51.jpg");
                    case 2:
                        return HeaderDesign.fromColorResAndUrl(
                                R.color.cyan,
                                "http://www.droid-life.com/wp-content/uploads/2014/10/lollipop-wallpapers10.jpg");
                    case 3:
                        return HeaderDesign.fromColorResAndUrl(
                                R.color.red,
                                "http://www.tothemobile.com/wp-content/uploads/2014/07/original.jpg");
                }

                //execute others actions if needed (ex : modify your header logo)

                return null;
            }
        });

        mViewPager.getViewPager().setOffscreenPageLimit(mViewPager.getViewPager().getAdapter().getCount());
        mViewPager.getPagerTitleStrip().setViewPager(mViewPager.getViewPager());

        Toolbar toolbar = mViewPager.getToolbar();

        if (toolbar != null) {
            setSupportActionBar(toolbar);

            ActionBar actionBar = getSupportActionBar();
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setDisplayUseLogoEnabled(false);
            actionBar.setHomeButtonEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_material_view_pager, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.search:
                Intent intent = new Intent(MaterialViewPagerActivity.this, OnboardingWithPlaceholderActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
