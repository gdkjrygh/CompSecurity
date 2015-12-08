// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import com.braintreepayments.api.Braintree;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.models.CardBuilder;
import com.contextlogic.wish.analytics.CommerceLogger;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCachedBillingInfo;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.api.service.UpdateBraintreeBillingInfoService;
import com.contextlogic.wish.ui.components.text.standalonecreditcard.CreditCardContainer;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.user.LoggedInUser;
import java.util.HashMap;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            BraintreePaymentVaultProcessor, CartPaymentVaultProcessor

class this._cls2
    implements com.contextlogic.wish.api.service.cessCallback
{

    final paymentVaultProcessor this$2;

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

    paymentVaultProcessor()
    {
        this$2 = this._cls2.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/cartmodal/ui/billing/vault/BraintreePaymentVaultProcessor$1

/* anonymous class */
    class BraintreePaymentVaultProcessor._cls1
        implements com.contextlogic.wish.api.service.GetBraintreeClientTokenService.SuccessCallback
    {

        final BraintreePaymentVaultProcessor this$0;
        final WishShippingInfo val$billingAddress;
        final CreditCardContainer val$creditCardContainer;
        final CartPaymentVaultProcessor val$paymentVaultProcessor;
        final CartPaymentVaultProcessor.SaveListener val$saveListener;

        public void onServiceSucceeded(String s)
        {
            s = Braintree.getInstance(cartManager.getActivity(), s);
            s.addListener(new BraintreePaymentVaultProcessor._cls1._cls1());
            s.addListener(new BraintreePaymentVaultProcessor._cls1._cls2());
            s.tokenize((new CardBuilder()).cardNumber(creditCardContainer.getCardNumber()).expirationDate(CreditCardContainer.getFormattedExpiryDate(creditCardContainer.getExpiryMonth(), creditCardContainer.getExpiryYear())).cvv(creditCardContainer.getSecurityCode()));
        }

            
            {
                this$0 = final_braintreepaymentvaultprocessor;
                billingAddress = wishshippinginfo;
                creditCardContainer = creditcardcontainer;
                saveListener = savelistener;
                paymentVaultProcessor = CartPaymentVaultProcessor.this;
                super();
            }

        // Unreferenced inner class com/contextlogic/wish/ui/fragment/cartmodal/ui/billing/vault/BraintreePaymentVaultProcessor$1$2

/* anonymous class */
        class BraintreePaymentVaultProcessor._cls1._cls2
            implements com.braintreepayments.api.Braintree.ErrorListener
        {

            final BraintreePaymentVaultProcessor._cls1 this$1;

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
                        this$1 = BraintreePaymentVaultProcessor._cls1.this;
                        super();
                    }
        }

    }


    // Unreferenced inner class com/contextlogic/wish/ui/fragment/cartmodal/ui/billing/vault/BraintreePaymentVaultProcessor$1$1

/* anonymous class */
    class BraintreePaymentVaultProcessor._cls1._cls1
        implements com.braintreepayments.api.Braintree.PaymentMethodNonceListener
    {

        final BraintreePaymentVaultProcessor._cls1 this$1;

        public void onPaymentMethodNonce(String s)
        {
            BraintreePaymentVaultProcessor.access$000(this$0).requestService(s, billingAddress, new BraintreePaymentVaultProcessor._cls1._cls1._cls1(), new BraintreePaymentVaultProcessor._cls1._cls1._cls2());
        }

            
            {
                this$1 = BraintreePaymentVaultProcessor._cls1.this;
                super();
            }

        // Unreferenced inner class com/contextlogic/wish/ui/fragment/cartmodal/ui/billing/vault/BraintreePaymentVaultProcessor$1$1$2

/* anonymous class */
        class BraintreePaymentVaultProcessor._cls1._cls1._cls2
            implements com.contextlogic.wish.api.service.UpdateBraintreeBillingInfoService.FailureCallback
        {

            final BraintreePaymentVaultProcessor._cls1._cls1 this$2;

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
                        this$2 = BraintreePaymentVaultProcessor._cls1._cls1.this;
                        super();
                    }
        }

    }

}
