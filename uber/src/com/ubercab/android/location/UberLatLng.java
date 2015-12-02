// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

public final class UberLatLng
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private static final double a = Math.pow(10D, 6D);
    private final double b;
    private final double c;
    private final int d;

    public UberLatLng(double d1, double d2)
    {
        this(d1, d2, 0);
    }

    public UberLatLng(double d1, double d2, int i)
    {
        b = d1;
        c = d2;
        d = i;
    }

    public UberLatLng(Parcel parcel)
    {
        b = parcel.readDouble();
        c = parcel.readDouble();
        d = parcel.readInt();
    }

    private static double a(double d1, double d2)
    {
        return -100D + 2D * d1 + 3D * d2 + 0.20000000000000001D * d2 * d2 + 0.10000000000000001D * d1 * d2 + 0.20000000000000001D * Math.sqrt(Math.abs(d1)) + ((20D * Math.sin(6D * d1 * 3.1415926535897931D) + 20D * Math.sin(2D * d1 * 3.1415926535897931D)) * 2D) / 3D + ((20D * Math.sin(3.1415926535897931D * d2) + 40D * Math.sin((d2 / 3D) * 3.1415926535897931D)) * 2D) / 3D + ((160D * Math.sin((d2 / 12D) * 3.1415926535897931D) + 320D * Math.sin((3.1415926535897931D * d2) / 30D)) * 2D) / 3D;
    }

    public static double a(UberLatLng uberlatlng, UberLatLng uberlatlng1)
    {
        uberlatlng = uberlatlng.d();
        uberlatlng1 = uberlatlng1.d();
        float af[] = new float[1];
        Location.distanceBetween(uberlatlng.a(), uberlatlng.b(), uberlatlng1.a(), uberlatlng1.b(), af);
        return (double)af[0];
    }

    private static double b(double d1, double d2)
    {
        return 300D + d1 + 2D * d2 + 0.10000000000000001D * d1 * d1 + 0.10000000000000001D * d1 * d2 + 0.10000000000000001D * Math.sqrt(Math.abs(d1)) + ((20D * Math.sin(6D * d1 * 3.1415926535897931D) + 20D * Math.sin(2D * d1 * 3.1415926535897931D)) * 2D) / 3D + ((20D * Math.sin(3.1415926535897931D * d1) + 40D * Math.sin((d1 / 3D) * 3.1415926535897931D)) * 2D) / 3D + ((150D * Math.sin((d1 / 12D) * 3.1415926535897931D) + 300D * Math.sin((d1 / 30D) * 3.1415926535897931D)) * 2D) / 3D;
    }

    private static UberLatLng c(UberLatLng uberlatlng)
    {
        UberLatLng uberlatlng1 = d(uberlatlng);
        double d1 = uberlatlng1.a();
        double d2 = uberlatlng.a();
        double d3 = uberlatlng1.b();
        double d4 = uberlatlng.b();
        return new UberLatLng(uberlatlng.a() - (d1 - d2), uberlatlng.b() - (d3 - d4), 0);
    }

    private static UberLatLng d(UberLatLng uberlatlng)
    {
        double d1 = Math.toRadians(uberlatlng.a());
        double d2 = 1.0D - 0.0066934216229659433D * Math.sin(d1) * Math.sin(d1);
        double d3 = Math.sqrt(d2);
        d2 = (a(uberlatlng.b() - 105D, uberlatlng.a() - 35D) * 180D) / ((6335552.7170004258D / (d2 * d3)) * 3.1415926535897931D);
        double d4 = b(uberlatlng.b() - 105D, uberlatlng.a() - 35D);
        d3 = 6378245D / d3;
        d1 = (d4 * 180D) / (Math.cos(d1) * d3 * 3.1415926535897931D);
        return new UberLatLng(d2 + uberlatlng.a(), d1 + uberlatlng.b(), 1);
    }

    private static UberLatLng e(UberLatLng uberlatlng)
    {
        double d2 = uberlatlng.b() - 0.0064999999999999997D;
        double d3 = uberlatlng.a() - 0.0060000000000000001D;
        double d1 = Math.sqrt(d2 * d2 + d3 * d3) - 2.0000000000000002E-05D * Math.sin(d3 * 52.359877559829883D);
        d2 = Math.atan2(d3, d2) - Math.cos(d2 * 52.359877559829883D) * 3.0000000000000001E-06D;
        d3 = Math.cos(d2);
        return new UberLatLng(d1 * Math.sin(d2), d1 * d3, 1);
    }

    private static UberLatLng f(UberLatLng uberlatlng)
    {
        double d2 = uberlatlng.b();
        double d3 = uberlatlng.a();
        double d1 = Math.sqrt(d2 * d2 + d3 * d3);
        d1 = 2.0000000000000002E-05D * Math.sin(d3 * 52.359877559829883D) + d1;
        d3 = Math.atan2(d3, d2);
        d2 = Math.cos(d2 * 52.359877559829883D) * 3.0000000000000001E-06D + d3;
        d3 = Math.cos(d2);
        return new UberLatLng(0.0060000000000000001D + Math.sin(d2) * d1, 0.0064999999999999997D + d3 * d1, 2);
    }

    public final double a()
    {
        return b;
    }

    public final boolean a(UberLatLng uberlatlng)
    {
        if (uberlatlng != null)
        {
            if (equals(uberlatlng))
            {
                return true;
            }
            double d1 = (double)Math.round(a() * a) / a;
            double d2 = (double)Math.round(uberlatlng.a() * a) / a;
            double d3 = (double)Math.round(b() * a) / a;
            double d4 = (double)Math.round(uberlatlng.b() * a) / a;
            if (d1 == d2 && d3 == d4)
            {
                return true;
            }
        }
        return false;
    }

    public final double b()
    {
        return c;
    }

    public final boolean b(UberLatLng uberlatlng)
    {
        while (uberlatlng == null || a(this, uberlatlng) >= 1.0D) 
        {
            return false;
        }
        return true;
    }

    public final int c()
    {
        return d;
    }

    public final UberLatLng d()
    {
        switch (d)
        {
        default:
            throw new RuntimeException("Conversion doesn't exist for projections.");

        case 0: // '\0'
            return new UberLatLng(b, c, d);

        case 1: // '\001'
            return c(this);

        case 2: // '\002'
            return c(e(this));
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final UberLatLng e()
    {
        switch (d)
        {
        default:
            throw new RuntimeException("Conversion doesn't exist for projections.");

        case 2: // '\002'
            return new UberLatLng(b, c, d);

        case 0: // '\0'
            return f(d(this));

        case 1: // '\001'
            return f(this);
        }
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (UberLatLng)obj;
            if (Double.compare(((UberLatLng) (obj)).a(), b) != 0)
            {
                return false;
            }
            if (Double.compare(((UberLatLng) (obj)).b(), c) != 0)
            {
                return false;
            }
            if (d != ((UberLatLng) (obj)).c())
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        long l = Double.doubleToLongBits(b);
        int i = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(c);
        return (i * 31 + (int)(l ^ l >>> 32)) * 31 + d;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a()).append(", ").append(b()).append(" [").append(c()).append("]").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeDouble(b);
        parcel.writeDouble(c);
        parcel.writeInt(d);
    }


    /* member class not found */
    class _cls1 {}

}
