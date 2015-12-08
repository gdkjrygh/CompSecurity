// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import android.os.Bundle;
import com.adyen.clientencryption.Card;
import com.adyen.clientencryption.Encrypter;
import com.contextlogic.wish.analytics.CommerceLogger;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.api.service.UpdateAdyenBillingInfoService;
import com.contextlogic.wish.ui.components.text.standalonecreditcard.CreditCardContainer;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.user.UserStatusManager;
import com.contextlogic.wish.util.CreditCardUtil;
import java.util.Date;
import java.util.HashMap;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            CartPaymentVaultProcessor

public class AdyenPaymentVaultProcessor extends CartPaymentVaultProcessor
{

    private UpdateAdyenBillingInfoService updateAdyenBillingInfoService;

    public AdyenPaymentVaultProcessor(CartManager cartmanager)
    {
        super(cartmanager);
        updateAdyenBillingInfoService = new UpdateAdyenBillingInfoService();
    }

    public void prepareTab(CartPaymentVaultProcessor.PrepareListener preparelistener)
    {
        preparelistener.onTabPrepared(this);
    }

    public void save(final CartPaymentVaultProcessor.SaveListener saveListener, Bundle bundle)
    {
        cartManager.showLoadingSpinner();
        Object obj = new CreditCardContainer(bundle.getString("ParamCreditCardNumber"), bundle.getString("ParamCreditCardExpiry"), bundle.getString("ParamCreditCardCvv"));
        WishShippingInfo wishshippinginfo = parseBillingAddress(bundle);
        String s1 = CreditCardUtil.sanitizeCreditCardNumber(((CreditCardContainer) (obj)).getCardNumber());
        String s = s1.substring(s1.length() - 4);
        com.adyen.clientencryption.Card.Builder builder = (new com.adyen.clientencryption.Card.Builder(new Date())).number(s1).cvc(((CreditCardContainer) (obj)).getSecurityCode());
        if (((CreditCardContainer) (obj)).getExpiryMonth() < 10)
        {
            bundle = (new StringBuilder()).append("0").append(((CreditCardContainer) (obj)).getExpiryMonth()).toString();
        } else
        {
            bundle = Integer.toString(((CreditCardContainer) (obj)).getExpiryMonth());
        }
        bundle = builder.expiryMonth(bundle).expiryYear(Integer.toString(((CreditCardContainer) (obj)).getExpiryYear())).holderName(wishshippinginfo.getName()).build();
        obj = CreditCardUtil.getCreditCardTypeString(CreditCardUtil.getCardType(s1));
        try
        {
            bundle = (new Encrypter(UserStatusManager.getInstance().getAdyenKey())).encrypt(bundle.toString());
            updateAdyenBillingInfoService.requestService(bundle, s, ((String) (obj)), wishshippinginfo, new com.contextlogic.wish.api.service.UpdateAdyenBillingInfoService.SuccessCallback() {

                final AdyenPaymentVaultProcessor this$0;
                final CartPaymentVaultProcessor val$paymentVaultProcessor;
                final CartPaymentVaultProcessor.SaveListener val$saveListener;

                public void onServiceSucceeded(WishUserBillingInfo wishuserbillinginfo)
                {
                    trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_SUCCESS);
                    cartManager.hideLoadingSpinner();
                    cartManager.updatePreferredPaymentMode("PaymentModeCC");
                    cartManager.updateData(cartManager.getCart(), cartManager.getShippingInfo(), wishuserbillinginfo);
                    saveListener.onSaveComplete(paymentVaultProcessor);
                }

            
            {
                this$0 = AdyenPaymentVaultProcessor.this;
                saveListener = savelistener;
                paymentVaultProcessor = cartpaymentvaultprocessor;
                super();
            }
            }, new com.contextlogic.wish.api.service.UpdateAdyenBillingInfoService.FailureCallback() {

                final AdyenPaymentVaultProcessor this$0;
                final CartPaymentVaultProcessor val$paymentVaultProcessor;
                final CartPaymentVaultProcessor.SaveListener val$saveListener;

                public void onServiceFailed(String s2)
                {
                    HashMap hashmap = new HashMap();
                    if (s2 != null)
                    {
                        hashmap.put("error_message", s2);
                    }
                    CommerceLogger.logError(com.contextlogic.wish.analytics.CommerceLogger.Action.NATIVE_SAVE_TABBED_BILLING_INFO, com.contextlogic.wish.analytics.CommerceLogger.Result.API_ERROR, hashmap);
                    trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_FAILURE);
                    cartManager.hideLoadingSpinner();
                    saveListener.onSaveFailed(paymentVaultProcessor, s2);
                }

            
            {
                this$0 = AdyenPaymentVaultProcessor.this;
                saveListener = savelistener;
                paymentVaultProcessor = cartpaymentvaultprocessor;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle = new HashMap();
        }
        CommerceLogger.logError(com.contextlogic.wish.analytics.CommerceLogger.Action.NATIVE_SAVE_TABBED_BILLING_INFO, com.contextlogic.wish.analytics.CommerceLogger.Result.ADYEN_SDK_ERROR, bundle);
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_FAILURE);
        cartManager.hideLoadingSpinner();
        saveListener.onSaveFailed(this, null);
    }
}
