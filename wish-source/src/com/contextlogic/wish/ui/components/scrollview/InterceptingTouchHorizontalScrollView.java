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
import android.widget.HorizontalScrollView;

public class InterceptingTouchHorizontalScrollView extends HorizontalScrollView
{

    private static final int DRAG_THRESHOLD = 10;
    private boolean isDragging;
    private int startTouchX;

    public InterceptingTouchHorizontalScrollView(Context context)
    {
        this(context, null);
    }

    public InterceptingTouchHorizontalScrollView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public InterceptingTouchHorizontalScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i = (int)motionevent.getRawX();
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 56
    //                   0 81
    //                   1 89
    //                   2 102
    //                   3 89
    //                   4 56
    //                   5 56
    //                   6 89;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L1 _L3
_L1:
        boolean flag = super.onInterceptTouchEvent(motionevent);
        if (flag)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return flag;
_L2:
        startTouchX = i;
        continue; /* Loop/switch isn't completed */
_L3:
        startTouchX = -1;
        isDragging = false;
        continue; /* Loop/switch isn't completed */
_L4:
        int j = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        if (!isDragging && startTouchX != -1 && Math.abs(i - startTouchX) > j)
        {
            isDragging = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
