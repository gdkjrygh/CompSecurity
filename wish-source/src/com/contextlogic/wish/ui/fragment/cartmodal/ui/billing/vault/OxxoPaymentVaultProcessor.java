// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import android.os.Bundle;
import com.contextlogic.wish.analytics.CommerceLogger;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.api.service.UpdateOxxoBillingInfoService;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import java.util.HashMap;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            CartPaymentVaultProcessor

public class OxxoPaymentVaultProcessor extends CartPaymentVaultProcessor
{

    private UpdateOxxoBillingInfoService updateOxxoBillingInfoService;

    public OxxoPaymentVaultProcessor(CartManager cartmanager)
    {
        super(cartmanager);
        updateOxxoBillingInfoService = new UpdateOxxoBillingInfoService();
    }

    public void prepareTab(CartPaymentVaultProcessor.PrepareListener preparelistener)
    {
        preparelistener.onTabPrepared(this);
    }

    public void save(final CartPaymentVaultProcessor.SaveListener saveListener, Bundle bundle)
    {
        cartManager.showLoadingSpinner();
        updateOxxoBillingInfoService.cancelAllRequests();
        updateOxxoBillingInfoService.requestService(bundle.getString("ParamName"), bundle.getString("ParamEmail"), new com.contextlogic.wish.api.service.UpdateOxxoBillingInfoService.SuccessCallback() {

            final OxxoPaymentVaultProcessor this$0;
            final CartPaymentVaultProcessor val$paymentVaultProcessor;
            final CartPaymentVaultProcessor.SaveListener val$saveListener;

            public void onServiceSucceeded(WishUserBillingInfo wishuserbillinginfo)
            {
                cartManager.hideLoadingSpinner();
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_OXXO_SUCCESS);
                cartManager.updatePreferredPaymentMode("PaymentModeOxxo");
                cartManager.updateData(cartManager.getCart(), cartManager.getShippingInfo(), wishuserbillinginfo);
                saveListener.onSaveComplete(paymentVaultProcessor);
            }

            
            {
                this$0 = OxxoPaymentVaultProcessor.this;
                saveListener = savelistener;
                paymentVaultProcessor = cartpaymentvaultprocessor;
                super();
            }
        }, new com.contextlogic.wish.api.service.UpdateOxxoBillingInfoService.FailureCallback() {

            final OxxoPaymentVaultProcessor this$0;
            final CartPaymentVaultProcessor val$paymentVaultProcessor;
            final CartPaymentVaultProcessor.SaveListener val$saveListener;

            public void onServiceFailed(String s)
            {
                cartManager.hideLoadingSpinner();
                HashMap hashmap = new HashMap();
                if (s != null)
                {
                    hashmap.put("error_message", s);
                }
                CommerceLogger.logError(com.contextlogic.wish.analytics.CommerceLogger.Action.UPDATE_OXXO_BILLING_INFO, com.contextlogic.wish.analytics.CommerceLogger.Result.API_ERROR, hashmap);
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_OXXO_FAILURE);
                cartManager.hideLoadingSpinner();
                saveListener.onSaveFailed(paymentVaultProcessor, s);
            }

            
            {
                this$0 = OxxoPaymentVaultProcessor.this;
                saveListener = savelistener;
                paymentVaultProcessor = cartpaymentvaultprocessor;
                super();
            }
        });
    }
}
