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
//            a

public class AutocompletePredictionEntity
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int a;
    final String b;
    final String c;
    final List d;
    final List e;
    final int f;

    AutocompletePredictionEntity(int i, String s, String s1, List list, List list1, int j)
    {
        a = i;
        b = s;
        c = s1;
        d = list;
        e = list1;
        f = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof AutocompletePredictionEntity))
            {
                return false;
            }
            obj = (AutocompletePredictionEntity)obj;
            if (!ar.a(b, ((AutocompletePredictionEntity) (obj)).b) || !ar.a(c, ((AutocompletePredictionEntity) (obj)).c) || !ar.a(d, ((AutocompletePredictionEntity) (obj)).d) || !ar.a(e, ((AutocompletePredictionEntity) (obj)).e) || !ar.a(Integer.valueOf(f), Integer.valueOf(((AutocompletePredictionEntity) (obj)).f)))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ar.a(new Object[] {
            b, c, d, e, Integer.valueOf(f)
        });
    }

    public String toString()
    {
        return ar.a(this).a("description", b).a("placeId", c).a("placeTypes", d).a("substrings", e).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.places.internal.a.a(this, parcel, i);
    }

}
