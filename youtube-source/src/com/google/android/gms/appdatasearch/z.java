// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            g, Feature

public final class z
    implements android.os.Parcelable.Creator
{

    public z()
    {
    }

    static void a(g g1, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, g1.corpusName, false);
        b.a(parcel, 1000, g1.jE);
        b.a(parcel, 2, g1.features, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Feature afeature[] = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        String s = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    afeature = (Feature[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, Feature.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new g(i, s, afeature);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new g[i];
    }
}
