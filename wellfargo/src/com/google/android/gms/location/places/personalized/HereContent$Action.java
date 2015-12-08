// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.ar;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            a

public final class c
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    final int a;
    private final String b;
    private final String c;

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public int describeContents()
    {
        a a1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof CREATOR))
            {
                return false;
            }
            obj = (CREATOR)obj;
            if (!ar.a(b, ((b) (obj)).b) || !ar.a(c, ((c) (obj)).c))
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
        return ar.a(this).a("title", b).a("uri", c).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a a1 = CREATOR;
        com.google.android.gms.location.places.personalized.a.a(this, parcel, i);
    }


    (int i, String s, String s1)
    {
        a = i;
        b = s;
        c = s1;
    }
}
