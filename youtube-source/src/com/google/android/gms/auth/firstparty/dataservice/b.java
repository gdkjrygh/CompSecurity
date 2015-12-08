// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            AccountNameCheckResponse

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(AccountNameCheckResponse accountnamecheckresponse, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, accountnamecheckresponse.version);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, accountnamecheckresponse.lV, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, accountnamecheckresponse.lW, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, accountnamecheckresponse.lX, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, accountnamecheckresponse.lY, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        CaptchaChallenge captchachallenge = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        String s = null;
        java.util.ArrayList arraylist = null;
        String s1 = null;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.u(parcel, k);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 5: // '\005'
                    captchachallenge = (CaptchaChallenge)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, CaptchaChallenge.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AccountNameCheckResponse(i, s1, arraylist, s, captchachallenge);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AccountNameCheckResponse[i];
    }
}
