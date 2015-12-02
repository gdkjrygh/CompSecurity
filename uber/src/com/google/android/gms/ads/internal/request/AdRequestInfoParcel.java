// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;
import nd;
import np;

public final class AdRequestInfoParcel
    implements SafeParcelable
{

    public static final np CREATOR = new np();
    public final List A;
    public final int a;
    public final Bundle b;
    public final AdRequestParcel c;
    public final AdSizeParcel d;
    public final String e;
    public final ApplicationInfo f;
    public final PackageInfo g;
    public final String h;
    public final String i;
    public final String j;
    public final VersionInfoParcel k;
    public final Bundle l;
    public final int m;
    public final List n;
    public final Bundle o;
    public final boolean p;
    public final Messenger q;
    public final int r;
    public final int s;
    public final float t;
    public final String u;
    public final boolean v;
    public final int w;
    public final String x;
    public final long y;
    public final String z;

    public AdRequestInfoParcel(int i1, Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s1, ApplicationInfo applicationinfo, PackageInfo packageinfo, 
            String s2, String s3, String s4, VersionInfoParcel versioninfoparcel, Bundle bundle1, int j1, List list, 
            Bundle bundle2, boolean flag, Messenger messenger, int k1, int l1, float f1, String s5, 
            boolean flag1, int i2, String s6, long l2, String s7, List list1)
    {
        a = i1;
        b = bundle;
        c = adrequestparcel;
        d = adsizeparcel;
        e = s1;
        f = applicationinfo;
        g = packageinfo;
        h = s2;
        i = s3;
        j = s4;
        k = versioninfoparcel;
        l = bundle1;
        m = j1;
        n = list;
        o = bundle2;
        p = flag;
        q = messenger;
        r = k1;
        s = l1;
        t = f1;
        u = s5;
        v = flag1;
        w = i2;
        x = s6;
        y = l2;
        z = s7;
        if (list1 == null)
        {
            bundle = Collections.emptyList();
        } else
        {
            bundle = Collections.unmodifiableList(list1);
        }
        A = bundle;
    }

    private AdRequestInfoParcel(Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s1, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s2, 
            String s3, String s4, VersionInfoParcel versioninfoparcel, Bundle bundle1, int i1, List list, Bundle bundle2, 
            boolean flag, Messenger messenger, int j1, int k1, float f1, String s5, boolean flag1, 
            int l1, String s6, long l2, String s7, List list1)
    {
        this(9, bundle, adrequestparcel, adsizeparcel, s1, applicationinfo, packageinfo, s2, s3, s4, versioninfoparcel, bundle1, i1, list, bundle2, flag, messenger, j1, k1, f1, s5, flag1, l1, s6, l2, s7, list1);
    }

    public AdRequestInfoParcel(nd nd1, String s1, String s2)
    {
        this(nd1.a, nd1.b, nd1.c, nd1.d, nd1.e, nd1.f, s1, nd1.g, nd1.h, nd1.j, nd1.i, nd1.k, nd1.l, nd1.m, nd1.n, nd1.o, nd1.p, nd1.q, nd1.r, nd1.s, nd1.t, nd1.u, s2, nd1.v, nd1.w, nd1.x);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        np.a(this, parcel, i1);
    }

}
