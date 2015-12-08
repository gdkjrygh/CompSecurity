// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal;

import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.user.UserStatusManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal:
//            CartManager

public class CartExperimentManager
{

    public CartExperimentManager()
    {
    }

    public static boolean canCheckoutWithBoleto(CartManager cartmanager)
    {
        boolean flag;
        if (cartmanager != null)
        {
            if (cartmanager.getCart() != null && cartmanager.getCart().getTotal().getValue() > 0.0D)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = true;
        }
        return UserStatusManager.getInstance().getBucketForExperiment("mobile_boleto_checkout").equals("show") && flag;
    }

    public static boolean canCheckoutWithCreditCard(CartManager cartmanager)
    {
        return !UserStatusManager.getInstance().getBucketForExperiment("mobile_hide_cc_checkout").equals("hide");
    }

    public static boolean canCheckoutWithFuturePayPal(CartManager cartmanager)
    {
        boolean flag;
        if (cartmanager != null)
        {
            if (cartmanager.getCart() != null && cartmanager.getCart().getTotal().getValue() > 0.0D)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = true;
        }
        return UserStatusManager.getInstance().getBucketForExperiment("mobile_future_paypal_checkout").equals("show") && flag;
    }

    public static boolean canCheckoutWithGoogleWallet(CartManager cartmanager)
    {
        boolean flag;
        if (cartmanager != null)
        {
            if (cartmanager.getCart() != null && cartmanager.getCart().getTotal().getValue() > 0.0D && cartmanager.getCart().getTotal().getUsdValue() <= 1800D)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = true;
        }
        return UserStatusManager.getInstance().getBucketForExperiment("mobile_google_checkout").equals("show") && flag && GooglePlusManager.isGooglePlayServicesAllowed();
    }

    public static boolean canCheckoutWithKlarnaHybrid(CartManager cartmanager)
    {
        boolean flag;
        if (cartmanager != null)
        {
            if (cartmanager.getCart() != null && cartmanager.getCart().getTotal().getValue() > 0.0D)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = true;
        }
        return UserStatusManager.getInstance().getBucketForExperiment("mobile_klarna_checkout").equals("show-v2") && flag;
    }

    public static boolean canCheckoutWithKlarnaOnly(CartManager cartmanager)
    {
        boolean flag;
        if (cartmanager != null)
        {
            if (cartmanager.getCart() != null && cartmanager.getCart().getTotal().getValue() > 0.0D)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = true;
        }
        return UserStatusManager.getInstance().getBucketForExperiment("mobile_klarna_checkout").equals("show") && flag;
    }

    public static boolean canCheckoutWithOxxo(CartManager cartmanager)
    {
        boolean flag;
        if (cartmanager != null)
        {
            if (cartmanager.getCart() != null && cartmanager.getCart().getTotal().getValue() > 0.0D)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = true;
        }
        return UserStatusManager.getInstance().getBucketForExperiment("mobile_oxxo_checkout").equals("show") && flag;
    }

    public static boolean canCheckoutWithPayPal(CartManager cartmanager)
    {
        boolean flag;
        if (cartmanager != null)
        {
            if (cartmanager.getCart() != null && cartmanager.getCart().getTotal().getValue() > 0.0D)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = true;
        }
        return !UserStatusManager.getInstance().getBucketForExperiment("mobile_hide_paypal").equals("hide") && flag;
    }

    public static boolean canUseImproveKlarnaCheckout()
    {
        return UserStatusManager.getInstance().getBucketForExperiment("mobile_klarna_checkout_GB_improvement").equals("show");
    }

    public static boolean defaultsToGoogleWallet(CartManager cartmanager)
    {
        return UserStatusManager.getInstance().getBucketForExperiment("mobile_default_google_wallet").equals("show");
    }

    public static boolean mustUseUsd(CartManager cartmanager)
    {
        return UserStatusManager.getInstance().getBucketForExperiment("mobile_psuedo_localized_currency").equals("show");
    }

    public static boolean usesNativePayPalCheckout(CartManager cartmanager)
    {
        return UserStatusManager.getInstance().getBucketForExperiment("mobile_native_paypal").equals("show");
    }
}
