// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public final class TwcAdRequest
{

    private final Map targetingParameters;
    private final int viewCountId;

    public TwcAdRequest(Map map, int i)
    {
        viewCountId = ((Integer)Preconditions.checkNotNull(Integer.valueOf(i))).intValue();
        targetingParameters = ImmutableMap.copyOf(map);
    }

    public Map getTargetingParameters()
    {
        return targetingParameters;
    }

    public int getViewCountId()
    {
        return viewCountId;
    }
}
