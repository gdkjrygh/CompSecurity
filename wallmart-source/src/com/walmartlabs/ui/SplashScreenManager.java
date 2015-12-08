// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

public class SplashScreenManager
{
    public static interface OnSplashRemovedCallback
    {

        public abstract void onSplashRemoved();
    }


    private static final String TAG = com/walmartlabs/ui/SplashScreenManager.getSimpleName();
    private Activity mActivity;
    private boolean mDontChangeOrientation;
    private Handler mHandler;
    private Animation mHomeScreenAnim;
    private int mSplashDisplayTime;
    private int mSplashFadeoutTime;

    public SplashScreenManager(Activity activity)
    {
        mSplashDisplayTime = 1400;
        mSplashFadeoutTime = 500;
        mActivity = activity;
        mHandler = new Handler();
        mHomeScreenAnim = new AlphaAnimation(0.0F, 1.0F);
        mHomeScreenAnim.setDuration(1000L);
        mActivity.findViewById(0x1020002).setVisibility(4);
    }

    private void clearBackground()
    {
        mActivity.getWindow().setBackgroundDrawable(null);
    }

    private void fadeOutSplash(boolean flag, final OnSplashRemovedCallback callback)
    {
        final ViewGroup rootContainer;
        boolean flag1;
        boolean flag2;
        rootContainer = (ViewGroup)mActivity.findViewById(0x1020002);
        flag2 = false;
        flag1 = flag2;
        if (!flag) goto _L2; else goto _L1
_L1:
        View view;
        mHomeScreenAnim.setDuration(mSplashFadeoutTime);
        mHomeScreenAnim.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final SplashScreenManager this$0;
            final OnSplashRemovedCallback val$callback;
            final ViewGroup val$rootContainer;

            public void onAnimationEnd(Animation animation)
            {
                clearBackground();
                if (callback != null)
                {
                    callback.onSplashRemoved();
                }
                if (!mDontChangeOrientation)
                {
                    mActivity.setRequestedOrientation(2);
                }
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
                rootContainer.setVisibility(0);
            }

            
            {
                this$0 = SplashScreenManager.this;
                rootContainer = viewgroup;
                callback = onsplashremovedcallback;
                super();
            }
        });
        view = null;
        View view1 = (View)rootContainer.getParent();
        view = view1;
_L4:
        flag1 = flag2;
        if (view != null)
        {
            rootContainer.startAnimation(mHomeScreenAnim);
            view.invalidate();
            flag1 = true;
        }
_L2:
        if (!flag1)
        {
            rootContainer.setVisibility(0);
            clearBackground();
            if (callback != null)
            {
                callback.onSplashRemoved();
            }
            if (!mDontChangeOrientation)
            {
                mActivity.setRequestedOrientation(2);
            }
        }
        return;
        Exception exception;
        exception;
        Log.e(TAG, "Could not retrieve mainlayout parentview", exception);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void removeSplash(final OnSplashRemovedCallback callback)
    {
        mHandler.postDelayed(new Runnable() {

            final SplashScreenManager this$0;
            final OnSplashRemovedCallback val$callback;

            public void run()
            {
                fadeOutSplash(true, callback);
            }

            
            {
                this$0 = SplashScreenManager.this;
                callback = onsplashremovedcallback;
                super();
            }
        }, mSplashDisplayTime);
    }

    public void setDisplayDuration(int i)
    {
        mSplashDisplayTime = i;
    }

    public void setDontChangeOrientation(boolean flag)
    {
        mDontChangeOrientation = flag;
    }

    public void setFadeTime(int i)
    {
        mSplashFadeoutTime = i;
    }





}
