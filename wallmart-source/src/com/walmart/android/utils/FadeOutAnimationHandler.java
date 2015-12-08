// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class FadeOutAnimationHandler
{

    private View mFadeInView;
    private Animation mFadeOutAnim;
    private View mFadeOutView;

    public FadeOutAnimationHandler(View view, int i, Context context)
    {
        mFadeOutView = view;
        mFadeOutAnim = AnimationUtils.loadAnimation(context, i);
    }

    public FadeOutAnimationHandler(View view, Context context)
    {
        this(view, com.walmart.lib.R.anim.fade_out, context);
    }

    public void start()
    {
        mFadeOutAnim.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final FadeOutAnimationHandler this$0;

            public void onAnimationEnd(Animation animation)
            {
                mFadeOutView.setVisibility(8);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = FadeOutAnimationHandler.this;
                super();
            }
        });
        mFadeOutView.startAnimation(mFadeOutAnim);
        long l = mFadeOutAnim.getDuration();
        mFadeOutView.postDelayed(new Runnable() {

            final FadeOutAnimationHandler this$0;

            public void run()
            {
                if (!mFadeOutAnim.hasEnded())
                {
                    mFadeOutView.setVisibility(8);
                    mFadeOutAnim.cancel();
                }
            }

            
            {
                this$0 = FadeOutAnimationHandler.this;
                super();
            }
        }, 150L + l);
    }


}
