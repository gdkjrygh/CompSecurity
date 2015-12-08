// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.a.m;
import com.google.android.gms.maps.a.p;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.f;

public final class l
{

    private final p a;

    l(p p1)
    {
        a = p1;
    }

    public Point a(LatLng latlng)
    {
        try
        {
            latlng = (Point)m.a(a.a(latlng));
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new f(latlng);
        }
        return latlng;
    }

    public LatLng a(Point point)
    {
        try
        {
            point = a.a(m.a(point));
        }
        // Misplaced declaration of an exception variable
        catch (Point point)
        {
            throw new f(point);
        }
        return point;
    }
}
