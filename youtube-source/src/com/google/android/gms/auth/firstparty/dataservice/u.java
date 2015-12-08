// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            UpdateCredentialsRequest

public final class u
    implements android.os.Parcelable.Creator
{

    public u()
    {
    }

    static void a(UpdateCredentialsRequest updatecredentialsrequest, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, updatecredentialsrequest.version);
        b.a(parcel, 2, updatecredentialsrequest.mo, i, false);
        b.a(parcel, 3, updatecredentialsrequest.lU, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        AccountCredentials accountcredentials = null;
        int i = 0;
        CaptchaSolution captchasolution = null;
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
                    accountcredentials = (AccountCredentials)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, AccountCredentials.CREATOR);
                    break;

                case 3: // '\003'
                    captchasolution = (CaptchaSolution)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, CaptchaSolution.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new UpdateCredentialsRequest(i, accountcredentials, captchasolution);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new UpdateCredentialsRequest[i];
    }
}
