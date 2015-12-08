// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.shared;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet.shared:
//            ApplicationParameters

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(ApplicationParameters applicationparameters, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, applicationparameters.jE);
        b.a(parcel, 2, applicationparameters.Pp);
        b.a(parcel, 3, applicationparameters.Pu, i, false);
        b.a(parcel, 4, applicationparameters.mArgs, false);
        b.a(parcel, 5, applicationparameters.Pv);
        b.a(parcel, 6, applicationparameters.mTheme);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        android.os.Bundle bundle = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 1;
        boolean flag = false;
        Account account = null;
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
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    account = (Account)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, Account.CREATOR);
                    break;

                case 4: // '\004'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new ApplicationParameters(k, j, account, bundle, flag, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ApplicationParameters[i];
    }
}
