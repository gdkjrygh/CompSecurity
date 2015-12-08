// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class CrossfadeAnimationHandler
{

    private long mAnimationTime;
    private Animation mFadeInAnim;
    private View mFadeInView;
    private Animation mFadeOutAnim;
    private View mFadeOutView;

    public CrossfadeAnimationHandler(View view, int i, View view1, int j, Context context)
    {
        mAnimationTime = -1L;
        mFadeInView = view;
        mFadeOutView = view1;
        mFadeInAnim = AnimationUtils.loadAnimation(context, i);
        mFadeOutAnim = AnimationUtils.loadAnimation(context, j);
        view.setVisibility(4);
        view1.setVisibility(0);
    }

    public CrossfadeAnimationHandler(View view, View view1, Context context)
    {
        this(view, com.walmart.lib.R.anim.fade_in, view1, com.walmart.lib.R.anim.fade_out, context);
    }

    public void setDuration(long l)
    {
        mAnimationTime = l;
    }

    public void start()
    {
        long l1 = mFadeOutAnim.getDuration();
        long l = mFadeInAnim.getDuration();
        if (mAnimationTime >= 0L)
        {
            l1 = mAnimationTime;
            l = mAnimationTime;
        }
        mFadeOutAnim.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final CrossfadeAnimationHandler this$0;

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
                this$0 = CrossfadeAnimationHandler.this;
                super();
            }
        });
        mFadeInAnim.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final CrossfadeAnimationHandler this$0;

            public void onAnimationEnd(Animation animation)
            {
                mFadeInView.setVisibility(0);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = CrossfadeAnimationHandler.this;
                super();
            }
        });
        mFadeOutAnim.setDuration(l1);
        mFadeInAnim.setDuration(l);
        mFadeOutView.startAnimation(mFadeOutAnim);
        mFadeInView.startAnimation(mFadeInAnim);
        mFadeOutView.postDelayed(new Runnable() {

            final CrossfadeAnimationHandler this$0;

            public void run()
            {
                if (!mFadeOutAnim.hasEnded())
                {
                    mFadeOutView.setVisibility(8);
                    mFadeOutAnim.cancel();
                }
            }

            
            {
                this$0 = CrossfadeAnimationHandler.this;
                super();
            }
        }, l1 + 150L);
        mFadeInView.postDelayed(new Runnable() {

            final CrossfadeAnimationHandler this$0;

            public void run()
            {
                if (!mFadeInAnim.hasEnded())
                {
                    mFadeInView.setVisibility(0);
                    mFadeInAnim.cancel();
                }
            }

            
            {
                this$0 = CrossfadeAnimationHandler.this;
                super();
            }
        }, l + 150L);
    }




}
