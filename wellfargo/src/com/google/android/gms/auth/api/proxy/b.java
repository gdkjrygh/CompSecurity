// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            ProxyRequest

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(ProxyRequest proxyrequest, Parcel parcel, int i)
    {
        i = c.a(parcel);
        c.a(parcel, 1, proxyrequest.k, false);
        c.a(parcel, 1000, proxyrequest.j);
        c.a(parcel, 2, proxyrequest.l);
        c.a(parcel, 3, proxyrequest.m);
        c.a(parcel, 4, proxyrequest.n, false);
        c.a(parcel, 5, proxyrequest.o, false);
        c.a(parcel, i);
    }

    public ProxyRequest a(Parcel parcel)
    {
        int i = 0;
        android.os.Bundle bundle = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        long l1 = 0L;
        byte abyte0[] = null;
        String s = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, l);
                    break;

                case 4: // '\004'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 5: // '\005'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.b((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new ProxyRequest(j, s, i, l1, abyte0, bundle);
            }
        } while (true);
    }

    public ProxyRequest[] a(int i)
    {
        return new ProxyRequest[i];
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
