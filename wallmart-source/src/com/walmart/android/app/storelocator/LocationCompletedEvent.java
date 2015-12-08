// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.storelocator;

import com.walmartlabs.storelocator.StoreData;

// Referenced classes of package com.walmart.android.app.storelocator:
//            InStoreCriteria

public class LocationCompletedEvent
{

    public float mAccuracy;
    public StoreData mClosestStoreData;
    public float mDistanceFromStore;
    public boolean mForced;
    public boolean mLocationEnabled;

    public LocationCompletedEvent()
    {
    }

    public boolean isInStore()
    {
        return mClosestStoreData != null && InStoreCriteria.isInStore(mAccuracy, mDistanceFromStore);
    }

    public String toString()
    {
        String s;
        String s1;
        if (mClosestStoreData == null)
        {
            s = "Not available";
        } else
        {
            s = mClosestStoreData.getDescription();
        }
        if (mClosestStoreData == null)
        {
            s1 = "Not available";
        } else
        {
            s1 = mClosestStoreData.getId();
        }
        return (new StringBuilder()).append("LocationCompletedEvent [Store Name=").append(s).append(", Store ID=").append(s1).append(", Distance From Store=").append(mDistanceFromStore).append(", Accuracy=").append(mAccuracy).append(", Forced=").append(mForced).append(", Location Enabled=").append(mLocationEnabled).append("]").toString();
    }
}
