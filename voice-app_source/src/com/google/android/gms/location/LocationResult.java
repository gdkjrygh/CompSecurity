// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            zzf

public final class LocationResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    static final List zzaxZ = Collections.emptyList();
    private final int zzCY;
    private final List zzaya;

    LocationResult(int i, List list)
    {
        zzCY = i;
        zzaya = list;
    }

    public static LocationResult create(List list)
    {
        List list1 = list;
        if (list == null)
        {
            list1 = zzaxZ;
        }
        return new LocationResult(2, list1);
    }

    public static LocationResult extractResult(Intent intent)
    {
        if (!hasResult(intent))
        {
            return null;
        } else
        {
            return (LocationResult)intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
        }
    }

    public static boolean hasResult(Intent intent)
    {
        if (intent == null)
        {
            return false;
        } else
        {
            return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof LocationResult))
        {
            return false;
        }
        obj = (LocationResult)obj;
        if (((LocationResult) (obj)).zzaya.size() != zzaya.size())
        {
            return false;
        }
        obj = ((LocationResult) (obj)).zzaya.iterator();
        Iterator iterator = zzaya.iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            Location location = (Location)iterator.next();
            Location location1 = (Location)((Iterator) (obj)).next();
            if (location.getTime() != location1.getTime())
            {
                return false;
            }
        }
        return true;
    }

    public Location getLastLocation()
    {
        int i = zzaya.size();
        if (i == 0)
        {
            return null;
        } else
        {
            return (Location)zzaya.get(i - 1);
        }
    }

    public List getLocations()
    {
        return zzaya;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        Iterator iterator = zzaya.iterator();
        int i;
        long l;
        for (i = 17; iterator.hasNext(); i = (int)(l ^ l >>> 32) + i * 31)
        {
            l = ((Location)iterator.next()).getTime();
        }

        return i;
    }

    public String toString()
    {
        return (new StringBuilder()).append("LocationResult[locations: ").append(zzaya).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

}
