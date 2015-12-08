// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.tooltip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;

public abstract class SlidingTooltip extends RelativeLayout
{

    public SlidingTooltip(Context context)
    {
        this(context, null);
    }

    public SlidingTooltip(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidingTooltip(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setVisibility(4);
        init();
    }

    protected abstract int getTooltipHeight();

    protected abstract void init();

    public void slideDown()
    {
        if (getVisibility() == 4)
        {
            return;
        } else
        {
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, getTooltipHeight());
            translateanimation.setFillAfter(false);
            translateanimation.setDuration(200L);
            translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final SlidingTooltip this$0;

                public void onAnimationEnd(Animation animation)
                {
                    setVisibility(4);
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$0 = SlidingTooltip.this;
                super();
            }
            });
            startAnimation(translateanimation);
            return;
        }
    }

    public void slideUp()
    {
        if (getVisibility() == 0)
        {
            return;
        } else
        {
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, getTooltipHeight(), 0.0F);
            translateanimation.setFillAfter(false);
            translateanimation.setDuration(200L);
            translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final SlidingTooltip this$0;

                public void onAnimationEnd(Animation animation)
                {
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                    setVisibility(0);
                }

            
            {
                this$0 = SlidingTooltip.this;
                super();
            }
            });
            startAnimation(translateanimation);
            return;
        }
    }
}
