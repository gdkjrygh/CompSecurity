// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.checkout;

import android.os.Bundle;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiConfig;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.ui.fragment.cartmodal.CartExperimentManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.AdyenCreditCardPaymentProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.BoletoPaymentProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.BraintreeCreditCardPaymentProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.CartPaymentProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.EbanxCreditCardPaymentProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.FuturePayPalPaymentProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.GoogleWalletPaymentProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.KlarnaPaymentProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.NativePayPalPaymentProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.NonNativePayPalPaymentProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.OxxoPaymentProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.StripeCreditCardPaymentProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.CartBillingWebView;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.items.CartItemsView;
import com.contextlogic.wish.ui.fragment.signup.SignupCartBillingView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.checkout:
//            CartCheckoutActionManager

public class PlaceOrderCheckoutManager extends CartCheckoutActionManager
{

    private CartPaymentProcessor cartPaymentProcessor;

    public PlaceOrderCheckoutManager(CartManager cartmanager, String s)
    {
        super(cartmanager);
        if (s.equals("PaymentModeGoogle"))
        {
            cartPaymentProcessor = new GoogleWalletPaymentProcessor(cartmanager);
        } else
        {
            if (s.equals("PaymentModeKlarna"))
            {
                cartPaymentProcessor = new KlarnaPaymentProcessor(cartmanager);
                return;
            }
            if (s.equals("PaymentModePayPal"))
            {
                if (CartExperimentManager.canCheckoutWithFuturePayPal(cartmanager))
                {
                    cartPaymentProcessor = new FuturePayPalPaymentProcessor(cartmanager);
                    return;
                }
                if (CartExperimentManager.usesNativePayPalCheckout(cartmanager))
                {
                    cartPaymentProcessor = new NativePayPalPaymentProcessor(cartmanager);
                    return;
                } else
                {
                    cartPaymentProcessor = new NonNativePayPalPaymentProcessor(cartmanager);
                    return;
                }
            }
            if (s.equals("PaymentModeBoleto"))
            {
                cartPaymentProcessor = new BoletoPaymentProcessor(cartmanager);
                return;
            }
            if (s.equals("PaymentModeOxxo"))
            {
                cartPaymentProcessor = new OxxoPaymentProcessor(cartmanager);
                return;
            }
            if (s.equals("PaymentModeCC"))
            {
                if (cartmanager.getCart().getPaymentProcessor() == com.contextlogic.wish.api.data.WishCart.PaymentProcessor.Stripe)
                {
                    cartPaymentProcessor = new StripeCreditCardPaymentProcessor(cartmanager);
                    return;
                }
                if (cartmanager.getCart().getPaymentProcessor() == com.contextlogic.wish.api.data.WishCart.PaymentProcessor.Ebanx)
                {
                    cartPaymentProcessor = new EbanxCreditCardPaymentProcessor(cartmanager);
                    return;
                }
                if (cartmanager.getCart().getPaymentProcessor() == com.contextlogic.wish.api.data.WishCart.PaymentProcessor.Adyen)
                {
                    cartPaymentProcessor = new AdyenCreditCardPaymentProcessor(cartmanager);
                    return;
                }
                if (cartmanager.getCart().getPaymentProcessor() == com.contextlogic.wish.api.data.WishCart.PaymentProcessor.Braintree)
                {
                    cartPaymentProcessor = new BraintreeCreditCardPaymentProcessor(cartmanager);
                    return;
                }
            }
        }
    }

    public void checkout()
    {
        final CartManager cartManager = this.cartManager;
        if (!(cartPaymentProcessor instanceof KlarnaPaymentProcessor))
        {
            cartManager.showLoadingSpinner();
        }
        cartPaymentProcessor.checkout(new com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.CartPaymentProcessor.SuccessListener() {

            final PlaceOrderCheckoutManager this$0;
            final CartManager val$cartManager;

            public void onSuccess(CartPaymentProcessor cartpaymentprocessor, Bundle bundle)
            {
                cartManager.hideLoadingSpinner();
                if (!bundle.containsKey(CartPaymentProcessor.DATA_KEY_BUY_URL)) goto _L2; else goto _L1
_L1:
                cartpaymentprocessor = bundle.getString(CartPaymentProcessor.DATA_KEY_BUY_URL);
                if (!bundle.containsKey(CartPaymentProcessor.DATA_KEY_SHOW_IN_MODAL)) goto _L4; else goto _L3
_L3:
                cartManager.updateCurrentView(new CartBillingWebView(cartManager, cartpaymentprocessor), true);
_L6:
                return;
_L4:
                cartManager.showBrowser(cartpaymentprocessor, true);
                return;
_L2:
                if (bundle.containsKey(CartPaymentProcessor.DATA_KEY_TRANSACTION_ID))
                {
                    cartManager.showBrowser(String.format("https://%s/m/purchase-confirmation?tid=%s", new Object[] {
                        WishApi.getInstance().getConfig().getApiBaseUrlString(), bundle.getString(CartPaymentProcessor.DATA_KEY_TRANSACTION_ID)
                    }), true);
                    return;
                }
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                this$0 = PlaceOrderCheckoutManager.this;
                cartManager = cartmanager;
                super();
            }
        }, new com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.CartPaymentProcessor.FailureListener() {

            final PlaceOrderCheckoutManager this$0;
            final CartManager val$cartManager;

            public void onCancel(CartPaymentProcessor cartpaymentprocessor)
            {
                cartManager.hideLoadingSpinner();
                if (!(cartManager.getCurrentUiView() instanceof CartItemsView) && !(cartManager.getCurrentUiView() instanceof SignupCartBillingView))
                {
                    cartManager.updateCurrentView(new CartItemsView(cartManager), false);
                }
            }

            public void onFailure(CartPaymentProcessor cartpaymentprocessor, Bundle bundle)
            {
                cartManager.hideLoadingSpinner();
                cartpaymentprocessor = bundle.getString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE);
                cartManager.showErrorMessage(cartpaymentprocessor, WishApplication.getAppInstance().getString(0x7f060456));
            }

            
            {
                this$0 = PlaceOrderCheckoutManager.this;
                cartManager = cartmanager;
                super();
            }
        });
    }

    public String getCheckoutButtonText()
    {
        return WishApplication.getAppInstance().getString(0x7f060341);
    }

    public boolean onBackPressed()
    {
        boolean flag = false;
        if (!(cartManager.getCurrentUiView() instanceof CartItemsView))
        {
            cartManager.updateCurrentView(new CartItemsView(cartManager), false);
            flag = true;
        }
        return flag;
    }

    public boolean shouldShowPaymentCredentials()
    {
        return true;
    }
}
