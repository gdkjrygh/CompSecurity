// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.ui;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.weather.ads2.config.AdConfigManager;
import com.weather.dal2.system.TwcBus;
import com.weather.util.ui.Dimension;

// Referenced classes of package com.weather.ads2.ui:
//            DfpAd, AdHolder

public class PageAdHolder
{

    private final AdHolder adHolder;
    private final DfpAd dfpAd;
    private boolean paused;
    private boolean visible;

    public PageAdHolder()
    {
        paused = true;
        dfpAd = DfpAd.builder().build();
        adHolder = new AdHolder(dfpAd);
    }

    PageAdHolder(AdConfigManager adconfigmanager, TwcBus twcbus, Handler handler)
    {
        paused = true;
        dfpAd = DfpAd.builder().setAdConfigManager(adconfigmanager).build();
        adHolder = new AdHolder(dfpAd, adconfigmanager, twcbus, handler);
    }

    private void onHide()
    {
        if (visible)
        {
            visible = false;
            if (!paused)
            {
                adHolder.pause();
                return;
            }
        }
    }

    private void onVisible()
    {
        if (!visible)
        {
            visible = true;
            if (!paused)
            {
                adHolder.resume();
                return;
            }
        }
    }

    public void destroy()
    {
        adHolder.destroy();
    }

    public Dimension getAdBoundingBox(Context context)
    {
        return adHolder.getAdBoundingBox(context);
    }

    public void init(View view, String s)
    {
        dfpAd.init(view);
        adHolder.init(s);
    }

    public void pause()
    {
        if (!paused)
        {
            paused = true;
            if (visible)
            {
                adHolder.pause();
                return;
            }
        }
    }

    public void resume()
    {
        if (paused)
        {
            paused = false;
            if (visible)
            {
                adHolder.resume();
                return;
            }
        }
    }

    public void setVisible(boolean flag)
    {
        if (flag)
        {
            onVisible();
            return;
        } else
        {
            onHide();
            return;
        }
    }
}
