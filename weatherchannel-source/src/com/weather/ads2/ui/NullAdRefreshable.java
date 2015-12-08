// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.ui;

import com.weather.ads2.config.AdConfigUnit;
import com.weather.ads2.targeting.AdRefreshEvent;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Map;

// Referenced classes of package com.weather.ads2.ui:
//            HideableAd

public class NullAdRefreshable
    implements HideableAd
{

    private static final NullAdRefreshable INSTANCE = new NullAdRefreshable();
    private static final String TAG = "NullAdRefreshable";

    private NullAdRefreshable()
    {
    }

    public static NullAdRefreshable getInstance()
    {
        return INSTANCE;
    }

    public void clearPendingAdRequest()
    {
    }

    public void destroy()
    {
    }

    public AdConfigUnit getAdConfiguration()
    {
        return null;
    }

    public void hideAd()
    {
    }

    public boolean isConfigured()
    {
        return false;
    }

    public void pause()
    {
    }

    public void recordImpression()
    {
    }

    public void refreshAd(AdRefreshEvent adrefreshevent)
    {
        LogUtil.d("NullAdRefreshable", LoggingMetaTags.TWC_AD, "Ad is not configured to be a real ad, so no refresh", new Object[0]);
    }

    public void resume()
    {
    }

    public void setAdConfiguration(AdConfigUnit adconfigunit)
    {
    }

    public void setAdSlotName(String s)
    {
    }

    public void setSingleUseAdParameters(Map map)
    {
    }

    public void showAdOnLoad()
    {
    }

}
