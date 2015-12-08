// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            hp, hk, ge, gf

public final class hm
    implements SafeParcelable
{

    public static final hp CREATOR = new hp();
    private final LocationRequest CU;
    private final hk CV;
    final int jE;

    public hm(int i, LocationRequest locationrequest, hk hk1)
    {
        jE = i;
        CU = locationrequest;
        CV = hk1;
    }

    public final LocationRequest dO()
    {
        return CU;
    }

    public final hk dP()
    {
        return CV;
    }

    public final int describeContents()
    {
        hp hp1 = CREATOR;
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof hm))
            {
                return false;
            }
            obj = (hm)obj;
            if (!CU.equals(((hm) (obj)).CU) || !CV.equals(((hm) (obj)).CV))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            CU, CV
        });
    }

    public final String toString()
    {
        return ge.a(this).a("locationRequest", CU).a("filter", CV).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        hp hp1 = CREATOR;
        hp.a(this, parcel, i);
    }

}
