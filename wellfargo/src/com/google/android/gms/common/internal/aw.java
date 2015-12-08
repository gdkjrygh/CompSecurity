// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.common.internal:
//            ResolveAccountResponse

public class aw
    implements android.os.Parcelable.Creator
{

    public aw()
    {
    }

    static void a(ResolveAccountResponse resolveaccountresponse, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, resolveaccountresponse.a);
        c.a(parcel, 2, resolveaccountresponse.b, false);
        c.a(parcel, 3, resolveaccountresponse.b(), i, false);
        c.a(parcel, 4, resolveaccountresponse.c());
        c.a(parcel, 5, resolveaccountresponse.d());
        c.a(parcel, j);
    }

    public ResolveAccountResponse a(Parcel parcel)
    {
        ConnectionResult connectionresult = null;
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        boolean flag1 = false;
        android.os.IBinder ibinder = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 3: // '\003'
                    connectionresult = (ConnectionResult)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ConnectionResult.CREATOR);
                    break;

                case 4: // '\004'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ResolveAccountResponse(i, ibinder, connectionresult, flag1, flag);
            }
        } while (true);
    }

    public ResolveAccountResponse[] a(int i)
    {
        return new ResolveAccountResponse[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
