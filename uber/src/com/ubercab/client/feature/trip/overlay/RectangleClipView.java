// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import duz;

public class RectangleClipView extends View
{

    int a;
    RectF b;
    int c;
    Paint d;

    public RectangleClipView(Context context)
    {
        this(context, null);
    }

    public RectangleClipView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RectangleClipView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context);
    }

    private void a(Context context)
    {
        setLayerType(1, null);
        a = context.getResources().getColor(0x7f0d004c);
        d = b(context);
        c = Math.round(duz.a(getResources(), 2));
    }

    private static Paint b(Context context)
    {
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        paint.setColor(context.getResources().getColor(0x106000d));
        paint.setAntiAlias(true);
        return paint;
    }

    public final void a(Rect rect)
    {
        b = new RectF(rect);
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        if (b != null)
        {
            int i = canvas.saveLayer(0.0F, 0.0F, getWidth(), getHeight(), null, 12);
            canvas.drawColor(a);
            canvas.drawRoundRect(b, c, c, d);
            canvas.restoreToCount(i);
        }
    }
}
