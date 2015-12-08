// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location.reporting:
//            UploadRequest

public final class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(UploadRequest uploadrequest, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, uploadrequest.getVersionCode());
        b.a(parcel, 2, uploadrequest.getAccount(), i, false);
        b.a(parcel, 3, uploadrequest.getReason(), false);
        b.a(parcel, 4, uploadrequest.getDurationMillis());
        b.a(parcel, 5, uploadrequest.getMovingLatencyMillis());
        b.a(parcel, 6, uploadrequest.getStationaryLatencyMillis());
        b.a(parcel, 7, uploadrequest.getAppSpecificKey(), false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        long l = 0L;
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        long l1 = 0L;
        long l2 = 0L;
        String s1 = null;
        Account account = null;
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
                    account = (Account)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Account.CREATOR);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 4: // '\004'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, k);
                    break;

                case 5: // '\005'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, k);
                    break;

                case 6: // '\006'
                    l = com.google.android.gms.common.internal.safeparcel.a.h(parcel, k);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new UploadRequest(i, account, s1, l2, l1, l, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new UploadRequest[i];
    }
}
