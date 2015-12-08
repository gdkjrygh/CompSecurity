// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location.reporting:
//            GmmSettings

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(GmmSettings gmmsettings, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, gmmsettings.getVersionCode());
        b.a(parcel, 2, gmmsettings.getReadMillis());
        b.a(parcel, 3, gmmsettings.getAccount(), i, false);
        b.a(parcel, 4, gmmsettings.isReportingSelected());
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        long l = 0L;
        Account account = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    l = com.google.android.gms.common.internal.safeparcel.a.h(parcel, k);
                    break;

                case 3: // '\003'
                    account = (Account)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Account.CREATOR);
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
                return new GmmSettings(i, l, account, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GmmSettings[i];
    }
}
