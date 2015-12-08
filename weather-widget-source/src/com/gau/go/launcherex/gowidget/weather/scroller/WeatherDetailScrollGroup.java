// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.scroller;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.scroller:
//            i, c, h, k, 
//            l

public class WeatherDetailScrollGroup extends FrameLayout
    implements i
{

    int a;
    int b;
    private int c;
    private PointF d;
    private boolean e;
    private int f;
    private h g;
    private int h;
    private l i;
    private c j;
    private c k;
    private int l;
    private k m;
    private boolean n;

    public WeatherDetailScrollGroup(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 500;
        g = null;
        h = 0;
        i = null;
        n = false;
        c();
    }

    private void a(int i1, int j1)
    {
        float f3 = 1.0F;
        if (j != null)
        {
            if (!n)
            {
                j.a();
                k.a();
                return;
            }
            int k1 = g.r();
            float f5 = g.q();
            if (b() == 0 && k1 > 0)
            {
                float f4 = ((float)(i1 - j1) / f5) * 1.5F;
                float f1 = f4;
                if (f4 > 1.0F)
                {
                    f1 = 1.0F;
                }
                j.a(f1);
            }
            if (k1 < 0 && b() == getChildCount() - 1)
            {
                float f2 = ((float)(i1 - j1) / f5) * 1.5F;
                if (f2 > 1.0F)
                {
                    f2 = f3;
                }
                k.a(f2);
                return;
            }
        }
    }

    private void a(Canvas canvas)
    {
        if (j == null)
        {
            return;
        }
        int i1 = g.r();
        int j1 = getHeight();
        if (b() == 0 && i1 > 0)
        {
            int k1 = canvas.save();
            canvas.rotate(270F);
            canvas.translate(-j1, getScrollX());
            j.a(j1, getWidth());
            if (j.a(canvas))
            {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            canvas.restoreToCount(k1);
            if (l <= 0)
            {
                j.a((int)g.v());
            }
        }
        if (i1 < 0 && b() == getChildCount() - 1)
        {
            int l1 = canvas.save();
            int i2 = getWidth();
            canvas.rotate(90F);
            canvas.translate(0.0F, -i2 - getScrollX());
            k.a(j1, i2);
            if (k.a(canvas))
            {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            canvas.restoreToCount(l1);
            if (l >= 0)
            {
                k.a((int)g.v());
            }
        }
        l = i1;
    }

    private void a(Canvas canvas, int i1, int j1)
    {
        int k1 = getPaddingLeft();
        int l1 = getPaddingTop();
        int i2 = g.k();
        int j2 = g.o();
        int k2 = g.p();
        canvas.save();
        if (g.l() == 0)
        {
            canvas.translate(i2 + j1, 0.0F);
        } else
        {
            canvas.translate(0.0F, i2 + j1);
        }
        canvas.clipRect(k1, l1, k1 + j2, l1 + k2);
        canvas.translate(k1, l1);
        a(canvas, i1);
        canvas.translate(-k1, -l1);
        canvas.restore();
    }

    private void c()
    {
        e = false;
        d = new PointF();
        new DisplayMetrics();
        f = (int)(getResources().getDisplayMetrics().density * 10F);
        g = new h(this);
        g.k(0);
        g.h(c);
        g.f(0);
        a(k.a);
    }

    private void d()
    {
        if (!e())
        {
            h();
            return;
        }
        if (getChildCount() == 1 || !g.s())
        {
            g();
            return;
        } else
        {
            h();
            return;
        }
    }

    private boolean e()
    {
        return m == k.a || m == k.c;
    }

    private boolean f()
    {
        return m == k.b || m == k.c;
    }

    private void g()
    {
        if (j == null)
        {
            j = new c(getContext());
        }
        if (k == null)
        {
            k = new c(getContext());
        }
    }

    private void h()
    {
        j = null;
        k = null;
    }

    public void a()
    {
        int i1 = getChildCount();
        g.g(i1);
        d();
    }

    public void a(int i1)
    {
        g.a(i1, c, null);
    }

    public void a(Canvas canvas, int i1)
    {
        if (g.j() != 0.0F)
        {
            g.a(false);
        }
        View view = getChildAt(i1);
        if (view != null && !g.d())
        {
            view.draw(canvas);
        }
    }

    public void a(k k1)
    {
        if (m != k1)
        {
            m = k1;
            d();
        }
    }

    public void a(l l1)
    {
        i = l1;
    }

    public void a(boolean flag)
    {
        com.gau.go.launcherex.gowidget.weather.scroller.h.a(this, flag);
        d();
    }

    public int b()
    {
        return h;
    }

    public void computeScroll()
    {
        g.g();
    }

    protected void dispatchDraw(Canvas canvas)
    {
        if (g.d()) goto _L2; else goto _L1
_L1:
        int j1;
        int k1;
        int l1;
        int i2;
label0:
        {
            j1 = g.r();
            k1 = g.b();
            l1 = g.c();
            i2 = g.q();
            int i1 = j1;
            if (j1 > 0)
            {
                i1 = j1 - i2;
            }
            if (-1 != l1)
            {
                j1 = i1;
                if (-1 != k1)
                {
                    break label0;
                }
            }
            j1 = i1;
            if (!f())
            {
                j1 = 0;
            }
        }
        if (j1 == 0)
        {
            a(canvas, k1, j1);
            a(canvas, l1, j1);
        } else
        {
            a(canvas, k1, j1);
            a(canvas, l1, j1 + i2);
        }
_L4:
        if (e())
        {
            a(canvas);
        }
        return;
_L2:
        super.dispatchDraw(canvas);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public h getScreenScroller()
    {
        return g;
    }

    public void onFlingIntercepted()
    {
    }

    public void onFlingStart()
    {
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            n = false;
            e = false;
            d.set(motionevent.getX(), motionevent.getY());
            g.a(motionevent, motionevent.getAction());
            return !g.d();
        }
        if (motionevent.getAction() == 2)
        {
            n = true;
            if (!e && Math.abs(motionevent.getX() - d.x) > (float)f && (double)Math.abs(motionevent.getX() - d.x) > (double)Math.abs(motionevent.getY() - d.y) * Math.sqrt(2D))
            {
                e = true;
                return true;
            }
        } else
        if (motionevent.getAction() == 1)
        {
            n = false;
            g.a(motionevent, motionevent.getAction());
            return e;
        }
        return super.onInterceptTouchEvent(motionevent);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int i2 = getPaddingLeft();
        int j2 = getPaddingTop();
        k1 = k1 - i1 - (getPaddingLeft() + getPaddingRight());
        a = k1;
        l1 = l1 - j1 - (getPaddingTop() + getPaddingBottom());
        b = l1;
        int k2 = getChildCount();
        i1 = 0;
        j1 = i2;
        for (; i1 < k2; i1++)
        {
            getChildAt(i1).layout(j1, j2, j1 + k1, j2 + l1);
            j1 += k1;
        }

    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
    }

    public void onScreenChanged(int i1, int j1)
    {
        h = i1;
        if (i != null)
        {
            i.b(this, h);
        }
    }

    public void onScrollChanged(int i1, int j1)
    {
        a(i1, j1);
    }

    public void onScrollFinish(int i1)
    {
        h = i1;
        if (i != null)
        {
            i.c(this, h);
        }
    }

    public void onScrollStart()
    {
        if (i != null)
        {
            i.a(this, h);
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        k1 = getPaddingLeft();
        l1 = getPaddingRight();
        int i2 = getPaddingTop();
        int j2 = getPaddingBottom();
        g.c(i1 - (k1 + l1), j1 - (i2 + j2));
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if ((motionevent.getAction() & 0xff) == 2)
        {
            n = true;
        } else
        {
            n = false;
        }
        return g.a(motionevent, motionevent.getAction());
    }

    public void setScreenScroller(h h1)
    {
        g = h1;
    }
}
