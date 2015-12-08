// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import com.walmart.android.data.StoreAvailabilityData;
import com.walmart.android.service.item.BuyingOptionModel;
import com.walmart.android.service.item.ItemPrice;

public class ItemState
{
    public static interface ItemStateChangeListener
    {

        public abstract void onBuyingOptionModelChanged();
    }


    private com.walmart.android.service.item.BundleModel.GroupOption mBundleGroupOption;
    private BuyingOptionModel mBuyingOptionModel;
    private boolean mIsAddedToCart;
    private boolean mIsFetchingBuyingOption;
    private ItemStateChangeListener mItemStateChangeListener;
    private StoreAvailabilityData mStoreAvailabilityData;
    private com.walmart.android.service.item.VariantsModel.VariantItem mVariantItem;

    public ItemState()
    {
    }

    public com.walmart.android.service.item.BundleModel.GroupOption getBundleOption()
    {
        return mBundleGroupOption;
    }

    public BuyingOptionModel getSelectedBuyingOption()
    {
        return mBuyingOptionModel;
    }

    public String getSelectedItemId()
    {
        return mVariantItem.getItemId();
    }

    public ItemPrice getSelectedVariantPrice()
    {
        if (mVariantItem.hasBuyingOption())
        {
            return mVariantItem.getPrice();
        } else
        {
            return new ItemPrice();
        }
    }

    public String getSelectedVariantProductImageUrl()
    {
        return mVariantItem.getProductImageUrl();
    }

    public StoreAvailabilityData getStoreAvailabilityData()
    {
        return mStoreAvailabilityData;
    }

    public boolean hasSelectedVariant()
    {
        return mVariantItem != null;
    }

    public boolean isAddedToCart()
    {
        return mIsAddedToCart;
    }

    public boolean isBundleItem()
    {
        return mBundleGroupOption != null;
    }

    public boolean isFetchingBuyingOption()
    {
        return mIsFetchingBuyingOption;
    }

    public void setAddedToCart()
    {
        mIsAddedToCart = true;
    }

    public void setBundleOption(com.walmart.android.service.item.BundleModel.GroupOption groupoption)
    {
        mBundleGroupOption = groupoption;
    }

    public void setIsFetchingBuyingOption(boolean flag)
    {
        mIsFetchingBuyingOption = flag;
    }

    public void setItemStateChangeListener(ItemStateChangeListener itemstatechangelistener)
    {
        mItemStateChangeListener = itemstatechangelistener;
    }

    public void setSelectedBuyingOption(BuyingOptionModel buyingoptionmodel)
    {
        mBuyingOptionModel = buyingoptionmodel;
        if (mItemStateChangeListener != null)
        {
            mItemStateChangeListener.onBuyingOptionModelChanged();
        }
    }

    public void setSelectedVariantItem(com.walmart.android.service.item.VariantsModel.VariantItem variantitem)
    {
        mVariantItem = variantitem;
    }

    public void setStoreAvailability(StoreAvailabilityData storeavailabilitydata)
    {
        mStoreAvailabilityData = storeavailabilitydata;
    }
}
