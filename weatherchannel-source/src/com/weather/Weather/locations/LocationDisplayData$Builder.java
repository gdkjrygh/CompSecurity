// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.locations;

import com.google.common.base.Preconditions;

// Referenced classes of package com.weather.Weather.locations:
//            LocationDisplayData, LocationDisplayItem

public static class list
{

    private LocationDisplayItem followMe;
    private LocationDisplayItem list[];

    public LocationDisplayData build()
    {
        return new LocationDisplayData(list, followMe, null);
    }

    public followMe setFollowMe(LocationDisplayItem locationdisplayitem)
    {
        followMe = locationdisplayitem;
        return this;
    }

    public followMe setItem(int i, LocationDisplayItem locationdisplayitem)
    {
        Preconditions.checkNotNull(locationdisplayitem);
        Preconditions.checkPositionIndex(i, list.length);
        list[i] = locationdisplayitem;
        return this;
    }

    public (int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "count must be non-negative");
        list = new LocationDisplayItem[i];
    }
}
