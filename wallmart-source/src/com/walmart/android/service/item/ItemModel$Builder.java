// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmart.android.service.item:
//            ItemModel, BundleModel, VariantsModel, DescriptionModel, 
//            ReviewData

public static class mReviewData
{

    protected BundleModel mBundleModel;
    protected List mBuyingOptions;
    protected boolean mCanPickupToday;
    protected DescriptionModel mDescriptionModel;
    protected String mFreeShipToHomeMessaging;
    protected boolean mHasVariants;
    protected boolean mIsAvailableInSomeStore;
    protected boolean mIsConfigurableBundle;
    protected boolean mIsElectronicGiftCard;
    protected boolean mIsElectronicShipping;
    protected boolean mIsEligibleForCart;
    protected boolean mIsEligibleToBuyOnline;
    protected boolean mIsGrouping;
    protected boolean mIsInflexibleKit;
    protected boolean mIsMarketPlaceOnlyItem;
    protected boolean mIsNonConfigurableBundle;
    protected boolean mIsPersonalized;
    protected boolean mIsPhysicalGiftCard;
    protected boolean mIsPickupTodayEligible;
    protected boolean mIsShipToHomeEligible;
    protected boolean mIsShipToStoreEligible;
    protected String mItemId;
    protected String mPreorderMessage;
    protected List mPriceFlags;
    protected String mPrimarySellerId;
    protected String mProductId;
    protected List mProductImageUrls;
    protected String mProductName;
    protected ReviewData mReviewData;
    protected String mShipToHomeDeliveryDateMessaging;
    protected String mShipToStoreDate;
    protected String mShipToStoreDeliveryDateMessaging;
    protected String mThumbnailImage;
    protected String mUpc;
    protected String mUrlPath;
    protected VariantsModel mVariantsModel;

    public ItemModel build()
    {
        return new ItemModel(this);
    }

    public ()
    {
        mPrimarySellerId = "";
        mProductName = "";
        mProductImageUrls = new ArrayList();
        mPriceFlags = new ArrayList();
        mBundleModel = new BundleModel();
        mVariantsModel = new VariantsModel();
        mDescriptionModel = new DescriptionModel();
        mBuyingOptions = new ArrayList();
        mReviewData = new ReviewData();
    }
}
