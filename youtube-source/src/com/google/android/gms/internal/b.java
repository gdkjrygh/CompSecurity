// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.internal:
//            ac

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    public static ac a(Parcel parcel)
    {
        ac aac[] = null;
        int i = 0;
        int j1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
        boolean flag = false;
        int k = 0;
        int l = 0;
        String s = null;
        int i1 = 0;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = parcel.readInt();
                switch (0xffff & k1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k1);
                    break;

                case 1: // '\001'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k1);
                    break;

                case 3: // '\003'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 4: // '\004'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k1);
                    break;

                case 6: // '\006'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 8: // '\b'
                    aac = (ac[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k1, ac.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j1).toString(), parcel);
            } else
            {
                return new ac(i1, s, l, k, flag, j, i, aac);
            }
        } while (true);
    }

    static void a(ac ac1, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, ac1.versionCode);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, ac1.eJ, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, ac1.height);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, ac1.heightPixels);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, ac1.eK);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, ac1.width);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, ac1.widthPixels);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, ac1.eL, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new ac[i];
    }
}
