// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng, PolylineOptions

public final class l
    implements android.os.Parcelable.Creator
{

    public l()
    {
    }

    public static PolylineOptions a(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        int i = 0;
        float f1 = 0.0F;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    f1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, i1);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 5: // '\005'
                    f = com.google.android.gms.common.internal.safeparcel.a.j(parcel, i1);
                    break;

                case 6: // '\006'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new PolylineOptions(j, arraylist, f1, i, f, flag1, flag);
            }
        } while (true);
    }

    static void a(PolylineOptions polylineoptions, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, polylineoptions.getVersionCode());
        b.b(parcel, 2, polylineoptions.getPoints(), false);
        b.a(parcel, 3, polylineoptions.getWidth());
        b.a(parcel, 4, polylineoptions.getColor());
        b.a(parcel, 5, polylineoptions.getZIndex());
        b.a(parcel, 6, polylineoptions.isVisible());
        b.a(parcel, 7, polylineoptions.isGeodesic());
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PolylineOptions[i];
    }
}
