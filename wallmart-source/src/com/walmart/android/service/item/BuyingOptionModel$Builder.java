// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import java.util.List;

// Referenced classes of package com.walmart.android.service.item:
//            BuyingOptionModel, ItemPrice

public static class 
{

    protected boolean mAvailable;
    protected int mCatalogSellerId;
    protected String mDisplayPreorderStreetDate;
    protected String mFreeShippingThresholdPrice;
    protected boolean mHasFreeShipping;
    protected boolean mHasFreeShippingThreshold;
    protected List mInflexibleKitConfiguration;
    protected String mInflexibleKitId;
    protected boolean mIsFreight;
    protected String mOfferId;
    protected boolean mPreorder;
    protected ItemPrice mPrice;
    protected boolean mPureSoi;
    protected String mSellerId;
    protected String mSellerName;
    protected String mSellerUrl;
    protected boolean mShippable;
    protected String mShippingDeliveryDateMessage;
    protected boolean mShippingPassEligible;
    protected List mStoreItemModels;
    protected boolean mStoreOnlyItem;
    protected String mUsItemId;

    public BuyingOptionModel build()
    {
        return new BuyingOptionModel(this);
    }

    public  price(ItemPrice itemprice)
    {
        mPrice = itemprice;
        return this;
    }

    public ()
    {
    }
}
