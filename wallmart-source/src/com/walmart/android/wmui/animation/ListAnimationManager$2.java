// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui.animation;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;

// Referenced classes of package com.walmart.android.wmui.animation:
//            ListAnimationManager, ListAnimator, DismissibleAdapter

class this._cls0
    implements android.view.istAnimationManager._cls2
{

    private View mDownView;
    float mDownX;
    float mDownY;
    final ListAnimationManager this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (!ListAnimationManager.access$000(ListAnimationManager.this))
        {
            return false;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 48
    //                   0 50
    //                   1 387
    //                   2 224
    //                   3 174;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return false;
_L2:
        if (ListAnimationManager.access$200(ListAnimationManager.this).isAnimating())
        {
            return true;
        }
        mDownView = ListAnimationManager.access$300(ListAnimationManager.this, motionevent);
        if (mDownView != null)
        {
            mDownX = motionevent.getX();
            mDownY = motionevent.getY();
            if (mDownView.getParent() != null)
            {
                int i = ListAnimationManager.access$400(ListAnimationManager.this).getPositionForView(mDownView) - ListAnimationManager.access$400(ListAnimationManager.this).getHeaderViewsCount();
                if (i < 0 || !ListAnimationManager.access$500(ListAnimationManager.this).isDismissible(i))
                {
                    mDownView = null;
                }
            } else
            {
                mDownView = null;
            }
        }
_L7:
        return false;
_L5:
        if (mDownView != null)
        {
            ListAnimationManager.access$200(ListAnimationManager.this).setSwipePosition(mDownView, 0.0F);
        }
        mDownView = null;
        mDownX = 0.0F;
        mDownY = 0.0F;
        ListAnimationManager.access$200(ListAnimationManager.this).clearSwiping();
        continue; /* Loop/switch isn't completed */
_L4:
        if (ListAnimationManager.access$200(ListAnimationManager.this).isAnimating())
        {
            return true;
        }
        if (mDownView != null)
        {
            float f = motionevent.getX() - mDownX;
            float f2 = Math.abs(f);
            float f4 = Math.abs(motionevent.getY() - mDownY);
            if (!ListAnimationManager.access$200(ListAnimationManager.this).isSwiping() && f2 > (float)ListAnimationManager.access$600(ListAnimationManager.this) && f4 < f2 / 2.0F)
            {
                ListAnimationManager.access$200(ListAnimationManager.this).setSwiping(mDownView);
                ListAnimationManager.access$400(ListAnimationManager.this).requestDisallowInterceptTouchEvent(true);
            }
            if (ListAnimationManager.access$200(ListAnimationManager.this).isSwiping())
            {
                mDownView.setPressed(false);
                ListAnimationManager.access$400(ListAnimationManager.this).setPressed(false);
                ListAnimationManager.access$200(ListAnimationManager.this).setSwipePosition(mDownView, f);
                return true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (ListAnimationManager.access$200(ListAnimationManager.this).isAnimating())
        {
            return true;
        }
        if (ListAnimationManager.access$200(ListAnimationManager.this).isSwiping() && mDownView != null)
        {
            view = mDownView;
            float f1 = motionevent.getX() - mDownX;
            float f3 = Math.abs(f1);
            boolean flag;
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
                flag = true;
            } else
            {
                f3 = 1.0F - f3 / (float)view.getWidth();
                f1 = 0.0F;
                flag = false;
            }
            l = (int)((1.0F - f3) * 250F);
            ListAnimationManager.access$200(ListAnimationManager.this).animateSwipe(view, f1, l, flag);
        }
        mDownView = null;
        mDownX = 0.0F;
        mDownY = 0.0F;
        ListAnimationManager.access$200(ListAnimationManager.this).clearSwiping();
        if (true) goto _L7; else goto _L6
_L6:
    }

    ()
    {
        this$0 = ListAnimationManager.this;
        super();
    }
}
