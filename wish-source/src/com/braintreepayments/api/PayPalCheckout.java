// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import com.braintreepayments.api.models.PostalAddress;
import java.math.BigDecimal;

public class PayPalCheckout
{

    private Boolean mAddressOverride;
    private BigDecimal mAmount;
    private String mCurrencyCode;
    private Boolean mEnableShippingAddress;
    private String mLocaleCode;
    private PostalAddress mShippingAddress;
    private Boolean mSingleUse;

    public PayPalCheckout()
    {
        this(null);
    }

    public PayPalCheckout(BigDecimal bigdecimal)
    {
        mAmount = bigdecimal;
        mEnableShippingAddress = Boolean.valueOf(true);
        mAddressOverride = Boolean.valueOf(false);
        mSingleUse = Boolean.valueOf(true);
    }

    public Boolean getAddressOverride()
    {
        return mAddressOverride;
    }

    public BigDecimal getAmount()
    {
        return mAmount;
    }

    public String getCurrencyCode()
    {
        return mCurrencyCode;
    }

    public Boolean getEnableShippingAddress()
    {
        return mEnableShippingAddress;
    }

    public String getLocaleCode()
    {
        return mLocaleCode;
    }

    public PostalAddress getShippingAddress()
    {
        return mShippingAddress;
    }

    public boolean isSingleUse()
    {
        return mSingleUse.booleanValue();
    }

    public void setAddressOverride(Boolean boolean1)
    {
        mAddressOverride = boolean1;
    }

    public void setAmount(BigDecimal bigdecimal)
    {
        mAmount = bigdecimal;
    }

    public void setCurrencyCode(String s)
    {
        mCurrencyCode = s;
    }

    public void setEnableShippingAddress(Boolean boolean1)
    {
        mEnableShippingAddress = boolean1;
    }

    public void setLocaleCode(String s)
    {
        mLocaleCode = s;
    }

    public void setShippingAddress(PostalAddress postaladdress)
    {
        mShippingAddress = postaladdress;
    }

    public void setSingleUse(Boolean boolean1)
    {
        mSingleUse = boolean1;
    }
}
