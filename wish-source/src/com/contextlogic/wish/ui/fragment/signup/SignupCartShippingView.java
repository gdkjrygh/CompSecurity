// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCartItem;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishSignupFreeGiftCart;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.components.text.UnifiedFontTextView;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartDataEntryCallback;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.shipping.CartShippingView;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            CheckoutSignupCartManager, SignupCartDataEntryCallback

public class SignupCartShippingView extends CartShippingView
{

    public SignupCartShippingView(CartManager cartmanager, SignupCartDataEntryCallback signupcartdataentrycallback, boolean flag)
    {
        super(cartmanager, signupcartdataentrycallback, flag);
    }

    private void close()
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(getContext())).create();
        alertdialog.setTitle(getContext().getString(0x7f060073));
        alertdialog.setMessage(getContext().getString(0x7f06012d));
        alertdialog.setButton2(getContext().getString(0x7f060488), new android.content.DialogInterface.OnClickListener() {

            final SignupCartShippingView this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                hideKeyboard();
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_FREE_GIFT_SHIPPING_CANCEL_BUTTON);
                ((SignupCartDataEntryCallback)access$300).onClose();
            }

            
            {
                this$0 = SignupCartShippingView.this;
                super();
            }
        });
        alertdialog.setButton(getContext().getString(0x7f0602d8), new android.content.DialogInterface.OnClickListener() {

            final SignupCartShippingView this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                this$0 = SignupCartShippingView.this;
                super();
            }
        });
        alertdialog.show();
    }

    protected String getNextButtonText()
    {
        return getContext().getString(0x7f0602d3);
    }

    protected WishAnalyticsEvent getWishAnalyticsEventForError()
    {
        return WishAnalyticsEvent.IMPRESSION_MOBILE_FREE_GIFT_SHIPPING_ERROR_MODAL;
    }

    protected WishAnalyticsEvent getWishAnalyticsEventForNextButton()
    {
        return WishAnalyticsEvent.CLICK_MOBILE_FREE_GIFT_SHIPPING_NEXT_BUTTON;
    }

    protected void setupHeaderViews(View view)
    {
        Object obj = cartManager.getCart();
        Object obj1 = (TextView)view.findViewById(0x7f0d011d);
        ((TextView)view.findViewById(0x7f0d011c)).setVisibility(4);
        ((TextView) (obj1)).setText(getContext().getString(0x7f0601c7));
        ((TextView) (obj1)).setPaintFlags(((TextView) (obj1)).getPaintFlags() & -9);
        ((TextView) (obj1)).setTextSize(1, 14F);
        ((TextView) (obj1)).setOnClickListener(new android.view.View.OnClickListener() {

            final SignupCartShippingView this$0;

            public void onClick(View view1)
            {
                close();
            }

            
            {
                this$0 = SignupCartShippingView.this;
                super();
            }
        });
        ((TextView) (obj1)).setTextColor(getContext().getResources().getColor(0x7f0c00b7));
        ((LinearLayout)view.findViewById(0x7f0d0120)).setVisibility(0);
        obj1 = (WishCartItem)((WishCart) (obj)).getItems().get(0);
        Object obj2 = (BorderedImageView)view.findViewById(0x7f0d0122);
        ((BorderedImageView) (obj2)).getImageView().setImageUrl(((WishCartItem) (obj1)).getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium));
        ((BorderedImageView) (obj2)).getImageView().setRequestedImageWidth(100);
        ((BorderedImageView) (obj2)).getImageView().setRequestedImageHeight(100);
        ((UnifiedFontTextView)view.findViewById(0x7f0d0121)).setText(((CheckoutSignupCartManager)cartManager).getWishSignupFreeGiftCart().getWhereToShipTitle());
        obj2 = (UnifiedFontTextView)view.findViewById(0x7f0d0125);
        view = (UnifiedFontTextView)view.findViewById(0x7f0d0124);
        view.setPaintFlags(view.getPaintFlags() | 0x10);
        if (((WishCartItem) (obj1)).getProductSubtotal().getValue() > 0.0D)
        {
            ((UnifiedFontTextView) (obj2)).setText(((WishCart) (obj)).getSubtotal().toFormattedString());
        } else
        {
            ((UnifiedFontTextView) (obj2)).setText(getContext().getString(0x7f0601e1));
        }
        obj = ((WishCartItem) (obj1)).getRetailPrice();
        if (((WishLocalizedCurrencyValue) (obj)).getValue() > ((WishCartItem) (obj1)).getProductSubtotal().getValue())
        {
            view.setVisibility(0);
            if (((WishLocalizedCurrencyValue) (obj)).getValue() > 0.0D)
            {
                view.setText(((WishLocalizedCurrencyValue) (obj)).toFormattedString());
                return;
            } else
            {
                view.setText(getContext().getString(0x7f0601e1));
                return;
            }
        } else
        {
            view.setVisibility(8);
            return;
        }
    }




}
