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
//            zze

public final class LocationResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    static final List zzaCb = Collections.emptyList();
    private final int mVersionCode;
    private final List zzaCc;

    LocationResult(int i, List list)
    {
        mVersionCode = i;
        zzaCc = list;
    }

    public static LocationResult create(List list)
    {
        List list1 = list;
        if (list == null)
        {
            list1 = zzaCb;
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
        if (((LocationResult) (obj)).zzaCc.size() != zzaCc.size())
        {
            return false;
        }
        obj = ((LocationResult) (obj)).zzaCc.iterator();
        Iterator iterator = zzaCc.iterator();
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
        int i = zzaCc.size();
        if (i == 0)
        {
            return null;
        } else
        {
            return (Location)zzaCc.get(i - 1);
        }
    }

    public List getLocations()
    {
        return zzaCc;
    }

    int getVersionCode()
    {
        return mVersionCode;
    }

    public int hashCode()
    {
        Iterator iterator = zzaCc.iterator();
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
        return (new StringBuilder()).append("LocationResult[locations: ").append(zzaCc).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

}
