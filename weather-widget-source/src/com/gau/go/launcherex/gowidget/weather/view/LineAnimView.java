// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ImageView;

public class LineAnimView extends ImageView
{

    private boolean a;
    private Rect b;
    private float c;

    public LineAnimView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 0.0F;
        b = new Rect();
    }

    static float a(LineAnimView lineanimview, float f)
    {
        lineanimview.c = f;
        return f;
    }

    public void a(boolean flag)
    {
        a = flag;
    }

    protected void onDraw(Canvas canvas)
    {
        getDrawingRect(b);
        canvas.save();
        if (c != 1.0F)
        {
            if (a)
            {
                float f = b.width();
                float f1 = c;
                canvas.clipRect(0.0F, b.top, f * f1, b.bottom);
            } else
            {
                canvas.clipRect((float)b.width() * (1.0F - c), b.top, b.right, b.bottom);
            }
        }
        super.onDraw(canvas);
        canvas.restore();
    }
}
