// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.content.Context;
import android.content.Intent;
import com.braintreepayments.api.exceptions.UnexpectedException;
import com.braintreepayments.api.models.AndroidPayConfiguration;
import com.braintreepayments.api.models.Configuration;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.Payments;
import com.google.android.gms.wallet.Wallet;

public class AndroidPay
{

    private Cart mCart;
    private Configuration mConfiguration;
    private GoogleApiClient mGoogleApiClient;

    protected AndroidPay(Configuration configuration)
    {
        mConfiguration = configuration;
    }

    private GoogleApiClient getConnectedApiClient(Context context)
        throws UnexpectedException
    {
        if (mGoogleApiClient == null)
        {
            mGoogleApiClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(context)).addApi(Wallet.API, (new com.google.android.gms.wallet.Wallet.WalletOptions.Builder()).setEnvironment(getEnvironment()).setTheme(1).build()).build();
        }
        if (!mGoogleApiClient.isConnected())
        {
            context = mGoogleApiClient.blockingConnect();
            if (!context.isSuccess())
            {
                throw new UnexpectedException((new StringBuilder()).append("GoogleApiClient failed to connect with error code").append(context.getErrorCode()).toString());
            }
        }
        return mGoogleApiClient;
    }

    private int getEnvironment()
    {
        return mConfiguration.getAndroidPay().getEnvironment() == null || !mConfiguration.getAndroidPay().getEnvironment().equals("production") ? 0 : 1;
    }

    private String getMerchantName()
    {
        if (mConfiguration.getAndroidPay().getDisplayName() != null)
        {
            return mConfiguration.getAndroidPay().getDisplayName();
        } else
        {
            return "";
        }
    }

    public static boolean isFullWalletResponse(Intent intent)
    {
        return intent.hasExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET");
    }

    public static boolean isMaskedWalletResponse(Intent intent)
    {
        return intent.hasExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
    }

    protected void disconnect()
    {
        if (mGoogleApiClient != null)
        {
            mGoogleApiClient.disconnect();
        }
    }

    protected FullWalletRequest getFullWalletRequest(String s)
    {
        return FullWalletRequest.newBuilder().setCart(mCart).setGoogleTransactionId(s).build();
    }

    protected MaskedWalletRequest getMaskedWalletRequest(boolean flag, boolean flag1, boolean flag2)
    {
        com.google.android.gms.wallet.MaskedWalletRequest.Builder builder = MaskedWalletRequest.newBuilder().setMerchantName(getMerchantName()).setCurrencyCode("USD").setCart(mCart).setIsBillingAgreement(flag).setShippingAddressRequired(flag1).setPhoneNumberRequired(flag2).setPaymentMethodTokenizationParameters(getTokenizationParameters());
        if (mCart != null)
        {
            builder.setEstimatedTotalPrice(mCart.getTotalPrice());
        }
        return builder.build();
    }

    protected PaymentMethodTokenizationParameters getTokenizationParameters()
    {
        return PaymentMethodTokenizationParameters.newBuilder().setPaymentMethodTokenizationType(1).addParameter("gateway", "braintree").addParameter("braintree:merchantId", mConfiguration.getMerchantId()).addParameter("braintree:authorizationFingerprint", mConfiguration.getAndroidPay().getGoogleAuthorizationFingerprint()).addParameter("braintree:apiVersion", "v1").addParameter("braintree:sdkVersion", "1.6.5-paypal-browser-switch-3-SNAPSHOT").build();
    }

    protected void performChangeMaskedWalletRequest(Context context, int i, String s)
        throws UnexpectedException
    {
        Wallet.Payments.changeMaskedWallet(getConnectedApiClient(context), s, null, i);
    }

    protected void performFullWalletRequest(Context context, int i, String s)
        throws UnexpectedException
    {
        Wallet.Payments.loadFullWallet(getConnectedApiClient(context), getFullWalletRequest(s), i);
    }

    protected void performMaskedWalletRequest(Context context, int i, boolean flag, boolean flag1, boolean flag2)
        throws UnexpectedException
    {
        MaskedWalletRequest maskedwalletrequest = getMaskedWalletRequest(flag, flag1, flag2);
        Wallet.Payments.loadMaskedWallet(getConnectedApiClient(context), maskedwalletrequest, i);
    }

    protected void setCart(Cart cart)
    {
        mCart = cart;
    }
}
