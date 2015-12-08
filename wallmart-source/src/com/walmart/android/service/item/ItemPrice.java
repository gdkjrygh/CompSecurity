// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import android.text.TextUtils;

public class ItemPrice
{
    public static class Builder
    {

        private CharSequence mListPrice;
        private String mPrice;
        private String mPricePerUnit;
        private boolean mSubmap;

        public ItemPrice build()
        {
            return new ItemPrice(this);
        }

        public Builder listPrice(CharSequence charsequence)
        {
            mListPrice = charsequence;
            return this;
        }

        public Builder price(String s)
        {
            mPrice = s;
            return this;
        }

        public Builder pricePerUnit(String s)
        {
            mPricePerUnit = s;
            return this;
        }

        public Builder submap(boolean flag)
        {
            mSubmap = flag;
            return this;
        }





        public Builder()
        {
        }

        public Builder(ItemPrice itemprice)
        {
            mPrice = itemprice.mPrice;
            mSubmap = itemprice.mIsSubmap;
            mListPrice = itemprice.mListPrice;
            mPricePerUnit = itemprice.mPricePerUnit;
        }
    }


    private final boolean mIsSubmap;
    private final CharSequence mListPrice;
    private final String mPrice;
    private final String mPricePerUnit;

    public ItemPrice()
    {
        this(new Builder());
    }

    private ItemPrice(Builder builder)
    {
        mPrice = builder.mPrice;
        mIsSubmap = builder.mSubmap;
        mListPrice = builder.mListPrice;
        if (builder.mPricePerUnit != null)
        {
            builder = builder.mPricePerUnit;
        } else
        {
            builder = "";
        }
        mPricePerUnit = builder;
    }


    public Builder buildUpon()
    {
        return new Builder(this);
    }

    public CharSequence getListPrice()
    {
        return mListPrice;
    }

    public int getPriceInCents()
    {
        if (TextUtils.isEmpty(mPrice))
        {
            return 0;
        }
        float f;
        try
        {
            f = Float.parseFloat(mPrice);
        }
        catch (NumberFormatException numberformatexception)
        {
            return 0;
        }
        return Math.round(100F * f);
    }

    public String getPricePerUnit()
    {
        return mPricePerUnit;
    }

    public String getPriceString()
    {
        return mPrice;
    }

    public boolean isSubmap()
    {
        return mIsSubmap;
    }




}
