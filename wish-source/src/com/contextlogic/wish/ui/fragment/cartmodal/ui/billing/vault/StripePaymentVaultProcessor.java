// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import android.os.Bundle;
import com.contextlogic.wish.analytics.CommerceLogger;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.api.service.UpdateStripeBillingInfoService;
import com.contextlogic.wish.ui.components.text.standalonecreditcard.CreditCardContainer;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.user.UserStatusManager;
import com.stripe.android.Stripe;
import com.stripe.android.TokenCallback;
import com.stripe.android.model.Card;
import com.stripe.android.model.Token;
import java.util.HashMap;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            CartPaymentVaultProcessor

public class StripePaymentVaultProcessor extends CartPaymentVaultProcessor
{

    private UpdateStripeBillingInfoService updateStripeBillingInfoService;

    public StripePaymentVaultProcessor(CartManager cartmanager)
    {
        super(cartmanager);
        updateStripeBillingInfoService = new UpdateStripeBillingInfoService();
    }

    public void prepareTab(CartPaymentVaultProcessor.PrepareListener preparelistener)
    {
        preparelistener.onTabPrepared(this);
    }

    public void save(final CartPaymentVaultProcessor.SaveListener saveListener, final Bundle billingAddress)
    {
        cartManager.showLoadingSpinner();
        Object obj = new CreditCardContainer(billingAddress.getString("ParamCreditCardNumber"), billingAddress.getString("ParamCreditCardExpiry"), billingAddress.getString("ParamCreditCardCvv"));
        billingAddress = parseBillingAddress(billingAddress);
        try
        {
            obj = new Card(((CreditCardContainer) (obj)).getCardNumber(), Integer.valueOf(((CreditCardContainer) (obj)).getExpiryMonth()), Integer.valueOf(((CreditCardContainer) (obj)).getExpiryYear()), ((CreditCardContainer) (obj)).getSecurityCode());
            if (billingAddress.getName() != null)
            {
                ((Card) (obj)).setName(billingAddress.getName());
            }
            if (billingAddress.getStreetAddressLineOne() != null)
            {
                ((Card) (obj)).setAddressLine1(billingAddress.getStreetAddressLineOne());
            }
            if (billingAddress.getStreetAddressLineTwo() != null)
            {
                ((Card) (obj)).setAddressLine2(billingAddress.getStreetAddressLineTwo());
            }
            if (billingAddress.getCity() != null)
            {
                ((Card) (obj)).setAddressCity(billingAddress.getCity());
            }
            if (billingAddress.getState() != null)
            {
                ((Card) (obj)).setAddressState(billingAddress.getState());
            }
            if (billingAddress.getZipCode() != null)
            {
                ((Card) (obj)).setAddressZip(billingAddress.getZipCode());
            }
            if (billingAddress.getCountryCode() != null)
            {
                ((Card) (obj)).setAddressCountry(billingAddress.getCountryCode());
            }
            (new Stripe(UserStatusManager.getInstance().getStripeKey())).createToken(((Card) (obj)), new TokenCallback() {

                final StripePaymentVaultProcessor this$0;
                final WishShippingInfo val$billingAddress;
                final CartPaymentVaultProcessor val$paymentVaultProcessor;
                final CartPaymentVaultProcessor.SaveListener val$saveListener;

                public void onError(Exception exception)
                {
                    trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_FAILURE);
                    cartManager.hideLoadingSpinner();
                    saveListener.onSaveFailed(paymentVaultProcessor, null);
                }

                public void onSuccess(Token token)
                {
                    updateStripeBillingInfoService.requestService(token.getId(), billingAddress, new com.contextlogic.wish.api.service.UpdateStripeBillingInfoService.SuccessCallback() {

                        final _cls1 this$1;

                        public void onServiceSucceeded(WishUserBillingInfo wishuserbillinginfo)
                        {
                            trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_SUCCESS);
                            cartManager.hideLoadingSpinner();
                            cartManager.updatePreferredPaymentMode("PaymentModeCC");
                            cartManager.updateData(cartManager.getCart(), cartManager.getShippingInfo(), wishuserbillinginfo);
                            saveListener.onSaveComplete(paymentVaultProcessor);
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    }, new com.contextlogic.wish.api.service.UpdateStripeBillingInfoService.FailureCallback() {

                        final _cls1 this$1;

                        public void onServiceFailed(String s)
                        {
                            HashMap hashmap = new HashMap();
                            if (s != null)
                            {
                                hashmap.put("error_message", s);
                            }
                            CommerceLogger.logError(com.contextlogic.wish.analytics.CommerceLogger.Action.NATIVE_SAVE_TABBED_BILLING_INFO, com.contextlogic.wish.analytics.CommerceLogger.Result.API_ERROR, hashmap);
                            trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_FAILURE);
                            cartManager.hideLoadingSpinner();
                            saveListener.onSaveFailed(paymentVaultProcessor, s);
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                }

            
            {
                this$0 = StripePaymentVaultProcessor.this;
                saveListener = savelistener;
                paymentVaultProcessor = cartpaymentvaultprocessor;
                billingAddress = wishshippinginfo;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (final Bundle billingAddress)
        {
            obj = new HashMap();
        }
        if (billingAddress.getMessage() != null)
        {
            ((HashMap) (obj)).put("error_message", billingAddress.getMessage());
        }
        CommerceLogger.logError(com.contextlogic.wish.analytics.CommerceLogger.Action.NATIVE_SAVE_TABBED_BILLING_INFO, com.contextlogic.wish.analytics.CommerceLogger.Result.STRIPE_SDK_ERROR, ((HashMap) (obj)));
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_FAILURE);
        cartManager.hideLoadingSpinner();
        saveListener.onSaveFailed(this, null);
    }

}
