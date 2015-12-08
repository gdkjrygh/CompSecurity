// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            an, aa

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    public static aa a(Parcel parcel)
    {
        Location location = null;
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        long l1 = 0L;
        an an1 = null;
        String s = null;
        int i = 0;
        boolean flag1 = false;
        java.util.ArrayList arraylist = null;
        int j = 0;
        android.os.Bundle bundle = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, i1);
                    break;

                case 3: // '\003'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 5: // '\005'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.u(parcel, i1);
                    break;

                case 6: // '\006'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 9: // '\t'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 10: // '\n'
                    an1 = (an)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, an.CREATOR);
                    break;

                case 11: // '\013'
                    location = (Location)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, Location.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new aa(k, l1, bundle, j, arraylist, flag1, i, flag, s, an1, location);
            }
        } while (true);
    }

    static void a(aa aa1, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, aa1.versionCode);
        b.a(parcel, 2, aa1.eB);
        b.a(parcel, 3, aa1.extras, false);
        b.a(parcel, 4, aa1.eC);
        b.a(parcel, 5, aa1.eD, false);
        b.a(parcel, 6, aa1.eE);
        b.a(parcel, 7, aa1.tagForChildDirectedTreatment);
        b.a(parcel, 8, aa1.eF);
        b.a(parcel, 9, aa1.eG, false);
        b.a(parcel, 10, aa1.eH, i, false);
        b.a(parcel, 11, aa1.eI, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new aa[i];
    }
}
