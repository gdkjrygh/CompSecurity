// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.realtime;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.realtime:
//            Shape_RiderParcelableUnpaidBill, RiderParcelableUnpaidBill

final class 
    implements android.os.arcelableUnpaidBill._cls1
{

    private static RiderParcelableUnpaidBill a(Parcel parcel)
    {
        return new Shape_RiderParcelableUnpaidBill(parcel, (byte)0);
    }

    private static RiderParcelableUnpaidBill[] a(int i)
    {
        return new RiderParcelableUnpaidBill[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
