// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.rds.core.model:
//            Shape_TripReceiptStrings

public abstract class TripReceiptStrings
    implements Parcelable
{

    public TripReceiptStrings()
    {
    }

    public static TripReceiptStrings create()
    {
        return new Shape_TripReceiptStrings();
    }

    public abstract String getSubtotal();

    public abstract String getTotal();

    public abstract TripReceiptStrings setSubtotal(String s);

    public abstract TripReceiptStrings setTotal(String s);
}
