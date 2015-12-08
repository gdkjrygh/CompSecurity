// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.a.c;
import android.support.v7.a.d;
import android.support.v7.a.f;
import android.support.v7.a.h;
import android.support.v7.a.j;
import android.support.v7.a.k;
import android.support.v7.c.a;
import android.support.v7.internal.view.menu.ae;
import android.support.v7.internal.view.menu.ah;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.o;
import android.support.v7.internal.view.menu.p;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.app:
//            d, f, k, ActionBarActivity, 
//            ActionBar

class e extends android.support.v7.app.d
    implements ae, p
{

    private static final int d[];
    private ActionBarView e;
    private m f;
    private o g;
    private a h;
    private boolean i;
    private CharSequence j;
    private boolean k;
    private boolean l;
    private boolean m;
    private final Runnable n = new android.support.v7.app.f(this);

    e(ActionBarActivity actionbaractivity)
    {
        super(actionbaractivity);
    }

    static o a(e e1)
    {
        return e1.l();
    }

    static void a(e e1, o o1)
    {
        e1.c(o1);
    }

    static boolean a(e e1, boolean flag)
    {
        e1.m = false;
        return false;
    }

    private void c(o o1)
    {
        if (o1 != g)
        {
            if (g != null)
            {
                g.b(f);
            }
            g = o1;
            if (o1 != null && f != null)
            {
                o1.a(f);
            }
            if (e != null)
            {
                e.setMenu(o1, this);
                return;
            }
        }
    }

    private o l()
    {
        o o1 = new o(j());
        o1.a(this);
        return o1;
    }

    public ActionBar a()
    {
        k();
        return new android.support.v7.app.k(a, a);
    }

    public final void a(int i1)
    {
        k();
        ActionBarActivity actionbaractivity;
        if (b)
        {
            ViewGroup viewgroup = (ViewGroup)a.findViewById(0x1020002);
            viewgroup.removeAllViews();
            a.getLayoutInflater().inflate(i1, viewgroup);
        } else
        {
            a.a(i1);
        }
        actionbaractivity = a;
    }

    public final void a(Configuration configuration)
    {
        if (b && i)
        {
            ((android.support.v7.app.k)b()).c();
        }
    }

    public final void a(o o1)
    {
        if (e != null && e.f())
        {
            if (!e.e())
            {
                if (e.getVisibility() == 0)
                {
                    e.b();
                }
                return;
            } else
            {
                e.d();
                return;
            }
        } else
        {
            o1.close();
            return;
        }
    }

    public final void a(o o1, boolean flag)
    {
        a.closeOptionsMenu();
    }

    public final void a(View view)
    {
        k();
        if (b)
        {
            ViewGroup viewgroup = (ViewGroup)a.findViewById(0x1020002);
            viewgroup.removeAllViews();
            viewgroup.addView(view);
        } else
        {
            a.a(view);
        }
        view = a;
    }

    public final void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        k();
        if (b)
        {
            ViewGroup viewgroup = (ViewGroup)a.findViewById(0x1020002);
            viewgroup.removeAllViews();
            viewgroup.addView(view, layoutparams);
        } else
        {
            a.a(view, layoutparams);
        }
        view = a;
    }

    public final void a(CharSequence charsequence)
    {
        if (e != null)
        {
            e.setWindowTitle(charsequence);
            return;
        } else
        {
            j = charsequence;
            return;
        }
    }

    public final boolean a(int i1, Menu menu)
    {
        if (i1 != 0)
        {
            return a.a(i1, menu);
        } else
        {
            return false;
        }
    }

    public final boolean a(int i1, MenuItem menuitem)
    {
        MenuItem menuitem1 = menuitem;
        if (i1 == 0)
        {
            menuitem1 = ah.a(menuitem);
        }
        return a.a(i1, menuitem1);
    }

    public final boolean a(int i1, View view, Menu menu)
    {
        if (i1 != 0)
        {
            return a.a(i1, view, menu);
        } else
        {
            return false;
        }
    }

    public final boolean a(MenuItem menuitem)
    {
        return a.onMenuItemSelected(0, menuitem);
    }

    public final View b(int i1)
    {
label0:
        {
            Object obj = null;
            Object obj2 = null;
            if (i1 == 0)
            {
                boolean flag = true;
                boolean flag1 = true;
                o o1 = g;
                Object obj1 = o1;
                if (h == null)
                {
                    obj = o1;
                    if (o1 == null)
                    {
                        obj = l();
                        c(((o) (obj)));
                        ((o) (obj)).f();
                        flag1 = a.a(0, ((Menu) (obj)));
                    }
                    obj1 = obj;
                    flag = flag1;
                    if (flag1)
                    {
                        ((o) (obj)).f();
                        flag = a.a(0, null, ((Menu) (obj)));
                        obj1 = obj;
                    }
                }
                if (!flag)
                {
                    break label0;
                }
                obj = a;
                if (g == null)
                {
                    obj = obj2;
                } else
                {
                    if (f == null)
                    {
                        TypedArray typedarray = ((Context) (obj)).obtainStyledAttributes(k.I);
                        i1 = typedarray.getResourceId(4, j.a);
                        typedarray.recycle();
                        f = new m(h.o, i1);
                        f.a(this);
                        g.a(f);
                    } else
                    {
                        f.c(false);
                    }
                    obj = f.a(new FrameLayout(((Context) (obj))));
                }
                obj = (View)obj;
                ((o) (obj1)).g();
            }
            return ((View) (obj));
        }
        c(null);
        return null;
    }

    public final void b(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        k();
        if (b)
        {
            ((ViewGroup)a.findViewById(0x1020002)).addView(view, layoutparams);
        } else
        {
            a.a(view, layoutparams);
        }
        view = a;
    }

    public final boolean b(o o1)
    {
        return false;
    }

    public final void d()
    {
        android.support.v7.app.k k1 = (android.support.v7.app.k)b();
        if (k1 != null)
        {
            k1.c(false);
        }
    }

    public final void e()
    {
        android.support.v7.app.k k1 = (android.support.v7.app.k)b();
        if (k1 != null)
        {
            k1.c(true);
        }
    }

    public final void f()
    {
        if (!m)
        {
            m = true;
            a.getWindow().getDecorView().post(n);
        }
    }

    public final boolean g()
    {
        if (h != null)
        {
            h.a();
            return true;
        }
        if (e != null && e.j())
        {
            e.k();
            return true;
        } else
        {
            return false;
        }
    }

    public final void h()
    {
    }

    final void k()
    {
        if (b && !i)
        {
            ActionBarContainer actionbarcontainer;
            boolean flag;
            boolean flag1;
            if (c)
            {
                a.a(h.b);
            } else
            {
                a.a(h.a);
            }
            e = (ActionBarView)a.findViewById(f.a);
            e.setWindowCallback(a);
            if (k)
            {
                e.g();
            }
            if (l)
            {
                e.h();
            }
            flag1 = "splitActionBarWhenNarrow".equals(i());
            if (flag1)
            {
                flag = a.getResources().getBoolean(d.e);
            } else
            {
                TypedArray typedarray = a.obtainStyledAttributes(k.c);
                flag = typedarray.getBoolean(2, false);
                typedarray.recycle();
            }
            actionbarcontainer = (ActionBarContainer)a.findViewById(f.C);
            if (actionbarcontainer != null)
            {
                e.setSplitView(actionbarcontainer);
                e.setSplitActionBar(flag);
                e.setSplitWhenNarrow(flag1);
                ActionBarContextView actionbarcontextview = (ActionBarContextView)a.findViewById(f.h);
                actionbarcontextview.setSplitView(actionbarcontainer);
                actionbarcontextview.setSplitActionBar(flag);
                actionbarcontextview.setSplitWhenNarrow(flag1);
            }
            a.findViewById(0x1020002).setId(-1);
            a.findViewById(f.b).setId(0x1020002);
            if (j != null)
            {
                e.setWindowTitle(j);
                j = null;
            }
            i = true;
            f();
        }
    }

    static 
    {
        d = (new int[] {
            c.i
        });
    }
}
