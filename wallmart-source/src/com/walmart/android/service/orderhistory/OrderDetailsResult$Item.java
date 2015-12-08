// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.orderhistory;


// Referenced classes of package com.walmart.android.service.orderhistory:
//            OrderDetailsResult

public static class 
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

    public ()
    {
    }
}
