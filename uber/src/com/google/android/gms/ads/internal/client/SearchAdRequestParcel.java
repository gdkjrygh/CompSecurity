// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import mb;
import pd;

public final class SearchAdRequestParcel
    implements SafeParcelable
{

    public static final mb CREATOR = new mb();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final int k;
    public final String l;
    public final int m;
    public final int n;
    public final String o;

    public SearchAdRequestParcel(int i1, int j1, int k1, int l1, int i2, int j2, int k2, 
            int l2, int i3, String s, int j3, String s1, int k3, int l3, 
            String s2)
    {
        a = i1;
        b = j1;
        c = k1;
        d = l1;
        e = i2;
        f = j2;
        g = k2;
        h = l2;
        i = i3;
        j = s;
        k = j3;
        l = s1;
        m = k3;
        n = l3;
        o = s2;
    }

    public SearchAdRequestParcel(pd pd1)
    {
        a = 1;
        b = pd1.a();
        c = pd1.b();
        d = pd1.c();
        e = pd1.d();
        f = pd1.e();
        g = pd1.f();
        h = pd1.g();
        i = pd1.h();
        j = pd1.i();
        k = pd1.j();
        l = pd1.k();
        m = pd1.l();
        n = pd1.m();
        o = pd1.n();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        mb.a(this, parcel);
    }

}
