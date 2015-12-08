// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.view.View;
import com.google.common.base.Preconditions;
import com.weather.Weather.feed.ViewWithAlpha;
import com.weather.ads2.branded.background.BrandedBackgroundAd;
import com.weather.ads2.ui.AdHolder;
import com.weather.ads2.ui.DfpAd;

// Referenced classes of package com.weather.Weather.app:
//            HomeScreenUI, WeatherController, BackgroundManager

public class HomeScreen
    implements ViewWithAlpha
{

    private static final int MAXIMUM_ALPHA_FOR_VISIBLE = 84;
    private final AdHolder adHolder;
    private int backgroundAlpha;
    private final BackgroundManager backgroundManager;
    private final DfpAd bannerAd = DfpAd.builder().setResizeAdOnLoad(true).setHideAdOnLoadFailure(true).setHiddenVisibility(8).build();
    private final BrandedBackgroundAd brandedBackgroundAd;
    private final HomeScreenUI uiFields;

    public HomeScreen(WeatherController weathercontroller)
    {
        brandedBackgroundAd = new BrandedBackgroundAd("weather.bb", bannerAd);
        adHolder = new AdHolder(brandedBackgroundAd);
        backgroundAlpha = 0x80000000;
        uiFields = new HomeScreenUI(weathercontroller);
        View view = weathercontroller.findViewById(0x7f0d0026);
        backgroundManager = new BackgroundManager(weathercontroller, view, (View)Preconditions.checkNotNull(weathercontroller.findViewById(0x7f0d01e6)), uiFields.nowCircleFront, uiFields.nowCircleFront, uiFields.getProgressbar());
        bannerAd.init(view);
        brandedBackgroundAd.setBackgroundView(backgroundManager);
        adHolder.init("weather.cc");
        adHolder.setVisible(false);
        bannerAd.hideAd();
        backgroundManager.loadInitialImage();
        weathercontroller = bannerAd.getAdViewHolder();
    /* block-local class not found */
    class AdClickListener {}

        if (weathercontroller != null)
        {
            weathercontroller.setOnClickListener(new AdClickListener(null));
        }
    }

    public HomeScreenUI getUiFields()
    {
        return uiFields;
    }

    public void onActivityDestroy()
    {
        adHolder.destroy();
    }

    public void onActivityPaused()
    {
        backgroundManager.setPaused(true);
        adHolder.pause();
    }

    public void onActivityResumed()
    {
        backgroundManager.setPaused(false);
        adHolder.resume();
        uiFields.showHideSevereAlert();
    }

    public void setAlphaOfView(int i)
    {
        if (backgroundAlpha != i)
        {
            backgroundAlpha = i;
            View view;
            boolean flag;
            if (i < 84)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            backgroundManager.setVisible(flag);
            adHolder.setVisible(flag);
            backgroundManager.setAlpha(248 - i);
            view = bannerAd.getAdViewHolder();
            if (view != null)
            {
                if (i >= 248)
                {
                    i = 0;
                } else
                {
                    i = 255 - i;
                }
                view.setAlpha((float)i / 255F);
            }
        }
    }
}
