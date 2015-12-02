// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_RtUnpaidBill

public abstract class RtUnpaidBill
    implements Parcelable
{

    public RtUnpaidBill()
    {
    }

    public static RtUnpaidBill create(String s, String s1, String s2, String s3, String s4)
    {
        return (new Shape_RtUnpaidBill()).setClientBillUuid(s).setAmount(s1).setAmountString(s2).setCreatedAt(s3).setTripUuid(s4);
    }

    public abstract String getAmount();

    public abstract String getAmountString();

    public abstract String getClientBillUuid();

    public abstract String getCreatedAt();

    public abstract String getTripUuid();

    abstract RtUnpaidBill setAmount(String s);

    abstract RtUnpaidBill setAmountString(String s);

    abstract RtUnpaidBill setClientBillUuid(String s);

    abstract RtUnpaidBill setCreatedAt(String s);

    abstract RtUnpaidBill setTripUuid(String s);
}
