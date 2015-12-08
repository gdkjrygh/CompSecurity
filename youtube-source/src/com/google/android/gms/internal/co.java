// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            cg

public final class co
    implements android.os.Parcelable.Creator
{

    public co()
    {
    }

    public static cg a(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int k = 0;
        String s2 = null;
        String s1 = null;
        java.util.ArrayList arraylist2 = null;
        int j = 0;
        java.util.ArrayList arraylist1 = null;
        long l3 = 0L;
        boolean flag = false;
        long l2 = 0L;
        java.util.ArrayList arraylist = null;
        long l1 = 0L;
        int i = 0;
        String s = null;
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
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 4: // '\004'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.u(parcel, i1);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 6: // '\006'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.u(parcel, i1);
                    break;

                case 7: // '\007'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 9: // '\t'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, i1);
                    break;

                case 10: // '\n'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.u(parcel, i1);
                    break;

                case 11: // '\013'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, i1);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 13: // '\r'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new cg(k, s2, s1, arraylist2, j, arraylist1, l3, flag, l2, arraylist, l1, i, s);
            }
        } while (true);
    }

    static void a(cg cg1, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, cg1.versionCode);
        b.a(parcel, 2, cg1.gO, false);
        b.a(parcel, 3, cg1.hz, false);
        b.a(parcel, 4, cg1.fO, false);
        b.a(parcel, 5, cg1.errorCode);
        b.a(parcel, 6, cg1.fP, false);
        b.a(parcel, 7, cg1.hA);
        b.a(parcel, 8, cg1.hB);
        b.a(parcel, 9, cg1.hC);
        b.a(parcel, 10, cg1.hD, false);
        b.a(parcel, 11, cg1.fS);
        b.a(parcel, 12, cg1.orientation);
        b.a(parcel, 13, cg1.hE, false);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new cg[i];
    }
}
