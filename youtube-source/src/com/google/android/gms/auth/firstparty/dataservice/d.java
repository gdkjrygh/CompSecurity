// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            AccountRecoveryDataRequest

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(AccountRecoveryDataRequest accountrecoverydatarequest, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, accountrecoverydatarequest.version);
        b.a(parcel, 2, accountrecoverydatarequest.accountName, false);
        b.a(parcel, 3, accountrecoverydatarequest.isClearUpdateSuggested);
        b.a(parcel, 4, accountrecoverydatarequest.callingAppDescription, i, false);
        b.a(parcel, 5, accountrecoverydatarequest.requestDescription, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        AppDescription appdescription = null;
        String s1 = null;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    appdescription = (AppDescription)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, AppDescription.CREATOR);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AccountRecoveryDataRequest(i, s1, flag, appdescription, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AccountRecoveryDataRequest[i];
    }
}
