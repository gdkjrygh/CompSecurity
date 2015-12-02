// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.rds.core.model:
//            Shape_TripReceiptCharge

public abstract class TripReceiptCharge
    implements Parcelable
{

    public TripReceiptCharge()
    {
    }

    public static TripReceiptCharge create()
    {
        return new Shape_TripReceiptCharge();
    }

    public abstract String getAmount();

    public abstract String getFaqLink();

    public abstract String getInputAmount();

    public abstract String getInputType();

    public abstract String getName();

    public abstract String getType();

    public abstract String getVariableRate();

    public abstract boolean isPositive();

    public abstract TripReceiptCharge setAmount(String s);

    public abstract TripReceiptCharge setFaqLink(String s);

    public abstract TripReceiptCharge setInputAmount(String s);

    public abstract TripReceiptCharge setInputType(String s);

    public abstract TripReceiptCharge setName(String s);

    public abstract TripReceiptCharge setPositive(boolean flag);

    public abstract TripReceiptCharge setType(String s);

    public abstract TripReceiptCharge setVariableRate(String s);
}
