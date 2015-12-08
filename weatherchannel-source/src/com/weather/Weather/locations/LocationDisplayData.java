// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.locations;

import com.google.common.base.Preconditions;
import java.util.Arrays;

// Referenced classes of package com.weather.Weather.locations:
//            LocationDisplayItem

public class LocationDisplayData
{
    public static class Builder
    {

        private LocationDisplayItem followMe;
        private LocationDisplayItem list[];

        public LocationDisplayData build()
        {
            return new LocationDisplayData(list, followMe, null);
        }

        public Builder setFollowMe(LocationDisplayItem locationdisplayitem)
        {
            followMe = locationdisplayitem;
            return this;
        }

        public Builder setItem(int i, LocationDisplayItem locationdisplayitem)
        {
            Preconditions.checkNotNull(locationdisplayitem);
            Preconditions.checkPositionIndex(i, list.length);
            list[i] = locationdisplayitem;
            return this;
        }

        public Builder(int i)
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


    private final LocationDisplayItem followMe;
    private final LocationDisplayItem list[];

    private LocationDisplayData(LocationDisplayItem alocationdisplayitem[], LocationDisplayItem locationdisplayitem)
    {
        list = alocationdisplayitem;
        followMe = locationdisplayitem;
    }

    LocationDisplayData(LocationDisplayItem alocationdisplayitem[], LocationDisplayItem locationdisplayitem, _cls1 _pcls1)
    {
        this(alocationdisplayitem, locationdisplayitem);
    }

    public static Builder builder(int i)
    {
        return new Builder(i);
    }

    public int getCount()
    {
        return list.length;
    }

    public LocationDisplayItem getFollowMe()
    {
        return followMe;
    }

    public LocationDisplayItem getItem(int i)
    {
        return list[i];
    }

    public String toString()
    {
        return (new StringBuilder()).append("list:").append(Arrays.toString(list)).append(", FM:").append(followMe).toString();
    }
}
