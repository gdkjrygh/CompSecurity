// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.internal:
//            hm, hk

public final class hp
    implements android.os.Parcelable.Creator
{

    public hp()
    {
    }

    static void a(hm hm1, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, hm1.dO(), i, false);
        b.a(parcel, 1000, hm1.jE);
        b.a(parcel, 2, hm1.dP(), i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        LocationRequest locationrequest = null;
        int i = 0;
        hk hk1 = null;
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
                    locationrequest = (LocationRequest)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LocationRequest.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    hk1 = (hk)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, hk.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new hm(i, locationrequest, hk1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new hm[i];
    }
}
