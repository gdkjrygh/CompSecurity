// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.checkout.CartCheckoutActionManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.items.CartItemsView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupCartShippingView, SignupCartBillingView, SignupCartDataEntryCallback, CheckoutSignupCartManager

public class DataEntryCheckoutSignupCartManager extends CartCheckoutActionManager
{

    public DataEntryCheckoutSignupCartManager(CartManager cartmanager)
    {
        super(cartmanager);
    }

    private double extractCartValue()
    {
        if (cartManager.getCart() != null)
        {
            return cartManager.getCart().getTotal().getUsdValue();
        } else
        {
            return -1D;
        }
    }

    public void checkout()
    {
        cartManager.trackEvent(WishAnalyticsEvent.IMPRESSION_MOBILE_FREE_GIFT_SHIPPING_INFO);
        cartManager.updateCurrentView(new SignupCartShippingView(cartManager, new SignupCartDataEntryCallback() {

            final DataEntryCheckoutSignupCartManager this$0;

            public void onCancel()
            {
                DataEntryCheckoutSignupCartManager.this.Object.trackEvent(WishAnalyticsEvent.CLICK_MOBILE_FREE_GIFT_SHIPPING_BACK_BUTTON);
                ((CheckoutSignupCartManager)DataEntryCheckoutSignupCartManager.this.Object).showFreeGiftsView();
            }

            public void onClose()
            {
                DataEntryCheckoutSignupCartManager.this.Object.close();
            }

            public void onComplete()
            {
                checkoutBilling();
            }

            
            {
                this$0 = DataEntryCheckoutSignupCartManager.this;
                super();
            }
        }, true), true);
    }

    public void checkoutBilling()
    {
        cartManager.trackEvent(WishAnalyticsEvent.IMPRESSION_MOBILE_FREE_GIFT_BILLING_INFO);
        cartManager.updateCurrentView(new SignupCartBillingView(cartManager, new SignupCartDataEntryCallback() {

            final DataEntryCheckoutSignupCartManager this$0;

            public void onCancel()
            {
                DataEntryCheckoutSignupCartManager.this.Object.trackEvent(WishAnalyticsEvent.CLICK_MOBILE_FREE_GIFT_BILLING_BACK_BUTTON);
                DataEntryCheckoutSignupCartManager.this.Object.setBackButtonInfo(true);
                checkout();
            }

            public void onClose()
            {
                DataEntryCheckoutSignupCartManager.this.Object.close();
            }

            public void onComplete()
            {
                DataEntryCheckoutSignupCartManager.this.Object.getCartCheckoutActionManager().checkout();
            }

            
            {
                this$0 = DataEntryCheckoutSignupCartManager.this;
                super();
            }
        }, true), true);
    }

    public String getCheckoutButtonText()
    {
        return WishApplication.getAppInstance().getString(0x7f0600d8);
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
        return false;
    }







}
