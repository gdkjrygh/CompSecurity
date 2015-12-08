// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.viewex;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class AlphaChangeRelativeLayout extends RelativeLayout
{

    private int a;
    private Rect b;

    public AlphaChangeRelativeLayout(Context context)
    {
        super(context);
        a = 255;
        b = new Rect();
    }

    public AlphaChangeRelativeLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 255;
        b = new Rect();
    }

    public AlphaChangeRelativeLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = 255;
        b = new Rect();
    }

    protected void dispatchDraw(Canvas canvas)
    {
        getDrawingRect(b);
        canvas.saveLayerAlpha(0.0F, 0.0F, b.right, b.bottom, a, 31);
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
