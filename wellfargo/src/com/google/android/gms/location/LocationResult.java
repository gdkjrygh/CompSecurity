// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            u

public final class LocationResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new u();
    static final List a = Collections.emptyList();
    private final int b;
    private final List c;

    LocationResult(int i, List list)
    {
        b = i;
        c = list;
    }

    public List a()
    {
        return c;
    }

    int b()
    {
        return b;
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
        if (((LocationResult) (obj)).c.size() != c.size())
        {
            return false;
        }
        obj = ((LocationResult) (obj)).c.iterator();
        Iterator iterator = c.iterator();
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

    public int hashCode()
    {
        Iterator iterator = c.iterator();
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
        return (new StringBuilder()).append("LocationResult[locations: ").append(c).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        u.a(this, parcel, i);
    }

}
