// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet:
//            ProxyCard

public final class s
    implements android.os.Parcelable.Creator
{

    public s()
    {
    }

    static void a(ProxyCard proxycard, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, proxycard.getVersionCode());
        b.a(parcel, 2, proxycard.Pf, false);
        b.a(parcel, 3, proxycard.Pg, false);
        b.a(parcel, 4, proxycard.Ph);
        b.a(parcel, 5, proxycard.Pi);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s1 = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
        String s2 = null;
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
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new ProxyCard(k, s2, s1, j, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ProxyCard[i];
    }
}
