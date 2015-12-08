// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.common.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

public class DashedDivider extends View
{

    private int a;
    private Paint b;
    private float c;
    private float d;
    private Path e;
    private PathEffect f;

    public DashedDivider(Context context)
    {
        super(context);
        a = -1;
        a(context);
    }

    public DashedDivider(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = -1;
        a(context);
    }

    public DashedDivider(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = -1;
        a(context);
    }

    private void a(Context context)
    {
        d = getContext().getResources().getDisplayMetrics().density;
        b = new Paint(3);
        b.setColor(a);
        b.setTextAlign(android.graphics.Paint.Align.CENTER);
        b.setStrokeWidth(1.5F * d);
        b.setStyle(android.graphics.Paint.Style.STROKE);
        e = new Path();
        f = new DashPathEffect(new float[] {
            6F, 5F, 6F, 5F
        }, 1.0F);
        b.setPathEffect(f);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        c = getWidth();
        float f1 = getHeight();
        e.moveTo(0.0F, f1 / 2.0F);
        e.lineTo(c, f1 / 2.0F);
        canvas.drawPath(e, b);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
    }
}
