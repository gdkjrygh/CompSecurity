// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

// Referenced classes of package com.google.android.gms.location:
//            LocationAvailabilityCreator

public final class LocationAvailability
    implements SafeParcelable
{

    public static final LocationAvailabilityCreator CREATOR = new LocationAvailabilityCreator();
    private final int mVersionCode;
    int zzaBS;
    int zzaBT;
    long zzaBU;
    int zzaBV;

    LocationAvailability(int i, int j, int k, int l, long l1)
    {
        mVersionCode = i;
        zzaBV = j;
        zzaBS = k;
        zzaBT = l;
        zzaBU = l1;
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
            if (zzaBV == ((LocationAvailability) (obj = (LocationAvailability)obj)).zzaBV && zzaBS == ((LocationAvailability) (obj)).zzaBS && zzaBT == ((LocationAvailability) (obj)).zzaBT && zzaBU == ((LocationAvailability) (obj)).zzaBU)
            {
                return true;
            }
        }
        return false;
    }

    int getVersionCode()
    {
        return mVersionCode;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Integer.valueOf(zzaBV), Integer.valueOf(zzaBS), Integer.valueOf(zzaBT), Long.valueOf(zzaBU)
        });
    }

    public boolean isLocationAvailable()
    {
        return zzaBV < 1000;
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
