// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location.reporting:
//            ReportingState

public final class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(ReportingState reportingstate, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, reportingstate.getVersionCode());
        b.a(parcel, 2, reportingstate.getReportingEnabled());
        b.a(parcel, 3, reportingstate.getHistoryEnabled());
        b.a(parcel, 4, reportingstate.isAllowed());
        b.a(parcel, 5, reportingstate.isActive());
        b.a(parcel, 6, reportingstate.isDeferringToMaps());
        b.a(parcel, 7, reportingstate.getExpectedOptInResult());
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        int j = 0;
        int k = 0;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 4: // '\004'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 5: // '\005'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 6: // '\006'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new ReportingState(l, k, j, flag2, flag1, flag, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ReportingState[i];
    }
}
