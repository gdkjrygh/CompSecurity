// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.mpay;

import android.location.Location;

public class PilotRegion
{

    public final Location mLocation;
    public final int mRadius;

    public PilotRegion(Location location, int i)
    {
        mLocation = location;
        mRadius = i;
    }
}
