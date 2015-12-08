// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            AccountRecoveryUpdateRequest

public final class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(AccountRecoveryUpdateRequest accountrecoveryupdaterequest, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, accountrecoveryupdaterequest.version);
        b.a(parcel, 2, accountrecoveryupdaterequest.accountName, false);
        b.a(parcel, 3, accountrecoveryupdaterequest.secondaryEmail, false);
        b.a(parcel, 4, accountrecoveryupdaterequest.phoneNumber, false);
        b.a(parcel, 5, accountrecoveryupdaterequest.phoneCountryCode, false);
        b.a(parcel, 6, accountrecoveryupdaterequest.isBroadUse);
        b.a(parcel, 7, accountrecoveryupdaterequest.callingAppDescription, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        AppDescription appdescription = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s = null;
        String s1 = null;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 6: // '\006'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 7: // '\007'
                    appdescription = (AppDescription)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, AppDescription.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AccountRecoveryUpdateRequest(i, s3, s2, s1, s, flag, appdescription);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AccountRecoveryUpdateRequest[i];
    }
}
