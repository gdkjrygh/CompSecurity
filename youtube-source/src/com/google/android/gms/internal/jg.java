// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            kq

public final class jg
    implements android.os.Parcelable.Creator
{

    public jg()
    {
    }

    public static kq a(Parcel parcel)
    {
        int k1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        HashSet hashset = new HashSet();
        int j1 = 0;
        String s9 = null;
        kq.a a1 = null;
        String s8 = null;
        String s7 = null;
        int i1 = 0;
        kq.b b1 = null;
        String s6 = null;
        String s5 = null;
        int l = 0;
        String s4 = null;
        kq.c c = null;
        boolean flag1 = false;
        String s3 = null;
        kq.d d = null;
        String s2 = null;
        int k = 0;
        java.util.ArrayList arraylist2 = null;
        java.util.ArrayList arraylist1 = null;
        int j = 0;
        int i = 0;
        String s1 = null;
        String s = null;
        java.util.ArrayList arraylist = null;
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() < k1)
            {
                int l1 = parcel.readInt();
                switch (0xffff & l1)
                {
                case 10: // '\n'
                case 11: // '\013'
                case 13: // '\r'
                case 17: // '\021'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l1);
                    break;

                case 1: // '\001'
                    j1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s9 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l1);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    a1 = (kq.a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l1, kq.a.CREATOR);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l1);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l1);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    b1 = (kq.b)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l1, kq.b.CREATOR);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l1);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l1);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 12: // '\f'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    hashset.add(Integer.valueOf(12));
                    break;

                case 14: // '\016'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l1);
                    hashset.add(Integer.valueOf(14));
                    break;

                case 15: // '\017'
                    c = (kq.c)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l1, kq.c.CREATOR);
                    hashset.add(Integer.valueOf(15));
                    break;

                case 16: // '\020'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1);
                    hashset.add(Integer.valueOf(16));
                    break;

                case 19: // '\023'
                    d = (kq.d)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l1, kq.d.CREATOR);
                    hashset.add(Integer.valueOf(19));
                    break;

                case 18: // '\022'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l1);
                    hashset.add(Integer.valueOf(18));
                    break;

                case 21: // '\025'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    hashset.add(Integer.valueOf(21));
                    break;

                case 20: // '\024'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l1);
                    hashset.add(Integer.valueOf(20));
                    break;

                case 23: // '\027'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1, kq.g.CREATOR);
                    hashset.add(Integer.valueOf(23));
                    break;

                case 22: // '\026'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1, kq.f.CREATOR);
                    hashset.add(Integer.valueOf(22));
                    break;

                case 25: // '\031'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    hashset.add(Integer.valueOf(25));
                    break;

                case 24: // '\030'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    hashset.add(Integer.valueOf(24));
                    break;

                case 27: // '\033'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l1);
                    hashset.add(Integer.valueOf(27));
                    break;

                case 26: // '\032'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l1);
                    hashset.add(Integer.valueOf(26));
                    break;

                case 29: // '\035'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1);
                    hashset.add(Integer.valueOf(29));
                    break;

                case 28: // '\034'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1, kq.h.CREATOR);
                    hashset.add(Integer.valueOf(28));
                    break;
                }
            } else
            if (parcel.dataPosition() != k1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k1).toString(), parcel);
            } else
            {
                return new kq(hashset, j1, s9, a1, s8, s7, i1, b1, s6, s5, l, s4, c, flag1, s3, d, s2, k, arraylist2, arraylist1, j, i, s1, s, arraylist, flag);
            }
        } while (true);
    }

    static void a(kq kq1, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        Set set = kq1.fD();
        if (set.contains(Integer.valueOf(1)))
        {
            b.a(parcel, 1, kq1.getVersionCode());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.a(parcel, 2, kq1.getAboutMe(), true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            b.a(parcel, 3, kq1.fY(), i, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            b.a(parcel, 4, kq1.getBirthday(), true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            b.a(parcel, 5, kq1.getBraggingRights(), true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            b.a(parcel, 6, kq1.getCircledByCount());
        }
        if (set.contains(Integer.valueOf(7)))
        {
            b.a(parcel, 7, kq1.fZ(), i, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            b.a(parcel, 8, kq1.getCurrentLocation(), true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            b.a(parcel, 9, kq1.getDisplayName(), true);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            b.a(parcel, 12, kq1.getGender());
        }
        if (set.contains(Integer.valueOf(14)))
        {
            b.a(parcel, 14, kq1.getId(), true);
        }
        if (set.contains(Integer.valueOf(15)))
        {
            b.a(parcel, 15, kq1.ga(), i, true);
        }
        if (set.contains(Integer.valueOf(16)))
        {
            b.a(parcel, 16, kq1.isPlusUser());
        }
        if (set.contains(Integer.valueOf(19)))
        {
            b.a(parcel, 19, kq1.gb(), i, true);
        }
        if (set.contains(Integer.valueOf(18)))
        {
            b.a(parcel, 18, kq1.getLanguage(), true);
        }
        if (set.contains(Integer.valueOf(21)))
        {
            b.a(parcel, 21, kq1.getObjectType());
        }
        if (set.contains(Integer.valueOf(20)))
        {
            b.a(parcel, 20, kq1.getNickname(), true);
        }
        if (set.contains(Integer.valueOf(23)))
        {
            b.b(parcel, 23, kq1.gd(), true);
        }
        if (set.contains(Integer.valueOf(22)))
        {
            b.b(parcel, 22, kq1.gc(), true);
        }
        if (set.contains(Integer.valueOf(25)))
        {
            b.a(parcel, 25, kq1.getRelationshipStatus());
        }
        if (set.contains(Integer.valueOf(24)))
        {
            b.a(parcel, 24, kq1.getPlusOneCount());
        }
        if (set.contains(Integer.valueOf(27)))
        {
            b.a(parcel, 27, kq1.getUrl(), true);
        }
        if (set.contains(Integer.valueOf(26)))
        {
            b.a(parcel, 26, kq1.getTagline(), true);
        }
        if (set.contains(Integer.valueOf(29)))
        {
            b.a(parcel, 29, kq1.isVerified());
        }
        if (set.contains(Integer.valueOf(28)))
        {
            b.b(parcel, 28, kq1.ge(), true);
        }
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new kq[i];
    }
}
