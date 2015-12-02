// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import og;

public final class VersionInfoParcel
    implements SafeParcelable
{

    public static final og CREATOR = new og();
    public final int a;
    public String b;
    public int c;
    public int d;
    public boolean e;

    public VersionInfoParcel()
    {
        this(1, "afma-sdk-a-v7327000.7327000.0", 0x6fcd18, 0x6fcd18, true);
    }

    public VersionInfoParcel(int i, String s, int j, int k, boolean flag)
    {
        a = i;
        b = s;
        c = j;
        d = k;
        e = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        og.a(this, parcel);
    }

}
