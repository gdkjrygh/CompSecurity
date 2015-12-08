// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.view.MotionEvent;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            FlingDynamics, WatchWhileLayout

final class ix extends FlingDynamics
{

    final WatchWhileLayout g;
    private float h;

    public ix(WatchWhileLayout watchwhilelayout, Context context)
    {
        g = watchwhilelayout;
        super(context, 400);
        h = 0.0F;
    }

    public final int a(int i, int j)
    {
        int k = j;
        if (h != 0.0F)
        {
            k = (int)((double)i * Math.cos(h) + (double)j * Math.sin(h));
        }
        return k;
    }

    public final void a(float f1)
    {
        h = f1;
    }

    public final WatchWhileLayout.DragMode f(MotionEvent motionevent)
    {
        int i = motionevent.findPointerIndex(f);
        if (i >= 0 && motionevent.getPointerCount() > i)
        {
            float f1 = d;
            float f2 = e;
            int j = c(motionevent);
            int k = d(motionevent);
            boolean flag;
            int l;
            if (WatchWhileLayout.a(g) == WatchWhileLayout.WatchState.MINIMIZED && WatchWhileLayout.b(g) == WatchWhileLayout.c(g))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l = a(j, k);
            if (flag)
            {
                if (Math.abs(j) > a * 2 && (h == 0.0F || Math.abs(k) < a))
                {
                    return WatchWhileLayout.DragMode.DISMISS;
                }
                if (l > a * 2)
                {
                    return WatchWhileLayout.DragMode.MIN_MAX;
                }
            } else
            if (Math.abs(l) > a)
            {
                return WatchWhileLayout.DragMode.MIN_MAX;
            }
            d = f1;
            e = f2;
        } else
        {
            a();
        }
        return WatchWhileLayout.DragMode.NONE;
    }
}
