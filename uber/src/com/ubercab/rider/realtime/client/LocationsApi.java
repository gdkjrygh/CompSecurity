// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.client;

import ica;

public interface LocationsApi
{

    public abstract ica getPickupVenue(String s);

    public abstract ica getPoolAds(double d, double d1, int i, String s);
}
