// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.album;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import com.walmartlabs.utils.WLog;

public class ScrollSpeedMonitor extends android.support.v7.widget.RecyclerView.OnScrollListener
{

    private static final int SPEED_BUFFER_SIZE = 5;
    private static final String TAG = com/walmartlabs/android/photo/view/album/ScrollSpeedMonitor.getSimpleName();
    private static final int TOO_FAST_LIMIT_INCHES_PER_SECOND = 20;
    private double mAveragingBuffer[];
    private int mCount;
    private double mLastSpeed;
    private long mLastTime;
    private float mPixelsPerInch;
    private double mSum;

    public ScrollSpeedMonitor(Context context)
    {
        mAveragingBuffer = new double[5];
        mSum = 0.0D;
        mPixelsPerInch = context.getResources().getDisplayMetrics().ydpi;
        WLog.d(TAG, (new StringBuilder()).append("Vertical screen DPI is ").append(mPixelsPerInch).toString());
    }

    private double getSpeed(int i, long l)
    {
        return ((double)((float)i / mPixelsPerInch) / (double)l) * 1000D;
    }

    private boolean tooFast(double d)
    {
        return Math.abs(d) > 20D;
    }

    public void onScrollStateChanged(RecyclerView recyclerview, int i)
    {
        if (i == 0)
        {
            onSpeedStatusChange(false);
            onSettled();
            mAveragingBuffer = new double[5];
            mSum = 0.0D;
        }
    }

    public void onScrolled(RecyclerView recyclerview, int i, int j)
    {
        double d;
        long l;
        l = SystemClock.elapsedRealtime();
        long l1 = mLastTime;
        i = mCount;
        mCount = i + 1;
        i %= 5;
        d = mAveragingBuffer[i];
        mAveragingBuffer[i] = getSpeed(j, l - l1);
        mSum = (mSum + mAveragingBuffer[i]) - d;
        d = mSum / 5D;
        if (!tooFast(d) || tooFast(mLastSpeed)) goto _L2; else goto _L1
_L1:
        onSpeedStatusChange(true);
_L4:
        mLastTime = l;
        mLastSpeed = d;
        return;
_L2:
        if (tooFast(mLastSpeed) && !tooFast(d))
        {
            onSpeedStatusChange(false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onSettled()
    {
    }

    public void onSpeedStatusChange(boolean flag)
    {
    }

}
