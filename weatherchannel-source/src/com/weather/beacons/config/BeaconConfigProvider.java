// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.beacons.config;

import com.weather.util.config.ConfigException;

// Referenced classes of package com.weather.beacons.config:
//            BeaconConfig

public interface BeaconConfigProvider
{

    public abstract BeaconConfig getBeaconConfig()
        throws ConfigException;
}
