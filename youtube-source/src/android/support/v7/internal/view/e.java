// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.n;
import android.support.v4.view.z;
import android.support.v7.a.k;
import android.support.v7.internal.view.menu.s;
import android.support.v7.internal.view.menu.u;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

// Referenced classes of package android.support.v7.internal.view:
//            c, d

final class e
{

    final c a;
    private Menu b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private CharSequence l;
    private CharSequence m;
    private int n;
    private char o;
    private char p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private String w;
    private String x;
    private String y;
    private n z;

    public e(c c1, Menu menu)
    {
        a = c1;
        super();
        b = menu;
        a();
    }

    private static char a(String s1)
    {
        if (s1 == null)
        {
            return '\0';
        } else
        {
            return s1.charAt(0);
        }
    }

    static n a(e e1)
    {
        return e1.z;
    }

    private Object a(String s1, Class aclass[], Object aobj[])
    {
        try
        {
            aclass = ((Class []) (android.support.v7.internal.view.c.a(a).getClassLoader().loadClass(s1).getConstructor(aclass).newInstance(aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Class aclass[])
        {
            Log.w("SupportMenuInflater", (new StringBuilder("Cannot instantiate class: ")).append(s1).toString(), aclass);
            return null;
        }
        return aclass;
    }

    private void a(MenuItem menuitem)
    {
        boolean flag = true;
        MenuItem menuitem1 = menuitem.setChecked(r).setVisible(s).setEnabled(t);
        boolean flag1;
        if (q > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        menuitem1.setCheckable(flag1).setTitleCondensed(m).setIcon(n).setAlphabeticShortcut(o).setNumericShortcut(p);
        if (u >= 0)
        {
            android.support.v4.view.z.a(menuitem, u);
        }
        if (y != null)
        {
            if (android.support.v7.internal.view.c.a(a).isRestricted())
            {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuitem.setOnMenuItemClickListener(new d(android.support.v7.internal.view.c.c(a), y));
        }
        if (q >= 2)
        {
            if (menuitem instanceof s)
            {
                ((s)menuitem).a(true);
            } else
            if (menuitem instanceof u)
            {
                ((u)menuitem).a(true);
            }
        }
        if (w != null)
        {
            android.support.v4.view.z.a(menuitem, (View)a(w, android.support.v7.internal.view.c.b(), android.support.v7.internal.view.c.d(a)));
        } else
        {
            flag = false;
        }
        if (v > 0)
        {
            if (!flag)
            {
                android.support.v4.view.z.b(menuitem, v);
            } else
            {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        if (z != null)
        {
            android.support.v4.view.z.a(menuitem, z);
        }
    }

    public final void a()
    {
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = true;
        h = true;
    }

    public final void a(AttributeSet attributeset)
    {
        attributeset = android.support.v7.internal.view.c.a(a).obtainStyledAttributes(attributeset, k.s);
        c = attributeset.getResourceId(1, 0);
        d = attributeset.getInt(3, 0);
        e = attributeset.getInt(4, 0);
        f = attributeset.getInt(5, 0);
        g = attributeset.getBoolean(2, true);
        h = attributeset.getBoolean(0, true);
        attributeset.recycle();
    }

    public final void b()
    {
        i = true;
        a(b.add(c, j, k, l));
    }

    public final void b(AttributeSet attributeset)
    {
        boolean flag = true;
        attributeset = android.support.v7.internal.view.c.a(a).obtainStyledAttributes(attributeset, k.t);
        j = attributeset.getResourceId(2, 0);
        k = attributeset.getInt(5, d) & 0xffff0000 | attributeset.getInt(6, e) & 0xffff;
        l = attributeset.getText(7);
        m = attributeset.getText(8);
        n = attributeset.getResourceId(0, 0);
        o = a(attributeset.getString(9));
        p = a(attributeset.getString(10));
        int i1;
        if (attributeset.hasValue(11))
        {
            if (attributeset.getBoolean(11, false))
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            q = i1;
        } else
        {
            q = f;
        }
        r = attributeset.getBoolean(3, false);
        s = attributeset.getBoolean(4, g);
        t = attributeset.getBoolean(1, h);
        u = attributeset.getInt(13, -1);
        y = attributeset.getString(12);
        v = attributeset.getResourceId(14, 0);
        w = attributeset.getString(15);
        x = attributeset.getString(16);
        if (x != null)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        if (i1 != 0 && v == 0 && w == null)
        {
            z = (n)a(x, android.support.v7.internal.view.c.a(), android.support.v7.internal.view.c.b(a));
        } else
        {
            if (i1 != 0)
            {
                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
            }
            z = null;
        }
        attributeset.recycle();
        i = false;
    }

    public final SubMenu c()
    {
        i = true;
        SubMenu submenu = b.addSubMenu(c, j, k, l);
        a(submenu.getItem());
        return submenu;
    }

    public final boolean d()
    {
        return i;
    }
}
