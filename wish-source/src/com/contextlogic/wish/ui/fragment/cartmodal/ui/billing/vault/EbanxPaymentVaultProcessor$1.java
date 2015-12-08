// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import android.os.Bundle;
import com.contextlogic.wish.analytics.CommerceLogger;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.api.service.UpdateEbanxBillingInfoService;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import java.util.HashMap;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            EbanxPaymentVaultProcessor, CartPaymentVaultProcessor

class val.paymentVaultProcessor
    implements com.contextlogic.wish.api.service.back
{

    final EbanxPaymentVaultProcessor this$0;
    final WishShippingInfo val$billingAddress;
    final Bundle val$parameters;
    final CartPaymentVaultProcessor val$paymentVaultProcessor;
    final eListener val$saveListener;

    public void onServiceSucceeded(String s, String s1, String s2)
    {
        EbanxPaymentVaultProcessor.access$000(EbanxPaymentVaultProcessor.this).requestService(s, s1, s2, val$parameters.getString("ParamIdentityNumber"), val$parameters.getString("ParamEmail"), val$billingAddress, new com.contextlogic.wish.api.service.UpdateEbanxBillingInfoService.SuccessCallback() {

            final EbanxPaymentVaultProcessor._cls1 this$1;

            public void onServiceSucceeded(WishUserBillingInfo wishuserbillinginfo)
            {
                cartManager.hideLoadingSpinner();
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_SUCCESS);
                cartManager.updatePreferredPaymentMode("PaymentModeCC");
                cartManager.updateData(cartManager.getCart(), cartManager.getShippingInfo(), wishuserbillinginfo);
                saveListener.onSaveComplete(paymentVaultProcessor);
            }

            
            {
                this$1 = EbanxPaymentVaultProcessor._cls1.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.UpdateEbanxBillingInfoService.FailureCallback() {

            final EbanxPaymentVaultProcessor._cls1 this$1;

            public void onServiceFailed(String s3)
            {
                HashMap hashmap = new HashMap();
                if (s3 != null)
                {
                    hashmap.put("error_message", s3);
                }
                CommerceLogger.logError(com.contextlogic.wish.analytics.CommerceLogger.Action.NATIVE_SAVE_TABBED_BILLING_INFO, com.contextlogic.wish.analytics.CommerceLogger.Result.API_ERROR, hashmap);
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_FAILURE);
                cartManager.hideLoadingSpinner();
                saveListener.onSaveFailed(paymentVaultProcessor, s3);
            }

            
            {
                this$1 = EbanxPaymentVaultProcessor._cls1.this;
                super();
            }
        });
    }

    eListener()
    {
        this$0 = final_ebanxpaymentvaultprocessor;
        val$parameters = bundle;
        val$billingAddress = wishshippinginfo;
        val$saveListener = elistener;
        val$paymentVaultProcessor = CartPaymentVaultProcessor.this;
        super();
    }
}
