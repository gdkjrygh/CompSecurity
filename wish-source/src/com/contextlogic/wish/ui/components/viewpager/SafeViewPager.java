// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.viewpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class SafeViewPager extends ViewPager
{

    public SafeViewPager(Context context)
    {
        super(context);
    }

    public SafeViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void endFakeDrag()
    {
        try
        {
            super.endFakeDrag();
            return;
        }
        catch (Throwable throwable)
        {
            return;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (isFakeDragging())
        {
            return false;
        } else
        {
            return super.onInterceptTouchEvent(motionevent);
        }
    }
}
