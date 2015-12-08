// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            b

public class StarView extends View
{

    private Drawable a;
    private Drawable b;
    private Drawable c;
    private int d;
    private int e;
    private float f;
    private int g;
    private int h;

    public StarView(Context context)
    {
        super(context);
        a(context);
    }

    public StarView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    private void a(Context context)
    {
        context = getResources();
        a = context.getDrawable(0x7f02049f);
        b = context.getDrawable(0x7f0204a0);
        c = context.getDrawable(0x7f02049e);
        h = com.go.weatherex.sidebar.shuffle.b.a(3F);
        e = a.getIntrinsicHeight();
        d = a.getIntrinsicWidth();
        a.setBounds(0, 0, d, e);
        b.setBounds(0, 0, d, e);
        c.setBounds(0, 0, d, e);
        g = (d + h) * 5;
    }

    private void a(Canvas canvas, int i)
    {
        int j = canvas.save();
        canvas.translate((d + h) * i, 0.0F);
        float f1 = f - (float)i;
        if (f1 <= 0.0F)
        {
            c.draw(canvas);
        } else
        if (f1 <= 0.5F)
        {
            b.draw(canvas);
        } else
        {
            a.draw(canvas);
        }
        canvas.restoreToCount(j);
    }

    public void a(float f1)
    {
        f = f1;
        postInvalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        for (int i = 0; i < 5; i++)
        {
            a(canvas, i);
        }

    }

    protected void onMeasure(int i, int j)
    {
        setMeasuredDimension(g, e);
    }
}
