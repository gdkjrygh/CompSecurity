// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.pla.internal;

import android.widget.Scroller;

// Referenced classes of package com.jiubang.pla.internal:
//            PLA_AbsListView

class d
    implements Runnable
{

    final PLA_AbsListView a;
    private final Scroller b;
    private int c;

    d(PLA_AbsListView pla_abslistview)
    {
        a = pla_abslistview;
        super();
        b = new Scroller(pla_abslistview.getContext());
    }

    private void a()
    {
        c = 0;
        a.t = -1;
        a.a(0);
        PLA_AbsListView.c(a);
        a.removeCallbacks(this);
        if (PLA_AbsListView.d(a) != null)
        {
            a.removeCallbacks(PLA_AbsListView.d(a));
        }
        b.forceFinished(true);
    }

    static void a(d d1)
    {
        d1.a();
    }

    void a(int i)
    {
        int j = a.h(i);
        if (j < 0)
        {
            i = 0x7fffffff;
        } else
        {
            i = 0;
        }
        c = i;
        b.fling(0, i, 0, j, 0, 0x7fffffff, 0, 0x7fffffff);
        a.t = 4;
        a.post(this);
    }

    void a(int i, int j)
    {
        int k;
        if (i < 0)
        {
            k = 0x7fffffff;
        } else
        {
            k = 0;
        }
        c = k;
        b.startScroll(0, k, 0, i, j);
        a.t = 4;
        a.post(this);
    }

    public void run()
    {
        switch (a.t)
        {
        default:
            return;

        case 4: // '\004'
            break;
        }
        if (a.M == 0 || a.getChildCount() == 0)
        {
            a();
            return;
        }
        Scroller scroller = b;
        boolean flag = scroller.computeScrollOffset();
        int j = scroller.getCurrY();
        int i = c - j;
        boolean flag1;
        if (i > 0)
        {
            a.o = a.B;
            a.p = a.o();
            i = Math.min(a.getHeight() - a.getPaddingBottom() - a.getPaddingTop() - 1, i);
        } else
        {
            int k = a.getChildCount();
            a.o = (k - 1) + a.B;
            a.p = a.r();
            i = Math.max(-(a.getHeight() - a.getPaddingBottom() - a.getPaddingTop() - 1), i);
        }
        flag1 = a.c(i, i);
        if (flag && !flag1)
        {
            a.invalidate();
            c = j;
            a.post(this);
            return;
        } else
        {
            a();
            return;
        }
    }
}
