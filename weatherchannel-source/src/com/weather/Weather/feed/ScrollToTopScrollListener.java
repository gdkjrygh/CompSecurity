// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.feed;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.AbsListView;
import com.google.common.base.Preconditions;
import com.weather.commons.ui.NamedAlphaAnimation;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

public class ScrollToTopScrollListener
    implements android.widget.AbsListView.OnScrollListener
{

    private static final int FADE_DURATION_MS = 500;
    private static final String TAG = "ScrollToTopScrollListener";
    private static final int WAIT_TO_FADE_BACK_TOP_BUTTON_MS = 1500;
    private final View backTopView;
    private int currentScrollState;
    private boolean isBackTopFading;
    private int oldFirstVisibleItem;
    private int oldTop;

    public ScrollToTopScrollListener(View view)
    {
        backTopView = (View)Preconditions.checkNotNull(view);
    }

    private void interruptAnimation(View view)
    {
        Animation animation = view.getAnimation();
        if (animation != null)
        {
            animation.reset();
            view.clearAnimation();
            LogUtil.v("ScrollToTopScrollListener", LoggingMetaTags.TWC_UI, "%s interrupted", new Object[] {
                animation
            });
        }
    }

    private void revealBackTopButton()
    {
        backTopView.setVisibility(0);
        backTopView.setAlpha(1.0F);
    }

    public void fadeBackTopButton()
    {
        if (!isBackTopFading)
        {
            isBackTopFading = true;
            NamedAlphaAnimation namedalphaanimation = new NamedAlphaAnimation("fade backTop button", 1.0F, 0.0F);
            namedalphaanimation.setDuration(500L);
            namedalphaanimation.setStartOffset(1500L);
            namedalphaanimation.setAnimationListener(new _cls1(namedalphaanimation));
            backTopView.startAnimation(namedalphaanimation);
        }
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (j <= 0)
        {
            i = 0;
        }
        if (abslistview.getChildCount() >= 1)
        {
            abslistview = abslistview.getChildAt(0);
            if (abslistview == null)
            {
                j = 0;
            } else
            {
                j = abslistview.getTop();
            }
            LogUtil.v("ScrollToTopScrollListener", LoggingMetaTags.TWC_UI, "checkAnimateBackTopButton firstVisibleItem=%s, oldFirstVisibleItem=%s, top=%s, oldTop=%s", new Object[] {
                Integer.valueOf(i), Integer.valueOf(oldFirstVisibleItem), Integer.valueOf(j), Integer.valueOf(oldTop)
            });
            if (currentScrollState == 1)
            {
                boolean flag;
                if (i == oldFirstVisibleItem)
                {
                    if (j > oldTop)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                if (i < oldFirstVisibleItem)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                LogUtil.v("ScrollToTopScrollListener", LoggingMetaTags.TWC_UI, "checkAnimateBackTopButton isSwipingDown=%s", new Object[] {
                    Boolean.valueOf(flag)
                });
                if (flag)
                {
                    LogUtil.v("ScrollToTopScrollListener", LoggingMetaTags.TWC_UI, "checkAnimateBackTopButton swiping down. isFading=%s, visibility=%s", new Object[] {
                        Boolean.valueOf(isBackTopFading), LogUtil.getVisibilityName(backTopView.getVisibility())
                    });
                    if (isBackTopFading)
                    {
                        interruptAnimation(backTopView);
                        isBackTopFading = false;
                    }
                    revealBackTopButton();
                }
            }
            oldTop = j;
        }
        oldFirstVisibleItem = i;
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        currentScrollState = i;
        if (i != 1 && backTopView.getVisibility() == 0)
        {
            fadeBackTopButton();
        }
    }



/*
    static boolean access$002(ScrollToTopScrollListener scrolltotopscrolllistener, boolean flag)
    {
        scrolltotopscrolllistener.isBackTopFading = flag;
        return flag;
    }

*/


    /* member class not found */
    class _cls1 {}

}
