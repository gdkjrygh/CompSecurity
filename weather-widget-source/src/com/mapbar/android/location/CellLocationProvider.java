// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

// Referenced classes of package com.mapbar.android.location:
//            b

public final class CellLocationProvider
{

    public static final int AVAILABLE = 2;
    public static final int OUT_OF_SERVICE = 0;
    public static final int TEMPORARILY_UNAVAILABLE = 1;
    private static CellLocationProvider a;
    private b b;

    public CellLocationProvider(Context context)
    {
        b = com.mapbar.android.location.b.a(context);
    }

    public static CellLocationProvider getInstance(Context context)
    {
        if (a == null)
        {
            a = new CellLocationProvider(context);
        }
        return a;
    }

    public final String addLocationListener(LocationListener locationlistener)
    {
        return b.a(locationlistener);
    }

    public final void clearLocationListener()
    {
        b.o();
    }

    protected final Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }

    public final void disableLocation()
    {
        b.n();
    }

    public final void enableLocation()
    {
        b.m();
    }

    protected final void finalize()
        throws Throwable
    {
        super.finalize();
    }

    public final int getAccuracy()
    {
        b b1 = b;
        return com.mapbar.android.location.b.a();
    }

    public final String getName()
    {
        b b1 = b;
        return com.mapbar.android.location.b.b();
    }

    public final int getPowerRequirement()
    {
        b b1 = b;
        return com.mapbar.android.location.b.c();
    }

    public final int getStatus(Bundle bundle)
    {
        return b.k();
    }

    public final long getStatusUpdateTime()
    {
        return b.l();
    }

    public final boolean hasMonetaryCost()
    {
        b b1 = b;
        return com.mapbar.android.location.b.d();
    }

    public final boolean meetsCriteria(Criteria criteria)
    {
        return b.a(criteria);
    }

    public final boolean removeLocationListener(String s)
    {
        return b.a(s);
    }

    public final boolean requiresCell()
    {
        b b1 = b;
        return com.mapbar.android.location.b.e();
    }

    public final boolean requiresNetwork()
    {
        b b1 = b;
        return com.mapbar.android.location.b.f();
    }

    public final boolean requiresSatellite()
    {
        b b1 = b;
        return com.mapbar.android.location.b.g();
    }

    public final boolean supportsAltitude()
    {
        b b1 = b;
        return com.mapbar.android.location.b.h();
    }

    public final boolean supportsBearing()
    {
        b b1 = b;
        return com.mapbar.android.location.b.i();
    }

    public final boolean supportsSpeed()
    {
        b b1 = b;
        return com.mapbar.android.location.b.j();
    }

    public final void updateLocation(Location location)
    {
        b.a(location);
    }
}
