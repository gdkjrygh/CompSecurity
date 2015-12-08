// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;

import com.google.common.base.Preconditions;
import com.weather.dal2.locations.SavedLocation;

public class AdRefreshEvent
{

    private final boolean allowBrandedBackground;
    private final SavedLocation locationOfEvent;

    public AdRefreshEvent(SavedLocation savedlocation, boolean flag)
    {
        locationOfEvent = (SavedLocation)Preconditions.checkNotNull(savedlocation);
        allowBrandedBackground = flag;
    }

    public SavedLocation getLocationOfEvent()
    {
        return locationOfEvent;
    }

    public boolean isAllowBrandedBackground()
    {
        return allowBrandedBackground;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AdRefreshEvent{locationOfEvent=").append(locationOfEvent).append(", allowBrandedBackground=").append(allowBrandedBackground).append('}').toString();
    }
}
