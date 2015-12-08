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
//            b

public class HereContent
    implements SafeParcelable
{

    public static final b CREATOR = new b();
    final int a;
    private final String b;
    private final List c;

    HereContent(int i, String s, List list)
    {
        a = i;
        b = s;
        c = list;
    }

    public String a()
    {
        return b;
    }

    public List b()
    {
        return c;
    }

    public int describeContents()
    {
        b b1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof HereContent))
            {
                return false;
            }
            obj = (HereContent)obj;
            if (!ar.a(b, ((HereContent) (obj)).b) || !ar.a(c, ((HereContent) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ar.a(new Object[] {
            b, c
        });
    }

    public String toString()
    {
        return ar.a(this).a("data", b).a("actions", c).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b b1 = CREATOR;
        com.google.android.gms.location.places.personalized.b.a(this, parcel, i);
    }

}
