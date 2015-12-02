// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.rds.core.model:
//            Shape_TripReceiptPayment

public abstract class TripReceiptPayment
    implements Parcelable
{

    public TripReceiptPayment()
    {
    }

    public static TripReceiptPayment create()
    {
        return new Shape_TripReceiptPayment();
    }

    public abstract String getCardDisplayName();

    public abstract String getCardIcon();

    public abstract TripReceiptPayment setCardDisplayName(String s);

    public abstract TripReceiptPayment setCardIcon(String s);
}
