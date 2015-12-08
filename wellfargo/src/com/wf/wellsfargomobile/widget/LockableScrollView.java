// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class LockableScrollView extends ScrollView
{

    private boolean a;

    public LockableScrollView(Context context)
    {
        super(context);
        a = true;
    }

    public LockableScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = true;
    }

    public LockableScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = true;
    }

    public LockableScrollView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        a = true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (!a)
        {
            return false;
        } else
        {
            return super.onInterceptTouchEvent(motionevent);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (a)
        {
            return super.onTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }

    public void setScrollingEnabled(boolean flag)
    {
        a = flag;
    }
}
