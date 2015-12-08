// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.walmartlabs.utils.WLog;

public class SafeDrawerLayout extends DrawerLayout
{

    public static final String TAG = com/walmart/android/wmui/SafeDrawerLayout.getSimpleName();

    public SafeDrawerLayout(Context context)
    {
        super(context);
    }

    public SafeDrawerLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public SafeDrawerLayout(Context context, AttributeSet attributeset, int i)
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
            WLog.e(TAG, "onInterceptTouchEvent failed. Is Drawer working as expected?", motionevent);
            return false;
        }
        return flag;
    }

}
