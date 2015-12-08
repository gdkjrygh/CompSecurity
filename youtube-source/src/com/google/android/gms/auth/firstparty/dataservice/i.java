// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            AccountSignInRequest

public final class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(AccountSignInRequest accountsigninrequest, Parcel parcel, int j)
    {
        int k = b.a(parcel);
        b.a(parcel, 1, accountsigninrequest.version);
        b.a(parcel, 2, accountsigninrequest.callingAppDescription, j, false);
        b.a(parcel, 3, accountsigninrequest.mm);
        b.a(parcel, 4, accountsigninrequest.mn);
        b.a(parcel, 5, accountsigninrequest.lU, j, false);
        b.a(parcel, 6, accountsigninrequest.mo, j, false);
        b.a(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        AccountCredentials accountcredentials = null;
        boolean flag = false;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        CaptchaSolution captchasolution = null;
        boolean flag1 = false;
        AppDescription appdescription = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    appdescription = (AppDescription)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, AppDescription.CREATOR);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 5: // '\005'
                    captchasolution = (CaptchaSolution)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, CaptchaSolution.CREATOR);
                    break;

                case 6: // '\006'
                    accountcredentials = (AccountCredentials)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, AccountCredentials.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new AccountSignInRequest(j, appdescription, flag1, flag, captchasolution, accountcredentials);
            }
        } while (true);
    }

    public final Object[] newArray(int j)
    {
        return new AccountSignInRequest[j];
    }
}
