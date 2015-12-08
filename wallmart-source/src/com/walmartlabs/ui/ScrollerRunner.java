// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.content.Context;
import android.os.Handler;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;

public abstract class ScrollerRunner
    implements Runnable
{

    private static final boolean DEBUG = false;
    private static final String TAG = com/walmartlabs/ui/ScrollerRunner.getSimpleName();
    protected Context mContext;
    private int mDuration;
    private Handler mHandler;
    private Scroller mScroller;

    public ScrollerRunner(Context context)
    {
        mDuration = 300;
        mContext = context;
        mHandler = new Handler();
        mScroller = new Scroller(mContext, new LinearInterpolator());
    }

    public void finishScroll()
    {
        mScroller.forceFinished(true);
        mHandler.removeCallbacks(this);
    }

    public abstract void onScroll(int i, int j, boolean flag);

    public void run()
    {
        mScroller.computeScrollOffset();
        boolean flag = mScroller.isFinished();
        onScroll(mScroller.getCurrX(), mScroller.getCurrY(), flag);
        if (!flag)
        {
            mHandler.post(this);
        }
    }

    public void setDuration(int i)
    {
        mDuration = i;
    }

    public void startScrollDiff(int i, int j, int k, int l)
    {
        finishScroll();
        mScroller.startScroll(i, j, k, l, mDuration);
        mHandler.post(this);
    }

    public void startScrollToPoint(int i, int j, int k, int l)
    {
        startScrollDiff(i, j, k - i, l - j);
    }

}
