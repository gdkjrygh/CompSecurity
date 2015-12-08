// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            MarkerOptions, LatLng

public class o
    implements android.os.Parcelable.Creator
{

    public o()
    {
    }

    static void a(MarkerOptions markeroptions, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, markeroptions.a());
        c.a(parcel, 2, markeroptions.c(), i, false);
        c.a(parcel, 3, markeroptions.d(), false);
        c.a(parcel, 4, markeroptions.e(), false);
        c.a(parcel, 5, markeroptions.b(), false);
        c.a(parcel, 6, markeroptions.f());
        c.a(parcel, 7, markeroptions.g());
        c.a(parcel, 8, markeroptions.h());
        c.a(parcel, 9, markeroptions.i());
        c.a(parcel, 10, markeroptions.j());
        c.a(parcel, 11, markeroptions.k());
        c.a(parcel, 12, markeroptions.l());
        c.a(parcel, 13, markeroptions.m());
        c.a(parcel, 14, markeroptions.n());
        c.a(parcel, j);
    }

    public MarkerOptions a(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        LatLng latlng = null;
        String s1 = null;
        String s = null;
        android.os.IBinder ibinder = null;
        float f5 = 0.0F;
        float f4 = 0.0F;
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = false;
        float f3 = 0.0F;
        float f2 = 0.5F;
        float f1 = 0.0F;
        float f = 1.0F;
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
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 5: // '\005'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 6: // '\006'
                    f5 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 7: // '\007'
                    f4 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 8: // '\b'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 9: // '\t'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 10: // '\n'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 11: // '\013'
                    f3 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 12: // '\f'
                    f2 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 13: // '\r'
                    f1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 14: // '\016'
                    f = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new MarkerOptions(i, latlng, s1, s, ibinder, f5, f4, flag2, flag1, flag, f3, f2, f1, f);
            }
        } while (true);
    }

    public MarkerOptions[] a(int i)
    {
        return new MarkerOptions[i];
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
