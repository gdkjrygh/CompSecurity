// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import com.contextlogic.wish.analytics.CommerceLogger;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.api.service.UpdateStripeBillingInfoService;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.stripe.android.TokenCallback;
import com.stripe.android.model.Token;
import java.util.HashMap;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            StripePaymentVaultProcessor, CartPaymentVaultProcessor

class val.billingAddress extends TokenCallback
{

    final StripePaymentVaultProcessor this$0;
    final WishShippingInfo val$billingAddress;
    final CartPaymentVaultProcessor val$paymentVaultProcessor;
    final Listener val$saveListener;

    public void onError(Exception exception)
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_FAILURE);
        cartManager.hideLoadingSpinner();
        val$saveListener.onSaveFailed(val$paymentVaultProcessor, null);
    }

    public void onSuccess(Token token)
    {
        StripePaymentVaultProcessor.access$000(StripePaymentVaultProcessor.this).requestService(token.getId(), val$billingAddress, new com.contextlogic.wish.api.service.UpdateStripeBillingInfoService.SuccessCallback() {

            final StripePaymentVaultProcessor._cls1 this$1;

            public void onServiceSucceeded(WishUserBillingInfo wishuserbillinginfo)
            {
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_SUCCESS);
                cartManager.hideLoadingSpinner();
                cartManager.updatePreferredPaymentMode("PaymentModeCC");
                cartManager.updateData(cartManager.getCart(), cartManager.getShippingInfo(), wishuserbillinginfo);
                saveListener.onSaveComplete(paymentVaultProcessor);
            }

            
            {
                this$1 = StripePaymentVaultProcessor._cls1.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.UpdateStripeBillingInfoService.FailureCallback() {

            final StripePaymentVaultProcessor._cls1 this$1;

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
                this$1 = StripePaymentVaultProcessor._cls1.this;
                super();
            }
        });
    }

    Listener()
    {
        this$0 = final_stripepaymentvaultprocessor;
        val$saveListener = listener;
        val$paymentVaultProcessor = cartpaymentvaultprocessor;
        val$billingAddress = WishShippingInfo.this;
        super();
    }
}
