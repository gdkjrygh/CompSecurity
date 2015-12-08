// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class PassThroughTouchLinearLayout extends FrameLayout
{

    public PassThroughTouchLinearLayout(Context context)
    {
        super(context);
    }

    public PassThroughTouchLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public PassThroughTouchLinearLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public PassThroughTouchLinearLayout(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag = super.dispatchTouchEvent(motionevent);
        boolean flag1 = onTouchEvent(motionevent);
        return flag || flag1;
    }
}
