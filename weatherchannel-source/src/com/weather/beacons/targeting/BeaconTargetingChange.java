// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.beacons.targeting;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public final class BeaconTargetingChange
{

    private final Map changedParameters;

    public BeaconTargetingChange(Map map)
    {
        changedParameters = ImmutableMap.copyOf(map);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (BeaconTargetingChange)obj;
            if (!changedParameters.equals(((BeaconTargetingChange) (obj)).changedParameters))
            {
                return false;
            }
        }
        return true;
    }

    public Map getChangedParameters()
    {
        return changedParameters;
    }

    public int hashCode()
    {
        return changedParameters.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("BeaconTargetingChange{changedParameters=").append(changedParameters).append('}').toString();
    }
}
