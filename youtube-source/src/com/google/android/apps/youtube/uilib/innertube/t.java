// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.uilib.innertube;

import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.google.a.a.a.a.da;
import com.google.a.a.a.a.dq;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.datalib.innertube.i;
import com.google.android.apps.youtube.datalib.innertube.model.ag;
import com.google.android.apps.youtube.datalib.innertube.model.aj;
import com.google.android.apps.youtube.datalib.innertube.model.ar;
import com.google.android.apps.youtube.datalib.innertube.model.o;
import com.google.android.apps.youtube.datalib.innertube.model.p;
import com.google.android.apps.youtube.uilib.a.b;
import com.google.android.apps.youtube.uilib.a.h;
import com.google.android.apps.youtube.uilib.a.m;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.uilib.innertube:
//            h, q, j, k, 
//            m, v, r, o, 
//            p, i, b, c, 
//            d

public final class t extends com.google.android.apps.youtube.uilib.innertube.h
    implements android.view.View.OnClickListener, android.widget.AbsListView.OnScrollListener, q
{

    private final com.google.android.apps.youtube.uilib.innertube.i a;
    private final aw b;
    private final ListView c;
    private final com.google.android.apps.youtube.uilib.innertube.p d;
    private final a e;
    private final b f = new b();
    private final j g;
    private android.widget.AbsListView.OnScrollListener h;
    private h i;
    private com.google.android.apps.youtube.uilib.innertube.o j;
    private boolean k;
    private int l;

    public t(com.google.android.apps.youtube.uilib.innertube.i i1, ListView listview, com.google.android.apps.youtube.uilib.innertube.p p1, i j1, a a1, j j2, aw aw1)
    {
        super(j1, a1, com.google.android.apps.youtube.common.c.a.a(), aw1);
        a = i1;
        c = (ListView)com.google.android.apps.youtube.common.fromguava.c.a(listview);
        d = p1;
        e = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        g = (j)com.google.android.apps.youtube.common.fromguava.c.a(j2);
        b = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        l = -1;
    }

    private void c(aj aj1)
    {
        if (aj1 != null)
        {
            if (d != null && f.a() >= 0)
            {
                f.a(f.a());
            }
            a(aj1.b());
            int i1 = f.getViewTypeCount();
            aj1 = aj1.a().iterator();
            do
            {
                if (!aj1.hasNext())
                {
                    break;
                }
                Object obj = aj1.next();
                if (obj instanceof o)
                {
                    h h1 = new h();
                    g.a(h1);
                    k k1 = new k(h(), h1, e, b);
                    k1.a((o)obj);
                    f.a(h1);
                    if (!c())
                    {
                        a(k1);
                    }
                } else
                if (obj instanceof p)
                {
                    h h2 = new h();
                    g.b(h2);
                    (new com.google.android.apps.youtube.uilib.innertube.m(h(), h2, a, e, b)).a((p)obj);
                    f.a(h2);
                } else
                if (obj instanceof ar)
                {
                    h h3 = new h();
                    g.c(h3);
                    (new v(h3)).a((ar)obj);
                    f.a(h3);
                } else
                if (obj instanceof ag)
                {
                    h h4 = new h();
                    g.d(h4);
                    r r1 = new r(h(), h4, e, b);
                    r1.a((ag)obj);
                    f.a(h4);
                    if (!c())
                    {
                        a(r1);
                    }
                } else
                if ((obj instanceof da) && i != null)
                {
                    f.a(i);
                } else
                if (obj instanceof m)
                {
                    h h5 = new h();
                    g.e(h5);
                    h5.a(obj);
                    f.a(h5);
                }
            } while (true);
            if (d != null && (c() || d() || j != null))
            {
                if (j == null)
                {
                    j = new com.google.android.apps.youtube.uilib.innertube.o(b(), this, this);
                }
                f.a(d);
            }
            if (f.getViewTypeCount() != i1)
            {
                int l1 = c.getFirstVisiblePosition();
                aj1 = c.getChildAt(0);
                int j1;
                if (aj1 != null)
                {
                    j1 = aj1.getTop();
                } else
                {
                    j1 = 0;
                }
                c.setAdapter(f);
                c.setSelectionFromTop(l1, j1);
                return;
            }
        }
    }

    public final void a(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        h = onscrolllistener;
    }

    protected final void a(dq dq1, ContinuableController.ContinuationType continuationtype)
    {
        super.a(dq1, continuationtype);
        if (dq1 == null || dq1.b == null)
        {
            return;
        }
        dq1 = new aj(dq1.b);
        if (continuationtype == ContinuableController.ContinuationType.RELOAD)
        {
            a(((aj) (dq1)));
            k = true;
            c.setOnScrollListener(this);
            return;
        } else
        {
            c(dq1);
            return;
        }
    }

    public final void a(aj aj1)
    {
        l = -1;
        k = false;
        f.b();
        c.setOnScrollListener(null);
        a(((ContinuableController) (null)));
        g();
        c(aj1);
        if (f.getCount() > 0)
        {
            c.setSelection(0);
        }
    }

    public final void a(h h1)
    {
        i = h1;
    }

    public final void b(aj aj1)
    {
        a(aj1);
        j();
    }

    public final void handleContentEvent(com.google.android.apps.youtube.uilib.innertube.b b1)
    {
        if (d == null)
        {
            return;
        } else
        {
            j.a(b1);
            d.a(null);
            return;
        }
    }

    public final void handleErrorEvent(com.google.android.apps.youtube.uilib.innertube.c c1)
    {
        if (d == null)
        {
            return;
        } else
        {
            j.a(c1);
            d.a(j);
            return;
        }
    }

    public final void handleLoadingEvent(d d1)
    {
        if (d == null)
        {
            return;
        } else
        {
            j.a(d1);
            d.a(j);
            return;
        }
    }

    public final void j()
    {
        if (!k)
        {
            k = true;
            c.setOnScrollListener(this);
            c.setAdapter(f);
            if (f.getCount() == 0 && d())
            {
                f();
                return;
            }
        }
    }

    public final View k()
    {
        return c;
    }

    public final void k_()
    {
        i();
    }

    public final void onClick(View view)
    {
        e();
    }

    public final void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
        if (i1 + j1 == k1 && l != f.getCount())
        {
            l = f.getCount();
            e();
        }
        if (h != null)
        {
            h.onScroll(abslistview, i1, j1, k1);
        }
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i1)
    {
        if (h != null)
        {
            h.onScrollStateChanged(abslistview, i1);
        }
    }
}
