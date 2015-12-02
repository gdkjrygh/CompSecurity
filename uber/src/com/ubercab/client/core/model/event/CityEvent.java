// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.event;

import com.ubercab.client.core.model.City;

public final class CityEvent
{

    private final City mCity;

    public CityEvent(City city)
    {
        mCity = city;
    }

    public final City getCity()
    {
        return mCity;
    }
}
