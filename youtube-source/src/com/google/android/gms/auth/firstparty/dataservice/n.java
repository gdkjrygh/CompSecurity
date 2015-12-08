// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            GoogleAccountSetupRequest

public final class n
    implements android.os.Parcelable.Creator
{

    public n()
    {
    }

    static void a(GoogleAccountSetupRequest googleaccountsetuprequest, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, googleaccountsetuprequest.version);
        b.a(parcel, 2, googleaccountsetuprequest.mI, false);
        b.a(parcel, 3, googleaccountsetuprequest.mJ);
        b.a(parcel, 4, googleaccountsetuprequest.mK);
        b.a(parcel, 5, googleaccountsetuprequest.mL);
        b.a(parcel, 6, googleaccountsetuprequest.mp, false);
        b.a(parcel, 7, googleaccountsetuprequest.mq, false);
        b.a(parcel, 8, googleaccountsetuprequest.secondaryEmail, false);
        b.a(parcel, 9, googleaccountsetuprequest.mM, false);
        b.a(parcel, 10, googleaccountsetuprequest.mm);
        b.a(parcel, 11, googleaccountsetuprequest.mN);
        b.a(parcel, 12, googleaccountsetuprequest.mn);
        b.a(parcel, 13, googleaccountsetuprequest.mO, false);
        b.a(parcel, 14, googleaccountsetuprequest.callingAppDescription, i, false);
        b.a(parcel, 15, googleaccountsetuprequest.mo, i, false);
        b.a(parcel, 17, googleaccountsetuprequest.phoneNumber, false);
        b.a(parcel, 16, googleaccountsetuprequest.lU, i, false);
        b.a(parcel, 18, googleaccountsetuprequest.phoneCountryCode, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        Bundle bundle = new Bundle();
        boolean flag5 = false;
        boolean flag4 = false;
        boolean flag3 = false;
        String s6 = null;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = false;
        String s2 = null;
        AppDescription appdescription = null;
        AccountCredentials accountcredentials = null;
        CaptchaSolution captchasolution = null;
        String s1 = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    flag5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 6: // '\006'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 7: // '\007'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 8: // '\b'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 9: // '\t'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 10: // '\n'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 11: // '\013'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 12: // '\f'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 13: // '\r'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 14: // '\016'
                    appdescription = (AppDescription)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, AppDescription.CREATOR);
                    break;

                case 15: // '\017'
                    accountcredentials = (AccountCredentials)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, AccountCredentials.CREATOR);
                    break;

                case 17: // '\021'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 16: // '\020'
                    captchasolution = (CaptchaSolution)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, CaptchaSolution.CREATOR);
                    break;

                case 18: // '\022'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GoogleAccountSetupRequest(i, bundle, flag5, flag4, flag3, s6, s5, s4, s3, flag2, flag1, flag, s2, appdescription, accountcredentials, captchasolution, s1, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GoogleAccountSetupRequest[i];
    }
}
