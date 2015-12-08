// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlaceLikelihoodEntity, PlaceImpl

public class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(PlaceLikelihoodEntity placelikelihoodentity, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, placelikelihoodentity.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, placelikelihoodentity.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, placelikelihoodentity.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
    }

    public PlaceLikelihoodEntity a(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        PlaceImpl placeimpl = null;
        float f = 0.0F;
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
                    placeimpl = (PlaceImpl)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, PlaceImpl.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    f = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PlaceLikelihoodEntity(i, placeimpl, f);
            }
        } while (true);
    }

    public PlaceLikelihoodEntity[] a(int i)
    {
        return new PlaceLikelihoodEntity[i];
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
