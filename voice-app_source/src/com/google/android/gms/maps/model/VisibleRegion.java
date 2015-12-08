// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzo, LatLng, LatLngBounds

public final class VisibleRegion
    implements SafeParcelable
{

    public static final zzo CREATOR = new zzo();
    public final LatLng farLeft;
    public final LatLng farRight;
    public final LatLngBounds latLngBounds;
    public final LatLng nearLeft;
    public final LatLng nearRight;
    private final int zzCY;

    VisibleRegion(int i, LatLng latlng, LatLng latlng1, LatLng latlng2, LatLng latlng3, LatLngBounds latlngbounds)
    {
        zzCY = i;
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

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
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

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            nearLeft, nearRight, farLeft, farRight, latLngBounds
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("nearLeft", nearLeft).zzg("nearRight", nearRight).zzg("farLeft", farLeft).zzg("farRight", farRight).zzg("latLngBounds", latLngBounds).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzo.zza(this, parcel, i);
    }

}
