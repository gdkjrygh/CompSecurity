// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import com.walmartlabs.ui.recycler.BasicRecyclerView;

// Referenced classes of package com.walmart.android.app.wishlist:
//            SwipeController

class TouchListener extends android.support.v7.widget.eOnItemTouchListener
{

    private View mDownView;
    float mDownX;
    float mDownY;
    private View mSlidingView;
    final SwipeController this$0;

    public boolean onInterceptTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
    {
        return onTouch(motionevent);
    }

    public boolean onTouch(MotionEvent motionevent)
    {
        if (!SwipeController.access$000(SwipeController.this))
        {
            return false;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 48
    //                   0 50
    //                   1 410
    //                   2 247
    //                   3 196;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return false;
_L2:
        if (SwipeController.access$100(SwipeController.this))
        {
            return true;
        }
        mDownView = SwipeController.access$200(SwipeController.this, motionevent);
        if (mDownView != null)
        {
            mDownX = motionevent.getX();
            mDownY = motionevent.getY();
            mSlidingView = SwipeController.access$300(SwipeController.this, mDownView);
            if (mDownView.getParent() != null)
            {
                int i = SwipeController.access$400(SwipeController.this).getChildAdapterPosition(mDownView) - SwipeController.access$400(SwipeController.this).getHeaderCount();
                if (i < 0 || !SwipeController.access$500(SwipeController.this).isDismissible(i))
                {
                    mDownView = null;
                    mSlidingView = null;
                }
            } else
            {
                mDownView = null;
                mSlidingView = null;
            }
        }
_L7:
        return false;
_L5:
        if (mDownView != null)
        {
            SwipeController.access$600(SwipeController.this, mSlidingView, 0.0F);
        }
        mDownView = null;
        mSlidingView = null;
        mDownX = 0.0F;
        mDownY = 0.0F;
        SwipeController.access$702(SwipeController.this, false);
        continue; /* Loop/switch isn't completed */
_L4:
        if (SwipeController.access$100(SwipeController.this))
        {
            return true;
        }
        if (mDownView != null)
        {
            float f = motionevent.getX() - mDownX;
            float f2;
            float f4;
            boolean flag;
            if (f < 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f2 = Math.abs(f);
            f4 = Math.abs(motionevent.getY() - mDownY);
            if (flag)
            {
                if (!SwipeController.access$700(SwipeController.this) && f2 > (float)SwipeController.access$800(SwipeController.this) && f4 < f2 / 2.0F)
                {
                    SwipeController.access$702(SwipeController.this, true);
                    SwipeController.access$400(SwipeController.this).requestDisallowInterceptTouchEvent(true);
                }
                if (SwipeController.access$700(SwipeController.this))
                {
                    mDownView.setPressed(false);
                    SwipeController.access$400(SwipeController.this).setPressed(false);
                    SwipeController.access$600(SwipeController.this, mSlidingView, f);
                    return true;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (SwipeController.access$100(SwipeController.this))
        {
            return true;
        }
        if (SwipeController.access$700(SwipeController.this) && mDownView != null)
        {
            View view = mDownView;
            View view1 = mSlidingView;
            float f1 = motionevent.getX() - mDownX;
            float f3 = Math.abs(f1);
            boolean flag1;
            if (f3 > (float)(view.getWidth() / 4))
            {
                f3 /= view.getWidth();
                long l;
                if (f1 < 0.0F)
                {
                    f1 = -view.getWidth();
                } else
                {
                    f1 = view.getWidth();
                }
                flag1 = true;
            } else
            {
                f3 = 1.0F - f3 / (float)view.getWidth();
                f1 = 0.0F;
                flag1 = false;
            }
            l = (int)((1.0F - f3) * 250F);
            SwipeController.access$900(SwipeController.this, view, view1, f1, l, flag1);
        }
        mDownView = null;
        mSlidingView = null;
        mDownX = 0.0F;
        mDownY = 0.0F;
        SwipeController.access$702(SwipeController.this, false);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
    {
        onTouch(motionevent);
    }

    smissibleAdapter()
    {
        this$0 = SwipeController.this;
        super();
    }
}
