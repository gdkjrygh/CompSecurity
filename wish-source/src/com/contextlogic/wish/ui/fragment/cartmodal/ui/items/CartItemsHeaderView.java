// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.items;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishBoletoInfo;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCartSummaryItem;
import com.contextlogic.wish.api.data.WishCreditCardInfo;
import com.contextlogic.wish.api.data.WishOxxoInfo;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.ui.fragment.cartmodal.CartExperimentManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.checkout.CartCheckoutActionManager;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.KlarnaPaymentProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartDataEntryCallback;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.GoogleWalletHelper;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.CartBillingView;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.CartBillingWebView;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.shipping.CartShippingView;
import com.contextlogic.wish.util.CreditCardUtil;
import com.google.android.gms.wallet.Address;
import com.google.android.gms.wallet.MaskedWallet;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.items:
//            CartSummaryRow, CartItemsView

public class CartItemsHeaderView extends LinearLayout
{

    private TextView billingText;
    private CartManager cartManager;
    private LinearLayout cartSummaryContainer;
    private TextView editBillingButton;
    private View editBillingView;
    private TextView editShippingButton;
    private View editShippingView;
    private TextView shippingText;

    public CartItemsHeaderView(CartManager cartmanager)
    {
        super(cartmanager.getActivity());
        cartManager = cartmanager;
        init();
    }

