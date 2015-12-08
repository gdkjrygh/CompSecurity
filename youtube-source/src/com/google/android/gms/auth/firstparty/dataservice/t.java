// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            TokenResponse

public final class t
    implements android.os.Parcelable.Creator
{

    public t()
    {
    }

    static void a(TokenResponse tokenresponse, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, tokenresponse.version);
        b.a(parcel, 2, tokenresponse.accountName, false);
        b.a(parcel, 3, tokenresponse.lV, false);
        b.a(parcel, 4, tokenresponse.ne, false);
        b.a(parcel, 5, tokenresponse.nf, false);
        b.a(parcel, 6, tokenresponse.lX, false);
        b.a(parcel, 7, tokenresponse.ng, false);
        b.a(parcel, 8, tokenresponse.mp, false);
        b.a(parcel, 9, tokenresponse.mq, false);
        b.a(parcel, 10, tokenresponse.nh);
        b.a(parcel, 11, tokenresponse.ni);
        b.a(parcel, 12, tokenresponse.nj);
        b.a(parcel, 13, tokenresponse.nk);
        b.a(parcel, 14, tokenresponse.lY, i, false);
        b.b(parcel, 15, tokenresponse.nl, false);
        b.a(parcel, 17, tokenresponse.mO, false);
        b.a(parcel, 16, tokenresponse.mT, false);
        b.a(parcel, 18, tokenresponse.nm);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        String s9 = null;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        boolean flag4 = false;
        boolean flag3 = false;
        boolean flag2 = false;
        boolean flag1 = false;
        CaptchaChallenge captchachallenge = null;
        ArrayList arraylist = new ArrayList();
        String s1 = null;
        String s = null;
        boolean flag = false;
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
                    s9 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 3: // '\003'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 4: // '\004'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 5: // '\005'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 6: // '\006'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 7: // '\007'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 8: // '\b'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 9: // '\t'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 10: // '\n'
                    flag4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 11: // '\013'
                    flag3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 12: // '\f'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 13: // '\r'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 14: // '\016'
                    captchachallenge = (CaptchaChallenge)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, CaptchaChallenge.CREATOR);
                    break;

                case 15: // '\017'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, ScopeDetail.CREATOR);
                    break;

                case 17: // '\021'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 16: // '\020'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 18: // '\022'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new TokenResponse(i, s9, s8, s7, s6, s5, s4, s3, s2, flag4, flag3, flag2, flag1, captchachallenge, arraylist, s1, s, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new TokenResponse[i];
    }
}
