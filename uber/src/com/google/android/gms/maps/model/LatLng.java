// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import azn;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LatLng
    implements SafeParcelable
{

    public static final azn CREATOR = new azn();
    public final double a;
    public final double b;
    private final int c;

    public LatLng(double d, double d1)
    {
        this(1, d, d1);
    }

    public LatLng(int i, double d, double d1)
    {
        c = i;
        if (-180D <= d1 && d1 < 180D)
        {
            b = d1;
        } else
        {
            b = ((d1 - 180D) % 360D + 360D) % 360D - 180D;
        }
        a = Math.max(-90D, Math.min(90D, d));
    }

    public final int a()
    {
        return c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LatLng))
            {
                return false;
            }
            obj = (LatLng)obj;
            if (Double.doubleToLongBits(a) != Double.doubleToLongBits(((LatLng) (obj)).a) || Double.doubleToLongBits(b) != Double.doubleToLongBits(((LatLng) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        long l = Double.doubleToLongBits(a);
        int i = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(b);
        return (i + 31) * 31 + (int)(l ^ l >>> 32);
    }

    public final String toString()
    {
        return (new StringBuilder("lat/lng: (")).append(a).append(",").append(b).append(")").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        azn.a(this, parcel);
    }

}
