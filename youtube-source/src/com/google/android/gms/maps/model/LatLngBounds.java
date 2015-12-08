// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.gf;
import com.google.android.gms.internal.gi;
import com.google.android.gms.maps.a.bo;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            h, LatLng, g

public final class LatLngBounds
    implements SafeParcelable
{

    public static final h CREATOR = new h();
    private final int jE;
    public final LatLng northeast;
    public final LatLng southwest;

    LatLngBounds(int i, LatLng latlng, LatLng latlng1)
    {
        gi.a(latlng, "null southwest");
        gi.a(latlng1, "null northeast");
        double d1;
        double d2;
        boolean flag;
        if (latlng1.latitude >= latlng.latitude)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d1 = latlng.latitude;
        d2 = latlng1.latitude;
        if (!flag)
        {
            throw new IllegalArgumentException(String.format("southern latitude exceeds northern latitude (%s > %s)", new Object[] {
                Double.valueOf(d1), Double.valueOf(d2)
            }));
        } else
        {
            jE = i;
            southwest = latlng;
            northeast = latlng1;
            return;
        }
    }

    public LatLngBounds(LatLng latlng, LatLng latlng1)
    {
        this(1, latlng, latlng1);
    }

    private static double b(double d1, double d2)
    {
        return ((d1 - d2) + 360D) % 360D;
    }

    public static g builder()
    {
        return new g();
    }

    private static double c(double d1, double d2)
    {
        return ((d2 - d1) + 360D) % 360D;
    }

    private boolean c(double d1)
    {
        return southwest.latitude <= d1 && d1 <= northeast.latitude;
    }

    static double d(double d1, double d2)
    {
        return b(d1, d2);
    }

    private boolean d(double d1)
    {
        if (southwest.longitude > northeast.longitude) goto _L2; else goto _L1
_L1:
        if (southwest.longitude > d1 || d1 > northeast.longitude) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (southwest.longitude > d1 && d1 > northeast.longitude)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    static double e(double d1, double d2)
    {
        return c(d1, d2);
    }

    public final boolean contains(LatLng latlng)
    {
        return c(latlng.latitude) && d(latlng.longitude);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LatLngBounds))
            {
                return false;
            }
            obj = (LatLngBounds)obj;
            if (!southwest.equals(((LatLngBounds) (obj)).southwest) || !northeast.equals(((LatLngBounds) (obj)).northeast))
            {
                return false;
            }
        }
        return true;
    }

    public final LatLng getCenter()
    {
        double d2 = (southwest.latitude + northeast.latitude) / 2D;
        double d1 = northeast.longitude;
        double d3 = southwest.longitude;
        if (d3 <= d1)
        {
            d1 = (d1 + d3) / 2D;
        } else
        {
            d1 = (d1 + 360D + d3) / 2D;
        }
        return new LatLng(d2, d1);
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            southwest, northeast
        });
    }

    public final LatLngBounds including(LatLng latlng)
    {
        double d4 = Math.min(southwest.latitude, latlng.latitude);
        double d5 = Math.max(northeast.latitude, latlng.latitude);
        double d2 = northeast.longitude;
        double d3 = southwest.longitude;
        double d1 = latlng.longitude;
        if (!d(d1))
        {
            if (b(d3, d1) >= c(d2, d1))
            {
                d2 = d1;
                d1 = d3;
            }
        } else
        {
            d1 = d3;
        }
        return new LatLngBounds(new LatLng(d4, d1), new LatLng(d5, d2));
    }

    public final String toString()
    {
        return ge.a(this).a("southwest", southwest).a("northeast", northeast).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (bo.a())
        {
            int j = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
            com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, getVersionCode());
            com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, southwest, i, false);
            com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, northeast, i, false);
            com.google.android.gms.common.internal.safeparcel.b.a(parcel, j);
            return;
        } else
        {
            h.a(this, parcel, i);
            return;
        }
    }

}
