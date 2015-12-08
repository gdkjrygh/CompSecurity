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
//            kn, kl

public final class jf
    implements android.os.Parcelable.Creator
{

    public jf()
    {
    }

    static void a(kn kn1, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        Set set = kn1.fD();
        if (set.contains(Integer.valueOf(1)))
        {
            b.a(parcel, 1, kn1.getVersionCode());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.a(parcel, 2, kn1.getId(), true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            b.a(parcel, 4, kn1.fU(), i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            b.a(parcel, 5, kn1.getStartDate(), true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            b.a(parcel, 6, kn1.fV(), i, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            b.a(parcel, 7, kn1.getType(), true);
        }
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        kl kl1 = null;
        String s1 = null;
        kl kl2 = null;
        String s2 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 3: // '\003'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 4: // '\004'
                    kl2 = (kl)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, kl.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    kl1 = (kl)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, kl.CREATOR);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new kn(hashset, i, s2, kl2, s1, kl1, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new kn[i];
    }
}
