// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            ad, ag

public class MinimalTimeBar extends View
{

    private final ad a = new ad(getResources());
    private int b;
    private int c;
    private boolean d;

    public MinimalTimeBar(Context context)
    {
        super(context);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        a.draw(canvas);
    }

    protected void onMeasure(int i, int j)
    {
        setMeasuredDimension(getDefaultSize(0, i), resolveSize(a.getIntrinsicHeight(), j));
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        a.setBounds(0, 0, i, j);
    }

    public void setScrubberTime(int i)
    {
        long l;
        if (b == 0)
        {
            l = 0L;
        } else
        {
            l = ((long)i * 100L) / (long)b;
        }
        i = (int)l;
        a.setLevel(i + c * 1000);
        invalidate();
    }

    public void setScrubbing(boolean flag)
    {
        d = flag;
    }

    public void setStyle(com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style style)
    {
        if (style == com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style.AD)
        {
            style = ag.b;
        } else
        if (style == com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style.LIVE)
        {
            style = ag.c;
        } else
        {
            style = ag.a;
        }
        a.setState(style);
        invalidate();
    }

    public void setTimes(int i, int j, int k)
    {
        long l;
        if (j == 0)
        {
            l = 0L;
        } else
        {
            l = ((long)i * 100L) / (long)j;
        }
        i = (int)l;
        if (!d)
        {
            a.setLevel(i + k * 1000);
        }
        c = k;
        b = j;
        invalidate();
    }
}
