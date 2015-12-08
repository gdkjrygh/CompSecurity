// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.walmart.android.service.item:
//            BuyingOptionModel, ReviewData, BundleModel, DescriptionModel, 
//            VariantsModel

public class ItemModel
{
    public static class Builder
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

        public Builder()
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

    public static final class PriceFlags extends Enum
    {

        private static final PriceFlags $VALUES[];
        public static final PriceFlags AS_ADVERTISED;
        public static final PriceFlags AS_SEEN_ON_TV;
        public static final PriceFlags AWARD_WINNING;
        public static final PriceFlags CERTIFIED_ITEM;
        public static final PriceFlags CLEARANCE;
        public static final PriceFlags COMING_SOON;
        public static final PriceFlags DARE_TO_COMPARE;
        public static final PriceFlags EXCLUSIVE;
        public static final PriceFlags FREE_SHIPPING;
        public static final PriceFlags NEW;
        public static final PriceFlags NEW_ITEM;
        public static final PriceFlags PERSONALIZE_IT;
        public static final PriceFlags REBATE_AVAILABLE;
        public static final PriceFlags REDUCED_PRICE;
        public static final PriceFlags ROLLBACK;
        public static final PriceFlags SAME_DAY_DELIVERY;
        public static final PriceFlags SAVE_ON_SHIPPING;
        public static final PriceFlags SPECIAL_BUY;

        public static PriceFlags valueOf(String s)
        {
            return (PriceFlags)Enum.valueOf(com/walmart/android/service/item/ItemModel$PriceFlags, s);
        }

        public static PriceFlags[] values()
        {
            return (PriceFlags[])$VALUES.clone();
        }

        static 
        {
            FREE_SHIPPING = new PriceFlags("FREE_SHIPPING", 0);
            ROLLBACK = new PriceFlags("ROLLBACK", 1);
            CLEARANCE = new PriceFlags("CLEARANCE", 2);
            DARE_TO_COMPARE = new PriceFlags("DARE_TO_COMPARE", 3);
            SAME_DAY_DELIVERY = new PriceFlags("SAME_DAY_DELIVERY", 4);
            COMING_SOON = new PriceFlags("COMING_SOON", 5);
            EXCLUSIVE = new PriceFlags("EXCLUSIVE", 6);
            PERSONALIZE_IT = new PriceFlags("PERSONALIZE_IT", 7);
            SPECIAL_BUY = new PriceFlags("SPECIAL_BUY", 8);
            SAVE_ON_SHIPPING = new PriceFlags("SAVE_ON_SHIPPING", 9);
            REBATE_AVAILABLE = new PriceFlags("REBATE_AVAILABLE", 10);
            AS_ADVERTISED = new PriceFlags("AS_ADVERTISED", 11);
            AWARD_WINNING = new PriceFlags("AWARD_WINNING", 12);
            NEW = new PriceFlags("NEW", 13);
            NEW_ITEM = new PriceFlags("NEW_ITEM", 14);
            CERTIFIED_ITEM = new PriceFlags("CERTIFIED_ITEM", 15);
            REDUCED_PRICE = new PriceFlags("REDUCED_PRICE", 16);
            AS_SEEN_ON_TV = new PriceFlags("AS_SEEN_ON_TV", 17);
            $VALUES = (new PriceFlags[] {
                FREE_SHIPPING, ROLLBACK, CLEARANCE, DARE_TO_COMPARE, SAME_DAY_DELIVERY, COMING_SOON, EXCLUSIVE, PERSONALIZE_IT, SPECIAL_BUY, SAVE_ON_SHIPPING, 
                REBATE_AVAILABLE, AS_ADVERTISED, AWARD_WINNING, NEW, NEW_ITEM, CERTIFIED_ITEM, REDUCED_PRICE, AS_SEEN_ON_TV
            });
        }

        private PriceFlags(String s, int i)
        {
            super(s, i);
        }
    }


    private final BundleModel mBundleModel;
    private final List mBuyingOptions;
    private final boolean mCanPickupToday;
    private final DescriptionModel mDescriptionModel;
    private final String mFreeShipToHomeMessaging;
    private final boolean mHasVariants;
    private final boolean mIsAvailableInSomeStore;
    private final boolean mIsConfigurableBundle;
    private final boolean mIsElectronicGiftCard;
    private final boolean mIsElectronicShipping;
    private final boolean mIsEligibleForCart;
    private final boolean mIsEligibleToBuyOnline;
    private final boolean mIsGrouping;
    private final boolean mIsInflexibleKit;
    private final boolean mIsMarketPlaceOnlyItem;
    private final boolean mIsNonConfigurableBundle;
    private final boolean mIsPersonalized;
    private final boolean mIsPhysicalGiftCard;
    private final boolean mIsPickupTodayEligible;
    private final boolean mIsShipToHomeEligible;
    private final boolean mIsShipToStoreEligible;
    private final String mItemId;
    private final String mPreorderMessage;
    private final List mPriceFlags;
    private final String mPrimarySellerId;
    private final String mProductId;
    private final List mProductImageUrls;
    private final String mProductName;
    private final ReviewData mReviewData;
    private final String mShipToHomeDeliveryDateMessaging;
    private final String mShipToStoreDate;
    private final String mShipToStoreDeliveryDateMessaging;
    private final String mThumbnailImage;
    private final String mUpc;
    private final String mUrlPath;
    private final VariantsModel mVariantsModel;

