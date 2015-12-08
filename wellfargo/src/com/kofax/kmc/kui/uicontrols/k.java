// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.kofax.kmc.kui.uicontrols.data.GuidingLine;

final class k extends View
{

    private GuidingLine a;
    private Paint b;

    public k(Context context)
    {
        super(context);
        a = GuidingLine.OFF;
        b = new Paint();
        b.setColor(0xffff0000);
        b.setStrokeWidth(3F);
        setWillNotDraw(false);
    }

    public GuidingLine a()
    {
        return a;
    }

    public void a(GuidingLine guidingline)
    {
        a = guidingline;
        invalidate();
    }

    public void onDraw(Canvas canvas)
    {
        if (a != GuidingLine.OFF)
        {
            super.dispatchDraw(canvas);
            int i = Math.max(canvas.getWidth(), canvas.getHeight());
            int j = Math.min(canvas.getWidth(), canvas.getHeight());
            if (a == GuidingLine.LANDSCAPE)
            {
                if (canvas.getWidth() == i)
                {
                    canvas.drawLine(0.0F, j / 2, i, j / 2, b);
                    return;
                } else
                {
                    canvas.drawLine(j / 2, 0.0F, j / 2, i, b);
                    return;
                }
            }
            if (a == GuidingLine.PORTRAIT)
            {
                if (canvas.getHeight() == i)
                {
                    canvas.drawLine(0.0F, i / 2, j, i / 2, b);
                    return;
                } else
                {
                    canvas.drawLine(i / 2, 0.0F, i / 2, j, b);
                    return;
                }
            }
        }
    }
}
