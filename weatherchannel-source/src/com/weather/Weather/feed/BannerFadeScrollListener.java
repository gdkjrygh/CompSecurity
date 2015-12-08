// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.feed;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.AbsListView;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.weather.commons.ui.NamedAlphaAnimation;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import com.weather.util.ui.Dimension;

public class BannerFadeScrollListener
    implements android.widget.AbsListView.OnScrollListener
{

    private static final int DEFAULT_FADE_HEIGHT = 100;
    private static final int FADE_DURATION_MS = 500;
    private static final int REVEAL_DURATION_MS = 500;
    private static final int REVEAL_OFFSET = 50;
    private static final String TAG = "BannerFadeScrollListener";
    private final View banner;
    private int currentHeightForBanner;
    private final View header;
    private boolean isAnimatingBanner;
    private final Predicate showBannerPredicate;

    public BannerFadeScrollListener(View view, View view1, Predicate predicate)
    {
        banner = (View)Preconditions.checkNotNull(view);
        header = (View)Preconditions.checkNotNull(view1);
        showBannerPredicate = (Predicate)Preconditions.checkNotNull(predicate);
    }

    private int bannerHeightToFade()
    {
        byte byte0 = 100;
        Dimension dimension = getScreenDimension();
        int i = byte0;
        if (dimension != null)
        {
            i = byte0;
            if (dimension.getHeight() > 0)
            {
                i = dimension.getHeight() / 2;
            }
        }
        return i;
    }

    private int bannerHeightToReveal()
    {
        Dimension dimension = getScreenDimension();
        if (dimension != null)
        {
            return dimension.getHeight() / 2 + 50;
        } else
        {
            return 150;
        }
    }

    private AlphaAnimation getBannerFadeAnimation(View view)
    {
        NamedAlphaAnimation namedalphaanimation = new NamedAlphaAnimation("fade banner", 1.0F, 0.0F);
        namedalphaanimation.setDuration(500L);
        namedalphaanimation.setAnimationListener(new _cls2(view));
        return namedalphaanimation;
    }

    private AlphaAnimation getBannerRevealAnimation(View view)
    {
        NamedAlphaAnimation namedalphaanimation = new NamedAlphaAnimation("reveal banner", 0.0F, 1.0F);
        namedalphaanimation.setDuration(500L);
        namedalphaanimation.setAnimationListener(new _cls1(view));
        return namedalphaanimation;
    }

    private static Dimension getScreenDimension()
    {
        Prefs prefs = TwcPrefs.getInstance();
        if (prefs.contains(com.weather.util.prefs.TwcPrefs.Keys.SCREEN_WIDTH) && prefs.contains(com.weather.util.prefs.TwcPrefs.Keys.SCREEN_HEIGHT))
        {
            return new Dimension(prefs.getInt(com.weather.util.prefs.TwcPrefs.Keys.SCREEN_WIDTH, 0), prefs.getInt(com.weather.util.prefs.TwcPrefs.Keys.SCREEN_HEIGHT, 0));
        } else
        {
            return null;
        }
    }

    private boolean isCurrentHeightGreaterThanBannerHeightToFade()
    {
        return currentHeightForBanner > bannerHeightToFade();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (!isAnimatingBanner)
        {
            j = banner.getVisibility();
            LogUtil.v("BannerFadeScrollListener", LoggingMetaTags.TWC_UI, "shouldFadeShowBanner firstVisibleItem=%s, visibility=%s", new Object[] {
                Integer.valueOf(i), LogUtil.getVisibilityName(j)
            });
            if (i > 0 && j == 0)
            {
                isAnimatingBanner = true;
                banner.startAnimation(getBannerFadeAnimation(banner));
                return;
            }
            if (i == 0 && abslistview.getChildCount() > 0)
            {
                Rect rect = new Rect(0, 0, header.getWidth(), header.getHeight());
                abslistview.getChildVisibleRect(abslistview.getChildAt(0), rect, null);
                currentHeightForBanner = rect.height();
                boolean flag = showBannerPredicate.apply(null);
                if (isCurrentHeightGreaterThanBannerHeightToFade() && flag)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                LogUtil.v("BannerFadeScrollListener", LoggingMetaTags.TWC_UI, "checkAnimateBanner currentHeightForBanner=%s, bannerCanBeShown=%s", new Object[] {
                    Integer.valueOf(currentHeightForBanner), Boolean.valueOf(flag)
                });
                if (currentHeightForBanner < bannerHeightToFade() && j != 8)
                {
                    isAnimatingBanner = true;
                    banner.startAnimation(getBannerFadeAnimation(banner));
                    return;
                }
                if (currentHeightForBanner > bannerHeightToReveal() && j != 0 && i != 0)
                {
                    isAnimatingBanner = true;
                    banner.startAnimation(getBannerRevealAnimation(banner));
                    return;
                }
            }
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }


/*
    static boolean access$002(BannerFadeScrollListener bannerfadescrolllistener, boolean flag)
    {
        bannerfadescrolllistener.isAnimatingBanner = flag;
        return flag;
    }

*/

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
