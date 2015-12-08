// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.ui;

import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Locale;

// Referenced classes of package com.weather.ads2.ui:
//            DfpAdViewGenerator, AdViewHolder

private class w extends AdListener
{

    private final PublisherAdView ad;
    private final AdViewHolder addAdView;
    final DfpAdViewGenerator this$0;

    public void onAdClosed()
    {
        super.onAdClosed();
        LogUtil.v("DfpAdViewGenerator", LoggingMetaTags.TWC_AD, "onAdClosed:%s", new Object[] {
            ad
        });
    }

    public void onAdFailedToLoad(int i)
    {
        super.onAdFailedToLoad(i);
        i;
        JVM INSTR tableswitch 0 3: default 36
    //                   0 96
    //                   1 102
    //                   2 108
    //                   3 114;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        String s = "";
_L7:
        EventLog.w("DfpAdViewGenerator", String.format(Locale.US, "Fail to load %s: %n%d: %s", new Object[] {
            ad.getAdUnitId(), Integer.valueOf(i), s
        }));
        DfpAdViewGenerator.access$102(DfpAdViewGenerator.this, false);
        addAdView.onAdFail();
        return;
_L2:
        s = "ERROR_CODE_INTERNAL_ERROR";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "ERROR_CODE_INVALID_REQUEST";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "ERROR_CODE_NETWORK_ERROR";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "ERROR_CODE_NO_FILL";
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onAdLeftApplication()
    {
        super.onAdLeftApplication();
        LogUtil.v("DfpAdViewGenerator", LoggingMetaTags.TWC_AD, "onAdLeftApplication:%s", new Object[] {
            ad
        });
    }

    public void onAdLoaded()
    {
        super.onAdLoaded();
        android.view.View view = addAdView.getAdViewHolder();
        if (view != null)
        {
            if (ad.getParent() != null)
            {
                if (view instanceof ViewGroup)
                {
                    ((ViewGroup)view).removeAllViews();
                    ((ViewGroup)view).addView(ad);
                }
            } else
            {
                ((ViewGroup)view).addView(ad);
            }
        }
        DfpAdViewGenerator.access$102(DfpAdViewGenerator.this, true);
        LogUtil.v("DfpAdViewGenerator", LoggingMetaTags.TWC_AD, "%s loaded", new Object[] {
            ad.getAdUnitId()
        });
        addAdView.onAdLoaded(ad.getAdSize());
        if (DfpAdViewGenerator.access$200(DfpAdViewGenerator.this) == rdingOption.AUTO_CLIENT)
        {
            recordImpression();
        }
    }

    public void onAdOpened()
    {
        super.onAdOpened();
        LogUtil.v("DfpAdViewGenerator", LoggingMetaTags.TWC_AD, "onAdOpened:%s", new Object[] {
            ad
        });
    }

    private w(PublisherAdView publisheradview, AdViewHolder adviewholder)
    {
        this$0 = DfpAdViewGenerator.this;
        super();
        ad = publisheradview;
        addAdView = adviewholder;
    }

    w(PublisherAdView publisheradview, AdViewHolder adviewholder, w w)
    {
        this(publisheradview, adviewholder);
    }
}
