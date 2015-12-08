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

class this._cls1
    implements com.contextlogic.wish.api.service.ailureCallback
{

    final l.paymentVaultProcessor this$1;

    public void onServiceFailed(String s)
    {
        HashMap hashmap = new HashMap();
        if (s != null)
        {
            hashmap.put("error_message", s);
        }
        CommerceLogger.logError(com.contextlogic.wish.analytics.E_TABBED_BILLING_INFO, com.contextlogic.wish.analytics.E_TABBED_BILLING_INFO, hashmap);
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_FAILURE);
        cartManager.hideLoadingSpinner();
        saveListener.onSaveFailed(paymentVaultProcessor, s);
    }

    l.billingAddress()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/cartmodal/ui/billing/vault/StripePaymentVaultProcessor$1

/* anonymous class */
    class StripePaymentVaultProcessor._cls1 extends TokenCallback
    {

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
            StripePaymentVaultProcessor.access$000(StripePaymentVaultProcessor.this).requestService(token.getId(), billingAddress, new StripePaymentVaultProcessor._cls1._cls1(), new StripePaymentVaultProcessor._cls1._cls2());
        }

            
            {
                this$0 = final_stripepaymentvaultprocessor;
                saveListener = savelistener;
                paymentVaultProcessor = cartpaymentvaultprocessor;
                billingAddress = WishShippingInfo.this;
                super();
            }

        // Unreferenced inner class com/contextlogic/wish/ui/fragment/cartmodal/ui/billing/vault/StripePaymentVaultProcessor$1$1

/* anonymous class */
        class StripePaymentVaultProcessor._cls1._cls1
            implements com.contextlogic.wish.api.service.UpdateStripeBillingInfoService.SuccessCallback
        {

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
        }

    }

}
