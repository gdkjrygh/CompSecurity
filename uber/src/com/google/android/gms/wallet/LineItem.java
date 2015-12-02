// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import bhz;
import bji;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LineItem
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bji();
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;
    private final int g;

    LineItem()
    {
        g = 1;
        e = 0;
    }

    public LineItem(int i, String s, String s1, String s2, String s3, int j, String s4)
    {
        g = i;
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = j;
        f = s4;
    }

    public static bhz a()
    {
        LineItem lineitem = new LineItem();
        lineitem.getClass();
        return new bhz(lineitem, (byte)0);
    }

    public final int b()
    {
        return g;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        bji.a(this, parcel);
    }

}
