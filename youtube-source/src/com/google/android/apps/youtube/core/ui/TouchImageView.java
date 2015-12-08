// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

public class TouchImageView extends ImageView
{

    private boolean a;

    public TouchImageView(Context context)
    {
        super(context);
        a = false;
    }

    public TouchImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            a = true;
            setPressed(true);
        }
        return super.onTouchEvent(motionevent);
    }

    public void setPressed(boolean flag)
    {
        if (flag && !a)
        {
            return;
        } else
        {
            a = false;
            super.setPressed(flag);
            return;
        }
    }
}
