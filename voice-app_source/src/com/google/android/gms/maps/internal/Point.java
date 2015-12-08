// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzz

public class Point
    implements SafeParcelable
{

    public static final zzz CREATOR = new zzz();
    private final int versionCode;
    private final android.graphics.Point zzaCO;

    public Point(int i, android.graphics.Point point)
    {
        versionCode = i;
        zzaCO = point;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof Point))
        {
            return false;
        } else
        {
            obj = (Point)obj;
            return zzaCO.equals(((Point) (obj)).zzaCO);
        }
    }

    int getVersionCode()
    {
        return versionCode;
    }

    public int hashCode()
    {
        return zzaCO.hashCode();
    }

    public String toString()
    {
        return zzaCO.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzz.zza(this, parcel, i);
    }

    public android.graphics.Point zzvG()
    {
        return zzaCO;
    }

}
