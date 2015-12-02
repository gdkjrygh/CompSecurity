// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;

// Referenced classes of package com.whatsapp:
//            HomeActivity, App

public class b extends ViewPager
{

    private boolean b;

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (b)
        {
            return super.onInterceptTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (b)
        {
            return super.onTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }

    public void setCurrentItem(int i)
    {
label0:
        {
            if (i != getCurrentItem())
            {
                break label0;
            }
            Object obj = HomeActivity.b((HomeActivity)getContext(), i);
            if (obj == null)
            {
                break label0;
            }
            obj = (ListView)((Fragment)obj).getView().findViewById(0x102000a);
            if (obj == null)
            {
                break label0;
            }
            if (android.os.tView >= 8 && ((ListView) (obj)).getFirstVisiblePosition() < 8)
            {
                ((ListView) (obj)).smoothScrollToPosition(0);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            ((ListView) (obj)).setSelection(0);
        }
        super.setCurrentItem(i);
    }

    public (Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = true;
    }
}
