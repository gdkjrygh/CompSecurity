// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.a.l;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.o;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

// Referenced classes of package android.support.v7.internal.view:
//            e, f

class g
{

    final e a;
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
    private ActionProvider z;

    public g(e e1, Menu menu)
    {
        a = e1;
        super();
        b = menu;
        a();
    }

    private char a(String s1)
    {
        if (s1 == null)
        {
            return '\0';
        } else
        {
            return s1.charAt(0);
        }
    }

    static ActionProvider a(g g1)
    {
        return g1.z;
    }

    private Object a(String s1, Class aclass[], Object aobj[])
    {
        try
        {
            aclass = ((Class []) (android.support.v7.internal.view.e.a(a).getClassLoader().loadClass(s1).getConstructor(aclass).newInstance(aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Class aclass[])
        {
            Log.w("SupportMenuInflater", (new StringBuilder()).append("Cannot instantiate class: ").append(s1).toString(), aclass);
            return null;
        }
        return aclass;
    }

    private void a(MenuItem menuitem)
    {
        boolean flag = true;
        Object obj = menuitem.setChecked(r).setVisible(s).setEnabled(t);
        boolean flag1;
        if (q >= 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((MenuItem) (obj)).setCheckable(flag1).setTitleCondensed(m).setIcon(n).setAlphabeticShortcut(o).setNumericShortcut(p);
        if (u >= 0)
        {
            MenuItemCompat.setShowAsAction(menuitem, u);
        }
        if (y != null)
        {
            if (android.support.v7.internal.view.e.a(a).isRestricted())
            {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuitem.setOnMenuItemClickListener(new f(android.support.v7.internal.view.e.c(a), y));
        }
        if (menuitem instanceof m)
        {
            obj = (m)menuitem;
        }
        if (q >= 2)
        {
            if (menuitem instanceof m)
            {
                ((m)menuitem).a(true);
            } else
            if (menuitem instanceof o)
            {
                ((o)menuitem).a(true);
            }
        }
        if (w != null)
        {
            MenuItemCompat.setActionView(menuitem, (View)a(w, android.support.v7.internal.view.e.b(), android.support.v7.internal.view.e.d(a)));
        } else
        {
            flag = false;
        }
        if (v > 0)
        {
            if (!flag)
            {
                MenuItemCompat.setActionView(menuitem, v);
            } else
            {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        if (z != null)
        {
            MenuItemCompat.setActionProvider(menuitem, z);
        }
    }

    public void a()
    {
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = true;
        h = true;
    }

    public void a(AttributeSet attributeset)
    {
        attributeset = android.support.v7.internal.view.e.a(a).obtainStyledAttributes(attributeset, l.MenuGroup);
        c = attributeset.getResourceId(l.MenuGroup_android_id, 0);
        d = attributeset.getInt(l.MenuGroup_android_menuCategory, 0);
        e = attributeset.getInt(l.MenuGroup_android_orderInCategory, 0);
        f = attributeset.getInt(l.MenuGroup_android_checkableBehavior, 0);
        g = attributeset.getBoolean(l.MenuGroup_android_visible, true);
        h = attributeset.getBoolean(l.MenuGroup_android_enabled, true);
        attributeset.recycle();
    }

    public void b()
    {
        i = true;
        a(b.add(c, j, k, l));
    }

    public void b(AttributeSet attributeset)
    {
        boolean flag = true;
        attributeset = android.support.v7.internal.view.e.a(a).obtainStyledAttributes(attributeset, l.MenuItem);
        j = attributeset.getResourceId(l.MenuItem_android_id, 0);
        k = attributeset.getInt(l.MenuItem_android_menuCategory, d) & 0xffff0000 | attributeset.getInt(l.MenuItem_android_orderInCategory, e) & 0xffff;
        l = attributeset.getText(l.MenuItem_android_title);
        m = attributeset.getText(l.MenuItem_android_titleCondensed);
        n = attributeset.getResourceId(l.MenuItem_android_icon, 0);
        o = a(attributeset.getString(l.MenuItem_android_alphabeticShortcut));
        p = a(attributeset.getString(l.MenuItem_android_numericShortcut));
        int i1;
        if (attributeset.hasValue(l.MenuItem_android_checkable))
        {
            if (attributeset.getBoolean(l.MenuItem_android_checkable, false))
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
        r = attributeset.getBoolean(l.MenuItem_android_checked, false);
        s = attributeset.getBoolean(l.MenuItem_android_visible, g);
        t = attributeset.getBoolean(l.MenuItem_android_enabled, h);
        u = attributeset.getInt(l.MenuItem_showAsAction, -1);
        y = attributeset.getString(l.MenuItem_android_onClick);
        v = attributeset.getResourceId(l.MenuItem_actionLayout, 0);
        w = attributeset.getString(l.MenuItem_actionViewClass);
        x = attributeset.getString(l.MenuItem_actionProviderClass);
        if (x != null)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        if (i1 != 0 && v == 0 && w == null)
        {
            z = (ActionProvider)a(x, android.support.v7.internal.view.e.a(), android.support.v7.internal.view.e.b(a));
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

    public SubMenu c()
    {
        i = true;
        SubMenu submenu = b.addSubMenu(c, j, k, l);
        a(submenu.getItem());
        return submenu;
    }

    public boolean d()
    {
        return i;
    }
}
