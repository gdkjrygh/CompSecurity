// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCartItem;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishSignupFreeGiftCart;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.components.text.UnifiedFontTextView;
import com.contextlogic.wish.ui.fragment.cartmodal.CartExperimentManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartDataEntryCallback;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.CartBillingHeader;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.CartBillingView;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            CheckoutSignupCartManager, SignupCartDataEntryCallback

public class SignupCartBillingView extends CartBillingView
{

    private LinearLayout addressPlaceholder;
    private TextView addressPlaceholderText;

    public SignupCartBillingView(CartManager cartmanager, SignupCartDataEntryCallback signupcartdataentrycallback, boolean flag)
    {
        super(cartmanager, signupcartdataentrycallback, flag);
    }

    private void close()
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(getContext())).create();
        alertdialog.setTitle(getContext().getString(0x7f060073));
        alertdialog.setMessage(getContext().getString(0x7f06012c));
        alertdialog.setButton2(getContext().getString(0x7f060488), new android.content.DialogInterface.OnClickListener() );
        alertdialog.setButton(getContext().getString(0x7f0602d8), new android.content.DialogInterface.OnClickListener() {

            final SignupCartBillingView this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                this$0 = SignupCartBillingView.this;
                super();
            }
        });
        alertdialog.show();
    }

    protected String getNextButtonText()
    {
        return ((CheckoutSignupCartManager)cartManager).getWishSignupFreeGiftCart().getRedeemGiftText();
    }

    protected void onPaypalTabSelected(com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.CartBaseBillingHeader.CartBillingSection cartbillingsection)
    {
        onPaypalTabSelected(cartbillingsection);
        tabHeaderView.selectSection(cartbillingsection, true);
    }

    protected ArrayList populateCreditCardAddressParameters(Bundle bundle)
    {
        if (addressPlaceholder != null && addressPlaceholder.getVisibility() == 0)
        {
            WishShippingInfo wishshippinginfo = cartManager.getShippingInfo();
            bundle.putString("ParamName", wishshippinginfo.getName());
            bundle.putString("paramAddressLineOne", wishshippinginfo.getStreetAddressLineOne());
            if (wishshippinginfo.getStreetAddressLineTwo() != null)
            {
                bundle.putString("paramAddressLineTwo", wishshippinginfo.getStreetAddressLineTwo());
            }
            bundle.putString("paramCity", wishshippinginfo.getCity());
            if (wishshippinginfo.getState() != null)
            {
                bundle.putString("ParamState", wishshippinginfo.getState());
            }
            bundle.putString("paramCountry", wishshippinginfo.getCountryCode());
            bundle.putString("paramZip", wishshippinginfo.getZipCode());
            bundle.putString("ParamPhone", wishshippinginfo.getPhoneNumber());
            return new ArrayList();
        } else
        {
            return populateCreditCardAddressParameters(bundle);
        }
    }

    protected void prefillBillingAddress()
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_FREE_GIFT_SHIPPING_SAME_AS_CHECKBOX);
        prefillBillingAddress();
    }

    protected void setHeaderViews(View view)
    {
        WishCart wishcart = cartManager.getCart();
        if (!CartExperimentManager.canCheckoutWithPayPal(cartManager))
        {
            view.findViewById(0x7f0d00a6).setVisibility(8);
        }
        cancelButton.setText(getContext().getString(0x7f0601c7));
        cancelButton.setPaintFlags(cancelButton.getPaintFlags() & -9);
        cancelButton.setTextSize(1, 14F);
        cancelButton.setOnClickListener(new android.view.View.OnClickListener() {

            final SignupCartBillingView this$0;

            public void onClick(View view1)
            {
                close();
            }

            
            {
                this$0 = SignupCartBillingView.this;
                super();
            }
        });
        int i = getContext().getResources().getColor(0x7f0c00b7);
        cancelButton.setTextColor(i);
        ((TextView)view.findViewById(0x7f0d0099)).setVisibility(4);
        Object obj = (UnifiedFontTextView)view.findViewById(0x7f0d009b);
        ((UnifiedFontTextView) (obj)).setText(((CheckoutSignupCartManager)cartManager).getWishSignupFreeGiftCart().getAlmostDone());
        ((UnifiedFontTextView) (obj)).setVisibility(0);
        ((LinearLayout)view.findViewById(0x7f0d009c)).setVisibility(0);
        obj = (WishCartItem)wishcart.getItems().get(0);
        Object obj1 = (BorderedImageView)view.findViewById(0x7f0d009d);
        ((BorderedImageView) (obj1)).getImageView().setImageUrl(((WishCartItem) (obj)).getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium));
        ((BorderedImageView) (obj1)).getImageView().setRequestedImageWidth(100);
        ((BorderedImageView) (obj1)).getImageView().setRequestedImageHeight(100);
        ((UnifiedFontTextView)view.findViewById(0x7f0d009e)).setText(((CheckoutSignupCartManager)cartManager).getWishSignupFreeGiftCart().getFreeGiftShippingText());
        Object obj2 = (UnifiedFontTextView)view.findViewById(0x7f0d00a1);
        obj1 = (UnifiedFontTextView)view.findViewById(0x7f0d00a0);
        ((UnifiedFontTextView) (obj1)).setPaintFlags(((UnifiedFontTextView) (obj1)).getPaintFlags() | 0x10);
        if (((WishCartItem) (obj)).getProductSubtotal().getValue() > 0.0D)
        {
            ((UnifiedFontTextView) (obj2)).setText(wishcart.getSubtotal().toFormattedString());
        } else
        {
            ((UnifiedFontTextView) (obj2)).setText(getContext().getString(0x7f0601e1));
        }
        obj2 = ((WishCartItem) (obj)).getRetailPrice();
        if (((WishLocalizedCurrencyValue) (obj2)).getValue() > ((WishCartItem) (obj)).getProductSubtotal().getValue())
        {
            ((UnifiedFontTextView) (obj1)).setVisibility(0);
            if (((WishLocalizedCurrencyValue) (obj2)).getValue() > 0.0D)
            {
                ((UnifiedFontTextView) (obj1)).setText(((WishLocalizedCurrencyValue) (obj2)).toFormattedString());
            } else
            {
                ((UnifiedFontTextView) (obj1)).setText(getContext().getString(0x7f0601e1));
            }
        } else
        {
            ((UnifiedFontTextView) (obj1)).setVisibility(8);
        }
        obj = (UnifiedFontTextView)view.findViewById(0x7f0d00a3);
        if (wishcart.getShippingPrice().getValue() > 0.0D)
        {
            ((UnifiedFontTextView) (obj)).setText(wishcart.getShippingPrice().toFormattedString());
        } else
        {
            ((UnifiedFontTextView) (obj)).setText(getContext().getString(0x7f0601e1));
        }
        view = (UnifiedFontTextView)view.findViewById(0x7f0d00a5);
        if (wishcart.getTotal().getValue() > 0.0D)
        {
            view.setText(wishcart.getTotal().toFormattedString());
            return;
        } else
        {
            view.setText(getContext().getString(0x7f0601e1));
            return;
        }
    }

    protected void setupBillingAddressLayout(View view)
    {
        super.setupBillingAddressLayout(view);
        if (cartManager.getShippingInfo() != null)
        {
            fullAddressArea.setVisibility(8);
            addressPlaceholder = (LinearLayout)view.findViewById(0x7f0d00b2);
            addressPlaceholderText = (TextView)view.findViewById(0x7f0d00b3);
            view = (TextView)view.findViewById(0x7f0d00b4);
            view.setPaintFlags(view.getPaintFlags() | 8);
            addressPlaceholderText.setText(cartManager.getShippingInfo().getFormattedString());
            addressPlaceholder.setVisibility(0);
            addressPlaceholder.setOnClickListener(new android.view.View.OnClickListener() {

                final SignupCartBillingView this$0;

                public void onClick(View view1)
                {
                    addressPlaceholder.setVisibility(8);
                    .setVisibility(0);
                }

            
            {
                this$0 = SignupCartBillingView.this;
                super();
            }
            });
        }
    }

    protected void showPaymentTabs()
    {
        tabHeaderView.changeAllSectionVisibility(false);
        boolean flag1 = false;
        boolean flag = flag1;
        if (CartExperimentManager.canCheckoutWithCreditCard(cartManager))
        {
            tabHeaderView.setSectionVisible(com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.CartBaseBillingHeader.CartBillingSection.CREDIT_CARD, true);
            flag = flag1;
            if (true)
            {
                showCreditCardTab();
                flag = true;
            }
        }
        if (CartExperimentManager.canCheckoutWithPayPal(cartManager))
        {
            tabHeaderView.setSectionVisible(com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.CartBaseBillingHeader.CartBillingSection.PAYPAL, true);
            if (!flag)
            {
                showPayPalTab();
            }
        }
    }

    protected void trackCreditCardErrorInput()
    {
        trackEvent(WishAnalyticsEvent.IMPRESSION_MOBILE_FREE_GIFT_BILLING_ERROR_MODAL);
    }

    protected void trackCreditCardNextButton()
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_FREE_GIFT_BILLING_REDEEM_BUTTON);
    }






}
