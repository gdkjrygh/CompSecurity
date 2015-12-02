// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ViewSwitcher;

public final class oi extends ViewSwitcher
{

    private final ajm a;

    public oi(Context context)
    {
        super(context);
        a = new ajm(context);
    }

    static ajm a(oi oi1)
    {
        return oi1.a;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        a.a(motionevent);
        return false;
    }

    public final void removeAllViews()
    {
        for (int i = 0; i < getChildCount(); i++)
        {
            android.view.View view = getChildAt(i);
            if (view != null && (view instanceof akk))
            {
                ((akk)view).destroy();
            }
        }

        super.removeAllViews();
    }
}
