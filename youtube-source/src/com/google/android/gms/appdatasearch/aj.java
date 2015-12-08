// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            QuerySpecification, Section

public final class aj
    implements android.os.Parcelable.Creator
{

    public aj()
    {
    }

    static void a(QuerySpecification queryspecification, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, queryspecification.wantUris);
        b.a(parcel, 1000, queryspecification.jE);
        b.a(parcel, 2, queryspecification.wantedTags, false);
        b.b(parcel, 3, queryspecification.wantedSections, false);
        b.a(parcel, 4, queryspecification.prefixMatch);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        java.util.ArrayList arraylist1 = null;
        boolean flag1 = false;
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
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.u(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, Section.CREATOR);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new QuerySpecification(i, flag1, arraylist1, arraylist, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new QuerySpecification[i];
    }
}