    public ItemModel(Builder builder)
    {
        mIsGrouping = builder.mIsGrouping;
        mIsConfigurableBundle = builder.mIsConfigurableBundle;
        mIsNonConfigurableBundle = builder.mIsNonConfigurableBundle;
        mHasVariants = builder.mHasVariants;
        mIsMarketPlaceOnlyItem = builder.mIsMarketPlaceOnlyItem;
        mIsElectronicGiftCard = builder.mIsElectronicGiftCard;
        mIsPhysicalGiftCard = builder.mIsPhysicalGiftCard;
        mPrimarySellerId = builder.mPrimarySellerId;
        mProductName = builder.mProductName;
        mProductImageUrls = Collections.unmodifiableList(builder.mProductImageUrls);
        mThumbnailImage = builder.mThumbnailImage;
        mIsEligibleToBuyOnline = builder.mIsEligibleToBuyOnline;
        mPriceFlags = Collections.unmodifiableList(builder.mPriceFlags);
        mIsShipToHomeEligible = builder.mIsShipToHomeEligible;
        mIsShipToStoreEligible = builder.mIsShipToStoreEligible;
        mShipToStoreDate = builder.mShipToStoreDate;
        mIsPickupTodayEligible = builder.mIsPickupTodayEligible;
        mUrlPath = builder.mUrlPath;
        mUpc = builder.mUpc;
        mIsAvailableInSomeStore = builder.mIsAvailableInSomeStore;
        mCanPickupToday = builder.mCanPickupToday;
        mFreeShipToHomeMessaging = builder.mFreeShipToHomeMessaging;
        mShipToHomeDeliveryDateMessaging = builder.mShipToHomeDeliveryDateMessaging;
        mShipToStoreDeliveryDateMessaging = builder.mShipToStoreDeliveryDateMessaging;
        mPreorderMessage = builder.mPreorderMessage;
        mItemId = builder.mItemId;
        mIsEligibleForCart = builder.mIsEligibleForCart;
        mIsPersonalized = builder.mIsPersonalized;
        mBundleModel = builder.mBundleModel;
        mVariantsModel = builder.mVariantsModel;
        mDescriptionModel = builder.mDescriptionModel;
        mBuyingOptions = Collections.unmodifiableList(builder.mBuyingOptions);
        mReviewData = builder.mReviewData;
        mIsInflexibleKit = builder.mIsInflexibleKit;
        mProductId = builder.mProductId;
        mIsElectronicShipping = builder.mIsElectronicShipping;
    }

    public boolean canPickupToday()
    {
        return mCanPickupToday;
    }

    public BundleModel getBundleModel()
    {
        return mBundleModel;
    }

    public List getBuyingOptions()
    {
        return mBuyingOptions;
    }

    public DescriptionModel getDescriptionModel()
    {
        return mDescriptionModel;
    }

    public String getFreeShipToHomeMessaging()
    {
        return mFreeShipToHomeMessaging;
    }

    public String getItemId()
    {
        return mItemId;
    }

    public List getOnlinePriceFlags()
    {
        return mPriceFlags;
    }

    public CharSequence getPreorderMessage()
    {
        return mPreorderMessage;
    }

    public BuyingOptionModel getPrimaryBuyingOption()
    {
        if (!mBuyingOptions.isEmpty())
        {
            return (BuyingOptionModel)mBuyingOptions.get(0);
        } else
        {
            return null;
        }
    }

    public String getPrimarySellerId()
    {
        return mPrimarySellerId;
    }

    public String getProductId()
    {
        return mProductId;
    }

    public List getProductImageUrls()
    {
        return mProductImageUrls;
    }

    public String getProductName()
    {
        return mProductName;
    }

    public ReviewData getReviewData()
    {
        return mReviewData;
    }

    public String getShipToHomeDeliveryDateMessaging()
    {
        return mShipToHomeDeliveryDateMessaging;
    }

    public String getShipToStoreDate()
    {
        return mShipToStoreDate;
    }

    public String getShipToStoreDeliveryDateMessaging()
    {
        return mShipToStoreDeliveryDateMessaging;
    }

    public String getThumbnailImage()
    {
        return mThumbnailImage;
    }

    public String getUpc()
    {
        return mUpc;
    }

    public String getUrlPath()
    {
        return mUrlPath;
    }

    public VariantsModel getVariantsModel()
    {
        return mVariantsModel;
    }

    public boolean hasReviewData()
    {
        return mReviewData.getTotalReviewCount() >= 1;
    }

    public boolean hasVariants()
    {
        return mHasVariants;
    }

    public boolean isAvailableInSomeStore()
    {
        return mIsAvailableInSomeStore;
    }

    public boolean isConfigurableBundle()
    {
        return mIsConfigurableBundle;
    }

    public boolean isElectronicGiftCard()
    {
        return mIsElectronicGiftCard;
    }

    public boolean isElectronicShipping()
    {
        return mIsElectronicShipping;
    }

    public boolean isEligibleForCart()
    {
        return mIsEligibleForCart;
    }

    public boolean isEligibleToBuyOnline()
    {
        return mIsEligibleToBuyOnline;
    }

    public boolean isGrouping()
    {
        return mIsGrouping;
    }

    public boolean isInflexibleKit()
    {
        return mIsInflexibleKit;
    }

    public boolean isMarketPlaceOnlyItem()
    {
        return mIsMarketPlaceOnlyItem;
    }

    public boolean isNonConfigurableBundle()
    {
        return mIsNonConfigurableBundle;
    }

    public boolean isPersonalized()
    {
        return mIsPersonalized;
    }

    public boolean isPhysicalGiftCard()
    {
        return mIsPhysicalGiftCard;
    }

    public boolean isPickupTodayEligible()
    {
        return mIsPickupTodayEligible;
    }

    public boolean isShipToHomeEligible()
    {
        return mIsShipToHomeEligible;
    }

    public boolean isShipToStoreEligible()
    {
        return mIsShipToStoreEligible;
    }
}
