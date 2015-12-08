// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;

import com.google.common.collect.ImmutableMap;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Map;

public final class AdTargetingChange
{

    private static final String TAG = "AdTargetingChange";
    private final Map changedParameters;

    public AdTargetingChange(Map map)
    {
        changedParameters = ImmutableMap.copyOf(map);
        LogUtil.v("AdTargetingChange", LoggingMetaTags.TWC_AD, "%s", new Object[] {
            this
        });
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AdTargetingChange)obj;
            if (!changedParameters.equals(((AdTargetingChange) (obj)).changedParameters))
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
        return (new StringBuilder()).append("AdTargetingChange{changedParameters=").append(changedParameters).append('}').toString();
    }
}
