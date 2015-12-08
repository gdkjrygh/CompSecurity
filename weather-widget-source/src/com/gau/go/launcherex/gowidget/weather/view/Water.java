// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            WaterDropView

public class Water extends ImageView
{

    public WaterDropView a;
    private boolean b;
    private float c;
    private Drawable d;
    private int e;
    private int f;
    private TextView g;
    private int h;

    public Water(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = false;
        c = 0.0F;
        h = (int)(getResources().getDisplayMetrics().density * 75F);
        d = getResources().getDrawable(0x7f02004e);
        e = d.getIntrinsicWidth();
        f = d.getIntrinsicHeight();
    }

    static float a(Water water, float f1)
    {
        water.c = f1;
        return f1;
    }

    static boolean a(Water water)
    {
        return water.b;
    }

    static boolean a(Water water, boolean flag)
    {
        water.b = flag;
        return flag;
    }

    static TextView b(Water water)
    {
        return water.g;
    }

    static float c(Water water)
    {
        return water.c;
    }

    public void a()
    {
        clearAnimation();
        b = false;
        c = 0.0F;
        if (g != null)
        {
            g.setText((new StringBuilder()).append(String.valueOf(12)).append("%").toString());
        }
        invalidate();
    }

    public void a(TextView textview)
    {
        g = textview;
    }

    protected void onDraw(Canvas canvas)
    {
        if (!b)
        {
            super.onDraw(canvas);
        } else
        if (d != null)
        {
            Rect rect = d.getBounds();
            rect.left = 0;
            rect.top = (getHeight() - f) + (int)((float)(-h) * c);
            rect.right = getRight();
            rect.bottom = getHeight();
            d.draw(canvas);
            if (a != null)
            {
                a.a = rect.top;
                return;
            }
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
    }
}
