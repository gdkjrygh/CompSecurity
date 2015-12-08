// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import java.util.Collections;
import java.util.List;

public class BundleModel
{
    public static class BundleGroup
    {

        private final int mBasePriceInCents;
        private final GroupType mGroupType;
        private final int mId;
        private final boolean mIsBasePriceInvalid;
        private final int mMaxSelectionsAllowed;
        private final int mMinRequired;
        private final List mOptions;
        private final String mTitle;

        public int getBasePriceInCents()
        {
            return mBasePriceInCents;
        }

        public GroupType getGroupType()
        {
            return mGroupType;
        }

        public int getId()
        {
            return mId;
        }

        public int getMaximumSelectionsAllowed()
        {
            return mMaxSelectionsAllowed;
        }

        public int getMinimumSelectionsRequired()
        {
            return mMinRequired;
        }

        public List getOptions()
        {
            return mOptions;
        }

        public String getTitle()
        {
            return mTitle;
        }

        public boolean isBasePriceInvalid()
        {
            return mIsBasePriceInvalid;
        }

        private BundleGroup(Builder builder)
        {
            mGroupType = builder.mGroupType;
            String s;
            if (builder.mTitle != null)
            {
                s = builder.mTitle;
            } else
            {
                s = "";
            }
            mTitle = s;
            mMinRequired = builder.mMinRequired;
            mMaxSelectionsAllowed = builder.mMaxSelectionsAllowed;
            mOptions = Collections.unmodifiableList(builder.mOptions);
            mBasePriceInCents = builder.mBasePriceInCents;
            mIsBasePriceInvalid = builder.mIsBasePriceInvalid;
            mId = builder.mId;
        }

    }

    public static class BundleGroup.Builder
    {

        protected int mBasePriceInCents;
        protected GroupType mGroupType;
        protected int mId;
        protected boolean mIsBasePriceInvalid;
        protected int mMaxSelectionsAllowed;
        protected int mMinRequired;
        protected List mOptions;
        protected String mTitle;

        public BundleGroup build()
        {
            return new BundleGroup(this);
        }

        public BundleGroup.Builder()
        {
        }
    }

    public static class GroupOption
    {

        private final float customerRating;
        private final boolean isAvailable;
        private final boolean isVariant;
        private final String itemId;
        private final String itemName;
        private final int mCurrencyAmountCents;
        private final int mPriceModifierCents;
        private final String offerId;
        private final String productImageUrl;
        private final int quantity;
        private final int ranking;

        public int getCurrencyAmountInCents()
        {
            return mCurrencyAmountCents;
        }

        public float getCustomerRating()
        {
            return customerRating;
        }

        public String getItemId()
        {
            return itemId;
        }

        public String getItemName()
        {
            return itemName;
        }

        public String getOfferId()
        {
            return offerId;
        }

        public int getPriceModifierInCents()
        {
            return mPriceModifierCents;
        }

        public String getProductImageUrl()
        {
            return productImageUrl;
        }

        public int getQuantity()
        {
            return quantity;
        }

        public int getRanking()
        {
            return ranking;
        }

        public boolean isAvailable()
        {
            return isAvailable;
        }

        public boolean isVariant()
        {
            return isVariant;
        }

        private GroupOption(Builder builder)
        {
            mPriceModifierCents = builder.mPriceModifierCents;
            mCurrencyAmountCents = builder.mCurrencyAmountCents;
            itemName = builder.itemName;
            quantity = builder.quantity;
            itemId = builder.itemId;
            productImageUrl = builder.productImageUrl;
            customerRating = builder.customerRating;
            ranking = builder.ranking;
            isAvailable = builder.isAvailable;
            isVariant = builder.isVariant;
            offerId = builder.offerId;
        }

    }

    public static class GroupOption.Builder
    {

        protected float customerRating;
        protected boolean isAvailable;
        protected boolean isVariant;
        protected String itemId;
        protected String itemName;
        protected int mCurrencyAmountCents;
        protected int mPriceModifierCents;
        protected String offerId;
        protected String productImageUrl;
        protected int quantity;
        protected int ranking;

        public GroupOption build()
        {
            return new GroupOption(this);
        }

        public GroupOption.Builder()
        {
        }
    }

    public static final class GroupType extends Enum
    {

        private static final GroupType $VALUES[];
        public static final GroupType OPTIONAL;
        public static final GroupType REQUIRED;
        public static final GroupType STANDARD;

        public static GroupType valueOf(String s)
        {
            return (GroupType)Enum.valueOf(com/walmart/android/service/item/BundleModel$GroupType, s);
        }

        public static GroupType[] values()
        {
            return (GroupType[])$VALUES.clone();
        }

        static 
        {
            STANDARD = new GroupType("STANDARD", 0);
            REQUIRED = new GroupType("REQUIRED", 1);
            OPTIONAL = new GroupType("OPTIONAL", 2);
            $VALUES = (new GroupType[] {
                STANDARD, REQUIRED, OPTIONAL
            });
        }

        private GroupType(String s, int i)
        {
            super(s, i);
        }
    }


    private final String mGroupingId;
    private final List mOptional;
    private final List mRequired;
    private final List mStandard;

    public BundleModel()
    {
        mStandard = Collections.emptyList();
        mRequired = Collections.emptyList();
        mOptional = Collections.emptyList();
        mGroupingId = null;
    }

    public BundleModel(List list, List list1, List list2, String s)
    {
        mStandard = Collections.unmodifiableList(list);
        mRequired = Collections.unmodifiableList(list1);
        mOptional = Collections.unmodifiableList(list2);
        mGroupingId = s;
    }

    public String getGroupingId()
    {
        return mGroupingId;
    }

    public List getOptionalGroups()
    {
        return mOptional;
    }

    public List getRequiredGroups()
    {
        return mRequired;
    }

    public List getStandardGroups()
    {
        return mStandard;
    }
}
