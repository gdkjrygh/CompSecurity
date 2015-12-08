// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import android.os.Bundle;
import com.contextlogic.wish.analytics.CommerceLogger;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.api.service.EbanxTokenService;
import com.contextlogic.wish.api.service.UpdateEbanxBillingInfoService;
import com.contextlogic.wish.ui.components.text.standalonecreditcard.CreditCardContainer;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.util.CreditCardUtil;
import java.util.HashMap;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            CartPaymentVaultProcessor

public class EbanxPaymentVaultProcessor extends CartPaymentVaultProcessor
{

    private EbanxTokenService ebanxTokenService;
    private UpdateEbanxBillingInfoService updateEbanxBillingInfoService;

    public EbanxPaymentVaultProcessor(CartManager cartmanager)
    {
        super(cartmanager);
        ebanxTokenService = new EbanxTokenService();
        updateEbanxBillingInfoService = new UpdateEbanxBillingInfoService();
    }

    public void prepareTab(CartPaymentVaultProcessor.PrepareListener preparelistener)
    {
        preparelistener.onTabPrepared(this);
    }

    public void save(final CartPaymentVaultProcessor.SaveListener saveListener, final Bundle parameters)
    {
        cartManager.showLoadingSpinner();
        CreditCardContainer creditcardcontainer = new CreditCardContainer(parameters.getString("ParamCreditCardNumber"), parameters.getString("ParamCreditCardExpiry"), parameters.getString("ParamCreditCardCvv"));
        final WishShippingInfo billingAddress = parseBillingAddress(parameters);
        ebanxTokenService.requestService(creditcardcontainer.getCardNumber(), creditcardcontainer.getExpiryMonth(), creditcardcontainer.getExpiryYear(), creditcardcontainer.getSecurityCode(), CreditCardUtil.getCardType(creditcardcontainer.getCardNumber()), billingAddress, new com.contextlogic.wish.api.service.EbanxTokenService.SuccessCallback() {

            final EbanxPaymentVaultProcessor this$0;
            final WishShippingInfo val$billingAddress;
            final Bundle val$parameters;
            final CartPaymentVaultProcessor val$paymentVaultProcessor;
            final CartPaymentVaultProcessor.SaveListener val$saveListener;

            public void onServiceSucceeded(String s, String s1, String s2)
            {
                updateEbanxBillingInfoService.requestService(s, s1, s2, parameters.getString("ParamIdentityNumber"), parameters.getString("ParamEmail"), billingAddress, new com.contextlogic.wish.api.service.UpdateEbanxBillingInfoService.SuccessCallback() {

                    final _cls1 this$1;

                    public void onServiceSucceeded(WishUserBillingInfo wishuserbillinginfo)
                    {
                        cartManager.hideLoadingSpinner();
                        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_SUCCESS);
                        cartManager.updatePreferredPaymentMode("PaymentModeCC");
                        cartManager.updateData(cartManager.getCart(), cartManager.getShippingInfo(), wishuserbillinginfo);
                        saveListener.onSaveComplete(paymentVaultProcessor);
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                }, new com.contextlogic.wish.api.service.UpdateEbanxBillingInfoService.FailureCallback() {

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
                this$0 = EbanxPaymentVaultProcessor.this;
                parameters = bundle;
                billingAddress = wishshippinginfo;
                saveListener = savelistener;
                paymentVaultProcessor = cartpaymentvaultprocessor;
                super();
            }
        }, new com.contextlogic.wish.api.service.EbanxTokenService.FailureCallback() {

            final EbanxPaymentVaultProcessor this$0;
            final CartPaymentVaultProcessor val$paymentVaultProcessor;
            final CartPaymentVaultProcessor.SaveListener val$saveListener;

            public void onServiceFailed(String s)
            {
                HashMap hashmap = new HashMap();
                hashmap.put("error_message", s);
                CommerceLogger.logError(com.contextlogic.wish.analytics.CommerceLogger.Action.NATIVE_SAVE_TABBED_BILLING_INFO, com.contextlogic.wish.analytics.CommerceLogger.Result.EBANX_SDK_ERROR, hashmap);
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_FAILURE);
                cartManager.hideLoadingSpinner();
                saveListener.onSaveFailed(paymentVaultProcessor, s);
            }

            
            {
                this$0 = EbanxPaymentVaultProcessor.this;
                saveListener = savelistener;
                paymentVaultProcessor = cartpaymentvaultprocessor;
                super();
            }
        });
    }

}
