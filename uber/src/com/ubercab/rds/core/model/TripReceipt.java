// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.rds.core.model:
//            Shape_TripReceipt, TripReceiptDetails, TripReceiptPayment, TripReceiptStats, 
//            TripReceiptStrings

public abstract class TripReceipt
    implements Parcelable
{

    public TripReceipt()
    {
    }

    public static TripReceipt create()
    {
        return new Shape_TripReceipt();
    }

    public abstract String getAmountCharged();

    public abstract TripReceiptDetails getDetails();

    public abstract String getMapUrl();

    public abstract TripReceiptPayment getPayment();

    public abstract TripReceiptStats getStats();

    public abstract TripReceiptStrings getStrings();

    public abstract String getType();

    public abstract TripReceipt setAmountCharged(String s);

    public abstract TripReceipt setDetails(TripReceiptDetails tripreceiptdetails);

    public abstract TripReceipt setMapUrl(String s);

    public abstract TripReceipt setPayment(TripReceiptPayment tripreceiptpayment);

    public abstract TripReceipt setStats(TripReceiptStats tripreceiptstats);

    public abstract TripReceipt setStrings(TripReceiptStrings tripreceiptstrings);

    public abstract TripReceipt setType(String s);
}
