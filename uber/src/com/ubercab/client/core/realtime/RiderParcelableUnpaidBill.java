// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.realtime;

import com.ubercab.client.core.realtime.model.ParcelableUnpaidBill;

// Referenced classes of package com.ubercab.client.core.realtime:
//            Shape_RiderParcelableUnpaidBill

public abstract class RiderParcelableUnpaidBill
    implements ParcelableUnpaidBill
{

    public RiderParcelableUnpaidBill()
    {
    }

    public static ParcelableUnpaidBill a(String s, String s1, String s2, String s3)
    {
        return (new Shape_RiderParcelableUnpaidBill()).a(s).b(s1).c(s2).d(s3);
    }

    abstract RiderParcelableUnpaidBill a(String s);

    abstract RiderParcelableUnpaidBill b(String s);

    abstract RiderParcelableUnpaidBill c(String s);

    abstract RiderParcelableUnpaidBill d(String s);
}
