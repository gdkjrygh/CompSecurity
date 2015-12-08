// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.util.TabletUtil;

public class SignupFreeGiftCartFrameView extends FrameLayout
{

    private static final long SHOW_ANIMATION_TIME = 350L;
    private View animationGroup;
    private CartManager cartManager;
    private FrameLayout contentView;

    public SignupFreeGiftCartFrameView(CartManager cartmanager)
    {
        super(cartmanager.getActivity());
        cartManager = cartmanager;
        init();
    }

    private void init()
    {
        Object obj = (LayoutInflater)getContext().getSystemService("layout_inflater");
        if (TabletUtil.isTablet(cartManager.getActivity()))
        {
            obj = ((LayoutInflater) (obj)).inflate(0x7f0300c3, this);
        } else
        {
            obj = ((LayoutInflater) (obj)).inflate(0x7f0300c2, this);
        }
        animationGroup = (FrameLayout)((View) (obj)).findViewById(0x7f0d0411);
        contentView = (FrameLayout)((View) (obj)).findViewById(0x7f0d0412);
        if (TabletUtil.isTablet(cartManager.getActivity()))
        {
            double d1 = (double)cartManager.getActivity().getResources().getConfiguration().screenWidthDp * 0.80000000000000004D;
            double d = d1;
            if (d1 > 600D)
            {
                d = 600D;
            }
            contentView.getLayoutParams().width = (int)TypedValue.applyDimension(1, (float)d, getContext().getResources().getDisplayMetrics());
            contentView.requestLayout();
        }
    }

    public void animateOpen()
    {
        int i = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getHeight();
        if (TabletUtil.isTablet(cartManager.getActivity()))
        {
            animationGroup.setVisibility(0);
            return;
        } else
        {
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, i, 0.0F);
            translateanimation.setFillAfter(false);
            translateanimation.setDuration(350L);
            translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final SignupFreeGiftCartFrameView this$0;

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
                this$0 = SignupFreeGiftCartFrameView.this;
                super();
            }
            });
            animationGroup.startAnimation(translateanimation);
            return;
        }
    }

    public void setContentView(View view)
    {
        contentView.removeAllViews();
        contentView.addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

}
