// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.order;

import java.util.Date;

public class Order
{

    private Date mGMTPickupTime;
    private Date mLocalPickupTime;
    private String mOrderNumber;
    private String mRawLocalDateString;
    private String mRawLocalTimeString;
    private String mRawLocalTimeZoneString;
    private String mRawResultCode;
    private boolean mSuccess;

    public Order()
    {
    }

    public Date getGMTPickupTime()
    {
        return mGMTPickupTime;
    }

    public Date getLocalPickupTime()
    {
        return mLocalPickupTime;
    }

    public String getOrderNumber()
    {
        return mOrderNumber;
    }

    public String getRawLocalDateString()
    {
        return mRawLocalDateString;
    }

    public String getRawLocalTimeString()
    {
        return mRawLocalTimeString;
    }

    public String getRawLocalTimeZoneString()
    {
        return mRawLocalTimeZoneString;
    }

    public String getRawResultCode()
    {
        return mRawResultCode;
    }

    public void setGMTPickupTime(Date date)
    {
        mGMTPickupTime = date;
    }

    public void setLocalPickupTime(Date date)
    {
        mLocalPickupTime = date;
    }

    public void setOrderNumber(String s)
    {
        mOrderNumber = s;
    }

    public void setRawLocalDateString(String s)
    {
        mRawLocalDateString = s;
    }

    public void setRawLocalTimeString(String s)
    {
        mRawLocalTimeString = s;
    }

    public void setRawLocalTimeZoneString(String s)
    {
        mRawLocalTimeZoneString = s;
    }

    public void setRawResultCode(String s)
    {
        mRawResultCode = s;
    }

    public void setSuccessful(boolean flag)
    {
        mSuccess = flag;
    }

    public boolean successful()
    {
        return mSuccess;
    }
}
