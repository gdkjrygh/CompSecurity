// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.location.places:
//            NearbyAlertRequest, PlaceFilter, NearbyAlertFilter

public class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(NearbyAlertRequest nearbyalertrequest, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, nearbyalertrequest.b());
        c.a(parcel, 1000, nearbyalertrequest.a());
        c.a(parcel, 2, nearbyalertrequest.c());
        c.a(parcel, 3, nearbyalertrequest.d(), i, false);
        c.a(parcel, 4, nearbyalertrequest.e(), i, false);
        c.a(parcel, 5, nearbyalertrequest.f());
        c.a(parcel, j);
    }

    public NearbyAlertRequest a(Parcel parcel)
    {
        NearbyAlertFilter nearbyalertfilter = null;
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = -1;
        PlaceFilter placefilter = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 3: // '\003'
                    placefilter = (PlaceFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, PlaceFilter.CREATOR);
                    break;

                case 4: // '\004'
                    nearbyalertfilter = (NearbyAlertFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, NearbyAlertFilter.CREATOR);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new NearbyAlertRequest(k, j, i, placefilter, nearbyalertfilter, flag);
            }
        } while (true);
    }

    public NearbyAlertRequest[] a(int i)
    {
        return new NearbyAlertRequest[i];
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
