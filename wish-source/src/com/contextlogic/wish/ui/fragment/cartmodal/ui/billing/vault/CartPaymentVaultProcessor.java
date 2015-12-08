// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import android.os.Bundle;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

public abstract class CartPaymentVaultProcessor
{
    public static interface PrepareListener
    {

        public abstract void onTabPrepareCancelled(CartPaymentVaultProcessor cartpaymentvaultprocessor);

        public abstract void onTabPrepareFailed(CartPaymentVaultProcessor cartpaymentvaultprocessor, String s);

        public abstract void onTabPrepared(CartPaymentVaultProcessor cartpaymentvaultprocessor);
    }

    public static interface SaveListener
    {

        public abstract void onSaveComplete(CartPaymentVaultProcessor cartpaymentvaultprocessor);

        public abstract void onSaveFailed(CartPaymentVaultProcessor cartpaymentvaultprocessor, String s);
    }


    public static final String PARAMETER_ADDRESS_LINE_ONE = "paramAddressLineOne";
    public static final String PARAMETER_ADDRESS_LINE_TWO = "paramAddressLineTwo";
    public static final String PARAMETER_CITY = "paramCity";
    public static final String PARAMETER_COUNTRY = "paramCountry";
    public static final String PARAMETER_CREDIT_CARD_CVV = "ParamCreditCardCvv";
    public static final String PARAMETER_CREDIT_CARD_EXPIRY = "ParamCreditCardExpiry";
    public static final String PARAMETER_CREDIT_CARD_NUMBER = "ParamCreditCardNumber";
    public static final String PARAMETER_EMAIL = "ParamEmail";
    public static final String PARAMETER_IDENTITY_NUMBER = "ParamIdentityNumber";
    public static final String PARAMETER_NAME = "ParamName";
    public static final String PARAMETER_PHONE = "ParamPhone";
    public static final String PARAMETER_STATE = "ParamState";
    public static final String PARAMETER_ZIP = "paramZip";
    protected CartManager cartManager;

    public CartPaymentVaultProcessor(CartManager cartmanager)
    {
        cartManager = cartmanager;
    }

    protected WishShippingInfo parseBillingAddress(Bundle bundle)
    {
        WishShippingInfo wishshippinginfo = new WishShippingInfo();
        if (bundle.getString("ParamName") != null)
        {
            wishshippinginfo.setName(bundle.getString("ParamName"));
        }
        if (bundle.getString("paramAddressLineOne") != null)
        {
            wishshippinginfo.setStreetAddressLineOne(bundle.getString("paramAddressLineOne"));
        }
        if (bundle.getString("paramAddressLineTwo") != null)
        {
            wishshippinginfo.setStreetAddressLineTwo(bundle.getString("paramAddressLineTwo"));
        }
        if (bundle.getString("paramCity") != null)
        {
            wishshippinginfo.setCity(bundle.getString("paramCity"));
        }
        if (bundle.getString("paramZip") != null)
        {
            wishshippinginfo.setZipCode(bundle.getString("paramZip"));
        }
        if (bundle.getString("ParamPhone") != null)
        {
            wishshippinginfo.setPhoneNumber(bundle.getString("ParamPhone"));
        }
        if (bundle.getString("paramCountry") != null)
        {
            wishshippinginfo.setCountryCode(bundle.getString("paramCountry"));
        }
        if (bundle.getString("ParamState") != null)
        {
            wishshippinginfo.setState(bundle.getString("ParamState"));
        }
        return wishshippinginfo;
    }

    public abstract void prepareTab(PrepareListener preparelistener);

    public abstract void save(SaveListener savelistener, Bundle bundle);

    protected void trackEvent(WishAnalyticsEvent wishanalyticsevent)
    {
        (new LogService()).requestService(Integer.toString(wishanalyticsevent.getValue()), null, null, null);
    }
}
