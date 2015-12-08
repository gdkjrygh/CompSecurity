// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.ar;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            d

public final class PlaceLocalization
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;

    public PlaceLocalization(int i, String s, String s1, String s2, String s3, List list)
    {
        a = i;
        b = s;
        c = s1;
        d = s2;
        e = s3;
        f = list;
    }

    public int describeContents()
    {
        d d1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceLocalization))
            {
                return false;
            }
            obj = (PlaceLocalization)obj;
            if (!ar.a(b, ((PlaceLocalization) (obj)).b) || !ar.a(c, ((PlaceLocalization) (obj)).c) || !ar.a(d, ((PlaceLocalization) (obj)).d) || !ar.a(e, ((PlaceLocalization) (obj)).e) || !ar.a(f, ((PlaceLocalization) (obj)).f))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ar.a(new Object[] {
            b, c, d, e
        });
    }

    public String toString()
    {
        return ar.a(this).a("name", b).a("address", c).a("internationalPhoneNumber", d).a("regularOpenHours", e).a("attributions", f).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d d1 = CREATOR;
        com.google.android.gms.location.places.internal.d.a(this, parcel, i);
    }

}
