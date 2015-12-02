// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.network;

import retrofit.Callback;

public interface GuidedPickupApi
{

    public abstract void geocodeRegion(double d, double d1, double d2, Callback callback);

    public abstract void snap(double d, double d1, Callback callback);

    public abstract void snap(String s, double d, double d1, Callback callback);

    public abstract void venues(String s, String s1, Callback callback);

    public abstract void venues(String s, Callback callback);
}
