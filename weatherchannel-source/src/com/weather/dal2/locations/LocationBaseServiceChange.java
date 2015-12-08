// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import com.weather.util.AbstractPostable;

// Referenced classes of package com.weather.dal2.locations:
//            SavedLocation

public class LocationBaseServiceChange extends AbstractPostable
{

    private final SavedLocation location;

    public LocationBaseServiceChange(SavedLocation savedlocation)
    {
        location = savedlocation;
    }

    public SavedLocation getLocation()
    {
        return location;
    }
}
