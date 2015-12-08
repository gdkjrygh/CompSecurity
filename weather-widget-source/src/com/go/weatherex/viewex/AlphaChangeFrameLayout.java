// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.viewex;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class AlphaChangeFrameLayout extends FrameLayout
{

    private int a;
    private Rect b;

    public AlphaChangeFrameLayout(Context context)
    {
        super(context);
        a = 255;
        b = new Rect();
    }

    public AlphaChangeFrameLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 255;
        b = new Rect();
    }

    public AlphaChangeFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = 255;
        b = new Rect();
    }

    public int a()
    {
        return a;
    }

    public void a(int i)
    {
        a = i;
        invalidate();
    }

    protected void dispatchDraw(Canvas canvas)
    {
        getDrawingRect(b);
        canvas.saveLayerAlpha(0.0F, 0.0F, b.right, b.bottom, a, 31);
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
