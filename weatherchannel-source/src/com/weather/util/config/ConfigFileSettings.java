// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.config;

import java.net.URL;

public final class ConfigFileSettings
{

    public final Integer refreshRateHours;
    public final URL remoteResourceLocation;
    public final boolean updateImmediately;

    public ConfigFileSettings(URL url, Integer integer, boolean flag)
    {
        remoteResourceLocation = url;
        refreshRateHours = integer;
        updateImmediately = flag;
    }
}
