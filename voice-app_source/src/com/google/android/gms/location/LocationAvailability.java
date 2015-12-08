// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.location:
//            LocationAvailabilityCreator

public final class LocationAvailability
    implements SafeParcelable
{

    public static final LocationAvailabilityCreator CREATOR = new LocationAvailabilityCreator();
    private final int zzCY;
    int zzaxQ;
    int zzaxR;
    long zzaxS;
    int zzaxT;

    LocationAvailability(int i, int j, int k, int l, long l1)
    {
        zzCY = i;
        zzaxT = j;
        zzaxQ = k;
        zzaxR = l;
        zzaxS = l1;
    }

    public static LocationAvailability extractLocationAvailability(Intent intent)
    {
        if (!hasLocationAvailability(intent))
        {
            return null;
        } else
        {
            return (LocationAvailability)intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        }
    }

    public static boolean hasLocationAvailability(Intent intent)
    {
        if (intent == null)
        {
            return false;
        } else
        {
            return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof LocationAvailability)
        {
            if (zzaxT == ((LocationAvailability) (obj = (LocationAvailability)obj)).zzaxT && zzaxQ == ((LocationAvailability) (obj)).zzaxQ && zzaxR == ((LocationAvailability) (obj)).zzaxR && zzaxS == ((LocationAvailability) (obj)).zzaxS)
            {
                return true;
            }
        }
        return false;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Integer.valueOf(zzaxT), Integer.valueOf(zzaxQ), Integer.valueOf(zzaxR), Long.valueOf(zzaxS)
        });
    }

    public boolean isLocationAvailable()
    {
        return zzaxT < 1000;
    }

    public String toString()
    {
        return (new StringBuilder()).append("LocationAvailability[isLocationAvailable: ").append(isLocationAvailable()).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LocationAvailabilityCreator.zza(this, parcel, i);
    }

}
