// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.drawer;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

public class TabletDrawerLayout extends DrawerLayout
{

    private boolean isTouchLocked;

    public TabletDrawerLayout(Context context)
    {
        super(context);
    }

    public TabletDrawerLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TabletDrawerLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void closeDrawer(View view)
    {
        super.closeDrawer(view);
    }

    public boolean isDrawerOpen()
    {
        return isDrawerOpen(0x800003) || isDrawerOpen(0x800005);
    }

    public void lockTouches()
    {
        isTouchLocked = true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (isTouchLocked)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = super.onInterceptTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            return false;
        }
        return flag;
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (isTouchLocked)
        {
            return false;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (isTouchLocked)
        {
            return false;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (isTouchLocked)
        {
            return false;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public void openDrawer(View view)
    {
        super.openDrawer(view);
    }

    public void unlockTouches()
    {
        isTouchLocked = false;
    }
}
