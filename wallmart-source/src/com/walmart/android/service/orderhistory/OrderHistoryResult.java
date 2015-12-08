// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.orderhistory;

import java.util.Arrays;

public class OrderHistoryResult
{
    public static class OrderSummary
    {

        private String mDate;
        private String mId;
        private Shipment mShipments[];

        public String getId()
        {
            return mId;
        }

        public String getPurchaseDate()
        {
            return mDate;
        }

        public Shipment[] getShipments()
        {
            return mShipments;
        }

        public void setPurchaseDate(String s)
        {
            mDate = s;
        }

        public void setShipments(Shipment ashipment[])
        {
            mShipments = ashipment;
        }

        public void setiD(String s)
        {
            mId = s;
        }

        public String toString()
        {
            return (new StringBuilder()).append("OrderSummary [mId=").append(mId).append(", mDate=").append(mDate).append(", mShipments=").append(Arrays.toString(mShipments)).append("]").toString();
        }

        public OrderSummary()
        {
        }
    }

    public static class Shipment
    {

        private String mDescription;
        private String mImageThumbnailUrl;
        private int mQuantity;
        private String mStatus;
        private String mTrackUrl;

        public String getDescription()
        {
            return mDescription;
        }

        public String getImageThumbnailUrl()
        {
            return mImageThumbnailUrl;
        }

        public int getQuantity()
        {
            return mQuantity;
        }

        public String getStatus()
        {
            return mStatus;
        }

        public String getTrackUrl()
        {
            return mTrackUrl;
        }

        public void setDescription(String s)
        {
            mDescription = s;
        }

        public void setImageThumbnailUrl(String s)
        {
            mImageThumbnailUrl = s;
        }

        public void setQuantity(int i)
        {
            mQuantity = i;
        }

        public void setStatus(String s)
        {
            mStatus = s;
        }

        public void setTrackUrl(String s)
        {
            mTrackUrl = s;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Shipment [mDescription=").append(mDescription).append(", mImageThumbnailUrl=").append(mImageThumbnailUrl).append(", mQuantity=").append(mQuantity).append(", mStatus=").append(mStatus).append(", mTrackUrl=").append(mTrackUrl).append("]").toString();
        }

        public Shipment()
        {
        }
    }


    private OrderSummary mOrders[];

    public OrderHistoryResult()
    {
    }

    public OrderSummary[] getOrders()
    {
        return mOrders;
    }

    public void setOrders(OrderSummary aordersummary[])
    {
        mOrders = aordersummary;
    }

    public String toString()
    {
        return (new StringBuilder()).append("OrderHistoryResult [mOrders=").append(Arrays.toString(mOrders)).append("]").toString();
    }
}
