// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

public class CartFrameView extends FrameLayout
{

    private static final long SHOW_ANIMATION_TIME = 350L;
    private View animationGroup;
    private CartManager cartManager;
    private View closeButton;
    private FrameLayout contentView;

    public CartFrameView(CartManager cartmanager)
    {
        super(cartmanager.getActivity());
        cartManager = cartmanager;
        init();
    }

    private void close()
    {
        cartManager.trackEvent(WishAnalyticsEvent.CLICK_MOBILE_CART_CONTINUE_SHOPPING);
        cartManager.requestClose();
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030023, this);
        animationGroup = (FrameLayout)view.findViewById(0x7f0d00e4);
        contentView = (FrameLayout)view.findViewById(0x7f0d00e6);
        closeButton = view.findViewById(0x7f0d00e5);
        closeButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CartFrameView this$0;

            public void onClick(View view1)
            {
                close();
            }

            
            {
                this$0 = CartFrameView.this;
                super();
            }
        });
    }

    public void animateOpen()
    {
        TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getHeight(), 0.0F);
        translateanimation.setFillAfter(false);
        translateanimation.setDuration(350L);
        translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final CartFrameView this$0;

            public void onAnimationEnd(Animation animation)
            {
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
                animationGroup.setVisibility(0);
            }

            
            {
                this$0 = CartFrameView.this;
                super();
            }
        });
        animationGroup.startAnimation(translateanimation);
    }

    public void setContentView(View view)
    {
        contentView.removeAllViews();
        contentView.addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }


}
