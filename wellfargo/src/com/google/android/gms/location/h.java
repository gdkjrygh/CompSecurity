// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.location:
//            LocationRequest

public class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(LocationRequest locationrequest, Parcel parcel, int i)
    {
        i = c.a(parcel);
        c.a(parcel, 1, locationrequest.a);
        c.a(parcel, 1000, locationrequest.b());
        c.a(parcel, 2, locationrequest.b);
        c.a(parcel, 3, locationrequest.c);
        c.a(parcel, 4, locationrequest.d);
        c.a(parcel, 5, locationrequest.e);
        c.a(parcel, 6, locationrequest.f);
        c.a(parcel, 7, locationrequest.g);
        c.a(parcel, 8, locationrequest.h);
        c.a(parcel, i);
    }

    public LocationRequest a(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int k = 0;
        int j = 102;
        long l4 = 0x36ee80L;
        long l3 = 0x927c0L;
        boolean flag = false;
        long l2 = 0x7fffffffffffffffL;
        int i = 0x7fffffff;
        float f = 0.0F;
        long l1 = 0L;
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
                    l4 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, i1);
                    break;

                case 3: // '\003'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, i1);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 5: // '\005'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, i1);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 7: // '\007'
                    f = com.google.android.gms.common.internal.safeparcel.a.j(parcel, i1);
                    break;

                case 8: // '\b'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new LocationRequest(k, j, l4, l3, flag, l2, i, f, l1);
            }
        } while (true);
    }

    public LocationRequest[] a(int i)
    {
        return new LocationRequest[i];
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
