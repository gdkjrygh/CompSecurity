// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.ui.fragment.cartmodal.CartExperimentManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.AdyenPaymentVaultProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.BoletoPaymentVaultProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.BraintreePaymentVaultProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.CartPaymentVaultProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.EbanxPaymentVaultProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.FuturePayPalPaymentVaultProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.GoogleWalletPaymentVaultProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.OxxoPaymentVaultProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.PayPalPaymentVaultProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.StripePaymentVaultProcessor;

public abstract class CartBaseBillingHeader extends LinearLayout
{
    public static interface Callback
    {

        public abstract void onSectionSelected(CartBillingSection cartbillingsection, CartBillingSection cartbillingsection1);
    }

    public static final class CartBillingSection extends Enum
    {

        private static final CartBillingSection $VALUES[];
        public static final CartBillingSection BOLETO;
        public static final CartBillingSection CREDIT_CARD;
        public static final CartBillingSection GOOGLE_WALLET;
        public static final CartBillingSection OXXO;
        public static final CartBillingSection PAYPAL;

        public static CartBillingSection valueOf(String s)
        {
            return (CartBillingSection)Enum.valueOf(com/contextlogic/wish/ui/fragment/cartmodal/ui/billing/CartBaseBillingHeader$CartBillingSection, s);
        }

        public static CartBillingSection[] values()
        {
            return (CartBillingSection[])$VALUES.clone();
        }

        static 
        {
            CREDIT_CARD = new CartBillingSection("CREDIT_CARD", 0);
            GOOGLE_WALLET = new CartBillingSection("GOOGLE_WALLET", 1);
            BOLETO = new CartBillingSection("BOLETO", 2);
            OXXO = new CartBillingSection("OXXO", 3);
            PAYPAL = new CartBillingSection("PAYPAL", 4);
            $VALUES = (new CartBillingSection[] {
                CREDIT_CARD, GOOGLE_WALLET, BOLETO, OXXO, PAYPAL
            });
        }

        private CartBillingSection(String s, int i)
        {
            super(s, i);
        }
    }


    private Callback callback;
    protected CartManager cartManager;

    public CartBaseBillingHeader(Context context)
    {
        super(context);
    }

    public CartBaseBillingHeader(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void alertCallbackOnSectionSelected(CartBillingSection cartbillingsection, CartBillingSection cartbillingsection1)
    {
        if (callback != null)
        {
            callback.onSectionSelected(cartbillingsection, cartbillingsection1);
        }
    }

    public abstract void deselectAllSections();

    protected int getNumActivePaymentMethods()
    {
        int j = 0;
        CartBillingSection acartbillingsection[] = CartBillingSection.values();
        int l = acartbillingsection.length;
        for (int i = 0; i < l;)
        {
            int k = j;
            if (isSectionVisible(acartbillingsection[i]))
            {
                k = j + 1;
            }
            i++;
            j = k;
        }

        return j;
    }

    protected WishAnalyticsEvent getSectionAnalyticEvent(CartBillingSection cartbillingsection)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection = new int[CartBillingSection.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection[CartBillingSection.CREDIT_CARD.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection[CartBillingSection.GOOGLE_WALLET.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection[CartBillingSection.BOLETO.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection[CartBillingSection.OXXO.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection[CartBillingSection.PAYPAL.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.CartBaseBillingHeader.CartBillingSection[cartbillingsection.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_CC_TAB;

        case 2: // '\002'
            return WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_GWALLET_TAB;

        case 3: // '\003'
            return WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_BOLETO_TAB;

        case 4: // '\004'
            return WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_OXXO_TAB;

        case 5: // '\005'
            return WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_PAYPAL_TAB;
        }
    }

    protected CartBillingSection getSelectedSection()
    {
        Object obj = null;
        CartBillingSection acartbillingsection[] = CartBillingSection.values();
        int j = acartbillingsection.length;
        int i = 0;
        do
        {
label0:
            {
                CartBillingSection cartbillingsection = obj;
                if (i < j)
                {
                    cartbillingsection = acartbillingsection[i];
                    if (!isSectionSelected(cartbillingsection))
                    {
                        break label0;
                    }
                }
                return cartbillingsection;
            }
            i++;
        } while (true);
    }

    public CartPaymentVaultProcessor getVaultProcessor(CartManager cartmanager)
    {
        return getVaultProcessorForSection(getSelectedSection(), cartmanager);
    }

    protected CartPaymentVaultProcessor getVaultProcessorForSection(CartBillingSection cartbillingsection, CartManager cartmanager)
    {
        _cls1..SwitchMap.com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.CartBaseBillingHeader.CartBillingSection[cartbillingsection.ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 46
    //                   2 142
    //                   3 151
    //                   4 160
    //                   5 169;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return null;
_L2:
        if (cartmanager.getCart().getPaymentProcessor() == com.contextlogic.wish.api.data.WishCart.PaymentProcessor.Stripe)
        {
            return new StripePaymentVaultProcessor(cartmanager);
        }
        if (cartmanager.getCart().getPaymentProcessor() == com.contextlogic.wish.api.data.WishCart.PaymentProcessor.Ebanx)
        {
            return new EbanxPaymentVaultProcessor(cartmanager);
        }
        if (cartmanager.getCart().getPaymentProcessor() == com.contextlogic.wish.api.data.WishCart.PaymentProcessor.Adyen)
        {
            return new AdyenPaymentVaultProcessor(cartmanager);
        }
        if (cartmanager.getCart().getPaymentProcessor() == com.contextlogic.wish.api.data.WishCart.PaymentProcessor.Braintree)
        {
            return new BraintreePaymentVaultProcessor(cartmanager);
        }
          goto _L1
_L3:
        return new GoogleWalletPaymentVaultProcessor(cartmanager);
_L4:
        return new BoletoPaymentVaultProcessor(cartmanager);
_L5:
        return new OxxoPaymentVaultProcessor(cartmanager);
_L6:
        if (CartExperimentManager.canCheckoutWithFuturePayPal(cartmanager))
        {
            return new FuturePayPalPaymentVaultProcessor(cartmanager);
        } else
        {
            return new PayPalPaymentVaultProcessor(cartmanager);
        }
    }

    public abstract boolean isSectionSelected(CartBillingSection cartbillingsection);

    public abstract boolean isSectionVisible(CartBillingSection cartbillingsection);

    protected void logSectionSelection(CartBillingSection cartbillingsection)
    {
        if (!isSectionSelected(cartbillingsection))
        {
            cartbillingsection = getSectionAnalyticEvent(cartbillingsection);
            if (cartbillingsection != null)
            {
                (new LogService()).requestService(Integer.toString(cartbillingsection.getValue()), null, null, null);
            }
        }
    }

    public void selectSection(CartBillingSection cartbillingsection)
    {
        selectSection(cartbillingsection, false);
    }

    public abstract void selectSection(CartBillingSection cartbillingsection, boolean flag);

    public void setCallback(Callback callback1)
    {
        callback = callback1;
    }

    public void setCartManager(CartManager cartmanager)
    {
        cartManager = cartmanager;
    }

    public abstract void setSectionVisible(CartBillingSection cartbillingsection, boolean flag);
}
