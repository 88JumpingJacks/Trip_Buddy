package com.theboss.jackli.tripbuddy;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;

import com.theboss.jackli.tripbuddy.model.pojo.FakeUser;
import com.theboss.jackli.tripbuddy.utils.RoundedAvatarDrawable;

/**
 * Created by yucunli on 2016-02-21.
 */
public class ChooseTravelerActivity extends AppCompatActivity {

    private int mContentViewHeight;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Fake a long startup time
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                onFakeCreate();
            }

        }, 500);
    }

    private void onFakeCreate() {
        setContentView(R.layout.activity_choose_preference);

        TextView titleTextView = (TextView) findViewById(R.id.text_title);
        ViewCompat.animate(titleTextView).alpha(1).start();

        TextView name=(TextView)findViewById(R.id.person_name);
        TextView like=(TextView)findViewById(R.id.person_like);
        TextView thought=(TextView)findViewById(R.id.person_thought);
        FakeUser fakeUser=TextRandomizor.getInstance().randomPicker();
        name.setText(fakeUser.getName());
        like.setText(fakeUser.getLike());
        thought.setText(fakeUser.getThought());
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.getViewTreeObserver().addOnPreDrawListener(
                new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public boolean onPreDraw() {
                        mToolbar.getViewTreeObserver().removeOnPreDrawListener(this);
                        final int widthSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
                        final int heightSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);

                        mToolbar.measure(widthSpec, heightSpec);
                        mContentViewHeight = mToolbar.getHeight();
                        collapseToolbar();
                        return true;
                    }
                });

    }


    private void collapseToolbar() {
        int toolBarHeight;
        TypedValue tv = new TypedValue();
        getTheme().resolveAttribute(android.R.attr.actionBarSize, tv, true);
        toolBarHeight = TypedValue.complexToDimensionPixelSize(tv.data, getResources().getDisplayMetrics());
        ValueAnimator valueHeightAnimator = ValueAnimator.ofInt(mContentViewHeight, toolBarHeight);
        valueHeightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                ViewGroup.LayoutParams lp = mToolbar.getLayoutParams();
                lp.height = (Integer) animation.getAnimatedValue();
                mToolbar.setLayoutParams(lp);
            }
        });

        valueHeightAnimator.start();
    }
}
