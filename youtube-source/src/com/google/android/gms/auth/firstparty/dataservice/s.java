// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            TokenRequest

public final class s
    implements android.os.Parcelable.Creator
{

    public s()
    {
    }

    static void a(TokenRequest tokenrequest, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, tokenrequest.version);
        b.a(parcel, 2, tokenrequest.mZ, false);
        b.a(parcel, 3, tokenrequest.accountName, false);
        b.a(parcel, 4, tokenrequest.mI, false);
        b.a(parcel, 5, tokenrequest.na, i, false);
        b.a(parcel, 6, tokenrequest.nb, i, false);
        b.a(parcel, 7, tokenrequest.mN);
        b.a(parcel, 8, tokenrequest.mm);
        b.a(parcel, 9, tokenrequest.nc, false);
        b.a(parcel, 10, tokenrequest.callingAppDescription, i, false);
        b.a(parcel, 11, tokenrequest.lU, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        CaptchaSolution captchasolution = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        Bundle bundle = new Bundle();
        String s1 = "com.google.android.gms.auth.firstparty.shared.Consent.UNKNOWN.toString()";
        AppDescription appdescription = null;
        boolean flag1 = false;
        PACLConfig paclconfig = null;
        FACLConfig faclconfig = null;
        String s2 = null;
        String s3 = null;
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
                    s3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 4: // '\004'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 5: // '\005'
                    faclconfig = (FACLConfig)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, FACLConfig.CREATOR);
                    break;

                case 6: // '\006'
                    paclconfig = (PACLConfig)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, PACLConfig.CREATOR);
                    break;

                case 7: // '\007'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 9: // '\t'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 10: // '\n'
                    appdescription = (AppDescription)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, AppDescription.CREATOR);
                    break;

                case 11: // '\013'
                    captchasolution = (CaptchaSolution)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, CaptchaSolution.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new TokenRequest(i, s3, s2, bundle, faclconfig, paclconfig, flag1, flag, s1, appdescription, captchasolution);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new TokenRequest[i];
    }
}
