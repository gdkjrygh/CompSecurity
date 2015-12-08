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
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishAddToCartOfferApplied;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.testing.WishTestingUtil;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.components.timer.CountdownTimerView;

public class CartAddToCartOfferAppliedModal extends FrameLayout
{

    private WishAddToCartOfferApplied addToCartOfferApplied;
    private LinearLayout addToCartOfferCounterContainer;
    private CountdownTimerView addToCartOfferTimer;
    private View dismissButton;
    private TextView messageText;
    private View modalView;
    private BorderedImageView productImage;
    private TextView titleText;

    public CartAddToCartOfferAppliedModal(Context context)
    {
        this(context, null);
    }

    public CartAddToCartOfferAppliedModal(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CartAddToCartOfferAppliedModal(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030041, this);
        modalView = view.findViewById(0x7f0d0174);
        dismissButton = view.findViewById(0x7f0d0179);
        WishTestingUtil.addContentDescription(dismissButton, getClass().getSimpleName(), "dismissButton");
        titleText = (TextView)view.findViewById(0x7f0d0176);
        messageText = (TextView)view.findViewById(0x7f0d0177);
        productImage = (BorderedImageView)view.findViewById(0x7f0d0175);
        addToCartOfferCounterContainer = (LinearLayout)view.findViewById(0x7f0d0178);
        productImage.getImageView().setRequestedImageWidth(100);
        productImage.getImageView().setRequestedImageHeight(100);
        setBackgroundColor(getResources().getColor(0x7f0c006e));
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (addToCartOfferTimer != null)
        {
            addToCartOfferTimer.pauseTimer();
        }
    }

    public void setup(WishAddToCartOfferApplied wishaddtocartofferapplied, android.view.View.OnClickListener onclicklistener)
    {
        addToCartOfferApplied = wishaddtocartofferapplied;
        dismissButton.setOnClickListener(onclicklistener);
        titleText.setText(wishaddtocartofferapplied.getTitle());
        messageText.setText(wishaddtocartofferapplied.getMessage());
        productImage.getImageView().setImageUrl(wishaddtocartofferapplied.getProductImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Large));
        if (wishaddtocartofferapplied.getExpiry() != null)
        {
            addToCartOfferCounterContainer.setVisibility(0);
            addToCartOfferTimer = new CountdownTimerView(getContext());
            addToCartOfferTimer.setup(wishaddtocartofferapplied.getExpiry(), 18, getResources().getColor(0x7f0c00b2));
            addToCartOfferTimer.startTimer();
            addToCartOfferCounterContainer.removeAllViews();
            addToCartOfferCounterContainer.addView(addToCartOfferTimer);
        } else
        {
            addToCartOfferCounterContainer.setVisibility(8);
        }
        wishaddtocartofferapplied = new TranslateAnimation(0.0F, 0.0F, ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getHeight(), 0.0F);
        wishaddtocartofferapplied.setFillAfter(false);
        wishaddtocartofferapplied.setDuration(200L);
        wishaddtocartofferapplied.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final CartAddToCartOfferAppliedModal this$0;

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
                this$0 = CartAddToCartOfferAppliedModal.this;
                super();
            }
        });
        modalView.startAnimation(wishaddtocartofferapplied);
    }

}
