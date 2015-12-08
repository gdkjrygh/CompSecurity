// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.checkout;

import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.service.UpdateShippingInfoService;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.items.CartItemsView;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wallet.Address;
import com.google.android.gms.wallet.MaskedWallet;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.checkout:
//            CartCheckoutActionManager

public class GoogleWalletCheckoutManager extends CartCheckoutActionManager
{

    private UpdateShippingInfoService updateShippingInfoService;

    public GoogleWalletCheckoutManager(CartManager cartmanager)
    {
        super(cartmanager);
        updateShippingInfoService = new UpdateShippingInfoService();
    }

    private void checkForWalletPreauthorization(final GoogleApiClient client)
    {
        try
        {
            GooglePlusManager.getInstance().checkWalletPreauthorization(client, new com.contextlogic.wish.googleplus.GooglePlusManager.WalletPreauthorizationIntentCallback() {

                final GoogleWalletCheckoutManager this$0;
                final GoogleApiClient val$client;

                public void onWalletPreauthorizationCancelled()
                {
                    cartManager.hideLoadingSpinner();
                }

                public void onWalletPreauthorizationError(int i)
                {
                    if (cartManager.getEffectivePaymentMode().equals("PaymentModeGoogle"))
                    {
                        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FETCH_FAILURE);
                        cartManager.hideLoadingSpinner();
                        cartManager.updatePreferredPaymentMode("PaymentModeCC");
                        if (!cartManager.hasValidBillingInfo() || !cartManager.hasValidShippingInfo())
                        {
                            cartManager.getCartCheckoutActionManager().checkout();
                        }
                        return;
                    } else
                    {
                        loadMaskedWallet(client);
                        return;
                    }
                }

                public void onWalletPreauthorizationResult(boolean flag)
                {
                    if (flag)
                    {
                        loadMaskedWallet(client);
                    } else
                    if (cartManager.getEffectivePaymentMode().equals("PaymentModeGoogle"))
                    {
                        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FETCH_FAILURE);
                        cartManager.hideLoadingSpinner();
                        cartManager.updatePreferredPaymentMode("PaymentModeCC");
                        if (!cartManager.hasValidBillingInfo() || !cartManager.hasValidShippingInfo())
                        {
                            cartManager.getCartCheckoutActionManager().checkout();
                            return;
                        }
                    } else
                    {
                        loadMaskedWallet(client);
                        return;
                    }
                }

            
            {
                this$0 = GoogleWalletCheckoutManager.this;
                client = googleapiclient;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (final GoogleApiClient client)
        {
            trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FETCH_FAILURE);
        }
        cartManager.hideLoadingSpinner();
        cartManager.showErrorMessage(GooglePlusManager.getGoogleWalletErrorMessage(413, null));
    }

    private void loadMaskedWallet(GoogleApiClient googleapiclient)
    {
        try
        {
            GooglePlusManager.getInstance().loadMaskedWallet(googleapiclient, GooglePlusManager.createMaskedWalletRequest(cartManager), new com.contextlogic.wish.googleplus.GooglePlusManager.MaskedWalletIntentCallback() {

                final GoogleWalletCheckoutManager this$0;

                public void onMaskedWalletCancelled()
                {
                    cartManager.hideLoadingSpinner();
                }

                public void onMaskedWalletError(int i)
                {
                    trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FETCH_FAILURE);
                    cartManager.hideLoadingSpinner();
                    cartManager.showErrorMessage(GooglePlusManager.getGoogleWalletErrorMessage(i, null));
                }

                public void onMaskedWalletSuccess(MaskedWallet maskedwallet)
                {
                    trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FETCH_SUCCESS);
                    saveShippingAddress(maskedwallet);
                }

            
            {
                this$0 = GoogleWalletCheckoutManager.this;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FETCH_FAILURE);
        }
        cartManager.hideLoadingSpinner();
        cartManager.showErrorMessage(GooglePlusManager.getGoogleWalletErrorMessage(413, null));
    }

    private void saveShippingAddress(final MaskedWallet maskedWallet)
    {
        String s = maskedWallet.getShippingAddress().getName();
        String s1 = maskedWallet.getShippingAddress().getAddress1();
        String s2 = maskedWallet.getShippingAddress().getAddress2();
        String s3 = maskedWallet.getShippingAddress().getCity();
        String s4 = maskedWallet.getShippingAddress().getState();
        String s5 = maskedWallet.getShippingAddress().getPostalCode();
        String s6 = maskedWallet.getShippingAddress().getCountryCode();
        String s7 = maskedWallet.getShippingAddress().getPhoneNumber();
        updateShippingInfoService.requestService(s, s1, s2, s3, s4, s5, s6, s7, null, null, new com.contextlogic.wish.api.service.UpdateShippingInfoService.SuccessCallback() {

            final GoogleWalletCheckoutManager this$0;
            final MaskedWallet val$maskedWallet;

            public void onServiceSucceeded(WishShippingInfo wishshippinginfo, WishCart wishcart)
            {
                cartManager.hideLoadingSpinner();
                cartManager.updatePreferredPaymentMode("PaymentModeGoogle");
                cartManager.updateGoogleWalletMaskedWallet(maskedWallet);
                cartManager.updateCurrentView(new CartItemsView(cartManager), true);
            }

            
            {
                this$0 = GoogleWalletCheckoutManager.this;
                maskedWallet = maskedwallet;
                super();
            }
        }, new com.contextlogic.wish.api.service.UpdateShippingInfoService.FailureCallback() {

            final GoogleWalletCheckoutManager this$0;

            public void onServiceFailed(String s8)
            {
                cartManager.hideLoadingSpinner();
                cartManager.showErrorMessage(GooglePlusManager.getGoogleWalletErrorMessage(413, null));
            }

            
            {
                this$0 = GoogleWalletCheckoutManager.this;
                super();
            }
        });
    }

    public void checkout()
    {
        cartManager.showLoadingSpinner();
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BUY_WITH_GOOGLE);
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FETCH);
        GooglePlusManager.getInstance().getWalletClient(cartManager, cartManager.getActivity(), new com.contextlogic.wish.googleplus.GooglePlusManager.WalletClientCallback() {

            final GoogleWalletCheckoutManager this$0;

            public void onWalletClientLoadFailed(int i)
            {
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FETCH_FAILURE);
                cartManager.hideLoadingSpinner();
                cartManager.showErrorMessage(GooglePlusManager.getGoogleWalletErrorMessage(i, null));
            }

            public void onWalletClientLoaded(GoogleApiClient googleapiclient)
            {
                checkForWalletPreauthorization(googleapiclient);
            }

            
            {
                this$0 = GoogleWalletCheckoutManager.this;
                super();
            }
        });
    }

    public String getCheckoutButtonText()
    {
        return WishApplication.getAppInstance().getString(0x7f0600d8);
    }

    public boolean onBackPressed()
    {
        return false;
    }

    public boolean shouldShowPaymentCredentials()
    {
        return false;
    }



}
