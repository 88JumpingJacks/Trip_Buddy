package com.theboss.jackli.tripbuddy.splashes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;

import com.theboss.jackli.tripbuddy.MaterialViewPagerActivity;
import com.theboss.jackli.tripbuddy.R;
import com.theboss.jackli.tripbuddy.model.City;
import com.theboss.jackli.tripbuddy.model.TripAdvisorLocation;
import com.theboss.jackli.tripbuddy.networking.TripAdvisorService;

import java.io.IOException;
import java.util.List;


public class OnboardingWithCenterAnimationActivity extends AppCompatActivity {
    public static final int STARTUP_DELAY = 300;
    public static final int ANIM_ITEM_DURATION = 1000;
    public static final int ITEM_DELAY = 300;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_center);

        ImageView logoImageView = (ImageView) findViewById(R.id.img_logo);
        ViewGroup container = (ViewGroup) findViewById(R.id.container);

        ViewCompat.animate(logoImageView)
            .translationY(-250)
            .setStartDelay(STARTUP_DELAY)
            .setDuration(ANIM_ITEM_DURATION).setInterpolator(
                new DecelerateInterpolator(1.2f)).start();

        for (int i = 0; i < container.getChildCount(); i++) {
            View v = container.getChildAt(i);
            ViewPropertyAnimatorCompat viewAnimator;

            if (!(v instanceof Button)) {
                viewAnimator = ViewCompat.animate(v)
                        .translationY(50).alpha(1)
                        .setStartDelay((ITEM_DELAY * i) + 500)
                        .setDuration(1000);
            } else {
                viewAnimator = ViewCompat.animate(v)
                        .scaleY(1).scaleX(1)
                        .setStartDelay((ITEM_DELAY * i) + 500)
                        .setDuration(500);
            }

            viewAnimator.setInterpolator(new DecelerateInterpolator()).start();
        }

        Button btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OnboardingWithCenterAnimationActivity.this, MaterialViewPagerActivity.class);
                startActivity(intent);
            }
        });

        Thread landmark = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    List<TripAdvisorLocation> locations = new TripAdvisorService().getListForSubcategory(City.MTL, TripAdvisorService.landmarks);
                    MaterialViewPagerActivity.landmarks.addAll(locations);

                    Thread sighttour = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                List<TripAdvisorLocation> locations = new TripAdvisorService().getListForSubcategory(City.MTL, TripAdvisorService.sightseeing_tours);
                                MaterialViewPagerActivity.sighttours.addAll(locations);

                                Thread nightlife = new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        try {
                                            List<TripAdvisorLocation> locations = new TripAdvisorService().getListForSubcategory(City.MTL, TripAdvisorService.nightlife);
                                            MaterialViewPagerActivity.nightlifes.addAll(locations);

                                            Thread fooddrink = new Thread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    try {
                                                        List<TripAdvisorLocation> locations = new TripAdvisorService().getListForSubcategory(City.MTL, TripAdvisorService.food_drink);
                                                        MaterialViewPagerActivity.fooddrinks.addAll(locations);
                                                    } catch (IOException e) {
                                                        e.printStackTrace();
                                                    }
                                                }
                                            });
                                            fooddrink.start();

                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                });
                                nightlife.start();

                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    sighttour.start();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        landmark.start();


    }


}
