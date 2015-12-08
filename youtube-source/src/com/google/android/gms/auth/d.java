// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth:
//            RecoveryReadResponse, Country

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(RecoveryReadResponse recoveryreadresponse, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, recoveryreadresponse.jE);
        b.a(parcel, 2, recoveryreadresponse.mSecondaryEmail, false);
        b.a(parcel, 3, recoveryreadresponse.mPhoneNumber, false);
        b.a(parcel, 4, recoveryreadresponse.mPhoneCountryCode, false);
        b.b(parcel, 5, recoveryreadresponse.mCountryList, false);
        b.a(parcel, 6, recoveryreadresponse.mError, false);
        b.a(parcel, 7, recoveryreadresponse.mAction, false);
        b.a(parcel, 8, recoveryreadresponse.mAllowedOptions, false);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        String s1 = null;
        String s2 = null;
        java.util.ArrayList arraylist = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
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
                    s5 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 3: // '\003'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 4: // '\004'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 5: // '\005'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, Country.CREATOR);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new RecoveryReadResponse(i, s5, s4, s3, arraylist, s2, s1, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new RecoveryReadResponse[i];
    }
}
