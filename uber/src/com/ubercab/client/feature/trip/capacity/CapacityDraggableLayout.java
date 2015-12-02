// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.capacity;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import cwu;
import fug;
import fuh;
import gjz;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.trip.capacity:
//            CapacityActionSheetView

public class CapacityDraggableLayout extends LinearLayout
{

    public static final int a = cwu.a(60);
    fug b;
    public ViewDragHelper c;
    private final float d;
    private final float e;
    private boolean f;
    private boolean g;
    private int h;
    private fuh i;
    CapacityActionSheetView mCapacityActionSheetView;
    public FrameLayout mContentContainer;

    public CapacityDraggableLayout(Context context)
    {
        this(context, null);
    }

    public CapacityDraggableLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CapacityDraggableLayout(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        h = -1;
        context = ViewConfiguration.get(context);
        e = context.getScaledMinimumFlingVelocity() * 2;
        d = context.getScaledMaximumFlingVelocity();
        b = new fug(this);
        c = ViewDragHelper.create(this, 0.8F, b);
    }

    private boolean a(MotionEvent motionevent)
    {
        return !(new Rect(mContentContainer.getLeft(), mContentContainer.getTop(), mContentContainer.getRight(), mContentContainer.getBottom())).contains((int)motionevent.getX(), (int)motionevent.getY());
    }

    public static boolean a(CapacityDraggableLayout capacitydraggablelayout)
    {
        return capacitydraggablelayout.f;
    }

    public static int b(CapacityDraggableLayout capacitydraggablelayout)
    {
        return capacitydraggablelayout.h;
    }

    public static float c(CapacityDraggableLayout capacitydraggablelayout)
    {
        return capacitydraggablelayout.e;
    }

    public static float d(CapacityDraggableLayout capacitydraggablelayout)
    {
        return capacitydraggablelayout.d;
    }

    public static boolean e(CapacityDraggableLayout capacitydraggablelayout)
    {
        return capacitydraggablelayout.g;
    }

    public static fuh f(CapacityDraggableLayout capacitydraggablelayout)
    {
        return capacitydraggablelayout.i;
    }

    public static boolean g(CapacityDraggableLayout capacitydraggablelayout)
    {
        capacitydraggablelayout.g = false;
        return false;
    }

    public final void a()
    {
        g = true;
        c.smoothSlideViewTo(mContentContainer, mContentContainer.getLeft(), getHeight());
        ViewCompat.postInvalidateOnAnimation(this);
        c.continueSettling(true);
    }

    public final void a(fuh fuh1)
    {
        i = (fuh)gjz.a(fuh1);
        mCapacityActionSheetView.a(i);
    }

    public final void a(List list)
    {
        mCapacityActionSheetView.a((List)gjz.a(list));
    }

    public void computeScroll()
    {
        if (c.continueSettling(true))
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.inject(this);
            mCapacityActionSheetView.setVisibility(0);
            return;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int j;
        boolean flag;
        flag = false;
        if (h == -1)
        {
            h = mContentContainer.getTop();
            g = true;
        }
        j = MotionEventCompat.getActionMasked(motionevent);
        if (j != 0) goto _L2; else goto _L1
_L1:
        f = false;
_L6:
        flag = c.shouldInterceptTouchEvent(motionevent);
_L4:
        return flag;
_L2:
        if (j == 3) goto _L4; else goto _L3
_L3:
        if (j == 1)
        {
            return false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        c.processTouchEvent(motionevent);
        if (motionevent.getActionMasked() == 0 && a(motionevent))
        {
            f = true;
        } else
        if (motionevent.getActionMasked() == 1 && f && a(motionevent) && i != null)
        {
            i.b();
            return true;
        }
        return true;
    }

}
