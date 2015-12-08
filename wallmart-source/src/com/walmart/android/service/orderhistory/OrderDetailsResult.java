// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.orderhistory;

import android.text.TextUtils;
import java.util.Arrays;

public class OrderDetailsResult
{
    public static class Address
    {

        private String mCity;
        private String mCountry;
        private String mState;
        private String mStreet1;
        private String mStreet2;
        private String mZip;
        public boolean registry;

        public String getCity()
        {
            return mCity;
        }

        public String getCountry()
        {
            return mCountry;
        }

        public String getState()
        {
            return mState;
        }

        public String getStreet()
        {
            String s1 = mStreet1;
            String s = s1;
            if (TextUtils.isEmpty(s1))
            {
                s = "";
            }
            s1 = s;
            if (!TextUtils.isEmpty(mStreet2))
            {
                s1 = (new StringBuilder()).append(s).append(", ").append(mStreet2).toString();
            }
            return s1;
        }

        public String getZip()
        {
            return mZip;
        }

        public void setCity(String s)
        {
            mCity = s;
        }

        public void setCountry(String s)
        {
            mCountry = s;
        }

        public void setState(String s)
        {
            mState = s;
        }

        public void setStreet1(String s)
        {
            mStreet1 = s;
        }

        public void setStreet2(String s)
        {
            mStreet2 = s;
        }

        public void setZip(String s)
        {
            mZip = s;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Address [mCity=").append(mCity).append(", mCountry=").append(mCountry).append(", mState=").append(mState).append(", mStreet=").append(mStreet1).append(", mZip=").append(mZip).append("]").toString();
        }

        public Address()
        {
        }
    }

    public static class Item
    {

        private String mImageThumbnailUrl;
        private String mItemName;
        private int mQuantity;
        private String mStatus;
        private String mTrackUrl;
        private String mUnitPrice;
        public boolean registry;

        public String getImageThumbnailUrl()
        {
            return mImageThumbnailUrl;
        }

        public String getItemName()
        {
            return mItemName;
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

        public String getUnitPrice()
        {
            return mUnitPrice;
        }

        public void setImageThumbnailUrl(String s)
        {
            mImageThumbnailUrl = s;
        }

        public void setItemName(String s)
        {
            mItemName = s;
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

        public void setUnitPrice(String s)
        {
            mUnitPrice = s;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Item [mImageThumbnailUrl=").append(mImageThumbnailUrl).append(", mItemName=").append(mItemName).append(", mQuantity=").append(mQuantity).append(", mStatus=").append(mStatus).append(", mUnitPrice=").append(mUnitPrice).append(", mTrackUrl=").append(mTrackUrl).append("]").toString();
        }

        public Item()
        {
        }
    }


    private String mAdjustmentTotal;
    private Address mBillTo;
    private String mBillToName;
    private String mCcNumber;
    private String mId;
    private Item mItems[];
    private String mPaymentType;
    private String mPurchaseDate;
    private Address mShipTo;
    private String mShipToName;
    private OrderHistoryResult.Shipment mShipments[];
    private String mShippingTotal;
    private String mSubTotal;
    private String mTaxTotal;
    private String mTotal;

    public OrderDetailsResult()
    {
    }

    public String getAdjustmentTotal()
    {
        return mAdjustmentTotal;
    }

    public Address getBillTo()
    {
        return mBillTo;
    }

    public String getBillToName()
    {
        return mBillToName;
    }

    public String getCcNumber()
    {
        return mCcNumber;
    }

    public Item[] getItems()
    {
        return mItems;
    }

    public String getPaymentType()
    {
        return mPaymentType;
    }

    public String getPurchaseDate()
    {
        return mPurchaseDate;
    }

    public Address getShipTo()
    {
        return mShipTo;
    }

    public String getShipToName()
    {
        return mShipToName;
    }

    public OrderHistoryResult.Shipment[] getShipments()
    {
        return mShipments;
    }

    public String getShippingTotal()
    {
        return mShippingTotal;
    }

    public String getSubTotal()
    {
        return mSubTotal;
    }

    public String getTaxTotal()
    {
        return mTaxTotal;
    }

    public String getTotal()
    {
        return mTotal;
    }

    public String getiD()
    {
        return mId;
    }

    public void setAdjustmentTotal(String s)
    {
        mAdjustmentTotal = s;
    }

    public void setBillTo(Address address)
    {
        mBillTo = address;
    }

    public void setBillToName(String s)
    {
        mBillToName = s;
    }

    public void setCcNumber(String s)
    {
        mCcNumber = s;
    }

    public void setItems(Item aitem[])
    {
        mItems = aitem;
    }

    public void setPaymentType(String s)
    {
        mPaymentType = s;
    }

    public void setPurchaseDate(String s)
    {
        mPurchaseDate = s;
    }

    public void setShipTo(Address address)
    {
        mShipTo = address;
    }

    public void setShipToName(String s)
    {
        mShipToName = s;
    }

    public void setShipments(OrderHistoryResult.Shipment ashipment[])
    {
        mShipments = ashipment;
    }

    public void setShippingTotal(String s)
    {
        mShippingTotal = s;
    }

    public void setSubtotal(String s)
    {
        mSubTotal = s;
    }

    public void setTaxTotal(String s)
    {
        mTaxTotal = s;
    }

    public void setTotal(String s)
    {
        mTotal = s;
    }

    public void setiD(String s)
    {
        mId = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("OrderDetailsResult [mAdjustmentTotal=").append(mAdjustmentTotal).append(", mBillTo=").append(mBillTo).append(", mBillToName=").append(mBillToName).append(", mCcNumber=").append(mCcNumber).append(", mId=").append(mId).append(", mItems=").append(Arrays.toString(mItems)).append(", mPaymentType=").append(mPaymentType).append(", mPurchaseDate=").append(mPurchaseDate).append(", mShipments=").append(Arrays.toString(mShipments)).append(", mShippingTotal=").append(mShippingTotal).append(", mShipTo=").append(mShipTo).append(", mShipToName=").append(mShipToName).append(", mSubTotal=").append(mSubTotal).append(", mTaxTotal=").append(mTaxTotal).append(", mTotal=").append(mTotal).append("]").toString();
    }
}
