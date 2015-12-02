// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import bjq;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ProxyCard
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bjq();
    public String a;
    public String b;
    public int c;
    public int d;
    private final int e;

    public ProxyCard(int i, String s, String s1, int j, int k)
    {
        e = i;
        a = s;
        b = s1;
        c = j;
        d = k;
    }

    public final int a()
    {
        return e;
    }

    public final String b()
    {
        return a;
    }

    public final String c()
    {
        return b;
    }

    public final int d()
    {
        return c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int e()
    {
        return d;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        bjq.a(this, parcel);
    }

}
