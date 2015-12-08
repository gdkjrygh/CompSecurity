// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.os.Handler;
import android.support.v7.a.b;
import android.support.v7.a.c;
import android.support.v7.a.f;
import android.support.v7.internal.view.a;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.ActionBarView;
import android.support.v7.internal.widget.ScrollingTabContainerView;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.app:
//            ActionBar, ActionBarActivity, a

class k extends ActionBar
{

    final Handler a = new Handler();
    private Context b;
    private Context c;
    private ActionBarActivity d;
    private ActionBarOverlayLayout e;
    private ActionBarContainer f;
    private ViewGroup g;
    private ActionBarView h;
    private ActionBarContextView i;
    private ActionBarContainer j;
    private ScrollingTabContainerView k;
    private ArrayList l;
    private int m;
    private boolean n;
    private ArrayList o;
    private int p;
    private boolean q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private android.support.v7.app.a x;

    public k(ActionBarActivity actionbaractivity, android.support.v7.app.a a1)
    {
        boolean flag = false;
        super();
        l = new ArrayList();
        m = -1;
        o = new ArrayList();
        r = 0;
        v = true;
        d = actionbaractivity;
        b = actionbaractivity;
        x = a1;
        actionbaractivity = d;
        e = (ActionBarOverlayLayout)actionbaractivity.findViewById(f.d);
        if (e != null)
        {
            e.setActionBar(this);
        }
        h = (ActionBarView)actionbaractivity.findViewById(f.a);
        i = (ActionBarContextView)actionbaractivity.findViewById(f.h);
        f = (ActionBarContainer)actionbaractivity.findViewById(f.c);
        g = (ViewGroup)actionbaractivity.findViewById(f.F);
        if (g == null)
        {
            g = f;
        }
        j = (ActionBarContainer)actionbaractivity.findViewById(f.C);
        if (h == null || i == null || f == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used with a compatible window decor layout").toString());
        }
        h.setContextView(i);
        int i1;
        if (h.i())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        p = i1;
        if ((h.m() & 4) != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            n = true;
        }
        actionbaractivity = android.support.v7.internal.view.a.a(b);
        if (actionbaractivity.e() || i1 != 0)
        {
            flag = true;
        }
        b(flag);
        d(actionbaractivity.c());
        actionbaractivity = d.getTitle();
        h.setTitle(actionbaractivity);
    }

    private void d(boolean flag)
    {
        boolean flag2 = true;
        q = flag;
        ActionBarView actionbarview;
        boolean flag1;
        if (!q)
        {
            h.setEmbeddedTabView(null);
            f.setTabContainer(k);
        } else
        {
            f.setTabContainer(null);
            h.setEmbeddedTabView(k);
        }
        if (h.l() == 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (k != null)
        {
            if (flag1)
            {
                k.setVisibility(0);
            } else
            {
                k.setVisibility(8);
            }
        }
        actionbarview = h;
        if (!q && flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        actionbarview.setCollapsable(flag);
    }

    private void e(boolean flag)
    {
        boolean flag3 = true;
        boolean flag4 = false;
        flag = s;
        boolean flag5 = t;
        boolean flag1;
        if (!u && (flag || flag5))
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (flag1)
        {
            if (!v)
            {
                v = true;
                g.clearAnimation();
                if (g.getVisibility() != 0)
                {
                    flag1 = flag3;
                    if (!f())
                    {
                        flag1 = false;
                    }
                    if (flag1)
                    {
                        android.view.animation.Animation animation = AnimationUtils.loadAnimation(b, b.b);
                        g.startAnimation(animation);
                    }
                    g.setVisibility(0);
                    if (j != null && j.getVisibility() != 0)
                    {
                        if (flag1)
                        {
                            android.view.animation.Animation animation1 = AnimationUtils.loadAnimation(b, b.a);
                            j.startAnimation(animation1);
                        }
                        j.setVisibility(0);
                    }
                }
            }
        } else
        if (v)
        {
            v = false;
            g.clearAnimation();
            if (g.getVisibility() != 8)
            {
                boolean flag2;
                if (!f())
                {
                    flag2 = flag4;
                } else
                {
                    flag2 = true;
                }
                if (flag2)
                {
                    android.view.animation.Animation animation2 = AnimationUtils.loadAnimation(b, b.d);
                    g.startAnimation(animation2);
                }
                g.setVisibility(8);
                if (j != null && j.getVisibility() != 8)
                {
                    if (flag2)
                    {
                        android.view.animation.Animation animation3 = AnimationUtils.loadAnimation(b, b.c);
                        j.startAnimation(animation3);
                    }
                    j.setVisibility(8);
                    return;
                }
            }
        }
    }

    public final int a()
    {
        return h.m();
    }

    public final void a(boolean flag)
    {
        byte byte0;
        int i1;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        i1 = h.m();
        n = true;
        h.setDisplayOptions(byte0 & 4 | i1 & -5);
    }

    public final Context b()
    {
        if (c == null)
        {
            TypedValue typedvalue = new TypedValue();
            b.getTheme().resolveAttribute(c.d, typedvalue, true);
            int i1 = typedvalue.resourceId;
            if (i1 != 0)
            {
                c = new ContextThemeWrapper(b, i1);
            } else
            {
                c = b;
            }
        }
        return c;
    }

    public final void b(boolean flag)
    {
        h.setHomeButtonEnabled(flag);
    }

    public final void c()
    {
        d(android.support.v7.internal.view.a.a(b).c());
    }

    public final void c(boolean flag)
    {
        w = flag;
        if (!flag)
        {
            g.clearAnimation();
            if (j != null)
            {
                j.clearAnimation();
            }
        }
    }

    final void d()
    {
        if (!u)
        {
            u = true;
            e(false);
        }
    }

    final void e()
    {
        if (u)
        {
            u = false;
            e(false);
        }
    }

    boolean f()
    {
        return w;
    }
}
