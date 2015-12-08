// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            GplusInfoRequest

public final class o
    implements android.os.Parcelable.Creator
{

    public o()
    {
    }

    static void a(GplusInfoRequest gplusinforequest, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, gplusinforequest.version);
        b.a(parcel, 2, gplusinforequest.accountName, false);
        b.a(parcel, 3, gplusinforequest.lU, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        CaptchaSolution captchasolution = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        String s = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
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
                return new GplusInfoRequest(i, s, captchasolution);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GplusInfoRequest[i];
    }
}
