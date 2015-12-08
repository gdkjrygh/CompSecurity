// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.gf;
import com.google.android.gms.maps.a.bo;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            r, LatLng, LatLngBounds

public final class VisibleRegion
    implements SafeParcelable
{

    public static final r CREATOR = new r();
    public final LatLng farLeft;
    public final LatLng farRight;
    private final int jE;
    public final LatLngBounds latLngBounds;
    public final LatLng nearLeft;
    public final LatLng nearRight;

    VisibleRegion(int i, LatLng latlng, LatLng latlng1, LatLng latlng2, LatLng latlng3, LatLngBounds latlngbounds)
    {
        jE = i;
        nearLeft = latlng;
        nearRight = latlng1;
        farLeft = latlng2;
        farRight = latlng3;
        latLngBounds = latlngbounds;
    }

    public VisibleRegion(LatLng latlng, LatLng latlng1, LatLng latlng2, LatLng latlng3, LatLngBounds latlngbounds)
    {
        this(1, latlng, latlng1, latlng2, latlng3, latlngbounds);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof VisibleRegion))
            {
                return false;
            }
            obj = (VisibleRegion)obj;
            if (!nearLeft.equals(((VisibleRegion) (obj)).nearLeft) || !nearRight.equals(((VisibleRegion) (obj)).nearRight) || !farLeft.equals(((VisibleRegion) (obj)).farLeft) || !farRight.equals(((VisibleRegion) (obj)).farRight) || !latLngBounds.equals(((VisibleRegion) (obj)).latLngBounds))
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
        return Arrays.hashCode(new Object[] {
            nearLeft, nearRight, farLeft, farRight, latLngBounds
        });
    }

    public final String toString()
    {
        return ge.a(this).a("nearLeft", nearLeft).a("nearRight", nearRight).a("farLeft", farLeft).a("farRight", farRight).a("latLngBounds", latLngBounds).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (bo.a())
        {
            int j = b.a(parcel);
            b.a(parcel, 1, getVersionCode());
            b.a(parcel, 2, nearLeft, i, false);
            b.a(parcel, 3, nearRight, i, false);
            b.a(parcel, 4, farLeft, i, false);
            b.a(parcel, 5, farRight, i, false);
            b.a(parcel, 6, latLngBounds, i, false);
            b.a(parcel, j);
            return;
        } else
        {
            r.a(this, parcel, i);
            return;
        }
    }

}
