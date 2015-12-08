// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.store;


public class StoreStatus
{

    private boolean mOnline;
    private String mStoreNumber;

    public StoreStatus()
    {
    }

    public String getStoreNumber()
    {
        return mStoreNumber;
    }

    public boolean isOnline()
    {
        return mOnline;
    }

    public void setOnline(boolean flag)
    {
        mOnline = flag;
    }

    public void setStoreNumber(String s)
    {
        mStoreNumber = s;
    }
}
