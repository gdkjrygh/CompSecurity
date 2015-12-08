// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceRequest, PlaceFilter

public class l
    implements android.os.Parcelable.Creator
{

    public l()
    {
    }

    static void a(PlaceRequest placerequest, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1000, placerequest.b);
        c.a(parcel, 2, placerequest.a(), i, false);
        c.a(parcel, 3, placerequest.b());
        c.a(parcel, 4, placerequest.c());
        c.a(parcel, 5, placerequest.d());
        c.a(parcel, j);
    }

    public PlaceRequest a(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        PlaceFilter placefilter = null;
        long l2 = com.google.android.gms.location.places.PlaceRequest.a;
        int i = 102;
        long l1 = 0x7fffffffffffffffL;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    placefilter = (PlaceFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, PlaceFilter.CREATOR);
                    break;

                case 3: // '\003'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, i1);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 5: // '\005'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new PlaceRequest(j, placefilter, l2, i, l1);
            }
        } while (true);
    }

    public PlaceRequest[] a(int i)
    {
        return new PlaceRequest[i];
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
