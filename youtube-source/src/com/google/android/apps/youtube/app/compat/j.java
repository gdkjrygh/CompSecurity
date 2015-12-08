// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.compat;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.app.compat:
//            u, t, w, k, 
//            q

public final class j
{

    private final Context a;
    private final Menu b;
    private SparseArray c;

    public j(Context context, Menu menu)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (Menu)com.google.android.apps.youtube.common.fromguava.c.a(menu);
        c = new SparseArray();
        for (int i = 0; i < menu.size(); i++)
        {
            context = menu.getItem(i);
            if (context != null)
            {
                c.put(context.getItemId(), a(context));
            }
        }

    }

    static SparseArray a(j j1)
    {
        return j1.c;
    }

    private q a(MenuItem menuitem)
    {
        Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            obj = new u(a, menuitem);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            obj = new t(a, menuitem);
        } else
        {
            obj = new w(a, menuitem);
        }
        c.put(menuitem.getItemId(), obj);
        return ((q) (obj));
    }

    static q a(j j1, MenuItem menuitem)
    {
        return j1.a(menuitem);
    }

    public final int a(int i, int l, int i1, ComponentName componentname, Intent aintent[], Intent intent, int j1, 
            MenuItem amenuitem[])
    {
        return b.addIntentOptions(i, l, i1, componentname, aintent, intent, j1, amenuitem);
    }

    public final q a(int i)
    {
        return a(b.add(i));
    }

    public final q a(int i, int l, int i1, int j1)
    {
        return a(b.add(i, l, i1, j1));
    }

    public final q a(int i, int l, int i1, CharSequence charsequence)
    {
        return a(b.add(i, l, i1, charsequence));
    }

    public final q a(CharSequence charsequence)
    {
        return a(b.add(charsequence));
    }

    public final void a()
    {
        b.clear();
    }

    public final void a(int i, boolean flag)
    {
        b.setGroupEnabled(i, flag);
    }

    public final void a(int i, boolean flag, boolean flag1)
    {
        b.setGroupCheckable(i, flag, flag1);
    }

    public final void a(boolean flag)
    {
        b.setQwertyMode(flag);
    }

    public final boolean a(int i, int l)
    {
        return b.performIdentifierAction(i, l);
    }

    public final boolean a(int i, KeyEvent keyevent)
    {
        return b.isShortcutKey(i, keyevent);
    }

    public final boolean a(int i, KeyEvent keyevent, int l)
    {
        return b.performShortcut(i, keyevent, l);
    }

    public final SubMenu b(int i)
    {
        return new k(this, b.addSubMenu(i));
    }

    public final SubMenu b(int i, int l, int i1, int j1)
    {
        return new k(this, b.addSubMenu(i, l, i1, j1));
    }

    public final SubMenu b(int i, int l, int i1, CharSequence charsequence)
    {
        return new k(this, b.addSubMenu(i, l, i1, charsequence));
    }

    public final SubMenu b(CharSequence charsequence)
    {
        return new k(this, b.addSubMenu(charsequence));
    }

    public final void b()
    {
        b.close();
    }

    public final void b(int i, boolean flag)
    {
        b.setGroupVisible(i, flag);
    }

    public final q c(int i)
    {
        if (b.findItem(i) == null)
        {
            return null;
        } else
        {
            return (q)c.get(i);
        }
    }

    public final boolean c()
    {
        return b.hasVisibleItems();
    }

    public final int d()
    {
        return b.size();
    }

    public final q d(int i)
    {
        MenuItem menuitem = b.getItem(i);
        if (menuitem == null)
        {
            return null;
        } else
        {
            return (q)c.get(menuitem.getItemId());
        }
    }

    public final void e(int i)
    {
        b.removeGroup(i);
    }

    public final void f(int i)
    {
        b.removeItem(i);
        c.remove(i);
    }
}
