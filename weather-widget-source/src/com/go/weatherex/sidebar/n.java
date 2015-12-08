// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar;

import android.support.v4.widget.ViewDragHelper;
import android.view.View;

// Referenced classes of package com.go.weatherex.sidebar:
//            o, SidebarDrawerLayout

class n extends android.support.v4.widget.ViewDragHelper.Callback
{

    final SidebarDrawerLayout a;
    private final int b;
    private ViewDragHelper c;
    private final Runnable d = new o(this);

    public n(SidebarDrawerLayout sidebardrawerlayout, int i)
    {
        a = sidebardrawerlayout;
        super();
        b = i;
    }

    static void a(n n1)
    {
        n1.c();
    }

    private void b()
    {
        byte byte0 = 3;
        if (b == 3)
        {
            byte0 = 5;
        }
        View view = a.d(byte0);
        if (view != null)
        {
            a.i(view);
        }
    }

    private void c()
    {
        int i = 0;
        int j = c.getEdgeSize();
        View view;
        boolean flag;
        if (b == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view = a.d(3);
            if (view != null)
            {
                i = -view.getWidth();
            }
            i += j;
        } else
        {
            view = a.d(5);
            i = a.getWidth();
            i -= j;
        }
        if (view != null && (flag && view.getLeft() < i || !flag && view.getLeft() > i) && a.a(view) == 0)
        {
            SidebarDrawerLayout.LayoutParams layoutparams = (SidebarDrawerLayout.LayoutParams)view.getLayoutParams();
            c.smoothSlideViewTo(view, i, view.getTop());
            layoutparams.c = true;
            a.invalidate();
            b();
            a.c();
        }
    }

    public void a()
    {
        a.removeCallbacks(d);
    }

    public void a(ViewDragHelper viewdraghelper)
    {
        c = viewdraghelper;
    }

    public int clampViewPositionHorizontal(View view, int i, int j)
    {
        if (a.a(view, 3))
        {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        } else
        {
            j = a.getWidth();
            return Math.max(j - view.getWidth(), Math.min(i, j));
        }
    }

    public int clampViewPositionVertical(View view, int i, int j)
    {
        return view.getTop();
    }

    public int getViewHorizontalDragRange(View view)
    {
        return view.getWidth();
    }

    public void onEdgeDragStarted(int i, int j)
    {
        View view;
        if ((i & 1) == 1)
        {
            view = a.d(3);
        } else
        {
            view = a.d(5);
        }
        if (view != null && a.a(view) == 0)
        {
            c.captureChildView(view, j);
        }
    }

    public boolean onEdgeLock(int i)
    {
        return false;
    }

    public void onEdgeTouched(int i, int j)
    {
        a.postDelayed(d, 160L);
    }

    public void onViewCaptured(View view, int i)
    {
        ((SidebarDrawerLayout.LayoutParams)view.getLayoutParams()).c = false;
        b();
    }

    public void onViewDragStateChanged(int i)
    {
        a.a(b, i, c.getCapturedView());
    }

    public void onViewPositionChanged(View view, int i, int j, int k, int l)
    {
        j = view.getWidth();
        float f;
        if (a.a(view, 3))
        {
            f = (float)(j + i) / (float)j;
        } else
        {
            f = (float)(a.getWidth() - i) / (float)j;
        }
        a.b(view, f);
        if (f == 0.0F)
        {
            i = 4;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
        a.invalidate();
    }

    public void onViewReleased(View view, float f, float f1)
    {
        int k;
        f1 = a.d(view);
        k = view.getWidth();
        if (!a.a(view, 3)) goto _L2; else goto _L1
_L1:
        int i;
        if (f > 0.0F || f == 0.0F && f1 > 0.5F)
        {
            i = 0;
        } else
        {
            i = -k;
        }
_L4:
        c.settleCapturedViewAt(i, view.getTop());
        a.invalidate();
        return;
_L2:
        int j = a.getWidth();
        if (f >= 0.0F)
        {
            i = j;
            if (f != 0.0F)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = j;
            if (f1 <= 0.5F)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        i = j - k;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean tryCaptureView(View view, int i)
    {
        return a.g(view) && a.a(view, b) && a.a(view) == 0;
    }
}
