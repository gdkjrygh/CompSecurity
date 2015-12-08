// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.ar;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            d

public class PlaceUserData
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    final int a;
    private final String b;
    private final String c;
    private final List d;
    private final List e;
    private final List f;

    PlaceUserData(int i, String s, String s1, List list, List list1, List list2)
    {
        a = i;
        b = s;
        c = s1;
        d = list;
        e = list1;
        f = list2;
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public List c()
    {
        return e;
    }

    public List d()
    {
        return f;
    }

    public int describeContents()
    {
        d d1 = CREATOR;
        return 0;
    }

    public List e()
    {
        return d;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceUserData))
            {
                return false;
            }
            obj = (PlaceUserData)obj;
            if (!b.equals(((PlaceUserData) (obj)).b) || !c.equals(((PlaceUserData) (obj)).c) || !d.equals(((PlaceUserData) (obj)).d) || !e.equals(((PlaceUserData) (obj)).e) || !f.equals(((PlaceUserData) (obj)).f))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ar.a(new Object[] {
            b, c, d, e, f
        });
    }

    public String toString()
    {
        return ar.a(this).a("accountName", b).a("placeId", c).a("testDataImpls", d).a("placeAliases", e).a("hereContents", f).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d d1 = CREATOR;
        com.google.android.gms.location.places.personalized.d.a(this, parcel, i);
    }

}
