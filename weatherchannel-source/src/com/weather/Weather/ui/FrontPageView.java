// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.RelativeLayout;
import com.weather.Weather.app.VisibleView;
import com.weather.beacons.analytics.Analytics;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

public class FrontPageView extends RelativeLayout
    implements VisibleView
{

    public static final int ANIMATION_DIVISOR = 20;
    private static final int PADDING_ANIMATION_DURATION_MS = 500;
    private static final String TAG = "FrontPageView";
    private final String beacon;
    private int flingMagnitude;
    private boolean isOnScreen;
    private android.widget.AbsListView.LayoutParams lp;
    private boolean moreThanHalfVisible;
    private int originalHeight;
    private final int originalTopPadding;
    private final PaddingAnimation paddingAnimation;

    public FrontPageView(Context context)
    {
        super(context);
    /* block-local class not found */
    class PaddingAnimation {}

        paddingAnimation = new PaddingAnimation(500L);
        beacon = context.getResources().getString(0x7f07049e);
        originalTopPadding = getPaddingTop();
    }

    public FrontPageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        paddingAnimation = new PaddingAnimation(500L);
        beacon = context.getResources().getString(0x7f07049e);
        originalTopPadding = getPaddingTop();
    }

    public FrontPageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        paddingAnimation = new PaddingAnimation(500L);
        beacon = context.getResources().getString(0x7f07049e);
        originalTopPadding = getPaddingTop();
    }

    public void bounceToTop()
    {
        LogUtil.v("FrontPageView", LoggingMetaTags.TWC_UI, "bounceToTop", new Object[0]);
        paddingAnimation.setAnimationPadding(getExtraTopPadding());
        paddingAnimation.setInterpolator(new OvershootInterpolator());
        startAnimation(paddingAnimation);
    }

    public int getExtraTopPadding()
    {
        return getPaddingTop() - originalTopPadding;
    }

    public void noLongerVisible()
    {
        moreThanHalfVisible = false;
    }

    protected void onAttachedToWindow()
    {
        moreThanHalfVisible = true;
        super.onAttachedToWindow();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        i = getMeasuredHeight();
        int ai[] = new int[2];
        getLocationOnScreen(ai);
        if (ai[1] >= -(i / 2))
        {
            if (!isOnScreen)
            {
                if (beacon != null)
                {
                    Analytics.trackState(beacon, null);
                }
                LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.FRONT_PAGE);
                isOnScreen = true;
            }
            return;
        } else
        {
            isOnScreen = false;
            return;
        }
    }

    public void overscrollBounce()
    {
        LogUtil.v("FrontPageView", LoggingMetaTags.TWC_UI, "overscrollBounce", new Object[0]);
        paddingAnimation.setAnimationPadding(flingMagnitude);
        paddingAnimation.setInterpolator(new AnticipateOvershootInterpolator());
        startAnimation(paddingAnimation);
    }

    public void setExtraTopPadding(int i)
    {
        if (lp != null)
        {
            int j = originalTopPadding + i;
            lp.height = originalHeight + i;
            LogUtil.d("FrontPageView", LoggingMetaTags.TWC_UI, "setExtraTopPadding: newExtraTopPadding=%s, originalTopPadding=%s, topPadding=%s, height=%s", new Object[] {
                Integer.valueOf(i), Integer.valueOf(originalTopPadding), Integer.valueOf(j), Integer.valueOf(lp.height)
            });
            setPadding(getPaddingLeft(), j, getPaddingBottom(), getPaddingRight());
        }
    }

    public void setHeightWidth(int i, int j)
    {
        originalHeight = j;
        lp = (android.widget.AbsListView.LayoutParams)getLayoutParams();
        if (lp == null)
        {
            lp = new android.widget.AbsListView.LayoutParams(i, j);
            setLayoutParams(lp);
        }
        lp.height = j;
        lp.width = i;
        flingMagnitude = j / 20;
    }

    public void stopAnimating()
    {
        if (paddingAnimation.hasStarted() && !paddingAnimation.hasEnded())
        {
            clearAnimation();
        }
    }

    public void visibleItemIsScrolling()
    {
    }

    public void visibleItemIsSettled()
    {
        if (!moreThanHalfVisible && beacon != null)
        {
            boolean flag;
            if (getBottom() > getHeight() / 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            moreThanHalfVisible = flag;
            if (moreThanHalfVisible)
            {
                Analytics.trackState(beacon, null);
                LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.FRONT_PAGE);
            }
        }
    }
}
