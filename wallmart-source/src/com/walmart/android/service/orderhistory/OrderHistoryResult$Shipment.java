// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.orderhistory;


// Referenced classes of package com.walmart.android.service.orderhistory:
//            OrderHistoryResult

public static class 
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

    public ()
    {
    }
}
