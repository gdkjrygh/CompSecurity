// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.location.internal:
//            LocationRequestInternal, ClientIdentity

public class w
    implements android.os.Parcelable.Creator
{

    public w()
    {
    }

    static void a(LocationRequestInternal locationrequestinternal, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, locationrequestinternal.b, i, false);
        c.a(parcel, 1000, locationrequestinternal.a());
        c.a(parcel, 2, locationrequestinternal.c);
        c.a(parcel, 3, locationrequestinternal.d);
        c.a(parcel, 4, locationrequestinternal.e);
        c.c(parcel, 5, locationrequestinternal.f, false);
        c.a(parcel, 6, locationrequestinternal.g, false);
        c.a(parcel, 7, locationrequestinternal.h);
        c.a(parcel, j);
    }

    public LocationRequestInternal a(Parcel parcel)
    {
        String s = null;
        boolean flag1 = true;
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        Object obj = com.google.android.gms.location.internal.LocationRequestInternal.a;
        boolean flag2 = true;
        boolean flag3 = false;
        LocationRequest locationrequest = null;
        int i = 0;
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
                    locationrequest = (LocationRequest)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LocationRequest.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    flag3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 5: // '\005'
                    obj = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, ClientIdentity.CREATOR);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new LocationRequestInternal(i, locationrequest, flag3, flag2, flag1, ((java.util.List) (obj)), s, flag);
            }
        } while (true);
    }

    public LocationRequestInternal[] a(int i)
    {
        return new LocationRequestInternal[i];
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
