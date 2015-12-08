// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            aa, ac, cz, ce

public final class cn
    implements android.os.Parcelable.Creator
{

    public cn()
    {
    }

    public static ce a(Parcel parcel)
    {
        cz cz1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        PackageInfo packageinfo = null;
        ApplicationInfo applicationinfo = null;
        String s3 = null;
        ac ac1 = null;
        aa aa1 = null;
        android.os.Bundle bundle = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    aa1 = (aa)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, aa.CREATOR);
                    break;

                case 4: // '\004'
                    ac1 = (ac)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ac.CREATOR);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 6: // '\006'
                    applicationinfo = (ApplicationInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ApplicationInfo.CREATOR);
                    break;

                case 7: // '\007'
                    packageinfo = (PackageInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, PackageInfo.CREATOR);
                    break;

                case 8: // '\b'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 9: // '\t'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 10: // '\n'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 11: // '\013'
                    cz1 = (cz)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, cz.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ce(i, bundle, aa1, ac1, s3, applicationinfo, packageinfo, s2, s1, s, cz1);
            }
        } while (true);
    }

    static void a(ce ce1, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, ce1.versionCode);
        b.a(parcel, 2, ce1.ht, false);
        b.a(parcel, 3, ce1.hu, i, false);
        b.a(parcel, 4, ce1.eq, i, false);
        b.a(parcel, 5, ce1.adUnitId, false);
        b.a(parcel, 6, ce1.applicationInfo, i, false);
        b.a(parcel, 7, ce1.hv, i, false);
        b.a(parcel, 8, ce1.hw, false);
        b.a(parcel, 9, ce1.hx, false);
        b.a(parcel, 10, ce1.hy, false);
        b.a(parcel, 11, ce1.en, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new ce[i];
    }
}
