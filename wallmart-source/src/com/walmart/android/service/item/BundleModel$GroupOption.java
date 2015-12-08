// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;


// Referenced classes of package com.walmart.android.service.item:
//            BundleModel

public static class Builder
{
    public static class Builder
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

        public BundleModel.GroupOption build()
        {
            return new BundleModel.GroupOption(this, null);
        }

        public Builder()
        {
        }
    }


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

    private Builder(Builder builder)
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

    Builder(Builder builder, Builder builder1)
    {
        this(builder);
    }
}
