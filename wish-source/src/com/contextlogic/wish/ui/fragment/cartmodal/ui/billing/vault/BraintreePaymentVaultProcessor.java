// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import android.os.Bundle;
import com.braintreepayments.api.Braintree;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.models.CardBuilder;
import com.contextlogic.wish.analytics.CommerceLogger;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCachedBillingInfo;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.api.service.GetBraintreeClientTokenService;
import com.contextlogic.wish.api.service.UpdateBraintreeBillingInfoService;
import com.contextlogic.wish.ui.components.text.standalonecreditcard.CreditCardContainer;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.user.LoggedInUser;
import java.util.HashMap;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            CartPaymentVaultProcessor

public class BraintreePaymentVaultProcessor extends CartPaymentVaultProcessor
{

    private GetBraintreeClientTokenService getBraintreeClientTokenService;
    private UpdateBraintreeBillingInfoService updateBraintreeBillingInfoService;

    public BraintreePaymentVaultProcessor(CartManager cartmanager)
    {
        super(cartmanager);
        getBraintreeClientTokenService = new GetBraintreeClientTokenService();
        updateBraintreeBillingInfoService = new UpdateBraintreeBillingInfoService();
    }

    public void prepareTab(CartPaymentVaultProcessor.PrepareListener preparelistener)
    {
        preparelistener.onTabPrepared(this);
    }

    public void save(final CartPaymentVaultProcessor.SaveListener saveListener, final Bundle billingAddress)
    {
        cartManager.showLoadingSpinner();
        final CreditCardContainer creditCardContainer = new CreditCardContainer(billingAddress.getString("ParamCreditCardNumber"), billingAddress.getString("ParamCreditCardExpiry"), billingAddress.getString("ParamCreditCardCvv"));
        billingAddress = parseBillingAddress(billingAddress);
        getBraintreeClientTokenService.requestService(new com.contextlogic.wish.api.service.GetBraintreeClientTokenService.SuccessCallback() {

            final BraintreePaymentVaultProcessor this$0;
            final WishShippingInfo val$billingAddress;
            final CreditCardContainer val$creditCardContainer;
            final CartPaymentVaultProcessor val$paymentVaultProcessor;
            final CartPaymentVaultProcessor.SaveListener val$saveListener;

            public void onServiceSucceeded(String s)
            {
                s = Braintree.getInstance(cartManager.getActivity(), s);
                s.addListener(new com.braintreepayments.api.Braintree.PaymentMethodNonceListener() {

                    final _cls1 this$1;

                    public void onPaymentMethodNonce(String s)
                    {
                        updateBraintreeBillingInfoService.requestService(s, billingAddress, new com.contextlogic.wish.api.service.UpdateBraintreeBillingInfoService.SuccessCallback() {

                            final _cls1 this$2;

                            public void onServiceSucceeded(WishUserBillingInfo wishuserbillinginfo)
                            {
                                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_SUCCESS);
                                WishCachedBillingInfo wishcachedbillinginfo = new WishCachedBillingInfo(cartManager.getActivity(), creditCardContainer.getCardNumber(), creditCardContainer.getSecurityCode(), creditCardContainer.getExpiryMonth(), creditCardContainer.getExpiryYear(), billingAddress);
                                LoggedInUser.getInstance().setCachedBillingInfo(wishcachedbillinginfo);
                                cartManager.hideLoadingSpinner();
                                cartManager.updatePreferredPaymentMode("PaymentModeCC");
                                cartManager.updateData(cartManager.getCart(), cartManager.getShippingInfo(), wishuserbillinginfo);
                                saveListener.onSaveComplete(paymentVaultProcessor);
                            }

            
            {
                this$2 = _cls1.this;
                super();
            }
                        }, new com.contextlogic.wish.api.service.UpdateBraintreeBillingInfoService.FailureCallback() {

                            final _cls1 this$2;

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
                this$2 = _cls1.this;
                super();
            }
                        });
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
                s.addListener(new com.braintreepayments.api.Braintree.ErrorListener() {

                    final _cls1 this$1;

                    public void onRecoverableError(ErrorWithResponse errorwithresponse)
                    {
                        errorwithresponse = new HashMap();
                        CommerceLogger.logError(com.contextlogic.wish.analytics.CommerceLogger.Action.NATIVE_SAVE_TABBED_BILLING_INFO, com.contextlogic.wish.analytics.CommerceLogger.Result.BRAINTREE_SDK_ERROR, errorwithresponse);
                        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_FAILURE);
                        cartManager.hideLoadingSpinner();
                        saveListener.onSaveFailed(paymentVaultProcessor, null);
                    }

                    public void onUnrecoverableError(Throwable throwable)
                    {
                        throwable = new HashMap();
                        CommerceLogger.logError(com.contextlogic.wish.analytics.CommerceLogger.Action.NATIVE_SAVE_TABBED_BILLING_INFO, com.contextlogic.wish.analytics.CommerceLogger.Result.BRAINTREE_SDK_ERROR, throwable);
                        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_FAILURE);
                        cartManager.hideLoadingSpinner();
                        saveListener.onSaveFailed(paymentVaultProcessor, null);
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
                s.tokenize((new CardBuilder()).cardNumber(creditCardContainer.getCardNumber()).expirationDate(CreditCardContainer.getFormattedExpiryDate(creditCardContainer.getExpiryMonth(), creditCardContainer.getExpiryYear())).cvv(creditCardContainer.getSecurityCode()));
            }

            
            {
                this$0 = BraintreePaymentVaultProcessor.this;
                billingAddress = wishshippinginfo;
                creditCardContainer = creditcardcontainer;
                saveListener = savelistener;
                paymentVaultProcessor = cartpaymentvaultprocessor;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final BraintreePaymentVaultProcessor this$0;
            final CartPaymentVaultProcessor val$paymentVaultProcessor;
            final CartPaymentVaultProcessor.SaveListener val$saveListener;

            public void onServiceFailed()
            {
                HashMap hashmap = new HashMap();
                CommerceLogger.logError(com.contextlogic.wish.analytics.CommerceLogger.Action.NATIVE_GET_BRAINTREE_CLIENT_TOKEN, com.contextlogic.wish.analytics.CommerceLogger.Result.API_ERROR, hashmap);
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_FAILURE);
                cartManager.hideLoadingSpinner();
                saveListener.onSaveFailed(paymentVaultProcessor, null);
            }

            
            {
                this$0 = BraintreePaymentVaultProcessor.this;
                saveListener = savelistener;
                paymentVaultProcessor = cartpaymentvaultprocessor;
                super();
            }
        });
    }

}
