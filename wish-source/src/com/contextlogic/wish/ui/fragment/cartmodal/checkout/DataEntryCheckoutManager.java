// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.checkout;

import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartDataEntryCallback;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.CartBillingView;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.items.CartItemsView;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.shipping.CartShippingView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.checkout:
//            CartCheckoutActionManager

public class DataEntryCheckoutManager extends CartCheckoutActionManager
{

    private double initialCartValue;
    private boolean mustReviewOrder;
    private boolean shouldReturnToCart;

    public DataEntryCheckoutManager(CartManager cartmanager)
    {
        super(cartmanager);
        initialCartValue = extractCartValue();
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
        if (!cartManager.hasValidBillingInfo())
        {
            shouldReturnToCart = true;
            cartManager.updateCurrentView(new CartBillingView(cartManager, new CartDataEntryCallback() {

                final DataEntryCheckoutManager this$0;

                public void onCancel()
                {
                    cartManager.updateCurrentView(new CartItemsView(cartManager), true);
                }

                public void onComplete()
                {
                    if (cartManager.getEffectivePaymentMode().equals("PaymentModeGoogle"))
                    {
                        mustReviewOrder = true;
                    }
                    checkout();
                }

            
            {
                this$0 = DataEntryCheckoutManager.this;
                super();
            }
            }, true), true);
        } else
        {
            if (!cartManager.hasValidShippingInfo())
            {
                shouldReturnToCart = true;
                cartManager.updateCurrentView(new CartShippingView(cartManager, new CartDataEntryCallback() {

                    final DataEntryCheckoutManager this$0;

                    public void onCancel()
                    {
                        cartManager.updateCurrentView(new CartItemsView(cartManager), true);
                    }

                    public void onComplete()
                    {
                        checkout();
                    }

            
            {
                this$0 = DataEntryCheckoutManager.this;
                super();
            }
                }, true), true);
                return;
            }
            shouldReturnToCart = false;
            if (!(cartManager.getCurrentUiView() instanceof CartItemsView))
            {
                cartManager.updateCurrentView(new CartItemsView(cartManager), true);
            }
            if (initialCartValue == extractCartValue() && !mustReviewOrder)
            {
                cartManager.getCartCheckoutActionManager().checkout();
                return;
            }
        }
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
        return true;
    }


/*
    static boolean access$002(DataEntryCheckoutManager dataentrycheckoutmanager, boolean flag)
    {
        dataentrycheckoutmanager.mustReviewOrder = flag;
        return flag;
    }

*/
}
