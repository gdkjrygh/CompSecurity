// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.receipt;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class StoppableScrollView extends ScrollView
{

    private boolean a;

    public StoppableScrollView(Context context)
    {
        super(context);
        a = true;
    }

    public StoppableScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = true;
    }

    public StoppableScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = true;
    }

    public final void a(boolean flag)
    {
        a = flag;
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
        switch (motionevent.getAction())
        {
        default:
            return super.onTouchEvent(motionevent);

        case 0: // '\0'
            break;
        }
        if (a)
        {
            return super.onTouchEvent(motionevent);
        } else
        {
            return a;
        }
    }
}
