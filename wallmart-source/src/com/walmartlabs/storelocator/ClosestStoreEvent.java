// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;


// Referenced classes of package com.walmartlabs.storelocator:
//            StoreData

public class ClosestStoreEvent
{

    public float mAccuracy;
    public float mDistanceFromStore;
    public boolean mForced;
    public StoreData mStoreData;
    public String mStoreId;
    public String mStoreName;

    public ClosestStoreEvent()
    {
    }

    public ClosestStoreEvent(StoreData storedata, float f, float f1, boolean flag)
    {
        mStoreName = storedata.getDescription();
        mStoreId = storedata.getId();
        mDistanceFromStore = f;
        mAccuracy = f1;
        mForced = flag;
        mStoreData = storedata;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ClosestStoreEvent [mStoreName=").append(mStoreName).append(", mStoreId=").append(mStoreId).append(", mDistanceFromStore=").append(mDistanceFromStore).append(", mAccuracy=").append(mAccuracy).append(", mForced=").append(mForced).append("]").toString();
    }
}
