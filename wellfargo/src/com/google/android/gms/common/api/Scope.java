// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Parcel;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.api:
//            bk

public final class Scope
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bk();
    final int a;
    private final String b;

    Scope(int i, String s)
    {
        au.a(s, "scopeUri must not be null or empty");
        a = i;
        b = s;
    }

    public Scope(String s)
    {
        this(1, s);
    }

    public String a()
    {
        return b;
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
        if (!(obj instanceof Scope))
        {
            return false;
        } else
        {
            return b.equals(((Scope)obj).b);
        }
    }

    public int hashCode()
    {
        return b.hashCode();
    }

    public String toString()
    {
        return b;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        bk.a(this, parcel, i);
    }

}
