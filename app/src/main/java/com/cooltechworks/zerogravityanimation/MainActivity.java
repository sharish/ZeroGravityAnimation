package com.cooltechworks.zerogravityanimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.animation.Animation;

import com.cooltechworks.zerogravityanimation.direction.Direction;

/**
 * Created by Harish Sridharan on July 20 2015.
 */
public class MainActivity extends Activity {

    public void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.act_main);

        for(int i=0;i<5;i++) {
            // stars will fly behind the earth.
            flyStars(R.drawable.starglow);
        }

        // meteor will fly over the earth
        flyObject(R.drawable.meteor, 20000, Direction.RIGHT, Direction.LEFT, 1f);
        // satellite  will fly over the earth.
        flyObject(R.drawable.satellite, 10000, Direction.LEFT, Direction.RIGHT, .4f);


    }

    public void flyObject(final int resId, final int duration, final Direction from, final Direction to, final float scale) {

        ZeroGravityAnimation animation = new ZeroGravityAnimation();
        animation.setCount(1);
        animation.setScalingFactor(scale);
        animation.setOriginationDirection(from);
        animation.setDestinationDirection(to);
        animation.setImage(resId);
        animation.setDuration(duration);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                flyObject(resId, duration, from, to, scale);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        animation.play(this);

    }

    public void flyStars(final int resId) {

        ZeroGravityAnimation animation = new ZeroGravityAnimation();
        animation.setCount(1);
        animation.setScalingFactor(0.2f);
        animation.setOriginationDirection(Direction.RANDOM);
        animation.setDestinationDirection(Direction.RANDOM);
        animation.setImage(resId);

        animation.setAnimationListener(new Animation.AnimationListener() {
                                           @Override
                                           public void onAnimationStart(Animation animation) {

                                           }

                                           @Override
                                           public void onAnimationEnd(Animation animation) {

                                               flyStars(resId == R.drawable.starglow ? R.drawable.star : R.drawable.starglow);
                                           }

                                           @Override
                                           public void onAnimationRepeat(Animation animation) {

                                           }
                                       }
        );

        ViewGroup rootView = (ViewGroup) findViewById(R.id.animation_holder);
        animation.play(this,rootView);

    }
}
