// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.config;

import dqu;

public final class AppConfigKey extends Enum
    implements dqu
{

    public static final AppConfigKey a;
    public static final AppConfigKey b;
    public static final AppConfigKey c;
    public static final AppConfigKey d;
    public static final AppConfigKey e;
    public static final AppConfigKey f;
    public static final AppConfigKey g;
    public static final AppConfigKey h;
    public static final AppConfigKey i;
    public static final AppConfigKey j;
    public static final AppConfigKey k;
    private static final AppConfigKey l[];

    private AppConfigKey(String s, int i1)
    {
        super(s, i1);
    }

    public static AppConfigKey valueOf(String s)
    {
        return (AppConfigKey)Enum.valueOf(com/ubercab/client/core/config/AppConfigKey, s);
    }

    public static AppConfigKey[] values()
    {
        return (AppConfigKey[])l.clone();
    }

    static 
    {
        a = new AppConfigKey("DISABLE_CALLING", 0);
        b = new AppConfigKey("DISABLE_SPOTIFY_LINK_AND_UNLINK", 1);
        c = new AppConfigKey("DISABLE_TEXT_MESSAGING", 2);
        d = new AppConfigKey("DISABLE_VEHICLE_INVENTORY_VIEW", 3);
        e = new AppConfigKey("EMERGENCY_NUMBER", 4);
        f = new AppConfigKey("ENABLE_DEBUG_SETTINGS", 5);
        g = new AppConfigKey("ENABLE_MUSIC_BAR", 6);
        h = new AppConfigKey("ENABLE_NETWORK_MONITORING", 7);
        i = new AppConfigKey("ENABLE_SOS_INDIA_RIDER", 8);
        j = new AppConfigKey("ENABLE_UPFRONT_PRICING_V1", 9);
        k = new AppConfigKey("USE_TRIP_LEGS", 10);
        l = (new AppConfigKey[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
