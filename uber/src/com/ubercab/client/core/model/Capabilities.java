// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.TripDriverCapabilities;

public class Capabilities
    implements TripDriverCapabilities
{

    Boolean music;

    public Capabilities()
    {
    }

    public boolean getMusic()
    {
        return isMusicEnabled().booleanValue();
    }

    public Boolean isMusicEnabled()
    {
        boolean flag;
        if (music == null)
        {
            flag = false;
        } else
        {
            flag = music.booleanValue();
        }
        return Boolean.valueOf(flag);
    }
}
