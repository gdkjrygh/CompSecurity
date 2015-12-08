// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.internal.view.b;
import android.support.v7.internal.view.menu.ah;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            d, n, ActionBarActivity, i, 
//            ActionBar

class h extends d
{

    Menu d;

    h(ActionBarActivity actionbaractivity)
    {
        super(actionbaractivity);
    }

    public ActionBar a()
    {
        return new n(a, a);
    }

    public final void a(int j)
    {
        a.a(j);
    }

    public final void a(Configuration configuration)
    {
    }

    public final void a(Bundle bundle)
    {
        if ("splitActionBarWhenNarrow".equals(i()))
        {
            a.getWindow().setUiOptions(1, 1);
        }
        super.a(bundle);
        if (b)
        {
            a.requestWindowFeature(8);
        }
        if (c)
        {
            a.requestWindowFeature(9);
        }
        bundle = a.getWindow();
        bundle.setCallback(new i(this, bundle.getCallback()));
    }

    public final void a(ActionMode actionmode)
    {
        ActionBarActivity actionbaractivity = a;
        new b(j(), actionmode);
    }

    public final void a(View view)
    {
        a.a(view);
    }

    public final void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        a.a(view, layoutparams);
    }

    public final void a(CharSequence charsequence)
    {
    }

    public final boolean a(int j, Menu menu)
    {
        if (j == 0 || j == 8)
        {
            if (d == null)
            {
                d = ah.a(menu);
            }
            return a.a(j, d);
        } else
        {
            return a.a(j, menu);
        }
    }

    public final boolean a(int j, MenuItem menuitem)
    {
        MenuItem menuitem1 = menuitem;
        if (j == 0)
        {
            menuitem1 = ah.a(menuitem);
        }
        return a.a(j, menuitem1);
    }

    public final boolean a(int j, View view, Menu menu)
    {
        if (j == 0 || j == 8)
        {
            return a.a(j, view, d);
        } else
        {
            return a.a(j, view, menu);
        }
    }

    public final View b(int j)
    {
        return null;
    }

    public final void b(ActionMode actionmode)
    {
        ActionBarActivity actionbaractivity = a;
        new b(j(), actionmode);
    }

    public final void b(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        a.b(view, layoutparams);
    }

    public final void d()
    {
    }

    public final void e()
    {
    }

    public final void f()
    {
        d = null;
    }

    public final boolean g()
    {
        return false;
    }

    public final void h()
    {
        ActionBarActivity actionbaractivity = a;
    }
}