    private void init()
    {
        setOrientation(1);
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030024, this);
        cartSummaryContainer = (LinearLayout)view.findViewById(0x7f0d00ed);
        editShippingView = view.findViewById(0x7f0d00e7);
        shippingText = (TextView)view.findViewById(0x7f0d00e8);
        editShippingButton = (TextView)view.findViewById(0x7f0d00e9);
        editShippingButton.setText(getContext().getString(0x7f060135).toLowerCase());
        editShippingButton.setPaintFlags(editShippingButton.getPaintFlags() | 8);
        editShippingView.setOnClickListener(new android.view.View.OnClickListener() {

            final CartItemsHeaderView this$0;

            public void onClick(View view1)
            {
                if (cartManager.getEffectivePaymentMode().equals("PaymentModeGoogle") && cartManager.getGoogleWalletMaskedWallet() != null)
                {
                    (new GoogleWalletHelper(cartManager)).changeMaskedWallet(new com.contextlogic.wish.ui.fragment.cartmodal.ui.GoogleWalletHelper.ChangeListener() {

                        final _cls1 this$1;

                        public void onChangeCancelled()
                        {
                        }

                        public void onChangeComplete()
                        {
                            refreshView();
                        }

                        public void onChangeFailed()
                        {
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                    return;
                } else
                {
                    view1 = new CartShippingView(cartManager, new CartDataEntryCallback() {

                        final _cls1 this$1;

                        public void onCancel()
                        {
                            cartManager.updateCurrentView(new CartItemsView(cartManager), true);
                        }

                        public void onComplete()
                        {
                            cartManager.updateCurrentView(new CartItemsView(cartManager), true);
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    }, false);
                    cartManager.updateCurrentView(view1, true);
                    return;
                }
            }

            
            {
                this$0 = CartItemsHeaderView.this;
                super();
            }
        });
        editBillingView = view.findViewById(0x7f0d00ea);
        billingText = (TextView)view.findViewById(0x7f0d00eb);
        editBillingButton = (TextView)view.findViewById(0x7f0d00ec);
        editBillingButton.setText(getContext().getString(0x7f060135).toLowerCase());
        editBillingButton.setPaintFlags(editBillingButton.getPaintFlags() | 8);
        editBillingView.setOnClickListener(new android.view.View.OnClickListener() {

            final CartItemsHeaderView this$0;

            public void onClick(View view1)
            {
                if (CartExperimentManager.canCheckoutWithKlarnaHybrid(cartManager))
                {
                    view1 = KlarnaPaymentProcessor.getKlarnaCheckoutUrl(cartManager, false);
                    view1 = new CartBillingWebView(cartManager, view1);
                } else
                {
                    view1 = new CartBillingView(cartManager, new CartDataEntryCallback() {

                        final _cls2 this$1;

                        public void onCancel()
                        {
                            cartManager.updateCurrentView(new CartItemsView(cartManager), true);
                        }

                        public void onComplete()
                        {
                            cartManager.updateCurrentView(new CartItemsView(cartManager), true);
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    }, false);
                }
                cartManager.updateCurrentView(view1, true);
            }

            
            {
                this$0 = CartItemsHeaderView.this;
                super();
            }
        });
    }

    public void refreshView()
    {
        WishCart wishcart = cartManager.getCart();
        Object obj2 = cartManager.getEffectivePaymentMode();
        Object obj;
        if (cartManager.hasValidShippingInfo() && cartManager.getCartCheckoutActionManager().shouldShowPaymentCredentials())
        {
            editShippingView.setVisibility(0);
            obj = null;
            int i;
            int k;
            if (((String) (obj2)).equals("PaymentModeGoogle") && cartManager.getGoogleWalletMaskedWallet() != null)
            {
                obj = cartManager.getGoogleWalletMaskedWallet().getShippingAddress().getAddress1();
            } else
            if (cartManager.getShippingInfo() != null)
            {
                obj = cartManager.getShippingInfo().getStreetAddressLineOne();
            }
            if (obj != null)
            {
                shippingText.setText(((CharSequence) (obj)));
            } else
            {
                editShippingView.setVisibility(8);
            }
        } else
        {
            editShippingView.setVisibility(8);
        }
        if (cartManager.hasValidBillingInfo() && cartManager.getCartCheckoutActionManager().shouldShowPaymentCredentials())
        {
            editBillingView.setVisibility(0);
            Object obj1 = null;
            int j;
            if (((String) (obj2)).equals("PaymentModeGoogle") && cartManager.getGoogleWalletMaskedWallet() != null)
            {
                obj1 = getContext().getString(0x7f06021b);
                obj = cartManager.getGoogleWalletMaskedWallet();
                obj1 = (new StringBuilder()).append(((String) (obj1))).append("\n").append(((MaskedWallet) (obj)).getEmail()).toString();
                obj2 = ((MaskedWallet) (obj)).getPaymentDescriptions();
                k = obj2.length;
                i = 0;
                do
                {
                    obj = obj1;
                    if (i >= k)
                    {
                        break;
                    }
                    obj = obj2[i];
                    obj1 = (new StringBuilder()).append(((String) (obj1))).append("\n").append(((String) (obj))).toString();
                    i++;
                } while (true);
            } else
            if (((String) (obj2)).equals("PaymentModePayPal"))
            {
                obj = getContext().getString(0x7f06032b);
            } else
            if (((String) (obj2)).equals("PaymentModeKlarna"))
            {
                obj = getContext().getString(0x7f060267);
            } else
            {
                obj = obj1;
                if (cartManager.getUserBillingInfo() != null)
                {
                    if (((String) (obj2)).equals("PaymentModeBoleto"))
                    {
                        obj = getContext().getString(0x7f06009e);
                        obj = (new StringBuilder()).append(((String) (obj))).append("\n").append(String.format(getContext().getString(0x7f0600a2), new Object[] {
                            cartManager.getUserBillingInfo().getBoletoInfo().getLastFourDigits()
                        })).toString();
                    } else
                    if (((String) (obj2)).equals("PaymentModeOxxo"))
                    {
                        obj = getContext().getString(0x7f06031a);
                        obj = (new StringBuilder()).append(((String) (obj))).append("\n").append(String.format(getContext().getString(0x7f06031d), new Object[] {
                            cartManager.getUserBillingInfo().getOxxoInfo().getEmail()
                        })).toString();
                    } else
                    {
                        obj = obj1;
                        if (((String) (obj2)).equals("PaymentModeCC"))
                        {
                            obj = obj1;
                            if (cartManager.getUserBillingInfo().getCreditCardInfo(wishcart.getPaymentProcessor()) != null)
                            {
                                obj = cartManager.getUserBillingInfo().getCreditCardInfo(wishcart.getPaymentProcessor());
                                String s = CreditCardUtil.getCreditCardTypeDisplayString(((WishCreditCardInfo) (obj)).getCardType());
                                obj = (new StringBuilder()).append(s).append("\n").append(String.format("xxx-%s", new Object[] {
                                    ((WishCreditCardInfo) (obj)).getLastFourDigits()
                                })).toString();
                            }
                        }
                    }
                }
            }
            if (obj != null)
            {
                billingText.setText(((CharSequence) (obj)));
            } else
            {
                editBillingView.setVisibility(8);
            }
        } else
        {
            editBillingView.setVisibility(8);
        }
        obj = wishcart.getSummaryItems(cartManager.getEffectivePaymentMode());
        cartSummaryContainer.removeAllViews();
        for (j = 0; j < ((ArrayList) (obj)).size(); j++)
        {
            obj1 = (WishCartSummaryItem)((ArrayList) (obj)).get(j);
            obj1 = new CartSummaryRow(cartManager, ((WishCartSummaryItem) (obj1)));
            cartSummaryContainer.addView(((View) (obj1)));
        }

    }

}
