// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal;

import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCartItem;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.cartmodal.checkout.CartCheckoutActionManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartUiView;
import com.google.android.gms.wallet.MaskedWallet;

public interface CartManager
{

    public abstract void addToCart(String s, String s1);

    public abstract void addToCart(String s, String s1, String s2);

    public abstract void addToCart(String s, String s1, String s2, int i);

    public abstract void close();

    public abstract RootActivity getActivity();

    public abstract String getAddedToCartVariationId();

    public abstract WishCart getCart();

    public abstract CartCheckoutActionManager getCartCheckoutActionManager();

    public abstract String getCheckoutOfferId();

    public abstract String getCurrencyCode();

    public abstract CartUiView getCurrentUiView();

    public abstract String getEffectivePaymentMode();

    public abstract MaskedWallet getGoogleWalletMaskedWallet();

    public abstract WishShippingInfo getShippingInfo();

    public abstract WishUserBillingInfo getUserBillingInfo();

    public abstract boolean googleWalletMaskedWalletNeedsReload();

    public abstract boolean hasValidBillingInfo();

    public abstract boolean hasValidShippingInfo();

    public abstract void hideLoadingSpinner();

    public abstract void markGoogleWalletMaskedWalletNeedsReload();

    public abstract void onBackPressed();

    public abstract void removeProduct(WishCartItem wishcartitem);

    public abstract void requestClose();

    public abstract void setBackButtonInfo(boolean flag);

    public abstract void showBrowser(String s, boolean flag);

    public abstract void showCart();

    public abstract void showErrorMessage(String s);

    public abstract void showErrorMessage(String s, String s1);

    public abstract void showLoadingSpinner();

    public abstract void showPriceExpiryInfo(WishCartItem wishcartitem);

    public abstract void trackEvent(WishAnalyticsEvent wishanalyticsevent);

    public abstract void updateCart(String s, String s1, int i);

    public abstract void updateCheckoutActionManager();

    public abstract void updateCurrentView(CartUiView cartuiview, boolean flag);

    public abstract void updateData(WishCart wishcart, WishShippingInfo wishshippinginfo, WishUserBillingInfo wishuserbillinginfo);

    public abstract void updateGoogleWalletMaskedWallet(MaskedWallet maskedwallet);

    public abstract void updatePreferredPaymentMode(String s);
}
