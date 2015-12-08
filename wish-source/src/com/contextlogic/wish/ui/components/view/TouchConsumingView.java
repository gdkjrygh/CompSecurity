// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class TouchConsumingView extends FrameLayout
{

    public TouchConsumingView(Context context)
    {
        super(context);
    }

    public TouchConsumingView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TouchConsumingView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return true;
    }
}
