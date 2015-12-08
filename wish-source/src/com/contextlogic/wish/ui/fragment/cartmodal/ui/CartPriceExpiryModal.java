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
import com.contextlogic.wish.api.data.WishCartItem;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishPriceExpiryInfo;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.components.timer.CountdownTimerView;

public class CartPriceExpiryModal extends FrameLayout
{

    private TextView dismissButton;
    private CountdownTimerView expiryTimer;
    private LinearLayout expiryTimerContainer;
    private TextView messageText;
    private View modalView;
    private BorderedImageView productImage;
    private TextView titleText;

    public CartPriceExpiryModal(Context context)
    {
        this(context, null);
    }

    public CartPriceExpiryModal(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CartPriceExpiryModal(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030044, this);
        modalView = view.findViewById(0x7f0d0182);
        dismissButton = (TextView)view.findViewById(0x7f0d0187);
        titleText = (TextView)view.findViewById(0x7f0d0184);
        messageText = (TextView)view.findViewById(0x7f0d0185);
        productImage = (BorderedImageView)view.findViewById(0x7f0d0183);
        expiryTimerContainer = (LinearLayout)view.findViewById(0x7f0d0186);
        productImage.getImageView().setRequestedImageWidth(100);
        productImage.getImageView().setRequestedImageHeight(100);
        setBackgroundColor(getResources().getColor(0x7f0c006e));
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (expiryTimer != null)
        {
            expiryTimer.pauseTimer();
        }
    }

    public void setup(WishCartItem wishcartitem, android.view.View.OnClickListener onclicklistener)
    {
        titleText.setText(wishcartitem.getPriceExpiryInfo().getTitle());
        messageText.setText(wishcartitem.getPriceExpiryInfo().getMessage());
        dismissButton.setText(wishcartitem.getPriceExpiryInfo().getButtonText());
        dismissButton.setOnClickListener(onclicklistener);
        productImage.getImageView().setImageUrl(wishcartitem.getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Large));
        if (wishcartitem.getPriceExpiryInfo().getExpiry() != null)
        {
            expiryTimerContainer.setVisibility(0);
            expiryTimer = new CountdownTimerView(getContext());
            expiryTimer.setup(wishcartitem.getPriceExpiryInfo().getExpiry(), 18, getResources().getColor(0x7f0c00b2));
            expiryTimer.startTimer();
            expiryTimerContainer.removeAllViews();
            expiryTimerContainer.addView(expiryTimer);
        } else
        {
            expiryTimerContainer.setVisibility(8);
        }
        wishcartitem = new TranslateAnimation(0.0F, 0.0F, ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getHeight(), 0.0F);
        wishcartitem.setFillAfter(false);
        wishcartitem.setDuration(200L);
        wishcartitem.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final CartPriceExpiryModal this$0;

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
                this$0 = CartPriceExpiryModal.this;
                super();
            }
        });
        modalView.startAnimation(wishcartitem);
    }

}
