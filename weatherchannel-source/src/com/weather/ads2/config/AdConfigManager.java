// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.config;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.common.base.Preconditions;
import com.weather.ads2.ui.AdViewHolder;
import com.weather.ads2.ui.DfpAdViewGenerator;
import com.weather.beacons.config.BeaconConfig;
import com.weather.util.config.ConfigException;

// Referenced classes of package com.weather.ads2.config:
//            AdConfigProvider, AdSlotNotFoundException, AdConfigUnit, AdConfig, 
//            FactualConfig

public class AdConfigManager
    implements AdConfigProvider
{

    public static final AdConfigManager INSTANCE = new AdConfigManager();
    private volatile AdConfigProvider adConfigProvider;

    public AdConfigManager()
    {
    }

    private void checkInitializationState()
        throws ConfigException
    {
        if (adConfigProvider == null)
        {
            throw new ConfigException("System not setup to retrieve ad configurations");
        } else
        {
            return;
        }
    }

    public DfpAdViewGenerator generateAdView(Context context, String s, AdViewHolder adviewholder, com.weather.ads2.ui.DfpAdViewGenerator.ImpressionRecordingOption impressionrecordingoption)
        throws ConfigException, AdSlotNotFoundException
    {
        checkInitializationState();
        return new DfpAdViewGenerator(context, new AdConfigUnit(adConfigProvider.getAdConfig(), s), adviewholder, impressionrecordingoption, adConfigProvider.getDefaultAdSize(context));
    }

    public AdConfig getAdConfig()
        throws ConfigException
    {
        checkInitializationState();
        return adConfigProvider.getAdConfig();
    }

    public AdConfigUnit getAdConfigUnit(String s)
        throws ConfigException, AdSlotNotFoundException
    {
        checkInitializationState();
        return new AdConfigUnit(adConfigProvider.getAdConfig(), s);
    }

    public BeaconConfig getBeaconConfig()
        throws ConfigException
    {
        checkInitializationState();
        return adConfigProvider.getBeaconConfig();
    }

    public AdSize getDefaultAdSize(Context context)
    {
        return adConfigProvider.getDefaultAdSize(context);
    }

    public FactualConfig getFactualConfig()
        throws ConfigException
    {
        checkInitializationState();
        return adConfigProvider.getFactualConfig();
    }

    public void setAdConfigProvider(AdConfigProvider adconfigprovider)
    {
        adConfigProvider = (AdConfigProvider)Preconditions.checkNotNull(adconfigprovider);
    }

}
