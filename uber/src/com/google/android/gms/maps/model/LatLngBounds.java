// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import azm;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import wl;
import wm;
import wn;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public final class LatLngBounds
    implements SafeParcelable
{

    public static final azm CREATOR = new azm();
    public final LatLng a;
    public final LatLng b;
    private final int c;

    public LatLngBounds(int i, LatLng latlng, LatLng latlng1)
    {
        wn.a(latlng, "null southwest");
        wn.a(latlng1, "null northeast");
        boolean flag;
        if (latlng1.a >= latlng.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        wn.b(flag, "southern latitude exceeds northern latitude (%s > %s)", new Object[] {
            Double.valueOf(latlng.a), Double.valueOf(latlng1.a)
        });
        c = i;
        a = latlng;
        b = latlng1;
    }

    public LatLngBounds(LatLng latlng, LatLng latlng1)
    {
        this(1, latlng, latlng1);
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
            if (!(obj instanceof LatLngBounds))
            {
                return false;
            }
            obj = (LatLngBounds)obj;
            if (!a.equals(((LatLngBounds) (obj)).a) || !b.equals(((LatLngBounds) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return wl.a(new Object[] {
            a, b
        });
    }

    public final String toString()
    {
        return wl.a(this).a("southwest", a).a("northeast", b).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        azm.a(this, parcel, i);
    }

}
