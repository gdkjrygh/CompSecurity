// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.scroller;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.gau.go.launcherex.gowidget.weather.view.bl;
import com.gau.go.launcherex.gowidget.weather.view.gl.GLWidgetChildView;
import com.go.gl.graphics.GLCanvas;
import com.go.gl.view.GLFrameLayout;
import com.go.gl.view.GLView;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.scroller:
//            i, h, e

public class GLWidgetScrollGroup extends GLFrameLayout
    implements i
{

    private int a;
    private Point b;
    private boolean c;
    private int d;
    private h e;
    private int f;
    private e g;
    int mScreenHeight;
    int mScreenWidth;

    public GLWidgetScrollGroup(Context context)
    {
        super(context);
        a = 500;
        e = null;
        f = 0;
        g = null;
        a();
    }

    public GLWidgetScrollGroup(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 500;
        e = null;
        f = 0;
        g = null;
        a();
    }

    public GLWidgetScrollGroup(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a = 500;
        e = null;
        f = 0;
        g = null;
        a();
    }

    private void a()
    {
        c = false;
        b = new Point();
        d = 15;
        e = new h(this);
        e.k(0);
        e.h(a);
        e.f(1);
    }

    private void a(GLCanvas glcanvas, int j, int k)
    {
        int l = getPaddingLeft();
        int i1 = getPaddingTop();
        int j1 = e.k();
        int k1 = e.o();
        int l1 = e.p();
        glcanvas.save();
        if (e.l() == 0)
        {
            glcanvas.translate(j1 + k, 0.0F);
        } else
        {
            glcanvas.translate(0.0F, j1 + k);
        }
        glcanvas.clipRect(l, i1 - k, k1 + l, (l1 + i1) - k);
        glcanvas.translate(l, i1);
        drawScreen(glcanvas, j);
        glcanvas.translate(-l, -i1);
        glcanvas.restore();
    }

    public void computeScroll()
    {
        e.g();
    }

    protected void dispatchDraw(GLCanvas glcanvas)
    {
        int l = e.r();
        if (!e.d())
        {
            int j1 = e.b();
            int l1 = e.c();
            int j2 = e.q();
            int j = l;
            if (l > 0)
            {
                j = l - j2;
            }
            if (j == 0)
            {
                a(glcanvas, j1, j);
                return;
            } else
            {
                a(glcanvas, j1, j);
                a(glcanvas, l1, j + j2);
                return;
            }
        } else
        {
            int k = getPaddingLeft();
            int i1 = getPaddingTop();
            int k1 = e.k();
            int i2 = e.o();
            int k2 = e.p();
            int l2 = glcanvas.save();
            glcanvas.clipRect(k, k1 + i1, k + i2, i1 + k1 + k2);
            super.dispatchDraw(glcanvas);
            glcanvas.restoreToCount(l2);
            return;
        }
    }

    public void drawScreen(GLCanvas glcanvas, int j)
    {
        if (e.j() != 0.0F)
        {
            e.a(false);
        }
        GLView glview = getChildAt(j);
        if (glview != null && !e.d())
        {
            glview.draw(glcanvas);
        }
    }

    public int getCityCount()
    {
        return getCitys().size();
    }

    public ArrayList getCitys()
    {
        ArrayList arraylist = new ArrayList();
        for (int j = 0; j < getChildCount(); j++)
        {
            GLWidgetChildView glwidgetchildview = (GLWidgetChildView)getChildAt(j);
            if (glwidgetchildview != null && glwidgetchildview.getChildViewType() == bl.a)
            {
                arraylist.add(glwidgetchildview);
            }
        }

        return arraylist;
    }

    public int getCurScreen()
    {
        return f;
    }

    public h getScreenScroller()
    {
        return e;
    }

    public GLWidgetChildView getThemeEnterance()
    {
        for (int j = 0; j < getChildCount(); j++)
        {
            GLWidgetChildView glwidgetchildview = (GLWidgetChildView)getChildAt(j);
            if (glwidgetchildview != null && glwidgetchildview.getChildViewType() == bl.b)
            {
                return glwidgetchildview;
            }
        }

        return null;
    }

    public void notifyViewsChanged()
    {
        int j = getChildCount();
        e.g(j);
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
            c = false;
            b.set((int)motionevent.getX(), (int)motionevent.getY());
            e.a(motionevent, motionevent.getAction());
            return super.onInterceptTouchEvent(motionevent);
        }
        if (motionevent.getAction() == 2)
        {
            if (!c && Math.abs(motionevent.getY() - (float)b.y) > (float)d)
            {
                c = true;
            }
            return c;
        }
        if (motionevent.getAction() == 1)
        {
            e.a(motionevent, motionevent.getAction());
            return c;
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
        mScreenWidth = l;
        i1 = i1 - k - (getPaddingTop() + getPaddingBottom());
        mScreenHeight = i1;
        int l1 = getChildCount();
        j = 0;
        k = j1;
        for (; j < l1; j++)
        {
            getChildAt(j).layout(k1, k, k1 + l, k + i1);
            k += i1;
        }

        e.c(l, i1);
    }

    protected void onMeasure(int j, int k)
    {
        super.onMeasure(j, k);
    }

    public void onScreenChanged(int j, int k)
    {
        f = j;
        if (g != null)
        {
            g.onScrollGroupChange(this, f);
        }
    }

    public void onScrollChanged(int j, int k)
    {
    }

    public void onScrollFinish(int j)
    {
        f = j;
        if (g != null)
        {
            g.onScrollGroupFinishScroll(this, f);
        }
    }

    public void onScrollStart()
    {
        if (g != null)
        {
            g.onScrollGroupStartScroll(this, f);
        }
    }

    protected void onSizeChanged(int j, int k, int l, int i1)
    {
        l = getPaddingLeft();
        i1 = getPaddingRight();
        int j1 = getPaddingTop();
        int k1 = getPaddingBottom();
        e.c(j - (l + i1), k - (j1 + k1));
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return e.a(motionevent, motionevent.getAction());
    }

    public void setCurScreen(int j)
    {
        e.a(j, a, null);
    }

    public void setCycleMode(boolean flag)
    {
        h.a(this, flag);
    }

    public void setEventListener(e e1)
    {
        g = e1;
    }

    public void setScreenScroller(h h1)
    {
        e = h1;
    }
}
