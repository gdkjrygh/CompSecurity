// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.jiubang.playsdk.e;

public class ActionBarBackLayout extends RelativeLayout
{

    private RelativeLayout a;

    public ActionBarBackLayout(Context context)
    {
        super(context);
    }

    public ActionBarBackLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (RelativeLayout)findViewById(e.a);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (a != null)
        {
            if (motionevent.getAction() == 0)
            {
                a.setPressed(true);
            } else
            if (motionevent.getAction() == 3 || motionevent.getAction() == 1 || motionevent.getAction() == 7)
            {
                a.setPressed(false);
            } else
            if (motionevent.getAction() != 2);
        }
        return super.onTouchEvent(motionevent);
    }
}
