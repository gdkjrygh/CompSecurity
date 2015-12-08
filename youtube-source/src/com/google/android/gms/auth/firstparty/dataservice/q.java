// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            PasswordCheckRequest

public final class q
    implements android.os.Parcelable.Creator
{

    public q()
    {
    }

    static void a(PasswordCheckRequest passwordcheckrequest, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, passwordcheckrequest.version);
        b.a(parcel, 2, passwordcheckrequest.accountName, false);
        b.a(parcel, 3, passwordcheckrequest.mV, false);
        b.a(parcel, 4, passwordcheckrequest.lS, false);
        b.a(parcel, 5, passwordcheckrequest.lT, false);
        b.a(parcel, 6, passwordcheckrequest.mW, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        AppDescription appdescription = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
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
                    appdescription = (AppDescription)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, AppDescription.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PasswordCheckRequest(i, s3, s2, s1, s, appdescription);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PasswordCheckRequest[i];
    }
}
