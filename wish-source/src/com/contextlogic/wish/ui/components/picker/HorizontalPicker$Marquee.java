// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.picker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.text.Layout;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;

// Referenced classes of package com.contextlogic.wish.ui.components.picker:
//            HorizontalPicker

private static final class mRtl extends Handler
{

    private static final int MARQUEE_DELAY = 1200;
    private static final float MARQUEE_DELTA_MAX = 0.07F;
    private static final int MARQUEE_PIXELS_PER_SECOND = 30;
    private static final int MARQUEE_RESOLUTION = 33;
    private static final int MARQUEE_RESTART_DELAY = 1200;
    private static final byte MARQUEE_RUNNING = 2;
    private static final byte MARQUEE_STARTING = 1;
    private static final byte MARQUEE_STOPPED = 0;
    private static final int MESSAGE_RESTART = 3;
    private static final int MESSAGE_START = 1;
    private static final int MESSAGE_TICK = 2;
    private float mFadeStop;
    private float mGhostOffset;
    private float mGhostStart;
    private final WeakReference mLayout;
    private float mMaxFadeScroll;
    private float mMaxScroll;
    private int mRepeatLimit;
    private boolean mRtl;
    private float mScroll;
    private final float mScrollUnit;
    private byte mStatus;
    private final WeakReference mView;

    private void resetScroll()
    {
        mScroll = 0.0F;
        HorizontalPicker horizontalpicker = (HorizontalPicker)mView.get();
        if (horizontalpicker != null)
        {
            horizontalpicker.invalidate();
        }
    }

    float getGhostOffset()
    {
        return mGhostOffset;
    }

    float getMaxFadeScroll()
    {
        return mMaxFadeScroll;
    }

    float getScroll()
    {
        return mScroll;
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 33
    //                   2 43
    //                   3 48;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        mStatus = 2;
        tick();
        return;
_L3:
        tick();
        return;
_L4:
        if (mStatus == 2)
        {
            if (mRepeatLimit >= 0)
            {
                mRepeatLimit = mRepeatLimit - 1;
            }
            start(mRepeatLimit);
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    boolean isRunning()
    {
        return mStatus == 2;
    }

    boolean isStopped()
    {
        return mStatus == 0;
    }

    boolean shouldDrawGhost()
    {
        return mStatus == 2 && Math.abs(mScroll) > mGhostStart;
    }

    boolean shouldDrawLeftFade()
    {
        return mScroll <= mFadeStop;
    }

    void start(int i)
    {
        if (i == 0)
        {
            stop();
        } else
        {
            mRepeatLimit = i;
            HorizontalPicker horizontalpicker = (HorizontalPicker)mView.get();
            Layout layout = (Layout)mLayout.get();
            if (horizontalpicker != null && layout != null)
            {
                mStatus = 1;
                mScroll = 0.0F;
                i = HorizontalPicker.access$100(horizontalpicker);
                float f = layout.getLineWidth(0);
                float f1 = (float)i / 3F;
                mGhostStart = (f - (float)i) + f1;
                mMaxScroll = mGhostStart + (float)i;
                mGhostOffset = f + f1;
                mFadeStop = (float)i / 6F + f;
                mMaxFadeScroll = mGhostStart + f + f;
                if (mRtl)
                {
                    mGhostOffset = mGhostOffset * -1F;
                }
                horizontalpicker.invalidate();
                sendEmptyMessageDelayed(1, 1200L);
                return;
            }
        }
    }

    void stop()
    {
        mStatus = 0;
        removeMessages(1);
        removeMessages(3);
        removeMessages(2);
        resetScroll();
    }

    void tick()
    {
        if (mStatus == 2)
        {
            removeMessages(2);
            HorizontalPicker horizontalpicker = (HorizontalPicker)mView.get();
            Layout layout = (Layout)mLayout.get();
            if (horizontalpicker != null && layout != null && (horizontalpicker.isFocused() || horizontalpicker.isSelected()))
            {
                mScroll = mScroll + mScrollUnit;
                if (Math.abs(mScroll) > mMaxScroll)
                {
                    mScroll = mMaxScroll;
                    if (mRtl)
                    {
                        mScroll = mScroll * -1F;
                    }
                    sendEmptyMessageDelayed(3, 1200L);
                } else
                {
                    sendEmptyMessageDelayed(2, 33L);
                }
                horizontalpicker.invalidate();
                return;
            }
        }
    }

    I(HorizontalPicker horizontalpicker, Layout layout, boolean flag)
    {
        mStatus = 0;
        float f = (30F * horizontalpicker.getContext().getResources().getDisplayMetrics().density) / 33F;
        if (flag)
        {
            mScrollUnit = -f;
        } else
        {
            mScrollUnit = f;
        }
        mView = new WeakReference(horizontalpicker);
        mLayout = new WeakReference(layout);
        mRtl = flag;
    }
}
