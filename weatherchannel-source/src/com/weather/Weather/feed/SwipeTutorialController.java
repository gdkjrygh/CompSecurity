// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.feed;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.common.base.Preconditions;
import com.weather.util.app.AbstractTwcApplication;

public class SwipeTutorialController
{

    int animationCount;
    private final Animation fadeOutAnimation = AnimationUtils.loadAnimation(AbstractTwcApplication.getRootContext(), 0x7f040003);
    private final String launchedPreferenceKey;
    private final Animation slideUpFromBottomAnimation = AnimationUtils.loadAnimation(AbstractTwcApplication.getRootContext(), 0x7f040004);
    private final View tutorialView;

    public SwipeTutorialController(View view, String s)
    {
        tutorialView = (View)Preconditions.checkNotNull(view);
        launchedPreferenceKey = (String)Preconditions.checkNotNull(s);
    }

    private void startFirstTimeLaunchAnimation()
    {
        tutorialView.startAnimation(slideUpFromBottomAnimation);
        slideUpFromBottomAnimation.setAnimationListener(new _cls1());
        fadeOutAnimation.setAnimationListener(new _cls2());
    }

    public void firstTimeLaunchTutorial()
    {
        if (tutorialView.getVisibility() != 0)
        {
            return;
        }
        SharedPreferences sharedpreferences = AbstractTwcApplication.getRootContext().getSharedPreferences(launchedPreferenceKey, 0);
        android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
        if (sharedpreferences.getBoolean(launchedPreferenceKey, true))
        {
            startFirstTimeLaunchAnimation();
            editor.putBoolean(launchedPreferenceKey, false);
            editor.apply();
            return;
        } else
        {
            tutorialView.setVisibility(8);
            return;
        }
    }




    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
