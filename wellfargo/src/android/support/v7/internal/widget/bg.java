// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v7.a.b;
import android.support.v7.a.f;
import android.support.v7.a.g;
import android.support.v7.a.j;
import android.support.v7.a.l;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.y;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.bk;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.internal.widget:
//            ag, bf, bd, bh, 
//            an, bi, bj

public class bg
    implements ag
{

    private Toolbar a;
    private int b;
    private View c;
    private View d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private boolean h;
    private CharSequence i;
    private CharSequence j;
    private CharSequence k;
    private android.view.Window.Callback l;
    private boolean m;
    private ActionMenuPresenter n;
    private int o;
    private final bd p;
    private int q;
    private Drawable r;

    public bg(Toolbar toolbar, boolean flag)
    {
        this(toolbar, flag, j.abc_action_bar_up_description, f.abc_ic_ab_back_mtrl_am_alpha);
    }

    public bg(Toolbar toolbar, boolean flag, int i1, int j1)
    {
        o = 0;
        q = 0;
        a = toolbar;
        i = toolbar.getTitle();
        j = toolbar.getSubtitle();
        boolean flag1;
        if (i != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        h = flag1;
        g = toolbar.getNavigationIcon();
        if (flag)
        {
            toolbar = bf.a(toolbar.getContext(), null, l.ActionBar, b.actionBarStyle, 0);
            Object obj = toolbar.c(l.ActionBar_title);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                b(((CharSequence) (obj)));
            }
            obj = toolbar.c(l.ActionBar_subtitle);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                c(((CharSequence) (obj)));
            }
            obj = toolbar.a(l.ActionBar_logo);
            if (obj != null)
            {
                c(((Drawable) (obj)));
            }
            obj = toolbar.a(l.ActionBar_icon);
            if (g == null && obj != null)
            {
                a(((Drawable) (obj)));
            }
            obj = toolbar.a(l.ActionBar_homeAsUpIndicator);
            if (obj != null)
            {
                d(((Drawable) (obj)));
            }
            c(toolbar.a(l.ActionBar_displayOptions, 0));
            int k1 = toolbar.f(l.ActionBar_customNavigationLayout, 0);
            if (k1 != 0)
            {
                a(LayoutInflater.from(a.getContext()).inflate(k1, a, false));
                c(b | 0x10);
            }
            k1 = toolbar.e(l.ActionBar_height, 0);
            if (k1 > 0)
            {
                android.view.ViewGroup.LayoutParams layoutparams = a.getLayoutParams();
                layoutparams.height = k1;
                a.setLayoutParams(layoutparams);
            }
            k1 = toolbar.c(l.ActionBar_contentInsetStart, -1);
            int l1 = toolbar.c(l.ActionBar_contentInsetEnd, -1);
            if (k1 >= 0 || l1 >= 0)
            {
                a.a(Math.max(k1, 0), Math.max(l1, 0));
            }
            k1 = toolbar.f(l.ActionBar_titleTextStyle, 0);
            if (k1 != 0)
            {
                a.a(a.getContext(), k1);
            }
            k1 = toolbar.f(l.ActionBar_subtitleTextStyle, 0);
            if (k1 != 0)
            {
                a.b(a.getContext(), k1);
            }
            k1 = toolbar.f(l.ActionBar_popupTheme, 0);
            if (k1 != 0)
            {
                a.setPopupTheme(k1);
            }
            toolbar.b();
            p = toolbar.c();
        } else
        {
            b = s();
            p = bd.a(toolbar.getContext());
        }
        g(i1);
        k = a.getNavigationContentDescription();
        b(p.a(j1));
        a.setNavigationOnClickListener(new bh(this));
    }

    static Toolbar a(bg bg1)
    {
        return bg1.a;
    }

    static CharSequence b(bg bg1)
    {
        return bg1.i;
    }

    static android.view.Window.Callback c(bg bg1)
    {
        return bg1.l;
    }

    static boolean d(bg bg1)
    {
        return bg1.m;
    }

    private void e(CharSequence charsequence)
    {
        i = charsequence;
        if ((b & 8) != 0)
        {
            a.setTitle(charsequence);
        }
    }

    private int s()
    {
        byte byte0 = 11;
        if (a.getNavigationIcon() != null)
        {
            byte0 = 15;
        }
        return byte0;
    }

    private void t()
    {
        Drawable drawable = null;
        if ((b & 2) != 0)
        {
            if ((b & 1) != 0)
            {
                if (f != null)
                {
                    drawable = f;
                } else
                {
                    drawable = e;
                }
            } else
            {
                drawable = e;
            }
        }
        a.setLogo(drawable);
    }

    private void u()
    {
label0:
        {
            if ((b & 4) != 0)
            {
                if (!TextUtils.isEmpty(k))
                {
                    break label0;
                }
                a.setNavigationContentDescription(q);
            }
            return;
        }
        a.setNavigationContentDescription(k);
    }

    private void v()
    {
        if ((b & 4) != 0)
        {
            Toolbar toolbar = a;
            Drawable drawable;
            if (g != null)
            {
                drawable = g;
            } else
            {
                drawable = r;
            }
            toolbar.setNavigationIcon(drawable);
        }
    }

    public ViewGroup a()
    {
        return a;
    }

    public void a(int i1)
    {
        Drawable drawable;
        if (i1 != 0)
        {
            drawable = p.a(i1);
        } else
        {
            drawable = null;
        }
        a(drawable);
    }

    public void a(Drawable drawable)
    {
        e = drawable;
        t();
    }

    public void a(y y, android.support.v7.internal.view.menu.j j1)
    {
        a.a(y, j1);
    }

    public void a(an an1)
    {
        if (c != null && c.getParent() == a)
        {
            a.removeView(c);
        }
        c = an1;
        if (an1 != null && o == 2)
        {
            a.addView(c, 0);
            bk bk1 = (bk)c.getLayoutParams();
            bk1.width = -2;
            bk1.height = -2;
            bk1.a = 0x800053;
            an1.setAllowCollapse(true);
        }
    }

    public void a(Menu menu, y y)
    {
        if (n == null)
        {
            n = new ActionMenuPresenter(a.getContext());
            n.a(g.action_menu_presenter);
        }
        n.a(y);
        a.a((i)menu, n);
    }

    public void a(View view)
    {
        if (d != null && (b & 0x10) != 0)
        {
            a.removeView(d);
        }
        d = view;
        if (view != null && (b & 0x10) != 0)
        {
            a.addView(d);
        }
    }

    public void a(android.view.Window.Callback callback)
    {
        l = callback;
    }

    public void a(CharSequence charsequence)
    {
        if (!h)
        {
            e(charsequence);
        }
    }

    public void a(boolean flag)
    {
        a.setCollapsible(flag);
    }

    public Context b()
    {
        return a.getContext();
    }

    public void b(int i1)
    {
        Drawable drawable;
        if (i1 != 0)
        {
            drawable = p.a(i1);
        } else
        {
            drawable = null;
        }
        c(drawable);
    }

    public void b(Drawable drawable)
    {
        if (r != drawable)
        {
            r = drawable;
            v();
        }
    }

    public void b(CharSequence charsequence)
    {
        h = true;
        e(charsequence);
    }

    public void b(boolean flag)
    {
    }

    public void c(int i1)
    {
label0:
        {
            int j1 = b ^ i1;
            b = i1;
            if (j1 != 0)
            {
                if ((j1 & 4) != 0)
                {
                    if ((i1 & 4) != 0)
                    {
                        v();
                        u();
                    } else
                    {
                        a.setNavigationIcon(null);
                    }
                }
                if ((j1 & 3) != 0)
                {
                    t();
                }
                if ((j1 & 8) != 0)
                {
                    if ((i1 & 8) != 0)
                    {
                        a.setTitle(i);
                        a.setSubtitle(j);
                    } else
                    {
                        a.setTitle(null);
                        a.setSubtitle(null);
                    }
                }
                if ((j1 & 0x10) != 0 && d != null)
                {
                    if ((i1 & 0x10) == 0)
                    {
                        break label0;
                    }
                    a.addView(d);
                }
            }
            return;
        }
        a.removeView(d);
    }

    public void c(Drawable drawable)
    {
        f = drawable;
        t();
    }

    public void c(CharSequence charsequence)
    {
        j = charsequence;
        if ((b & 8) != 0)
        {
            a.setSubtitle(charsequence);
        }
    }

    public boolean c()
    {
        return false;
    }

    public void d(int i1)
    {
        if (i1 == 8)
        {
            ViewCompat.animate(a).alpha(0.0F).setListener(new bi(this));
        } else
        if (i1 == 0)
        {
            ViewCompat.animate(a).alpha(1.0F).setListener(new bj(this));
            return;
        }
    }

    public void d(Drawable drawable)
    {
        g = drawable;
        v();
    }

    public void d(CharSequence charsequence)
    {
        k = charsequence;
        u();
    }

    public boolean d()
    {
        return a.g();
    }

    public void e()
    {
        a.h();
    }

    public void e(int i1)
    {
        Object obj;
        if (i1 == 0)
        {
            obj = null;
        } else
        {
            obj = b().getString(i1);
        }
        d(((CharSequence) (obj)));
    }

    public CharSequence f()
    {
        return a.getTitle();
    }

    public void f(int i1)
    {
        a.setVisibility(i1);
    }

    public void g()
    {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void g(int i1)
    {
        if (i1 != q)
        {
            q = i1;
            if (TextUtils.isEmpty(a.getNavigationContentDescription()))
            {
                e(q);
                return;
            }
        }
    }

    public void h()
    {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public boolean i()
    {
        return a.a();
    }

    public boolean j()
    {
        return a.b();
    }

    public boolean k()
    {
        return a.c();
    }

    public boolean l()
    {
        return a.d();
    }

    public boolean m()
    {
        return a.e();
    }

    public void n()
    {
        m = true;
    }

    public void o()
    {
        a.f();
    }

    public int p()
    {
        return b;
    }

    public int q()
    {
        return o;
    }

    public Menu r()
    {
        return a.getMenu();
    }
}
