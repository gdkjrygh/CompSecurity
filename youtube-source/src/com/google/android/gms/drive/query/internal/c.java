// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            FilterHolder, ComparisonFilter, FieldOnlyFilter, LogicalFilter, 
//            NotFilter, InFilter

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(FilterHolder filterholder, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, filterholder.wb, i, false);
        b.a(parcel, 1000, filterholder.jE);
        b.a(parcel, 2, filterholder.wc, i, false);
        b.a(parcel, 3, filterholder.wd, i, false);
        b.a(parcel, 4, filterholder.we, i, false);
        b.a(parcel, 5, filterholder.wf, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        InFilter infilter = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        NotFilter notfilter = null;
        LogicalFilter logicalfilter = null;
        FieldOnlyFilter fieldonlyfilter = null;
        ComparisonFilter comparisonfilter = null;
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
                    comparisonfilter = (ComparisonFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ComparisonFilter.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    fieldonlyfilter = (FieldOnlyFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, FieldOnlyFilter.CREATOR);
                    break;

                case 3: // '\003'
                    logicalfilter = (LogicalFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LogicalFilter.CREATOR);
                    break;

                case 4: // '\004'
                    notfilter = (NotFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, NotFilter.CREATOR);
                    break;

                case 5: // '\005'
                    infilter = (InFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, InFilter.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new FilterHolder(i, comparisonfilter, fieldonlyfilter, logicalfilter, notfilter, infilter);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new FilterHolder[i];
    }
}
