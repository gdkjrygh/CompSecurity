// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import com.walmart.android.utils.ViewUtil;

public abstract class ScrollDirectionListener
    implements android.support.v7.widget.RecyclerView.OnItemTouchListener, android.view.View.OnTouchListener
{

    public static final int DIRECTION_DOWN = 1;
    public static final int DIRECTION_UP = 0;
    private int mCurrentDirection;
    private float mInitialY;
    private float mPreviousDiff;
    private float mThreshold;

    public ScrollDirectionListener(Context context)
    {
        mCurrentDirection = -1;
        mThreshold = ViewUtil.dpToPixels(25, context);
    }

    private boolean processEvents(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 34
    //                   1 177
    //                   2 44;
           goto _L1 _L2 _L3 _L4
_L1:
        return false;
_L2:
        mInitialY = motionevent.getY();
        return false;
_L4:
        float f = motionevent.getY();
        float f1 = f - mInitialY;
        if (f1 < 0.0F)
        {
            if (f1 < mPreviousDiff)
            {
                if (f1 < -mThreshold && mCurrentDirection != 0)
                {
                    mCurrentDirection = 0;
                    onScrollDirectionChanged(0);
                }
                mPreviousDiff = f1;
            } else
            {
                mInitialY = f;
                mPreviousDiff = 0.0F;
            }
        }
        if (f1 > 0.0F)
        {
            if (f1 > mPreviousDiff)
            {
                if (f1 > mThreshold && mCurrentDirection != 1)
                {
                    mCurrentDirection = 1;
                    onScrollDirectionChanged(1);
                }
                mPreviousDiff = f1;
                return false;
            } else
            {
                mInitialY = f;
                mPreviousDiff = 0.0F;
                return false;
            }
        }
          goto _L1
_L3:
        mPreviousDiff = 0.0F;
        return false;
    }

    public final boolean onInterceptTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
    {
        return processEvents(motionevent);
    }

    public void onRequestDisallowInterceptTouchEvent(boolean flag)
    {
    }

    public abstract void onScrollDirectionChanged(int i);

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        return processEvents(motionevent);
    }

    public final void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
    {
    }
}
