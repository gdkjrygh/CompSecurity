// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.Country;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            AccountRecoveryData, AccountRecoveryGuidance

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(AccountRecoveryData accountrecoverydata, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, accountrecoverydata.version);
        b.a(parcel, 2, accountrecoverydata.guidance, i, false);
        b.a(parcel, 3, accountrecoverydata.action, false);
        b.a(parcel, 4, accountrecoverydata.allowedRecoveryOption, false);
        b.a(parcel, 5, accountrecoverydata.accountName, false);
        b.a(parcel, 6, accountrecoverydata.secondaryEmail, false);
        b.a(parcel, 7, accountrecoverydata.phoneNumber, false);
        b.b(parcel, 8, accountrecoverydata.countries, false);
        b.a(parcel, 9, accountrecoverydata.defaultCountryCode, false);
        b.a(parcel, 10, accountrecoverydata.error, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        String s1 = null;
        java.util.ArrayList arraylist = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        AccountRecoveryGuidance accountrecoveryguidance = null;
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
                    accountrecoveryguidance = (AccountRecoveryGuidance)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, AccountRecoveryGuidance.CREATOR);
                    break;

                case 3: // '\003'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 4: // '\004'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 5: // '\005'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 6: // '\006'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 7: // '\007'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 8: // '\b'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, Country.CREATOR);
                    break;

                case 9: // '\t'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 10: // '\n'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AccountRecoveryData(i, accountrecoveryguidance, s6, s5, s4, s3, s2, arraylist, s1, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AccountRecoveryData[i];
    }
}
