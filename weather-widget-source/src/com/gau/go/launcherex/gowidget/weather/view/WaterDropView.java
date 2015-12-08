// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            ax, aw

public class WaterDropView extends View
{

    public int a;
    private int b;
    private Bitmap c;
    private ax d[];
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private aw j;

    public WaterDropView(Context context)
    {
        super(context);
        d = new ax[12];
        i = false;
        d();
    }

    public WaterDropView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = new ax[12];
        i = false;
        d();
    }

    private int a(int k)
    {
        int l = android.view.View.MeasureSpec.getMode(k);
        k = android.view.View.MeasureSpec.getSize(k);
        switch (l)
        {
        default:
            k = 0;
            // fall through

        case -2147483648: 
        case 1073741824: 
            return k;
        }
    }

    private void d()
    {
        f();
        b = (int)(7F * getResources().getDisplayMetrics().density);
        e = c.getWidth();
        f = c.getHeight();
        e();
    }

    private void e()
    {
        int l = d.length;
        int k = 0;
        boolean flag = false;
        while (k < l) 
        {
            ax ax1 = new ax(this, null);
            if (flag)
            {
                ax1.b = 0;
            } else
            {
                ax1.b = e + 12;
            }
            ax1.c = (k + 1) * -80;
            d[k] = ax1;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k++;
        }
    }

    private void f()
    {
        c = BitmapFactory.decodeResource(getResources(), 0x7f02004f);
    }

    public void a()
    {
        ax aax[] = d;
        int l = aax.length;
        int k = 0;
        while (k < l) 
        {
            ax ax1 = aax[k];
            ax1.c = ax1.c + b;
            if (ax1.c < -f)
            {
                ax1.a = false;
            } else
            if (ax1.c > g + f)
            {
                ax1.a = false;
                ax1.c = ax1.c - 960;
                if (!i && j != null)
                {
                    i = true;
                    j.d();
                }
            } else
            {
                ax1.a = true;
            }
            k++;
        }
    }

    public void a(aw aw1)
    {
        j = aw1;
    }

    public void b()
    {
        h = true;
        invalidate();
    }

    public void c()
    {
        h = false;
        i = false;
        e();
        invalidate();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (c != null && !c.isRecycled())
        {
            c.recycle();
        }
    }

    protected void onDraw(Canvas canvas)
    {
        int k = 0;
        super.onDraw(canvas);
        if (h)
        {
            a();
            invalidate();
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), a);
        ax aax[] = d;
        for (int l = aax.length; k < l; k++)
        {
            ax ax1 = aax[k];
            if (ax1.a)
            {
                canvas.drawBitmap(c, ax1.b, ax1.c, null);
            }
        }

        canvas.restore();
    }

    protected void onMeasure(int k, int l)
    {
        setMeasuredDimension(e * 2 + 12, a(l));
    }

    protected void onSizeChanged(int k, int l, int i1, int j1)
    {
        super.onSizeChanged(k, l, i1, j1);
        g = l;
        a = g;
    }
}
