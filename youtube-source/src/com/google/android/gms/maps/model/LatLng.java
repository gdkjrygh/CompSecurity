// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.a.bo;

// Referenced classes of package com.google.android.gms.maps.model:
//            i

public final class LatLng
    implements SafeParcelable
{

    public static final i CREATOR = new i();
    private final int jE;
    public final double latitude;
    public final double longitude;

    public LatLng(double d, double d1)
    {
        this(1, d, d1);
    }

    LatLng(int j, double d, double d1)
    {
        jE = j;
        if (-180D <= d1 && d1 < 180D)
        {
            longitude = d1;
        } else
        {
            longitude = ((d1 - 180D) % 360D + 360D) % 360D - 180D;
        }
        latitude = Math.max(-90D, Math.min(90D, d));
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
            if (Double.doubleToLongBits(latitude) != Double.doubleToLongBits(((LatLng) (obj)).latitude) || Double.doubleToLongBits(longitude) != Double.doubleToLongBits(((LatLng) (obj)).longitude))
            {
                return false;
            }
        }
        return true;
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final int hashCode()
    {
        long l = Double.doubleToLongBits(latitude);
        int j = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(longitude);
        return (j + 31) * 31 + (int)(l ^ l >>> 32);
    }

    public final String toString()
    {
        return (new StringBuilder("lat/lng: (")).append(latitude).append(",").append(longitude).append(")").toString();
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        if (bo.a())
        {
            j = b.a(parcel);
            b.a(parcel, 1, getVersionCode());
            b.a(parcel, 2, latitude);
            b.a(parcel, 3, longitude);
            b.a(parcel, j);
            return;
        } else
        {
            i.a(this, parcel);
            return;
        }
    }

}
