// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth:
//            RecoveryWriteRequest

public final class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(RecoveryWriteRequest recoverywriterequest, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, recoverywriterequest.jE);
        b.a(parcel, 2, recoverywriterequest.mAccount, false);
        b.a(parcel, 3, recoverywriterequest.mSecondaryEmail, false);
        b.a(parcel, 4, recoverywriterequest.mPhoneNumber, false);
        b.a(parcel, 5, recoverywriterequest.mPhoneCountryCode, false);
        b.a(parcel, 6, recoverywriterequest.mIsBroadUse);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new RecoveryWriteRequest(i, s3, s2, s1, s, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new RecoveryWriteRequest[i];
    }
}
