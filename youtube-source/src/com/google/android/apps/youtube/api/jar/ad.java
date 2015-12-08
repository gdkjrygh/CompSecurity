// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            ag

public final class ad extends ag
{

    private static final int n = Color.rgb(27, 27, 27);
    private final Paint o = new Paint();
    private final Rect p = new Rect();
    private final Rect q = new Rect();
    private final Rect r = new Rect();
    private final float s;

    public ad(Resources resources)
    {
        o.setDither(true);
        s = resources.getDisplayMetrics().density;
    }

    protected final void a()
    {
        Rect rect = getBounds();
        int i = (l * rect.width()) / 100;
        p.set(rect.left, rect.top, i + rect.left, rect.bottom);
        if (m > l)
        {
            i = ((m - l) * rect.width()) / 100;
        } else
        {
            i = 0;
        }
        q.set(p.right, rect.top, i + p.right, rect.bottom);
        r.set(q.right, rect.top, rect.right, rect.bottom);
    }

    public final void draw(Canvas canvas)
    {
        o.setShader(k);
        canvas.drawRect(p, o);
        o.setShader(null);
        o.setColor(h);
        canvas.drawRect(q, o);
        o.setColor(n);
        canvas.drawRect(r, o);
    }

    public final int getIntrinsicHeight()
    {
        return (int)(4F * s + 0.5F);
    }

    public final int getIntrinsicWidth()
    {
        return -1;
    }

    protected final void onBoundsChange(Rect rect)
    {
        a(rect, getState());
        a();
    }

}
