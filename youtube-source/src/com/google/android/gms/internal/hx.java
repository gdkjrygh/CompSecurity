// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.gms.internal:
//            hu, hw, ho

public final class hx
    implements android.os.Parcelable.Creator
{

    public hx()
    {
    }

    static void a(hu hu1, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, hu1.getId(), false);
        b.a(parcel, 2, hu1.ea(), false);
        b.a(parcel, 3, hu1.eb(), i, false);
        b.a(parcel, 4, hu1.dT(), i, false);
        b.a(parcel, 5, hu1.dU());
        b.a(parcel, 6, hu1.dV(), i, false);
        b.a(parcel, 7, hu1.ec(), false);
        b.a(parcel, 8, hu1.dW(), i, false);
        b.a(parcel, 9, hu1.dX());
        b.a(parcel, 10, hu1.getRating());
        b.a(parcel, 11, hu1.dY());
        b.a(parcel, 12, hu1.dZ());
        b.b(parcel, 13, hu1.dS(), false);
        b.a(parcel, 1000, hu1.jE);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
        String s1 = null;
        java.util.ArrayList arraylist = null;
        android.os.Bundle bundle = null;
        hw hw1 = null;
        LatLng latlng = null;
        float f1 = 0.0F;
        LatLngBounds latlngbounds = null;
        String s = null;
        Uri uri = null;
        boolean flag = false;
        float f = 0.0F;
        int i = 0;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 2: // '\002'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 3: // '\003'
                    hw1 = (hw)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, hw.CREATOR);
                    break;

                case 4: // '\004'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    f1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, LatLngBounds.CREATOR);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 8: // '\b'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, Uri.CREATOR);
                    break;

                case 9: // '\t'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 10: // '\n'
                    f = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    break;

                case 11: // '\013'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 12: // '\f'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, l);
                    break;

                case 13: // '\r'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, ho.CREATOR);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new hu(j, s1, arraylist, bundle, hw1, latlng, f1, latlngbounds, s, uri, flag, f, i, l1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new hu[i];
    }
}
