// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.weatherfx;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ScatterShotUpdateEvent
{

    private final Map zipCodeToScatterShotMap;

    public ScatterShotUpdateEvent(Map map)
    {
        zipCodeToScatterShotMap = ImmutableMap.copyOf(map);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ScatterShotUpdateEvent)obj;
            if (!zipCodeToScatterShotMap.equals(((ScatterShotUpdateEvent) (obj)).zipCodeToScatterShotMap))
            {
                return false;
            }
        }
        return true;
    }

    public Map getZipCodeToScatterShotMap()
    {
        return ImmutableMap.copyOf(zipCodeToScatterShotMap);
    }

    public int hashCode()
    {
        return zipCodeToScatterShotMap.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("ScatterShotUpdateEvent{zipCodeToScatterShotMap=").append(zipCodeToScatterShotMap).append('}').toString();
    }
}
