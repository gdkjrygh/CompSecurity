// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            GplusInfoResponse

public final class p
    implements android.os.Parcelable.Creator
{

    public p()
    {
    }

    static void a(GplusInfoResponse gplusinforesponse, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, gplusinforesponse.version);
        b.a(parcel, 2, gplusinforesponse.mP);
        b.a(parcel, 3, gplusinforesponse.mp, false);
        b.a(parcel, 4, gplusinforesponse.mq, false);
        b.a(parcel, 5, gplusinforesponse.mQ, false);
        b.a(parcel, 6, gplusinforesponse.mR);
        b.a(parcel, 7, gplusinforesponse.mS);
        b.a(parcel, 8, gplusinforesponse.mT, false);
        b.a(parcel, 9, gplusinforesponse.mO, false);
        b.a(parcel, 10, gplusinforesponse.mU, false);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s1 = null;
        String s2 = null;
        boolean flag1 = false;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        boolean flag2 = false;
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
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 3: // '\003'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 4: // '\004'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 6: // '\006'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 8: // '\b'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 9: // '\t'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 10: // '\n'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GplusInfoResponse(i, flag2, s5, s4, s3, flag1, flag, s2, s1, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GplusInfoResponse[i];
    }
}
