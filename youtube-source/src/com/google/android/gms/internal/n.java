// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            an

public final class n
    implements android.os.Parcelable.Creator
{

    public n()
    {
    }

    static void a(an an1, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, an1.versionCode);
        b.a(parcel, 2, an1.fd);
        b.a(parcel, 3, an1.backgroundColor);
        b.a(parcel, 4, an1.fe);
        b.a(parcel, 5, an1.ff);
        b.a(parcel, 6, an1.fg);
        b.a(parcel, 7, an1.fh);
        b.a(parcel, 8, an1.fi);
        b.a(parcel, 9, an1.fj);
        b.a(parcel, 10, an1.fk, false);
        b.a(parcel, 11, an1.fl);
        b.a(parcel, 12, an1.fm, false);
        b.a(parcel, 13, an1.fn);
        b.a(parcel, 14, an1.fo);
        b.a(parcel, 15, an1.fp, false);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i3 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int l2 = 0;
        int k2 = 0;
        int j2 = 0;
        int i2 = 0;
        int l1 = 0;
        int k1 = 0;
        int j1 = 0;
        int i1 = 0;
        int l = 0;
        String s2 = null;
        int k = 0;
        String s1 = null;
        int j = 0;
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < i3)
            {
                int j3 = parcel.readInt();
                switch (0xffff & j3)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j3);
                    break;

                case 1: // '\001'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 2: // '\002'
                    k2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 3: // '\003'
                    j2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 4: // '\004'
                    i2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 5: // '\005'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 6: // '\006'
                    k1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 7: // '\007'
                    j1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 8: // '\b'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 9: // '\t'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 10: // '\n'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j3);
                    break;

                case 11: // '\013'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 12: // '\f'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j3);
                    break;

                case 13: // '\r'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 14: // '\016'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j3);
                    break;

                case 15: // '\017'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j3);
                    break;
                }
            } else
            if (parcel.dataPosition() != i3)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(i3).toString(), parcel);
            } else
            {
                return new an(l2, k2, j2, i2, l1, k1, j1, i1, l, s2, k, s1, j, i, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new an[i];
    }
}
