// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.model;

import android.os.Parcelable;
import java.util.List;

// Referenced classes of package com.ubercab.rds.core.model:
//            Shape_TripReceiptDetails, TripReceiptCharge

public abstract class TripReceiptDetails
    implements Parcelable
{

    public TripReceiptDetails()
    {
    }

    public static TripReceiptDetails create()
    {
        return new Shape_TripReceiptDetails();
    }

    public abstract List getChargeModifiers();

    public abstract List getPrimaryCharges();

    public abstract String getPrimarySubtotal();

    public abstract List getSplitDeductions();

    public abstract String getSubtotal();

    public abstract TripReceiptCharge getSurge();

    public abstract TripReceiptDetails setChargeModifiers(List list);

    public abstract TripReceiptDetails setPrimaryCharges(List list);

    public abstract TripReceiptDetails setPrimarySubtotal(String s);

    public abstract TripReceiptDetails setSplitDeductions(List list);

    public abstract TripReceiptDetails setSubtotal(String s);

    public abstract TripReceiptDetails setSurge(TripReceiptCharge tripreceiptcharge);
}
