// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.wire;


public class WireOrder
{
    public static class PickupTime
    {

        private String gmtTimeReturn;
        private String localDate;
        private String localTime;
        private String localTimeZone;
        private String timestampReasonCode;

        public String getGmtTimeReturn()
        {
            return gmtTimeReturn;
        }

        public String getLocalDate()
        {
            return localDate;
        }

        public String getLocalTime()
        {
            return localTime;
        }

        public String getLocalTimeZone()
        {
            return localTimeZone;
        }

        public String getTimestampReasonCode()
        {
            return timestampReasonCode;
        }

        public void setGmtTimeReturn(String s)
        {
            gmtTimeReturn = s;
        }

        public void setLocalDate(String s)
        {
            localDate = s;
        }

        public void setLocalTime(String s)
        {
            localTime = s;
        }

        public void setLocalTimeZone(String s)
        {
            localTimeZone = s;
        }

        public void setTimestampReasonCode(String s)
        {
            timestampReasonCode = s;
        }

        public PickupTime()
        {
        }
    }


    public static final String RESULT_CODE_SUCCESS = "SUCCESS";
    private String orderNumber;
    private PickupTime pickupTime;
    private String resultCode;

    public WireOrder()
    {
    }

    public String getOrderNumber()
    {
        return orderNumber;
    }

    public PickupTime getPickupTime()
    {
        if (pickupTime != null)
        {
            return pickupTime;
        } else
        {
            return new PickupTime();
        }
    }

    public String getResultCode()
    {
        return resultCode;
    }

    public void setOrderNumber(String s)
    {
        orderNumber = s;
    }

    public void setPickupTime(PickupTime pickuptime)
    {
        pickupTime = pickuptime;
    }

    public void setResultCode(String s)
    {
        resultCode = s;
    }
}
