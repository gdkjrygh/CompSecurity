// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.ar;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location.places:
//            k

public class PlaceReport
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    final int a;
    private final String b;
    private final String c;
    private final String d;

    PlaceReport(int i, String s, String s1, String s2)
    {
        a = i;
        b = s;
        c = s1;
        d = s2;
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PlaceReport)
        {
            if (ar.a(b, ((PlaceReport) (obj = (PlaceReport)obj)).b) && ar.a(c, ((PlaceReport) (obj)).c) && ar.a(d, ((PlaceReport) (obj)).d))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return ar.a(new Object[] {
            b, c, d
        });
    }

    public String toString()
    {
        at at1 = ar.a(this);
        at1.a("placeId", b);
        at1.a("tag", c);
        if (!"unknown".equals(d))
        {
            at1.a("source", d);
        }
        return at1.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }

}
