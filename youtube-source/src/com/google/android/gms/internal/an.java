// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.ads.search.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            n

public final class an
    implements SafeParcelable
{

    public static final n CREATOR = new n();
    public final int backgroundColor;
    public final int fd;
    public final int fe;
    public final int ff;
    public final int fg;
    public final int fh;
    public final int fi;
    public final int fj;
    public final String fk;
    public final int fl;
    public final String fm;
    public final int fn;
    public final int fo;
    public final String fp;
    public final int versionCode;

    an(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, String s, int j2, String s1, int k2, int l2, 
            String s2)
    {
        versionCode = i;
        fd = j;
        backgroundColor = k;
        fe = l;
        ff = i1;
        fg = j1;
        fh = k1;
        fi = l1;
        fj = i2;
        fk = s;
        fl = j2;
        fm = s1;
        fn = k2;
        fo = l2;
        fp = s2;
    }

    public an(a a1)
    {
        versionCode = 1;
        fd = a1.a();
        backgroundColor = a1.b();
        fe = a1.c();
        ff = a1.d();
        fg = a1.e();
        fh = a1.f();
        fi = a1.g();
        fj = a1.h();
        fk = a1.i();
        fl = a1.j();
        fm = a1.k();
        fn = a1.l();
        fo = a1.m();
        fp = a1.n();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.internal.n.a(this, parcel);
    }

}
