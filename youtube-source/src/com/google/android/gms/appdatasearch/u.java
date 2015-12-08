// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            CorpusStatus

public final class u
    implements android.os.Parcelable.Creator
{

    public u()
    {
    }

    static void a(CorpusStatus corpusstatus, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, corpusstatus.jF);
        b.a(parcel, 1000, corpusstatus.jE);
        b.a(parcel, 2, corpusstatus.jG);
        b.a(parcel, 3, corpusstatus.jH);
        b.a(parcel, 4, corpusstatus.jI);
        b.a(parcel, 5, corpusstatus.jJ, false);
        b.a(parcel, 6, corpusstatus.jK, false);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        long l = 0L;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        long l1 = 0L;
        long l2 = 0L;
        android.os.Bundle bundle = null;
        int i = 0;
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
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, k);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, k);
                    break;

                case 4: // '\004'
                    l = com.google.android.gms.common.internal.safeparcel.a.h(parcel, k);
                    break;

                case 5: // '\005'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CorpusStatus(i, flag, l2, l1, l, bundle, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new CorpusStatus[i];
    }
}
