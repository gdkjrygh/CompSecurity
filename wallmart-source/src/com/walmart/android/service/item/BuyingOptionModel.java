// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.service.item:
//            StoreItemModel, ItemPrice

public class BuyingOptionModel
{
    public static class Builder
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

        public Builder price(ItemPrice itemprice)
        {
            mPrice = itemprice;
            return this;
        }

        public Builder()
        {
        }
    }

    public static class BuyingOptionPriceComparator
        implements Comparator
    {

        public int compare(BuyingOptionModel buyingoptionmodel, BuyingOptionModel buyingoptionmodel1)
        {
            int i = buyingoptionmodel.getPrice().getPriceInCents();
            int j = buyingoptionmodel1.getPrice().getPriceInCents();
            if (i == 0)
            {
                return 1;
            }
            if (j == 0)
            {
                return -1;
            } else
            {
                return i - j;
            }
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((BuyingOptionModel)obj, (BuyingOptionModel)obj1);
        }

        public BuyingOptionPriceComparator()
        {
        }
    }


    private final boolean mAvailable;
    private final int mCatalogSellerId;
    private final String mDisplayPreorderStreetDate;
    private final String mFreeShippingThresholdPrice;
    private final boolean mHasFreeShipping;
    private final boolean mHasFreeShippingThreshold;
    private final List mInflexibleKitConfiguration;
    private final String mInflexibleKitId;
    private final boolean mIsFreight;
    private final String mOfferId;
    private final boolean mPreorder;
    private final ItemPrice mPrice;
    private final boolean mPureSoi;
    private final String mSellerId;
    private final String mSellerName;
    private final String mSellerUrl;
    private final boolean mShippable;
    private final String mShippingDeliveryDateMessage;
    private final boolean mShippingPassEligible;
    private final List mStoreItemModels;
    private final boolean mStoreOnlyItem;
    private final String mUsItemId;

    public BuyingOptionModel(Builder builder)
    {
        mOfferId = builder.mOfferId;
        mPrice = builder.mPrice;
        mSellerName = builder.mSellerName;
        mSellerId = builder.mSellerId;
        mCatalogSellerId = builder.mCatalogSellerId;
        mSellerUrl = builder.mSellerUrl;
        mPreorder = builder.mPreorder;
        mAvailable = builder.mAvailable;
        mDisplayPreorderStreetDate = builder.mDisplayPreorderStreetDate;
        List list;
        if (builder.mStoreItemModels != null)
        {
            list = Collections.unmodifiableList(builder.mStoreItemModels);
        } else
        {
            list = Collections.emptyList();
        }
        mStoreItemModels = list;
        mShippingPassEligible = builder.mShippingPassEligible;
        if (builder.mInflexibleKitConfiguration != null)
        {
            list = Collections.unmodifiableList(builder.mInflexibleKitConfiguration);
        } else
        {
            list = Collections.emptyList();
        }
        mInflexibleKitConfiguration = list;
        mInflexibleKitId = builder.mInflexibleKitId;
        mHasFreeShipping = builder.mHasFreeShipping;
        mHasFreeShippingThreshold = builder.mHasFreeShippingThreshold;
        mFreeShippingThresholdPrice = builder.mFreeShippingThresholdPrice;
        mIsFreight = builder.mIsFreight;
        mPureSoi = builder.mPureSoi;
        mStoreOnlyItem = builder.mStoreOnlyItem;
        mShippingDeliveryDateMessage = builder.mShippingDeliveryDateMessage;
        mUsItemId = builder.mUsItemId;
        mShippable = builder.mShippable;
    }

    public String getCatalogSellerId()
    {
        return Integer.toString(mCatalogSellerId);
    }

    public String getDisplayPreorderStreetDate()
    {
        return mDisplayPreorderStreetDate;
    }

    public String getFreeShippingThresholdPrice()
    {
        return mFreeShippingThresholdPrice;
    }

    public List getInflexibleKitConfiguration()
    {
        return mInflexibleKitConfiguration;
    }

    public String getInflexibleKitId()
    {
        return mInflexibleKitId;
    }

    public String getOfferId()
    {
        return mOfferId;
    }

    public ItemPrice getPrice()
    {
        return mPrice;
    }

    public String getSellerId()
    {
        return mSellerId;
    }

    public String getSellerName()
    {
        return mSellerName;
    }

    public String getSellerUrl()
    {
        return mSellerUrl;
    }

    public String getShippingDeliveryDateMessage()
    {
        return mShippingDeliveryDateMessage;
    }

    public StoreItemModel getStoreItemModel(String s)
    {
        for (Iterator iterator = mStoreItemModels.iterator(); iterator.hasNext();)
        {
            StoreItemModel storeitemmodel = (StoreItemModel)iterator.next();
            if (s.equals(storeitemmodel.getStoreId()))
            {
                return storeitemmodel;
            }
        }

        return null;
    }

    public List getStoreItemModels()
    {
        return mStoreItemModels;
    }

    public String getUsItemId()
    {
        return mUsItemId;
    }

    public boolean hasFreeShipping()
    {
        return mHasFreeShipping;
    }

    public boolean hasFreeShippingThreshold()
    {
        return mHasFreeShippingThreshold;
    }

    public boolean isAvailable()
    {
        return mAvailable;
    }

    public boolean isFreight()
    {
        return mIsFreight;
    }

    public boolean isPreorder()
    {
        return mPreorder;
    }

    public boolean isPureStoreOnlyItem()
    {
        return mPureSoi;
    }

    public boolean isShippable()
    {
        return mShippable;
    }

    public boolean isShippingPassEligible()
    {
        return mShippingPassEligible;
    }

    public boolean isStoreOnlyItem()
    {
        return mStoreOnlyItem;
    }

    public boolean isWalmart()
    {
        return mCatalogSellerId == 0;
    }
}
