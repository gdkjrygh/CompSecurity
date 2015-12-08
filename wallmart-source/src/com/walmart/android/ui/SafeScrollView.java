// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.walmartlabs.utils.WLog;

public final class SafeScrollView extends ScrollView
{

    private static final String TAG = com/walmart/android/ui/SafeScrollView.getSimpleName();

    public SafeScrollView(Context context)
    {
        super(context);
    }

    public SafeScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public SafeScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        try
        {
            flag = super.onInterceptTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            WLog.w(TAG, (new StringBuilder()).append("onInterceptTouchEvent exception: ").append(motionevent).toString());
            return false;
        }
        return flag;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        try
        {
            flag = super.onTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            WLog.w(TAG, (new StringBuilder()).append("onTouchEvent exception: ").append(motionevent).toString());
            return false;
        }
        return flag;
    }

}
