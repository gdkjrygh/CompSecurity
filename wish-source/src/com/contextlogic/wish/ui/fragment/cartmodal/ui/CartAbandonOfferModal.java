// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCartAbandonOffer;
import com.contextlogic.wish.api.service.CartAbandonOfferClaimService;
import com.contextlogic.wish.api.service.CartAbandonOfferDismissService;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

public class CartAbandonOfferModal extends FrameLayout
{
    public static interface Callback
    {

        public abstract void onClaim(WishCart wishcart);

        public abstract void onDismiss();

        public abstract void onError();
    }


    private TextView actionButton;
    private WishCartAbandonOffer cartAbandonOffer;
    private CartManager cartManager;
    private TextView dismissButton;
    private BorderedImageView imageView;
    private TextView messageText;
    private View modalView;
    private TextView titleText;

    public CartAbandonOfferModal(Context context)
    {
        this(context, null);
    }

    public CartAbandonOfferModal(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CartAbandonOfferModal(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void handleClaim(final Callback callback)
    {
        cartManager.showLoadingSpinner();
        (new CartAbandonOfferClaimService()).requestService(cartAbandonOffer.getOfferId(), new com.contextlogic.wish.api.service.CartAbandonOfferClaimService.SuccessCallback() {

            final CartAbandonOfferModal this$0;
            final Callback val$callback;

            public void onServiceSucceeded(WishCart wishcart)
            {
                cartManager.hideLoadingSpinner();
                callback.onClaim(wishcart);
            }

            
            {
                this$0 = CartAbandonOfferModal.this;
                callback = callback1;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final CartAbandonOfferModal this$0;
            final Callback val$callback;

            public void onServiceFailed()
            {
                cartManager.hideLoadingSpinner();
                callback.onError();
            }

            
            {
                this$0 = CartAbandonOfferModal.this;
                callback = callback1;
                super();
            }
        });
    }

    private void handleDismiss(final Callback callback)
    {
        cartManager.showLoadingSpinner();
        (new CartAbandonOfferDismissService()).requestService(cartAbandonOffer.getOfferId(), new com.contextlogic.wish.api.service.CartAbandonOfferDismissService.SuccessCallback() {

            final CartAbandonOfferModal this$0;
            final Callback val$callback;

            public void onServiceSucceeded()
            {
                cartManager.hideLoadingSpinner();
                callback.onDismiss();
            }

            
            {
                this$0 = CartAbandonOfferModal.this;
                callback = callback1;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final CartAbandonOfferModal this$0;
            final Callback val$callback;

            public void onServiceFailed()
            {
                cartManager.hideLoadingSpinner();
                callback.onError();
            }

            
            {
                this$0 = CartAbandonOfferModal.this;
                callback = callback1;
                super();
            }
        });
    }

    public void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030040, this);
        modalView = view.findViewById(0x7f0d016e);
        dismissButton = (TextView)view.findViewById(0x7f0d0173);
        actionButton = (TextView)view.findViewById(0x7f0d0172);
        titleText = (TextView)view.findViewById(0x7f0d0170);
        messageText = (TextView)view.findViewById(0x7f0d0171);
        imageView = (BorderedImageView)view.findViewById(0x7f0d016f);
        imageView.getImageView().setRequestedImageWidth(75);
        imageView.getImageView().setRequestedImageHeight(75);
        setBackgroundColor(getResources().getColor(0x7f0c006e));
    }

    public void setup(CartManager cartmanager, WishCartAbandonOffer wishcartabandonoffer, final Callback callback)
    {
        (new LogService()).requestService(Integer.toString(WishAnalyticsEvent.IMPRESSION_MOBILE_CART_ABANDON_OFFER.getValue()), null, null, null);
        cartAbandonOffer = wishcartabandonoffer;
        cartManager = cartmanager;
        dismissButton.setText(wishcartabandonoffer.getDismissText());
        dismissButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CartAbandonOfferModal this$0;
            final Callback val$callback;

            public void onClick(View view)
            {
                handleDismiss(callback);
            }

            
            {
                this$0 = CartAbandonOfferModal.this;
                callback = callback1;
                super();
            }
        });
        actionButton.setText(wishcartabandonoffer.getButtonText());
        actionButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CartAbandonOfferModal this$0;
            final Callback val$callback;

            public void onClick(View view)
            {
                handleClaim(callback);
            }

            
            {
                this$0 = CartAbandonOfferModal.this;
                callback = callback1;
                super();
            }
        });
        titleText.setText(wishcartabandonoffer.getTitle());
        messageText.setText(wishcartabandonoffer.getMessage());
        imageView.getImageView().setImageUrl(wishcartabandonoffer.getImageUrl());
        cartmanager = new TranslateAnimation(0.0F, 0.0F, ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getHeight(), 0.0F);
        cartmanager.setFillAfter(false);
        cartmanager.setDuration(200L);
        cartmanager.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final CartAbandonOfferModal this$0;

            public void onAnimationEnd(Animation animation)
            {
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
                modalView.setVisibility(0);
            }

            
            {
                this$0 = CartAbandonOfferModal.this;
                super();
            }
        });
        modalView.startAnimation(cartmanager);
    }




}
