// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.orderhistory;

import java.util.Arrays;

// Referenced classes of package com.walmart.android.service.orderhistory:
//            OrderHistoryResult

public static class 
{

    private String mDate;
    private String mId;
    private mShipments mShipments[];

    public String getId()
    {
        return mId;
    }

    public String getPurchaseDate()
    {
        return mDate;
    }

    public mDate[] getShipments()
    {
        return mShipments;
    }

    public void setPurchaseDate(String s)
    {
        mDate = s;
    }

    public void setShipments(mDate amdate[])
    {
        mShipments = amdate;
    }

    public void setiD(String s)
    {
        mId = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("OrderSummary [mId=").append(mId).append(", mDate=").append(mDate).append(", mShipments=").append(Arrays.toString(mShipments)).append("]").toString();
    }

    public ()
    {
    }
}
