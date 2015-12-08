// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.scrollview;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.ScrollView;

public class InterceptingTouchScrollView extends ScrollView
{

    private static final int DRAG_THRESHOLD = 25;
    private boolean isDragging;
    private float lastX;
    private float lastY;
    private float movedX;
    private float movedY;
    private int startTouchY;

    public InterceptingTouchScrollView(Context context)
    {
        this(context, null);
    }

    public InterceptingTouchScrollView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public InterceptingTouchScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 38
    //                   1 32
    //                   2 67;
           goto _L1 _L2 _L1 _L3
_L1:
        return super.onInterceptTouchEvent(motionevent);
_L2:
        movedY = 0.0F;
        movedX = 0.0F;
        lastX = motionevent.getX();
        lastY = motionevent.getY();
        continue; /* Loop/switch isn't completed */
_L3:
        float f = motionevent.getX();
        float f1 = motionevent.getY();
        movedX = movedX + Math.abs(f - lastX);
        movedY = movedY + Math.abs(f1 - lastY);
        lastX = f;
        lastY = f1;
        if (movedX > movedY)
        {
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i = (int)motionevent.getRawY();
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 56
    //                   0 62
    //                   1 70
    //                   2 83
    //                   3 70
    //                   4 56
    //                   5 56
    //                   6 70;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L1 _L3
_L1:
        return super.onTouchEvent(motionevent);
_L2:
        startTouchY = i;
        continue; /* Loop/switch isn't completed */
_L3:
        startTouchY = -1;
        isDragging = false;
        continue; /* Loop/switch isn't completed */
_L4:
        int j = (int)TypedValue.applyDimension(1, 25F, getResources().getDisplayMetrics());
        if (!isDragging && startTouchY != -1 && Math.abs(i - startTouchY) > j)
        {
            isDragging = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
