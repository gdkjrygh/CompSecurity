// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.config;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.weather.beacons.config.BeaconConfig;
import com.weather.util.config.ConfigException;

// Referenced classes of package com.weather.ads2.config:
//            AdConfig, FactualConfig

public interface AdConfigProvider
{

    public abstract AdConfig getAdConfig()
        throws ConfigException;

    public abstract BeaconConfig getBeaconConfig()
        throws ConfigException;

    public abstract AdSize getDefaultAdSize(Context context);

    public abstract FactualConfig getFactualConfig()
        throws ConfigException;
}
