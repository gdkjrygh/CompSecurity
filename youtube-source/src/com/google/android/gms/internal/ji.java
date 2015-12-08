// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public final class ji
    implements android.os.Parcelable.Creator
{

    public ji()
    {
    }

    static void a(kq.b b1, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        Set set = b1.fD();
        if (set.contains(Integer.valueOf(1)))
        {
            b.a(parcel, 1, b1.getVersionCode());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.a(parcel, 2, b1.gh(), i, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            b.a(parcel, 3, b1.gi(), i, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            b.a(parcel, 4, b1.getLayout());
        }
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        kq.b.b b1 = null;
        int i = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        HashSet hashset = new HashSet();
        kq.b.a a1 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    a1 = (kq.b.a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, kq.b.a.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    b1 = (kq.b.b)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, kq.b.b.CREATOR);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    hashset.add(Integer.valueOf(4));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != k)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
                }
                return new kq.b(hashset, j, a1, b1, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new kq.b[i];
    }
}
