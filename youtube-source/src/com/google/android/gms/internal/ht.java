// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            hs, hu

public final class ht
    implements android.os.Parcelable.Creator
{

    public ht()
    {
    }

    static void a(hs hs1, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, hs1.dQ(), i, false);
        b.a(parcel, 1000, hs1.jE);
        b.a(parcel, 2, hs1.dR(), false);
        b.a(parcel, 3, hs1.getTimestampMillis());
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        float af[] = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        long l = 0L;
        hu ahu[] = null;
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
                    ahu = (hu[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, hu.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    af = com.google.android.gms.common.internal.safeparcel.a.r(parcel, k);
                    break;

                case 3: // '\003'
                    l = com.google.android.gms.common.internal.safeparcel.a.h(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new hs(i, ahu, af, l);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new hs[i];
    }
}
