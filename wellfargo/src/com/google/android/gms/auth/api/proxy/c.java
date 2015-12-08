// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            ProxyResponse

public class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(ProxyResponse proxyresponse, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, proxyresponse.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, proxyresponse.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, proxyresponse.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, proxyresponse.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, proxyresponse.e, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, proxyresponse.f, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
    }

    public ProxyResponse a(Parcel parcel)
    {
        byte abyte0[] = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        android.os.Bundle bundle = null;
        PendingIntent pendingintent = null;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    pendingintent = (PendingIntent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, PendingIntent.CREATOR);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 4: // '\004'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 5: // '\005'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new ProxyResponse(k, j, pendingintent, i, bundle, abyte0);
            }
        } while (true);
    }

    public ProxyResponse[] a(int i)
    {
        return new ProxyResponse[i];
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
