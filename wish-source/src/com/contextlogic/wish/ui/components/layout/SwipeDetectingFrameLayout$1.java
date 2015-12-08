// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.layout;

import android.view.MotionEvent;

// Referenced classes of package com.contextlogic.wish.ui.components.layout:
//            SwipeDetectingFrameLayout

class this._cls0 extends android.view.ureListener
{

    final SwipeDetectingFrameLayout this$0;

    public boolean onDown(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (Math.abs(motionevent.getY() - motionevent1.getY()) <= (float)SwipeDetectingFrameLayout.access$000(SwipeDetectingFrameLayout.this))
        {
            if (motionevent.getX() - motionevent1.getX() > (float)SwipeDetectingFrameLayout.access$100(SwipeDetectingFrameLayout.this) && Math.abs(f) > (float)SwipeDetectingFrameLayout.access$200(SwipeDetectingFrameLayout.this))
            {
                return SwipeDetectingFrameLayout.access$300(SwipeDetectingFrameLayout.this, ipeDirection.Left);
            }
            if (motionevent1.getX() - motionevent.getX() > (float)SwipeDetectingFrameLayout.access$100(SwipeDetectingFrameLayout.this) && Math.abs(f) > (float)SwipeDetectingFrameLayout.access$200(SwipeDetectingFrameLayout.this))
            {
                return SwipeDetectingFrameLayout.access$300(SwipeDetectingFrameLayout.this, ipeDirection.Right);
            }
        }
        return false;
    }

    ipeDirection()
    {
        this$0 = SwipeDetectingFrameLayout.this;
        super();
    }
}
