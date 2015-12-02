// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles.model;

import gkh;
import java.util.Map;

public class BadgeIcons
{

    private static final Map sIconTypeToResIdMap = initializeMap();

    private BadgeIcons()
    {
    }

    public static int getResIdForIcon(String s)
    {
        return ((Integer)sIconTypeToResIdMap.get(s)).intValue();
    }

    private static Map initializeMap()
    {
        return (new gkh()).a("house", Integer.valueOf(0x7f020297)).a("basketball", Integer.valueOf(0x7f020292)).a("flower", Integer.valueOf(0x7f020296)).a("lightBulb", Integer.valueOf(0x7f020298)).a("lightningBolt", Integer.valueOf(0x7f020299)).a("musicNote", Integer.valueOf(0x7f02029a)).a("rocketship", Integer.valueOf(0x7f02029b)).a("star", Integer.valueOf(0x7f02029c)).a("briefcase", Integer.valueOf(0x7f020293)).a();
    }

}
