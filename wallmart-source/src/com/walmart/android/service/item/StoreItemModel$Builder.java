// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;


// Referenced classes of package com.walmart.android.service.item:
//            StoreItemModel, ItemPrice

public static class tus.UNKNOWN
{

    protected boolean mIsPutAvailable;
    protected ItemPrice mPrice;
    protected tus mStockStatus;
    protected String mStoreAddress;
    protected String mStoreId;

    public StoreItemModel build()
    {
        return new StoreItemModel(this);
    }

    public tus.UNKNOWN storeId(String s)
    {
        mStoreId = s;
        return this;
    }

    public tus()
    {
        mStockStatus = tus.UNKNOWN;
    }
}
