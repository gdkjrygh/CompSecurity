// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v4.view.ViewCompat;
import android.support.v7.a.k;
import android.support.v7.app.a;
import android.support.v7.app.c;
import android.support.v7.internal.view.menu.g;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.widget.ag;
import android.support.v7.internal.widget.bg;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.bl;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.a:
//            c, d, h, g, 
//            e, f

public class b extends a
{

    private ag a;
    private boolean b;
    private android.view.Window.Callback c;
    private boolean d;
    private boolean e;
    private ArrayList f;
    private g g;
    private final Runnable h = new android.support.v7.internal.a.c(this);
    private final bl i = new d(this);

    public b(Toolbar toolbar, CharSequence charsequence, android.view.Window.Callback callback)
    {
        f = new ArrayList();
        a = new bg(toolbar, false);
        c = new h(this, callback);
        a.a(c);
        toolbar.setOnMenuItemClickListener(i);
        a.a(charsequence);
    }

    static View a(b b1, Menu menu)
    {
        return b1.a(menu);
    }

    private View a(Menu menu)
    {
        b(menu);
        while (menu == null || g == null || g.a().getCount() <= 0) 
        {
            return null;
        }
        return (View)g.a(a.a());
    }

    static android.view.Window.Callback a(b b1)
    {
        return b1.c;
    }

    static boolean a(b b1, boolean flag)
    {
        b1.b = flag;
        return flag;
    }

    private void b(Menu menu)
    {
        if (g == null && (menu instanceof i))
        {
            menu = (i)menu;
            Object obj = a.b();
            TypedValue typedvalue = new TypedValue();
            android.content.res.Resources.Theme theme = ((Context) (obj)).getResources().newTheme();
            theme.setTo(((Context) (obj)).getTheme());
            theme.resolveAttribute(android.support.v7.a.b.actionBarPopupTheme, typedvalue, true);
            if (typedvalue.resourceId != 0)
            {
                theme.applyStyle(typedvalue.resourceId, true);
            }
            theme.resolveAttribute(android.support.v7.a.b.panelMenuListTheme, typedvalue, true);
            if (typedvalue.resourceId != 0)
            {
                theme.applyStyle(typedvalue.resourceId, true);
            } else
            {
                theme.applyStyle(k.Theme_AppCompat_CompactMenu, true);
            }
            obj = new ContextThemeWrapper(((Context) (obj)), 0);
            ((Context) (obj)).getTheme().setTo(theme);
            g = new g(((Context) (obj)), android.support.v7.a.i.abc_list_menu_item_layout);
            g.a(new android.support.v7.internal.a.g(this, null));
            menu.a(g);
        }
    }

    static boolean b(b b1)
    {
        return b1.b;
    }

    static ag c(b b1)
    {
        return b1.a;
    }

    private Menu h()
    {
        if (!d)
        {
            a.a(new e(this, null), new f(this, null));
            d = true;
        }
        return a.r();
    }

    public int a()
    {
        return a.p();
    }

    public void a(float f1)
    {
        ViewCompat.setElevation(a.a(), f1);
    }

    public void a(int l)
    {
        a.e(l);
    }

    public void a(int l, int i1)
    {
        int j1 = a.p();
        a.c(j1 & ~i1 | l & i1);
    }

    public void a(Configuration configuration)
    {
        super.a(configuration);
    }

    public void a(View view)
    {
        a(view, new android.support.v7.app.b(-2, -2));
    }

    public void a(View view, android.support.v7.app.b b1)
    {
        view.setLayoutParams(b1);
        a.a(view);
    }

    public void a(CharSequence charsequence)
    {
        a.a(charsequence);
    }

    public void a(boolean flag)
    {
        int l;
        if (flag)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        a(l, 1);
    }

    public boolean a(int l, KeyEvent keyevent)
    {
        boolean flag = false;
        Menu menu = h();
        if (menu != null)
        {
            flag = menu.performShortcut(l, keyevent, 0);
        }
        return flag;
    }

    public void b()
    {
        a.f(8);
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
        return a.b();
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

    public boolean d()
    {
        a.a().removeCallbacks(h);
        ViewCompat.postOnAnimation(a.a(), h);
        return true;
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
        if (a.d())
        {
            a.e();
            return true;
        } else
        {
            return false;
        }
    }

    public android.view.Window.Callback f()
    {
        return c;
    }

    public void f(boolean flag)
    {
    }

    void g()
    {
        i l;
        Menu menu = h();
        if (menu instanceof i)
        {
            l = (i)menu;
        } else
        {
            l = null;
        }
        if (l != null)
        {
            l.g();
        }
        menu.clear();
        if (!c.onCreatePanelMenu(0, menu) || !c.onPreparePanel(0, null, menu))
        {
            menu.clear();
        }
        if (l != null)
        {
            l.h();
        }
        return;
        Exception exception;
        exception;
        if (l != null)
        {
            l.h();
        }
        throw exception;
    }

    public void h(boolean flag)
    {
    }

    public void i(boolean flag)
    {
    }

    public void j(boolean flag)
    {
        if (flag != e)
        {
            e = flag;
            int i1 = f.size();
            int l = 0;
            while (l < i1) 
            {
                ((c)f.get(l)).a(flag);
                l++;
            }
        }
    }
}
