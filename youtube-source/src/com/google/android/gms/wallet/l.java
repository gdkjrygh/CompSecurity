// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet:
//            ImmediateFullWalletRequest, CountrySpecification

public final class l
    implements android.os.Parcelable.Creator
{

    public l()
    {
    }

    static void a(ImmediateFullWalletRequest immediatefullwalletrequest, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, immediatefullwalletrequest.getVersionCode());
        b.a(parcel, 2, immediatefullwalletrequest.environment);
        b.a(parcel, 3, immediatefullwalletrequest.account, i, false);
        b.a(parcel, 4, immediatefullwalletrequest.Oz, false);
        b.a(parcel, 5, immediatefullwalletrequest.OA);
        b.a(parcel, 6, immediatefullwalletrequest.OB);
        b.a(parcel, 7, immediatefullwalletrequest.OC);
        b.a(parcel, 8, immediatefullwalletrequest.OD);
        b.a(parcel, 9, immediatefullwalletrequest.hy, false);
        b.a(parcel, 10, immediatefullwalletrequest.OE);
        b.a(parcel, 11, immediatefullwalletrequest.OF, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        CountrySpecification acountryspecification[] = null;
        boolean flag = false;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s = null;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        int i = 0;
        String s1 = null;
        Account account = null;
        int j = 0;
        int k = 0;
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
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 3: // '\003'
                    account = (Account)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, Account.CREATOR);
                    break;

                case 4: // '\004'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 6: // '\006'
                    flag3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 7: // '\007'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 8: // '\b'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 9: // '\t'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 10: // '\n'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 11: // '\013'
                    acountryspecification = (CountrySpecification[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1, CountrySpecification.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new ImmediateFullWalletRequest(k, j, account, s1, i, flag3, flag2, flag1, s, flag, acountryspecification);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ImmediateFullWalletRequest[i];
    }
}
