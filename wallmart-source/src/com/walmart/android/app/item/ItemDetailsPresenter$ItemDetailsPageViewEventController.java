// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.res.Resources;
import android.text.TextUtils;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.events.ProductType;
import com.walmart.android.data.StoreAvailabilityData;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.item.BuyingOptionModel;
import com.walmart.android.service.item.ItemModel;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter, ItemState

private static class mItemId
{

    private String mAisleMapped;
    private List mAisleNotMapped;
    private com.walmartlabs.anivia.oller.sendIfComplete mBuilder;
    private boolean mGotAisles;
    private boolean mGotAvailabilityData;
    private boolean mGotProductType;
    private boolean mGotRecommendationModule;
    private boolean mGotStoreId;
    private boolean mHasRecommendationModule;
    private final String mItemId;
    private Boolean mOnlineAvailability;
    private String mProductName;
    private String mProductType;
    private final Resources mResources;
    private String mStoreAvailability;
    private String mStoreId;
    private String mUpc;

    private void createEvent()
    {
        mBuilder = (new com.walmartlabs.anivia.oller.mBuilder("pageView")).mBuilder("name", "product detail").mBuilder("section", "shop").mBuilder("itemId", mItemId);
    }

    private boolean isComplete()
    {
        return mGotRecommendationModule && mGotAvailabilityData && mGotProductType && mGotStoreId && mGotAisles;
    }

    private void sendEvent()
    {
        if (!TextUtils.isEmpty(mUpc))
        {
            mBuilder.mBuilder("upc", mUpc);
        }
        if (!TextUtils.isEmpty(mProductName))
        {
            mBuilder.mBuilder("productName", mProductName);
        }
        if (mOnlineAvailability != null)
        {
            com.walmartlabs.anivia.oller oller = mBuilder;
            String s;
            if (mOnlineAvailability.booleanValue())
            {
                s = mResources.getString(0x7f09056c);
            } else
            {
                s = mResources.getString(0x7f09056e);
            }
            oller.mResources("onlineAvailability", s);
        }
        if (mGotRecommendationModule)
        {
            mBuilder.mBuilder("recModule", mHasRecommendationModule);
        }
        if (!TextUtils.isEmpty(mStoreId))
        {
            mBuilder.mBuilder("storeId", mStoreId);
        }
        if (!TextUtils.isEmpty(mStoreAvailability) && !TextUtils.isEmpty(mStoreId))
        {
            mBuilder.mBuilder("storeAvailability", mStoreAvailability);
        }
        if (!TextUtils.isEmpty(mProductType))
        {
            mBuilder.mBuilder("prodType", mProductType);
        }
        if (!TextUtils.isEmpty(mAisleMapped))
        {
            mBuilder.mBuilder("aisleMapped", String.valueOf(mAisleMapped));
        }
        if (mAisleNotMapped != null && !mAisleNotMapped.isEmpty())
        {
            mBuilder.mBuilder("aisleNotMapped", StringUtils.join(mAisleNotMapped.toArray(new String[mAisleNotMapped.size()]), ','));
        }
        MessageBus.getBus().post(mBuilder);
    }

    private void sendIfComplete()
    {
        if (isComplete())
        {
            sendEvent();
        }
    }

    public void pageClosed()
    {
        if (!isComplete())
        {
            sendEvent();
        }
    }

    public void pageViewed()
    {
        createEvent();
        sendIfComplete();
    }

    public void setAisles(String s, List list)
    {
        mAisleMapped = s;
        mAisleNotMapped = list;
        mGotAisles = true;
        sendIfComplete();
    }

    public void setHasRecommendationModule(boolean flag)
    {
        mHasRecommendationModule = flag;
        mGotRecommendationModule = true;
        sendIfComplete();
    }

    public void setItemModel(ItemModel itemmodel, ItemState itemstate)
    {
        mUpc = itemmodel.getUpc();
        mProductName = itemmodel.getProductName();
        itemmodel = itemstate.getSelectedBuyingOption();
        if (itemmodel != null)
        {
            itemmodel = Boolean.valueOf(itemmodel.isAvailable());
        } else
        {
            itemmodel = null;
        }
        mOnlineAvailability = itemmodel;
        sendIfComplete();
    }

    public void setProductType(ProductType producttype)
    {
        if (producttype != null)
        {
            mProductType = producttype.toString();
        }
        mGotProductType = true;
        sendIfComplete();
    }

    public void setStoreAvailability(StoreAvailabilityData storeavailabilitydata, String s)
    {
        if (storeavailabilitydata != null)
        {
            setStoreId(storeavailabilitydata.storeId);
            mStoreAvailability = storeavailabilitydata.stockStatus;
        } else
        {
            mStoreAvailability = s;
        }
        mGotAvailabilityData = true;
        sendIfComplete();
    }

    public void setStoreId(String s)
    {
        mStoreId = s;
        mGotStoreId = true;
        sendIfComplete();
    }

    public (Resources resources, String s)
    {
        mResources = resources;
        mItemId = s;
    }
}
