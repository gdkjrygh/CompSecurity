// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.locations;


// Referenced classes of package com.weather.commons.locations:
//            LocationManager

static final class isFollowMe
{

    final boolean isFollowMe;
    final String keyTypeCountry;

    public String toString()
    {
        return (new StringBuilder()).append("PersistedLocation{keyTypeCountry='").append(keyTypeCountry).append('\'').append(", isFollowMe=").append(isFollowMe).append('}').toString();
    }

    (String s, boolean flag)
    {
        y(s);
        keyTypeCountry = s;
        isFollowMe = flag;
    }
}
