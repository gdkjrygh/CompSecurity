// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class DashedLinearLayout extends LinearLayout
{

    private View a;
    private boolean b;
    private Context c;

    public DashedLinearLayout(Context context)
    {
        super(context);
        b = true;
        c = context;
    }

    public DashedLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = true;
        c = context;
    }

    public DashedLinearLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = true;
        c = context;
    }

    private void a()
    {
        a = new View(c);
        a.setBackgroundDrawable(getResources().getDrawable(0x7f0200c1));
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (b)
        {
            canvas.save();
            canvas.translate(0.0F, getHeight() - a.getHeight());
            canvas.clipRect(a.getLeft(), 0, a.getRight(), getHeight());
            a.draw(canvas);
            canvas.restore();
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        a.layout(0, l - 1, k, l);
    }
}
