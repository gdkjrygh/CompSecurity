// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import chm;

public class ArrowView extends View
{

    private final Paint a;
    private final Paint b;
    private final Paint c;
    private final Path d;
    private final Path e;

    public ArrowView(Context context)
    {
        this(context, null);
    }

    public ArrowView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ArrowView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = new Path();
        e = new Path();
        context = context.obtainStyledAttributes(attributeset, chm.ArrowView);
        int j;
        int k;
        attributeset = getResources();
        i = context.getColor(1, attributeset.getColor(0x7f0d0085));
        j = context.getColor(0, attributeset.getColor(0x7f0d008e));
        k = context.getColor(2, attributeset.getColor(0x7f0d008a));
        context.recycle();
        a = new Paint();
        a.setColor(i);
        a.setStyle(android.graphics.Paint.Style.FILL);
        b = new Paint();
        b.setColor(j);
        a.setStyle(android.graphics.Paint.Style.FILL);
        c = new Paint(1);
        c.setColor(k);
        c.setStyle(android.graphics.Paint.Style.STROKE);
        c.setStrokeWidth(1.0F);
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        float f = getWidth();
        float f1 = getHeight();
        if (f != 0.0F && f1 != 0.0F)
        {
            d.reset();
            d.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            d.moveTo(0.0F, 0.0F);
            d.lineTo(f, f1 / 2.0F);
            d.lineTo(0.0F, f1);
            d.close();
            e.reset();
            e.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            e.moveTo(0.0F, 0.0F);
            e.lineTo(f, f1 / 2.0F);
            e.lineTo(0.0F, f1);
            if (!isInEditMode())
            {
                canvas.drawPaint(a);
                canvas.drawPath(d, b);
                canvas.drawPath(e, c);
                return;
            }
        }
    }
}
