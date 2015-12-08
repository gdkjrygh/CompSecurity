// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            AccountRecoveryGuidance

public final class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(AccountRecoveryGuidance accountrecoveryguidance, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, accountrecoveryguidance.version);
        b.a(parcel, 2, accountrecoveryguidance.accountName, false);
        b.a(parcel, 3, accountrecoveryguidance.isRecoveryInfoNeeded);
        b.a(parcel, 4, accountrecoveryguidance.isRecoveryInterstitialSuggested);
        b.a(parcel, 5, accountrecoveryguidance.isRecoveryUpdateAllowed);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s = null;
        boolean flag1 = false;
        boolean flag2 = false;
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
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 3: // '\003'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AccountRecoveryGuidance(i, s, flag2, flag1, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AccountRecoveryGuidance[i];
    }
}
