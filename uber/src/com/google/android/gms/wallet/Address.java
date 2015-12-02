// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import bja;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class Address
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bja();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public String k;
    private final int l;

    Address()
    {
        l = 1;
    }

    public Address(int i1, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, boolean flag, String s9)
    {
        l = i1;
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        f = s5;
        g = s6;
        h = s7;
        i = s8;
        j = flag;
        k = s9;
    }

    public final int a()
    {
        return l;
    }

    public final String b()
    {
        return e;
    }

    public final String c()
    {
        return h;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        bja.a(this, parcel);
    }

}
