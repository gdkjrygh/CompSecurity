// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.msco.service;

import com.walmartlabs.storelocator.StoreData;

public class StoreModeEvent
{

    private StoreData mStoreData;
    private String mStoreId;
    private String mStoreName;

    public StoreModeEvent()
    {
    }

    public StoreModeEvent(StoreData storedata)
    {
        mStoreName = storedata.getDescription();
        mStoreId = storedata.getId();
        mStoreData = storedata;
    }

    public StoreModeEvent(String s, String s1)
    {
        mStoreId = s;
        mStoreName = s1;
    }

    public StoreData getStoreData()
    {
        return mStoreData;
    }

    public String getStoreId()
    {
        return mStoreId;
    }

    public String getStoreName()
    {
        return mStoreName;
    }

    public boolean isInStore()
    {
        return mStoreId != null;
    }

    public String toString()
    {
        return (new StringBuilder()).append("StoreModeEvent [mStoreName=").append(mStoreName).append(", mStoreId=").append(mStoreId).append("]").toString();
    }
}
