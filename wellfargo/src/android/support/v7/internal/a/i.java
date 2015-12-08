// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorUpdateListener;
import android.support.v7.a.b;
import android.support.v7.a.g;
import android.support.v7.app.a;
import android.support.v7.app.c;
import android.support.v7.internal.view.h;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.ag;
import android.support.v7.internal.widget.an;
import android.support.v7.internal.widget.l;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.a:
//            j, k, l, m

public class i extends a
    implements l
{

    static final boolean h;
    private static final boolean i;
    private boolean A;
    private int B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private h H;
    private boolean I;
    m a;
    android.support.v7.c.a b;
    android.support.v7.c.b c;
    boolean d;
    final ViewPropertyAnimatorListener e;
    final ViewPropertyAnimatorListener f;
    final ViewPropertyAnimatorUpdateListener g;
    private Context j;
    private Context k;
    private Activity l;
    private Dialog m;
    private ActionBarOverlayLayout n;
    private ActionBarContainer o;
    private ag p;
    private ActionBarContextView q;
    private ActionBarContainer r;
    private View s;
    private an t;
    private ArrayList u;
    private int v;
    private boolean w;
    private boolean x;
    private ArrayList y;
    private int z;

    public i(Activity activity, boolean flag)
    {
        u = new ArrayList();
        v = -1;
        y = new ArrayList();
        B = 0;
        C = true;
        G = true;
        e = new j(this);
        f = new k(this);
        g = new android.support.v7.internal.a.l(this);
        l = activity;
        activity = activity.getWindow().getDecorView();
        b(activity);
        if (!flag)
        {
            s = activity.findViewById(0x1020002);
        }
    }

    public i(Dialog dialog)
    {
        u = new ArrayList();
        v = -1;
        y = new ArrayList();
        B = 0;
        C = true;
        G = true;
        e = new j(this);
        f = new k(this);
        g = new android.support.v7.internal.a.l(this);
        m = dialog;
        b(dialog.getWindow().getDecorView());
    }

    static h a(i i1, h h1)
    {
        i1.H = h1;
        return h1;
    }

    static boolean a(i i1)
    {
        return i1.C;
    }

    static boolean a(boolean flag, boolean flag1, boolean flag2)
    {
        return b(flag, flag1, flag2);
    }

    static View b(i i1)
    {
        return i1.s;
    }

    private void b(View view)
    {
        n = (ActionBarOverlayLayout)view.findViewById(g.decor_content_parent);
        if (n != null)
        {
            n.setActionBarVisibilityCallback(this);
        }
        p = c(view.findViewById(g.action_bar));
        q = (ActionBarContextView)view.findViewById(g.action_context_bar);
        o = (ActionBarContainer)view.findViewById(g.action_bar_container);
        r = (ActionBarContainer)view.findViewById(g.split_action_bar);
        if (p == null || q == null || o == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used ").append("with a compatible window decor layout").toString());
        }
        j = p.b();
        int i1;
        boolean flag;
        if (p.c())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        z = i1;
        if ((p.p() & 4) != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            w = true;
        }
        view = android.support.v7.internal.view.a.a(j);
        if (view.f() || i1 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f(flag);
        o(view.d());
        view = j.obtainStyledAttributes(null, android.support.v7.a.l.ActionBar, b.actionBarStyle, 0);
        if (view.getBoolean(android.support.v7.a.l.ActionBar_hideOnContentScroll, false))
        {
            g(true);
        }
        i1 = view.getDimensionPixelSize(android.support.v7.a.l.ActionBar_elevation, 0);
        if (i1 != 0)
        {
            a(i1);
        }
        view.recycle();
    }

    private static boolean b(boolean flag, boolean flag1, boolean flag2)
    {
        while (flag2 || !flag && !flag1) 
        {
            return true;
        }
        return false;
    }

    static ActionBarContainer c(i i1)
    {
        return i1.o;
    }

    private ag c(View view)
    {
        if (view instanceof ag)
        {
            return (ag)view;
        }
        if (view instanceof Toolbar)
        {
            return ((Toolbar)view).getWrapper();
        }
        if ((new StringBuilder()).append("Can't make a decor toolbar out of ").append(view).toString() != null)
        {
            view = view.getClass().getSimpleName();
        } else
        {
            view = "null";
        }
        throw new IllegalStateException(view);
    }

    static ActionBarContainer d(i i1)
    {
        return i1.r;
    }

    static int e(i i1)
    {
        return i1.z;
    }

    static ActionBarOverlayLayout f(i i1)
    {
        return i1.n;
    }

    static boolean g(i i1)
    {
        return i1.D;
    }

    static boolean h(i i1)
    {
        return i1.E;
    }

    static ActionBarContextView i(i i1)
    {
        return i1.q;
    }

    static ag j(i i1)
    {
        return i1.p;
    }

    static Context k(i i1)
    {
        return i1.j;
    }

    private void l()
    {
        if (!F)
        {
            F = true;
            if (n != null)
            {
                n.setShowingForActionMode(true);
            }
            p(false);
        }
    }

    private void m()
    {
        if (F)
        {
            F = false;
            if (n != null)
            {
                n.setShowingForActionMode(false);
            }
            p(false);
        }
    }

    private void o(boolean flag)
    {
        boolean flag2 = true;
        A = flag;
        Object obj;
        boolean flag1;
        if (!A)
        {
            p.a(null);
            o.setTabContainer(t);
        } else
        {
            o.setTabContainer(null);
            p.a(t);
        }
        if (g() == 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (t != null)
        {
            if (flag1)
            {
                t.setVisibility(0);
                if (n != null)
                {
                    ViewCompat.requestApplyInsets(n);
                }
            } else
            {
                t.setVisibility(8);
            }
        }
        obj = p;
        if (!A && flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((ag) (obj)).a(flag);
        obj = n;
        if (!A && flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        ((ActionBarOverlayLayout) (obj)).setHasNonEmbeddedTabs(flag);
    }

    private void p(boolean flag)
    {
        if (b(D, E, F))
        {
            if (!G)
            {
                G = true;
                l(flag);
            }
        } else
        if (G)
        {
            G = false;
            m(flag);
            return;
        }
    }

    public int a()
    {
        return p.p();
    }

    public android.support.v7.c.a a(android.support.v7.c.b b1)
    {
        if (a != null)
        {
            a.c();
        }
        n.setHideOnContentScrollEnabled(false);
        q.c();
        b1 = new m(this, q.getContext(), b1);
        if (b1.e())
        {
            b1.d();
            q.a(b1);
            n(true);
            if (r != null && z == 1 && r.getVisibility() != 0)
            {
                r.setVisibility(0);
                if (n != null)
                {
                    ViewCompat.requestApplyInsets(n);
                }
            }
            q.sendAccessibilityEvent(32);
            a = b1;
            return b1;
        } else
        {
            return null;
        }
    }

    public void a(float f1)
    {
        ViewCompat.setElevation(o, f1);
        if (r != null)
        {
            ViewCompat.setElevation(r, f1);
        }
    }

    public void a(int i1)
    {
        p.e(i1);
    }

    public void a(int i1, int j1)
    {
        int k1 = p.p();
        if ((j1 & 4) != 0)
        {
            w = true;
        }
        p.c(k1 & ~j1 | i1 & j1);
    }

    public void a(Configuration configuration)
    {
        o(android.support.v7.internal.view.a.a(j).d());
    }

    public void a(View view)
    {
        p.a(view);
    }

    public void a(View view, android.support.v7.app.b b1)
    {
        view.setLayoutParams(b1);
        p.a(view);
    }

    public void a(CharSequence charsequence)
    {
        p.a(charsequence);
    }

    public void a(boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        a(i1, 1);
    }

    public void b()
    {
        if (!D)
        {
            D = true;
            p(false);
        }
    }

    public void b(int i1)
    {
        B = i1;
    }

    public void b(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 2);
    }

    public Context c()
    {
        if (k == null)
        {
            TypedValue typedvalue = new TypedValue();
            j.getTheme().resolveAttribute(b.actionBarWidgetTheme, typedvalue, true);
            int i1 = typedvalue.resourceId;
            if (i1 != 0)
            {
                k = new ContextThemeWrapper(j, i1);
            } else
            {
                k = j;
            }
        }
        return k;
    }

    public void c(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 4);
    }

    public void d(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 8);
    }

    public void e(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 16;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 16);
    }

    public boolean e()
    {
        if (p != null && p.d())
        {
            p.e();
            return true;
        } else
        {
            return false;
        }
    }

    void f()
    {
        if (c != null)
        {
            c.a(b);
            b = null;
            c = null;
        }
    }

    public void f(boolean flag)
    {
        p.b(flag);
    }

    public int g()
    {
        return p.q();
    }

    public void g(boolean flag)
    {
        if (flag && !n.a())
        {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        } else
        {
            d = flag;
            n.setHideOnContentScrollEnabled(flag);
            return;
        }
    }

    public void h()
    {
        if (E)
        {
            E = false;
            p(true);
        }
    }

    public void h(boolean flag)
    {
        if (!w)
        {
            c(flag);
        }
    }

    public void i()
    {
        if (!E)
        {
            E = true;
            p(true);
        }
    }

    public void i(boolean flag)
    {
        I = flag;
        if (!flag && H != null)
        {
            H.b();
        }
    }

    public void j()
    {
        if (H != null)
        {
            H.b();
            H = null;
        }
    }

    public void j(boolean flag)
    {
        if (flag != x)
        {
            x = flag;
            int j1 = y.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                ((c)y.get(i1)).a(flag);
                i1++;
            }
        }
    }

    public void k()
    {
    }

    public void k(boolean flag)
    {
        C = flag;
    }

    public void l(boolean flag)
    {
        if (H != null)
        {
            H.b();
        }
        o.setVisibility(0);
        if (B == 0 && i && (I || flag))
        {
            ViewCompat.setTranslationY(o, 0.0F);
            float f2 = -o.getHeight();
            float f1 = f2;
            if (flag)
            {
                int ai[] = new int[2];
                int[] _tmp = ai;
                ai[0] = 0;
                ai[1] = 0;
                o.getLocationInWindow(ai);
                f1 = f2 - (float)ai[1];
            }
            ViewCompat.setTranslationY(o, f1);
            h h1 = new h();
            ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(o).translationY(0.0F);
            viewpropertyanimatorcompat.setUpdateListener(g);
            h1.a(viewpropertyanimatorcompat);
            if (C && s != null)
            {
                ViewCompat.setTranslationY(s, f1);
                h1.a(ViewCompat.animate(s).translationY(0.0F));
            }
            if (r != null && z == 1)
            {
                ViewCompat.setTranslationY(r, r.getHeight());
                r.setVisibility(0);
                h1.a(ViewCompat.animate(r).translationY(0.0F));
            }
            h1.a(AnimationUtils.loadInterpolator(j, 0x10a0006));
            h1.a(250L);
            h1.a(f);
            H = h1;
            h1.a();
        } else
        {
            ViewCompat.setAlpha(o, 1.0F);
            ViewCompat.setTranslationY(o, 0.0F);
            if (C && s != null)
            {
                ViewCompat.setTranslationY(s, 0.0F);
            }
            if (r != null && z == 1)
            {
                ViewCompat.setAlpha(r, 1.0F);
                ViewCompat.setTranslationY(r, 0.0F);
                r.setVisibility(0);
            }
            f.onAnimationEnd(null);
        }
        if (n != null)
        {
            ViewCompat.requestApplyInsets(n);
        }
    }

    public void m(boolean flag)
    {
        if (H != null)
        {
            H.b();
        }
        if (B == 0 && i && (I || flag))
        {
            ViewCompat.setAlpha(o, 1.0F);
            o.setTransitioning(true);
            h h1 = new h();
            float f2 = -o.getHeight();
            float f1 = f2;
            if (flag)
            {
                int ai[] = new int[2];
                int[] _tmp = ai;
                ai[0] = 0;
                ai[1] = 0;
                o.getLocationInWindow(ai);
                f1 = f2 - (float)ai[1];
            }
            ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(o).translationY(f1);
            viewpropertyanimatorcompat.setUpdateListener(g);
            h1.a(viewpropertyanimatorcompat);
            if (C && s != null)
            {
                h1.a(ViewCompat.animate(s).translationY(f1));
            }
            if (r != null && r.getVisibility() == 0)
            {
                ViewCompat.setAlpha(r, 1.0F);
                h1.a(ViewCompat.animate(r).translationY(r.getHeight()));
            }
            h1.a(AnimationUtils.loadInterpolator(j, 0x10a0005));
            h1.a(250L);
            h1.a(e);
            H = h1;
            h1.a();
            return;
        } else
        {
            e.onAnimationEnd(null);
            return;
        }
    }

    public void n(boolean flag)
    {
        boolean flag1 = false;
        Object obj;
        int i1;
        if (flag)
        {
            l();
        } else
        {
            m();
        }
        obj = p;
        if (flag)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        ((ag) (obj)).d(i1);
        obj = q;
        if (flag)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        ((ActionBarContextView) (obj)).a(i1);
    }

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (!android/support/v7/internal/a/i.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        i = flag;
    }
}
