// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            cn, cm, cz, ac, 
//            aa

public final class ce
    implements SafeParcelable
{

    public static final cn CREATOR = new cn();
    public final String adUnitId;
    public final ApplicationInfo applicationInfo;
    public final cz en;
    public final ac eq;
    public final Bundle ht;
    public final aa hu;
    public final PackageInfo hv;
    public final String hw;
    public final String hx;
    public final String hy;
    public final int versionCode;

    ce(int i, Bundle bundle, aa aa, ac ac, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, 
            String s1, String s2, String s3, cz cz)
    {
        versionCode = i;
        ht = bundle;
        hu = aa;
        eq = ac;
        adUnitId = s;
        applicationInfo = applicationinfo;
        hv = packageinfo;
        hw = s1;
        hx = s2;
        hy = s3;
        en = cz;
    }

    public ce(Bundle bundle, aa aa, ac ac, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, String s3, cz cz)
    {
        this(1, bundle, aa, ac, s, applicationinfo, packageinfo, s1, s2, s3, cz);
    }

    public ce(cm cm1, String s)
    {
        this(cm1.a, cm1.b, cm1.c, cm1.d, cm1.e, cm1.f, s, cm1.g, cm1.h, cm1.i);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        cn.a(this, parcel, i);
    }

}
