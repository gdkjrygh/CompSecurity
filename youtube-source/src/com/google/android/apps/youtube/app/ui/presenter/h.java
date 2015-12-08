// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.gr;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.datalib.innertube.model.ap;
import com.google.android.apps.youtube.datalib.innertube.model.av;
import com.google.android.apps.youtube.datalib.innertube.model.aw;
import com.google.android.apps.youtube.datalib.innertube.model.ax;
import com.google.android.apps.youtube.datalib.innertube.model.ay;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.i;
import com.google.android.youtube.j;
import com.google.android.youtube.k;
import com.google.android.youtube.l;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            m, k, l, i, 
//            j

public final class h
    implements g
{

    private final Context a;
    private final bj b;
    private final i c;
    private final a d;
    private final Resources e;
    private final LinearLayout f;
    private final LinearLayout g;
    private FrameLayout h;
    private ImageView i;
    private TextView j;
    private LinearLayout k;
    private final LayoutInflater l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private com.google.android.apps.youtube.datalib.innertube.model.a q;

    public h(Context context, bj bj1, i i1, a a1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        c = (i)com.google.android.apps.youtube.common.fromguava.c.a(i1);
        d = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        e = context.getResources();
        l = LayoutInflater.from(context);
        context = l.inflate(l.i, null);
        f = (LinearLayout)context.findViewById(j.X);
        g = (LinearLayout)context.findViewById(j.V);
        m = false;
        n = false;
        o = false;
        i1.a(context);
    }

    private void a()
    {
        List list = q.k();
        if (list != null && list.size() > 0)
        {
            if (!o)
            {
                l.inflate(l.bG, g, true);
                ((TextView)g.getChildAt(g.getChildCount() - 1)).setText(q.j());
                l.inflate(l.bE, g, true);
            }
            int j1;
            int l1;
            if (k == null)
            {
                k = new LinearLayout(a);
                k.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
                k.setOrientation(0);
                int i1 = com.google.android.apps.youtube.core.utils.l.a(e.getDisplayMetrics(), 7);
                k.setPadding(i1, i1, i1, i1);
                g.addView(k);
            } else
            {
                k.removeAllViews();
            }
            j1 = e.getInteger(k.a);
            l1 = Math.min(j1, list.size());
            k.setWeightSum(j1);
            for (int k1 = 0; k1 < l1; k1++)
            {
                ax ax1 = (ax)list.get(k1);
                View view = l.inflate(l.bF, null);
                ((TextView)view.findViewById(j.fF)).setText(ax1.a());
                a(view, j.fy, ax1.b());
                view.setOnClickListener(new m(this, ax1.c()));
                k.addView(view);
                view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F));
            }

        }
    }

    private void a(View view, int i1, ap ap1)
    {
        ImageView imageview = (ImageView)view.findViewById(i1);
        if (ap1.a())
        {
            imageview.setVisibility(0);
            gr gr1 = (gr)imageview.getTag();
            view = gr1;
            if (gr1 == null)
            {
                view = new gr(b, imageview);
                imageview.setTag(view);
            }
            view.a(ap1);
            return;
        } else
        {
            imageview.setVisibility(8);
            return;
        }
    }

    static boolean a(h h1)
    {
        return h1.m;
    }

    static boolean a(h h1, boolean flag)
    {
        h1.m = flag;
        return flag;
    }

    private void b()
    {
        if (m)
        {
            if (!o)
            {
                q.e();
                List list = q.g();
                if (list != null && list.size() > 0)
                {
                    l.inflate(l.bG, g, true);
                    ((TextView)g.getChildAt(g.getChildCount() - 1)).setText(q.f());
                    l.inflate(l.bE, g, true);
                    for (int i1 = 0; i1 < Math.min(5, list.size()); i1++)
                    {
                        if (i1 != 0)
                        {
                            l.inflate(l.bE, g, true);
                        }
                        LinearLayout linearlayout = g;
                        Object obj = (ay)list.get(i1);
                        View view2 = l.inflate(l.bH, null);
                        ((TextView)view2.findViewById(j.fF)).setText(((ay) (obj)).a());
                        ((TextView)view2.findViewById(j.aP)).setText(((ay) (obj)).b());
                        a(view2, j.fy, ((ay) (obj)).c());
                        obj = ((ay) (obj)).d();
                        view2.findViewById(j.ga).setOnClickListener(new com.google.android.apps.youtube.app.ui.presenter.k(this, ((com.google.a.a.a.a.kz) (obj))));
                        linearlayout.addView(view2);
                    }

                }
                list = q.i();
                if (list != null && list.size() > 0)
                {
                    l.inflate(l.bG, g, true);
                    ((TextView)g.getChildAt(g.getChildCount() - 1)).setText(q.h());
                    l.inflate(l.bE, g, true);
                    for (int j1 = 0; j1 < Math.min(5, list.size()); j1++)
                    {
                        if (j1 != 0)
                        {
                            l.inflate(l.bE, g, true);
                        }
                        LinearLayout linearlayout1 = g;
                        Object obj1 = (av)list.get(j1);
                        View view3 = l.inflate(l.bC, null);
                        ((TextView)view3.findViewById(j.fF)).setText(((av) (obj1)).a());
                        ((TextView)view3.findViewById(j.gz)).setText(((av) (obj1)).b());
                        a(view3, j.fy, ((av) (obj1)).c());
                        obj1 = ((av) (obj1)).d();
                        view3.findViewById(j.p).setOnClickListener(new com.google.android.apps.youtube.app.ui.presenter.l(this, ((com.google.a.a.a.a.kz) (obj1))));
                        linearlayout1.addView(view3);
                    }

                }
                a();
                o = true;
            }
            if (e.getConfiguration().orientation == 1)
            {
                j.setVisibility(4);
                View view = h.findViewById(j.Z);
                int k1 = view.getPaddingTop();
                view.setPadding(k1, k1, k1, 0);
            } else
            {
                f.findViewById(j.be).setVisibility(0);
            }
            i.setImageResource(com.google.android.youtube.h.x);
            g.setVisibility(0);
            return;
        }
        if (e.getConfiguration().orientation == 1)
        {
            j.setVisibility(0);
            View view1 = h.findViewById(j.Z);
            int l1 = view1.getPaddingTop();
            view1.setPadding(l1, l1, l1, l1);
        } else
        {
            f.findViewById(j.be).setVisibility(8);
        }
        i.setImageResource(com.google.android.youtube.h.E);
        g.setVisibility(8);
    }

    static void b(h h1)
    {
        h1.b();
    }

    static a c(h h1)
    {
        return h1.d;
    }

    public final View a(f f1, Object obj)
    {
        obj = (com.google.android.apps.youtube.datalib.innertube.model.a)obj;
        if (n && e.getConfiguration().orientation == p)
        {
            return c.a(f1);
        }
        if (!n)
        {
            q = ((com.google.android.apps.youtube.datalib.innertube.model.a) (obj));
            aw aw1;
            boolean flag;
            if (!q.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            m = flag;
        }
        if (f.findViewById(j.W) != null)
        {
            f.removeViewAt(0);
        }
        obj = (LinearLayout)l.inflate(l.bD, null);
        f.addView(((View) (obj)), 0);
        ((TextView)f.findViewById(j.ab)).setText(q.a());
        j = (TextView)f.findViewById(j.U);
        j.setText(q.c());
        i = (ImageView)f.findViewById(j.aa);
        h = (FrameLayout)f.findViewById(j.Y);
        h.setOnClickListener(new com.google.android.apps.youtube.app.ui.presenter.i(this));
        obj = (FrameLayout)f.findViewById(j.Q);
        aw1 = q.d();
        a(((View) (obj)), j.cc, aw1.a());
        a(((View) (obj)), j.fJ, aw1.b());
        a(((View) (obj)), j.H, aw1.c());
        ((TextView)((FrameLayout) (obj)).findViewById(j.K)).setText(aw1.d());
        ((FrameLayout) (obj)).setOnClickListener(new com.google.android.apps.youtube.app.ui.presenter.j(this, aw1));
        if (n && o)
        {
            a();
        }
        b();
        n = true;
        p = e.getConfiguration().orientation;
        return c.a(f1);
    }
}
