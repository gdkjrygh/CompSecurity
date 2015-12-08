// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.scrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

public class DisabledHorizontalScrollView extends HorizontalScrollView
{

    public DisabledHorizontalScrollView(Context context)
    {
        super(context);
    }

    public DisabledHorizontalScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public DisabledHorizontalScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return false;
    }
}
