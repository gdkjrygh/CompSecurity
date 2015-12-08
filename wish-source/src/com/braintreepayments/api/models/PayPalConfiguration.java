// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;


public class PayPalConfiguration
{

    private String mClientId;
    private String mCurrencyIsoCode;
    private String mDirectBaseUrl;
    private String mDisplayName;
    private String mEnvironment;
    private String mPrivacyUrl;
    private boolean mTouchDisabled;
    private Boolean mUseBillingAgreement;
    private String mUserAgreementUrl;

    public PayPalConfiguration()
    {
    }

    public String getClientId()
    {
        return mClientId;
    }

    public String getCurrencyIsoCode()
    {
        return mCurrencyIsoCode;
    }

    public String getDirectBaseUrl()
    {
        return (new StringBuilder()).append(mDirectBaseUrl).append("/v1/").toString();
    }

    public String getDisplayName()
    {
        return mDisplayName;
    }

    public String getEnvironment()
    {
        return mEnvironment;
    }

    public String getPrivacyUrl()
    {
        return mPrivacyUrl;
    }

    public boolean getTouchDisabled()
    {
        return mTouchDisabled;
    }

    public Boolean getUseBillingAgreement()
    {
        return mUseBillingAgreement;
    }

    public String getUserAgreementUrl()
    {
        return mUserAgreementUrl;
    }
}
