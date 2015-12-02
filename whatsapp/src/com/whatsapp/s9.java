// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.location.Location;
import com.google.android.gms.location.LocationListener;

class s9
    implements LocationListener
{

    private boolean a;
    private float b;
    private long c;
    private android.location.LocationListener d;

    public s9(long l, float f, boolean flag, android.location.LocationListener locationlistener)
    {
        d = locationlistener;
        c = l;
        b = f;
        a = flag;
    }

    static long a(s9 s9_1)
    {
        return s9_1.c;
    }

    static float b(s9 s9_1)
    {
        return s9_1.b;
    }

    static boolean c(s9 s9_1)
    {
        return s9_1.a;
    }

    public void onLocationChanged(Location location)
    {
        d.onLocationChanged(location);
    }
}
