// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.support.v4.b.a.a;
import android.support.v4.e.n;
import android.support.v7.c.b;
import android.support.v7.internal.view.menu.ab;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view:
//            c

public class d
    implements b
{

    final android.view.ActionMode.Callback a;
    final Context b;
    final ArrayList c = new ArrayList();
    final n d = new n();

    public d(Context context, android.view.ActionMode.Callback callback)
    {
        b = context;
        a = callback;
    }

    private Menu a(Menu menu)
    {
        Menu menu2 = (Menu)d.get(menu);
        Menu menu1 = menu2;
        if (menu2 == null)
        {
            menu1 = ab.a(b, (a)menu);
            d.put(menu, menu1);
        }
        return menu1;
    }

    public void a(android.support.v7.c.a a1)
    {
        a.onDestroyActionMode(b(a1));
    }

    public boolean a(android.support.v7.c.a a1, Menu menu)
    {
        return a.onCreateActionMode(b(a1), a(menu));
    }

    public boolean a(android.support.v7.c.a a1, MenuItem menuitem)
    {
        return a.onActionItemClicked(b(a1), ab.a(b, (android.support.v4.b.a.b)menuitem));
    }

    public ActionMode b(android.support.v7.c.a a1)
    {
        int j = c.size();
        for (int i = 0; i < j; i++)
        {
            c c1 = (c)c.get(i);
            if (c1 != null && c1.b == a1)
            {
                return c1;
            }
        }

        a1 = new c(b, a1);
        c.add(a1);
        return a1;
    }

    public boolean b(android.support.v7.c.a a1, Menu menu)
    {
        return a.onPrepareActionMode(b(a1), a(menu));
    }
}
