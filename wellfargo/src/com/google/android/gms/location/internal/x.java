// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.location.internal:
//            LocationRequestUpdateData, LocationRequestInternal

public class x
    implements android.os.Parcelable.Creator
{

    public x()
    {
    }

    static void a(LocationRequestUpdateData locationrequestupdatedata, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, locationrequestupdatedata.a);
        c.a(parcel, 1000, locationrequestupdatedata.a());
        c.a(parcel, 2, locationrequestupdatedata.b, i, false);
        c.a(parcel, 3, locationrequestupdatedata.b(), false);
        c.a(parcel, 4, locationrequestupdatedata.d, i, false);
        c.a(parcel, 5, locationrequestupdatedata.c(), false);
        c.a(parcel, j);
    }

    public LocationRequestUpdateData a(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        int i = 1;
        PendingIntent pendingintent = null;
        android.os.IBinder ibinder1 = null;
        LocationRequestInternal locationrequestinternal = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    locationrequestinternal = (LocationRequestInternal)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, LocationRequestInternal.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;

                case 4: // '\004'
                    pendingintent = (PendingIntent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, PendingIntent.CREATOR);
                    break;

                case 5: // '\005'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new LocationRequestUpdateData(j, i, locationrequestinternal, ibinder1, pendingintent, ibinder);
            }
        } while (true);
    }

    public LocationRequestUpdateData[] a(int i)
    {
        return new LocationRequestUpdateData[i];
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
