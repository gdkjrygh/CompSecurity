// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

// Referenced classes of package com.go.weatherex.home:
//            b

public class ArrowIcon extends View
{

    private b a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private RectF h;
    private Paint i;
    private float j;
    private boolean k;

    public ArrowIcon(Context context)
    {
        super(context);
        j = 1.05F;
        k = false;
        a(context);
    }

    public ArrowIcon(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = 1.05F;
        k = false;
        a(context);
    }

    public ArrowIcon(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        j = 1.05F;
        k = false;
        a(context);
    }

    private void a(Context context)
    {
        a = new b(this, null);
        i = new Paint(35);
        i.setTextAlign(android.graphics.Paint.Align.CENTER);
        i.setColor(-1);
        h = new RectF();
        j = j * context.getResources().getDisplayMetrics().density;
    }

    public void a(boolean flag)
    {
        k = flag;
        if (k)
        {
            a.a(135F);
            a.b(225F);
        } else
        {
            a.a(225F);
            a.b(135F);
        }
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        float f2 = g + c;
        float f3 = (g - f) + b;
        float f1 = f;
        canvas.save();
        canvas.rotate(a.a(), g + c, g + b);
        float f4 = j + f1 + (f * (float)Math.sqrt(2D) - f1 - j) * (1.0F - a.d());
        float f5 = j;
        h.set(f2 - f4, f3 - f5, f2 + f4, f3 + f5);
        canvas.drawRect(h, i);
        canvas.restore();
        f2 = g + c;
        f3 = g + b;
        canvas.save();
        canvas.rotate(a.b(), g + c, g + b);
        f4 = f * (float)Math.sqrt(2D);
        f5 = j;
        h.set(f2 - f4, f3 - f5, f2 + f4, f3 + f5);
        canvas.drawRect(h, i);
        canvas.restore();
        f2 = g + c;
        f3 = g + f + b;
        canvas.save();
        canvas.rotate(a.c(), g + c, g + b);
        f4 = j;
        f1 = (f * (float)Math.sqrt(2D) - f1 - j) * (1.0F - a.d()) + (f4 + f1);
        f4 = j;
        h.set(f2 - f1, f3 - f4, f2 + f1, f3 + f4);
        canvas.drawRect(h, i);
        canvas.restore();
    }

    protected void onLayout(boolean flag, int l, int i1, int j1, int k1)
    {
        super.onLayout(flag, l, i1, j1, k1);
        b = getPaddingTop();
        c = getPaddingLeft();
        d = getWidth() - getPaddingLeft() - getPaddingRight();
        e = getHeight() - getPaddingTop() - getPaddingBottom();
        f = (Math.min(d, e) * (float)Math.sqrt(2D)) / 4F;
        g = Math.min(d, e) / 2.0F;
    }
}
