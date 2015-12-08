// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.feed;

import android.util.Log;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.weather.ads2.config.AdConfig;
import com.weather.ads2.config.AdConfigProvider;
import com.weather.util.config.ConfigException;

// Referenced classes of package com.weather.Weather.feed:
//            FeedAdConfig

public class StandardFeedAdConfigSupplier
    implements Supplier
{

    private static final String TAG = "SimpleFeedAdConfgSupplr";
    private final AdConfigProvider adConfigProvider;
    private final String feedSlotPrefix;

    public StandardFeedAdConfigSupplier(AdConfigProvider adconfigprovider, String s)
    {
        adConfigProvider = adconfigprovider;
        feedSlotPrefix = s;
    }

    public FeedAdConfig get()
    {
        Object obj;
        try
        {
            obj = adConfigProvider.getAdConfig();
            obj = new FeedAdConfig(((AdConfig) (obj)).getAdStartPosition(), ((AdConfig) (obj)).getAdModuleInterval(), ((AdConfig) (obj)).getFeedAdSlots(feedSlotPrefix));
        }
        catch (ConfigException configexception)
        {
            Log.e("SimpleFeedAdConfgSupplr", "Ads are not configured:  No ads will be displayed in the feed", configexception);
            return new FeedAdConfig(1, 1, ImmutableList.of());
        }
        return ((FeedAdConfig) (obj));
    }

    public volatile Object get()
    {
        return get();
    }
}
