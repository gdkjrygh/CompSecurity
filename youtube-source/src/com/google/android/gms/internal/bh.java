// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            br, bo, cz

public final class bh
    implements android.os.Parcelable.Creator
{

    public bh()
    {
    }

    static void a(br br1, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, br1.versionCode);
        b.a(parcel, 2, br1.gJ, i, false);
        b.a(parcel, 3, br1.aa(), false);
        b.a(parcel, 4, br1.ab(), false);
        b.a(parcel, 5, br1.ac(), false);
        b.a(parcel, 6, br1.ad(), false);
        b.a(parcel, 7, br1.gO, false);
        b.a(parcel, 8, br1.gP);
        b.a(parcel, 9, br1.gQ, false);
        b.a(parcel, 10, br1.ae(), false);
        b.a(parcel, 11, br1.orientation);
        b.a(parcel, 12, br1.gS);
        b.a(parcel, 13, br1.url, false);
        b.a(parcel, 14, br1.en, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int k = 0;
        bo bo1 = null;
        android.os.IBinder ibinder4 = null;
        android.os.IBinder ibinder3 = null;
        android.os.IBinder ibinder2 = null;
        android.os.IBinder ibinder1 = null;
        String s2 = null;
        boolean flag = false;
        String s1 = null;
        android.os.IBinder ibinder = null;
        int j = 0;
        int i = 0;
        String s = null;
        cz cz1 = null;
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
                    bo1 = (bo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, bo.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder4 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 4: // '\004'
                    ibinder3 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 5: // '\005'
                    ibinder2 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 6: // '\006'
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 7: // '\007'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 9: // '\t'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 10: // '\n'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 11: // '\013'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 13: // '\r'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 14: // '\016'
                    cz1 = (cz)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, cz.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new br(k, bo1, ibinder4, ibinder3, ibinder2, ibinder1, s2, flag, s1, ibinder, j, i, s, cz1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new br[i];
    }
}
