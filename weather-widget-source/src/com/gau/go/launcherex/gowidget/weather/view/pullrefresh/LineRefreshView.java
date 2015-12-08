// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view.pullrefresh;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view.pullrefresh:
//            b, c

public class LineRefreshView extends View
{

    private int a;
    private Handler b;
    private boolean c;
    private float d;
    private Paint e;
    private RectF f;
    private float g;
    private ArrayList h;
    private float i;
    private float j;
    private Runnable k;

    public LineRefreshView(Context context)
    {
        super(context);
        a = 50;
        c = false;
        d = 0.0F;
        g = 0.0F;
        i = 4F;
        k = new b(this);
        b();
    }

    public LineRefreshView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 50;
        c = false;
        d = 0.0F;
        g = 0.0F;
        i = 4F;
        k = new b(this);
        b();
    }

    public LineRefreshView(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        a = 50;
        c = false;
        d = 0.0F;
        g = 0.0F;
        i = 4F;
        k = new b(this);
        b();
    }

    static float a(LineRefreshView linerefreshview, float f1)
    {
        linerefreshview.d = f1;
        return f1;
    }

    static void a(LineRefreshView linerefreshview)
    {
        linerefreshview.c();
    }

    private void b()
    {
        b = new Handler();
        e = new Paint(1);
        e.setStyle(android.graphics.Paint.Style.FILL);
        e.setColor(0xff00a0ea);
        f = new RectF();
        h = new ArrayList();
        for (int l = 0; l < 4; l++)
        {
            h.add(new RectF());
        }

        i = getResources().getDisplayMetrics().density * i;
    }

    static void b(LineRefreshView linerefreshview)
    {
        linerefreshview.g();
    }

    private void c()
    {
        RectF rectf = (RectF)h.get(0);
        rectf.right = (float)(getRight() - getPaddingRight()) + g;
        rectf.left = rectf.right - j;
        for (int l = 1; l < h.size(); l++)
        {
            RectF rectf1 = (RectF)h.get(l);
            rectf1.right = rectf.left - i - (i + j) * (float)(l - 1);
            rectf1.left = rectf1.right - j;
        }

        if (rectf.left >= (float)(getRight() - getPaddingRight()))
        {
            h.remove(0);
            h.add(rectf);
        }
    }

    private void d()
    {
        clearAnimation();
        f();
        g = 0.0F;
    }

    private void e()
    {
        f();
        b.post(k);
    }

    private void f()
    {
        b.removeCallbacks(k);
    }

    private void g()
    {
        g = g + 10F;
        if (g > j + i)
        {
            g = 0.0F;
        }
        b.postDelayed(k, 1000 / a);
    }

    public void a()
    {
        if (!c)
        {
            clearAnimation();
            c c1 = new c(this, null);
            c1.a = d;
            c1.setDuration((long)(d * 200F + 200F));
            startAnimation(c1);
        }
    }

    public void a(float f1)
    {
        clearAnimation();
        d = f1;
        invalidate();
    }

    public void a(boolean flag)
    {
label0:
        {
            if (c != flag)
            {
                c = flag;
                if (!flag)
                {
                    break label0;
                }
                e();
            }
            return;
        }
        d();
    }

    protected void onDraw(Canvas canvas)
    {
        if (getWidth() != 0 && getHeight() != 0)
        {
            if (c)
            {
                Iterator iterator = h.iterator();
                while (iterator.hasNext()) 
                {
                    RectF rectf1 = (RectF)iterator.next();
                    float f1;
                    float f3;
                    if (rectf1.left < (float)(getLeft() + getPaddingLeft()))
                    {
                        f1 = getLeft() + getPaddingLeft();
                    } else
                    {
                        f1 = rectf1.left;
                    }
                    if (rectf1.right > (float)(getRight() - getPaddingRight()))
                    {
                        f3 = getRight() + getPaddingRight();
                    } else
                    {
                        f3 = rectf1.right;
                    }
                    canvas.drawRect(f1, rectf1.top, f3, rectf1.bottom, e);
                }
            } else
            {
                float f2 = getRight() - getLeft() - getPaddingLeft() - getPaddingRight();
                float f4 = d * f2;
                RectF rectf = f;
                float f5 = getPaddingLeft();
                rectf.left = (f2 - f4) / 2.0F + f5;
                f.right = f4 + f.left;
                canvas.drawRect(f, e);
                return;
            }
        }
    }

    protected void onLayout(boolean flag, int l, int i1, int j1, int k1)
    {
        super.onLayout(flag, l, i1, j1, k1);
        float f1 = getPaddingTop();
        float f2 = k1 - i1 - getPaddingBottom();
        f.bottom = f2;
        f.top = f1;
        for (Iterator iterator = h.iterator(); iterator.hasNext();)
        {
            RectF rectf = (RectF)iterator.next();
            rectf.bottom = f2;
            rectf.top = f1;
        }

        c();
        j = ((float)(j1 - l) / 5F) * 2.0F;
    }
}
