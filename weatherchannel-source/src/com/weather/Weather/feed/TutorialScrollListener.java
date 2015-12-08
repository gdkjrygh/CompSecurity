// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.feed;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.AbsListView;
import com.google.common.base.Preconditions;

public class TutorialScrollListener
    implements android.widget.AbsListView.OnScrollListener
{

    private static final float ALPHA_FROM = 0.5F;
    private static final float ALPHA_TO = 0F;
    private static final int DURATION = 500;
    private static final int FADE_TUTORIAL_POS = 6;
    private static final double HEADER_HEIGHT_FACTOR = 0.80000000000000004D;
    private boolean fadeTutorial;
    private final View tutorial;

    public TutorialScrollListener(View view)
    {
        fadeTutorial = true;
        tutorial = (View)Preconditions.checkNotNull(view);
    }

    private void fadeOutTutorial()
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(0.5F, 0.0F);
        alphaanimation.setAnimationListener(new _cls1());
        alphaanimation.setDuration(500L);
        tutorial.startAnimation(alphaanimation);
        tutorial.startAnimation(alphaanimation);
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        abslistview = abslistview.getChildAt(0);
        break MISSING_BLOCK_LABEL_6;
        if (abslistview != null && tutorial.getVisibility() == 0)
        {
            j = abslistview.getTop();
            i = j;
            if (j == 0)
            {
                i = 1;
            }
            i = abslistview.getHeight() / i;
            if ((double)i < (double)abslistview.getHeight() * 0.80000000000000004D && i < 6 && fadeTutorial)
            {
                fadeTutorial = false;
                fadeOutTutorial();
                return;
            }
        }
        return;
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }


    /* member class not found */
    class _cls1 {}

}
