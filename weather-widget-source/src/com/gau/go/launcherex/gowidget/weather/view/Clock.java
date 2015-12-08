// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public class Clock extends View
{

    private Paint a;
    private Bitmap b;
    private Bitmap c;
    private Bitmap d;
    private Bitmap e;
    private int f;
    private int g;
    private int h;
    private int i;
    private TextView j;
    private int k;
    private int l;
    private int m;

    public Clock(Context context)
    {
        super(context);
        h = -60;
        i = 0;
        a = new Paint(1);
        a(context);
    }

    public Clock(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = -60;
        i = 0;
        a = new Paint(1);
        a(context);
    }

    static int a(Clock clock, int i1)
    {
        clock.h = i1;
        return i1;
    }

    static TextView a(Clock clock)
    {
        return clock.j;
    }

    private void a(Context context)
    {
        context = context.getResources();
        b = BitmapFactory.decodeResource(context, 0x7f020020);
        f = b.getWidth();
        g = b.getHeight();
        c = BitmapFactory.decodeResource(context, 0x7f020029);
        d = BitmapFactory.decodeResource(context, 0x7f020032);
        e = BitmapFactory.decodeResource(context, 0x7f020021);
        m = g - c.getHeight();
        k = f / 2;
        l = (g - m) / 2;
    }

    private void a(Bitmap bitmap)
    {
        if (bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
        }
    }

    private void a(Canvas canvas)
    {
        if (h == 0)
        {
            canvas.drawBitmap(c, 0.0F, 0.0F, a);
            return;
        } else
        {
            int i1 = canvas.save();
            canvas.rotate(h, k, l);
            canvas.drawBitmap(c, 0.0F, 0.0F, a);
            canvas.restoreToCount(i1);
            return;
        }
    }

    static int b(Clock clock)
    {
        return clock.i;
    }

    static int b(Clock clock, int i1)
    {
        clock.i = i1;
        return i1;
    }

    private void b(Canvas canvas)
    {
        if (i == 0)
        {
            canvas.drawBitmap(d, 0.0F, 0.0F, a);
            return;
        } else
        {
            int i1 = canvas.save();
            canvas.rotate(i, k, l);
            canvas.drawBitmap(d, 0.0F, 0.0F, a);
            canvas.restoreToCount(i1);
            return;
        }
    }

    public void a()
    {
        clearAnimation();
        h = -60;
        i = 0;
        invalidate();
    }

    public void a(TextView textview)
    {
        j = textview;
    }

    public void draw(Canvas canvas)
    {
        canvas.drawBitmap(b, 0.0F, 0.0F, null);
        int i1 = canvas.save();
        canvas.translate(0.0F, m);
        b(canvas);
        a(canvas);
        canvas.drawBitmap(e, 0.0F, 0.0F, null);
        canvas.restoreToCount(i1);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        a(b);
        a(c);
        a(d);
        a(e);
    }

    protected void onMeasure(int i1, int j1)
    {
        setMeasuredDimension(f, g);
    }
}
