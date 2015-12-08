// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.scroller;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.scroller:
//            i, h, a

public class AnimViewScrollGroup extends FrameLayout
    implements i
{

    int a;
    int b;
    private int c;
    private h d;
    private int e;
    private a f;
    private Point g;
    private boolean h;
    private int i;

    public AnimViewScrollGroup(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 500;
        d = null;
        e = 0;
        f = null;
        b();
    }

    private void a(Canvas canvas, int j, int k)
    {
        int l = getPaddingLeft();
        int i1 = getPaddingTop();
        int j1 = d.k();
        int k1 = d.o();
        int l1 = d.p();
        canvas.save();
        if (d.l() == 0)
        {
            canvas.translate(j1 + k, 0.0F);
        } else
        {
            canvas.translate(0.0F, j1 + k);
        }
        canvas.clipRect(l, i1, l + k1, i1 + l1);
        canvas.translate(l, i1);
        a(canvas, j);
        canvas.translate(-l, -i1);
        canvas.restore();
    }

    private void b()
    {
        h = false;
        g = new Point();
        i = 15;
        d = new h(this);
        d.k(0);
        d.h(c);
        d.f(0);
    }

    public void a()
    {
        int j = getChildCount();
        d.g(j);
    }

    public void a(int j)
    {
        d.a(j, c, null);
    }

    public void a(Canvas canvas, int j)
    {
        if (d.j() != 0.0F)
        {
            d.a(false);
        }
        View view = getChildAt(j);
        if (view != null && !d.d())
        {
            view.draw(canvas);
        }
    }

    public void a(a a1)
    {
        f = a1;
    }

    public void a(boolean flag)
    {
        com.gau.go.launcherex.gowidget.weather.scroller.h.a(this, flag);
    }

    public void computeScroll()
    {
        d.g();
    }

    protected void dispatchDraw(Canvas canvas)
    {
        if (!d.d())
        {
            int k = d.r();
            int l = d.b();
            int i1 = d.c();
            int j1 = d.q();
            int j = k;
            if (k > 0)
            {
                j = k - j1;
            }
            if (j == 0)
            {
                a(canvas, l, j);
                return;
            } else
            {
                a(canvas, l, j);
                a(canvas, i1, j + j1);
                return;
            }
        } else
        {
            super.dispatchDraw(canvas);
            return;
        }
    }

    public h getScreenScroller()
    {
        return d;
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
            h = false;
            g.set((int)motionevent.getX(), (int)motionevent.getY());
            d.a(motionevent, motionevent.getAction());
            return super.onInterceptTouchEvent(motionevent);
        }
        if (motionevent.getAction() == 2)
        {
            if (!h && Math.abs(motionevent.getY() - (float)g.y) > (float)i)
            {
                h = true;
            }
            return h;
        }
        if (motionevent.getAction() == 1)
        {
            d.a(motionevent, motionevent.getAction());
            return h;
        } else
        {
            return super.onInterceptTouchEvent(motionevent);
        }
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        int j1 = getPaddingLeft();
        int k1 = getPaddingTop();
        l = l - j - (getPaddingLeft() + getPaddingRight());
        a = l;
        i1 = i1 - k - (getPaddingTop() + getPaddingBottom());
        b = i1;
        int l1 = getChildCount();
        j = 0;
        k = j1;
        for (; j < l1; j++)
        {
            getChildAt(j).layout(k, k1, k + l, k1 + i1);
            k += l;
        }

    }

    protected void onMeasure(int j, int k)
    {
        super.onMeasure(j, k);
    }

    public void onScreenChanged(int j, int k)
    {
        e = j;
        if (f != null)
        {
            f.a(e, k);
        }
    }

    public void onScrollChanged(int j, int k)
    {
    }

    public void onScrollFinish(int j)
    {
        e = j;
        if (f != null)
        {
            f.b(e);
        }
    }

    public void onScrollStart()
    {
        if (f != null)
        {
            f.a(e);
        }
    }

    protected void onSizeChanged(int j, int k, int l, int i1)
    {
        l = getPaddingLeft();
        i1 = getPaddingRight();
        int j1 = getPaddingTop();
        int k1 = getPaddingBottom();
        d.c(j - (l + i1), k - (j1 + k1));
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return d.a(motionevent, motionevent.getAction());
    }

    public void setScreenScroller(h h1)
    {
        d = h1;
    }
}
