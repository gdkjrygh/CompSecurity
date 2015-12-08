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
import com.gau.go.launcherex.gowidget.weather.view.bk;
import com.gau.go.launcherex.gowidget.weather.view.bl;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.scroller:
//            i, h, m

public class WidgetScrollGroup extends FrameLayout
    implements i
{

    int a;
    int b;
    private int c;
    private Point d;
    private boolean e;
    private int f;
    private h g;
    private int h;
    private m i;

    public WidgetScrollGroup(Context context)
    {
        super(context);
        c = 500;
        g = null;
        h = 0;
        i = null;
        c();
    }

    public WidgetScrollGroup(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 500;
        g = null;
        h = 0;
        i = null;
        c();
    }

    public WidgetScrollGroup(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        c = 500;
        g = null;
        h = 0;
        i = null;
        c();
    }

    private void a(Canvas canvas, int j, int k)
    {
        int l = getPaddingLeft();
        int i1 = getPaddingTop();
        int j1 = g.k();
        int k1 = g.o();
        int l1 = g.p();
        canvas.save();
        if (g.l() == 0)
        {
            canvas.translate(j1 + k, 0.0F);
        } else
        {
            canvas.translate(0.0F, j1 + k);
        }
        canvas.clipRect(l, i1 - k, k1 + l, (l1 + i1) - k);
        canvas.translate(l, i1);
        a(canvas, j);
        canvas.translate(-l, -i1);
        canvas.restore();
    }

    private void c()
    {
        e = false;
        d = new Point();
        f = 15;
        g = new h(this);
        g.k(0);
        g.h(c);
        g.f(1);
    }

    public void a()
    {
        int j = getChildCount();
        g.g(j);
    }

    public void a(int j)
    {
        g.a(j, c, null);
    }

    public void a(Canvas canvas, int j)
    {
        if (g.j() != 0.0F)
        {
            g.a(false);
        }
        View view = getChildAt(j);
        if (view != null && !g.d())
        {
            view.draw(canvas);
        }
    }

    public void a(m m1)
    {
        i = m1;
    }

    public void a(boolean flag)
    {
        com.gau.go.launcherex.gowidget.weather.scroller.h.a(this, flag);
    }

    public ArrayList b()
    {
        ArrayList arraylist = new ArrayList();
        for (int j = 0; j < getChildCount(); j++)
        {
            bk bk1 = (bk)getChildAt(j);
            if (bk1 != null && bk1.k() == bl.a)
            {
                arraylist.add(bk1);
            }
        }

        return arraylist;
    }

    public void computeScroll()
    {
        g.g();
    }

    protected void dispatchDraw(Canvas canvas)
    {
        int l = g.r();
        if (!g.d())
        {
            int j1 = g.b();
            int l1 = g.c();
            int j2 = g.q();
            int j = l;
            if (l > 0)
            {
                j = l - j2;
            }
            if (j == 0)
            {
                a(canvas, j1, j);
                return;
            } else
            {
                a(canvas, j1, j);
                a(canvas, l1, j + j2);
                return;
            }
        } else
        {
            int k = getPaddingLeft();
            int i1 = getPaddingTop();
            int k1 = g.k();
            int i2 = g.o();
            int k2 = g.p();
            int l2 = canvas.save();
            canvas.clipRect(k, k1 + i1, i2 + k, i1 + k1 + k2);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(l2);
            return;
        }
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
            e = false;
            d.set((int)motionevent.getX(), (int)motionevent.getY());
            g.a(motionevent, motionevent.getAction());
            return super.onInterceptTouchEvent(motionevent);
        }
        if (motionevent.getAction() == 2)
        {
            if (!e && Math.abs(motionevent.getY() - (float)d.y) > (float)f)
            {
                e = true;
            }
            return e;
        }
        if (motionevent.getAction() == 1)
        {
            g.a(motionevent, motionevent.getAction());
            return e;
        } else
        {
            return super.onInterceptTouchEvent(motionevent);
        }
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        int k1 = getPaddingLeft();
        int j1 = getPaddingTop();
        l = l - j - (getPaddingLeft() + getPaddingRight());
        a = l;
        i1 = i1 - k - (getPaddingTop() + getPaddingBottom());
        b = i1;
        int l1 = getChildCount();
        j = 0;
        k = j1;
        for (; j < l1; j++)
        {
            getChildAt(j).layout(k1, k, k1 + l, k + i1);
            k += i1;
        }

        g.c(l, i1);
    }

    protected void onMeasure(int j, int k)
    {
        super.onMeasure(j, k);
    }

    public void onScreenChanged(int j, int k)
    {
        h = j;
        if (i != null)
        {
            i.onScrollGroupChange(this, h);
        }
    }

    public void onScrollChanged(int j, int k)
    {
    }

    public void onScrollFinish(int j)
    {
        h = j;
        if (i != null)
        {
            i.onScrollGroupFinishScroll(this, h);
        }
    }

    public void onScrollStart()
    {
        if (i != null)
        {
            i.onScrollGroupStartScroll(this, h);
        }
    }

    protected void onSizeChanged(int j, int k, int l, int i1)
    {
        l = getPaddingLeft();
        i1 = getPaddingRight();
        int j1 = getPaddingTop();
        int k1 = getPaddingBottom();
        g.c(j - (l + i1), k - (j1 + k1));
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return g.a(motionevent, motionevent.getAction());
    }

    public void setScreenScroller(h h1)
    {
        g = h1;
    }
}
