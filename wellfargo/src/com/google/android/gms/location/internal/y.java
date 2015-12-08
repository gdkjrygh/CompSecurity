// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.location.internal:
//            ParcelableGeofence

public class y
    implements android.os.Parcelable.Creator
{

    public y()
    {
    }

    static void a(ParcelableGeofence parcelablegeofence, Parcel parcel, int i)
    {
        i = c.a(parcel);
        c.a(parcel, 1, parcelablegeofence.f(), false);
        c.a(parcel, 1000, parcelablegeofence.a());
        c.a(parcel, 2, parcelablegeofence.g());
        c.a(parcel, 3, parcelablegeofence.b());
        c.a(parcel, 4, parcelablegeofence.c());
        c.a(parcel, 5, parcelablegeofence.d());
        c.a(parcel, 6, parcelablegeofence.e());
        c.a(parcel, 7, parcelablegeofence.h());
        c.a(parcel, 8, parcelablegeofence.i());
        c.a(parcel, 9, parcelablegeofence.j());
        c.a(parcel, i);
    }

    public ParcelableGeofence a(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int l = 0;
        String s = null;
        int k = 0;
        short word0 = 0;
        double d1 = 0.0D;
        double d = 0.0D;
        float f = 0.0F;
        long l1 = 0L;
        int j = 0;
        int i = -1;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 1000: 
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, j1);
                    break;

                case 3: // '\003'
                    word0 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, j1);
                    break;

                case 4: // '\004'
                    d1 = com.google.android.gms.common.internal.safeparcel.a.k(parcel, j1);
                    break;

                case 5: // '\005'
                    d = com.google.android.gms.common.internal.safeparcel.a.k(parcel, j1);
                    break;

                case 6: // '\006'
                    f = com.google.android.gms.common.internal.safeparcel.a.j(parcel, j1);
                    break;

                case 7: // '\007'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 8: // '\b'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 9: // '\t'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new ParcelableGeofence(l, s, k, word0, d1, d, f, l1, j, i);
            }
        } while (true);
    }

    public ParcelableGeofence[] a(int i)
    {
        return new ParcelableGeofence[i];
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
