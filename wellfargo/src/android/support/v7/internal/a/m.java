// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.c.a;
import android.support.v7.c.b;
import android.support.v7.internal.view.e;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.ag;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.internal.a:
//            i

public class m extends a
    implements j
{

    final android.support.v7.internal.a.i a;
    private final Context b;
    private final i c;
    private b d;
    private WeakReference e;

    public m(android.support.v7.internal.a.i k, Context context, b b1)
    {
        a = k;
        super();
        b = context;
        d = b1;
        c = (new i(context)).a(1);
        c.a(this);
    }

    public MenuInflater a()
    {
        return new e(b);
    }

    public void a(int k)
    {
        b(android.support.v7.internal.a.i.k(a).getResources().getString(k));
    }

    public void a(i k)
    {
        if (d == null)
        {
            return;
        } else
        {
            d();
            android.support.v7.internal.a.i.i(a).a();
            return;
        }
    }

    public void a(View view)
    {
        android.support.v7.internal.a.i.i(a).setCustomView(view);
        e = new WeakReference(view);
    }

    public void a(CharSequence charsequence)
    {
        android.support.v7.internal.a.i.i(a).setSubtitle(charsequence);
    }

    public void a(boolean flag)
    {
        super.a(flag);
        android.support.v7.internal.a.i.i(a).setTitleOptional(flag);
    }

    public boolean a(i k, MenuItem menuitem)
    {
        if (d != null)
        {
            return d.a(this, menuitem);
        } else
        {
            return false;
        }
    }

    public Menu b()
    {
        return c;
    }

    public void b(int k)
    {
        a(android.support.v7.internal.a.i.k(a).getResources().getString(k));
    }

    public void b(CharSequence charsequence)
    {
        android.support.v7.internal.a.i.i(a).setTitle(charsequence);
    }

    public void c()
    {
        if (a.a != this)
        {
            return;
        }
        if (!android.support.v7.internal.a.i.a(android.support.v7.internal.a.i.g(a), android.support.v7.internal.a.i.h(a), false))
        {
            a.b = this;
            a.c = d;
        } else
        {
            d.a(this);
        }
        d = null;
        a.n(false);
        android.support.v7.internal.a.i.i(a).b();
        android.support.v7.internal.a.i.j(a).a().sendAccessibilityEvent(32);
        android.support.v7.internal.a.i.f(a).setHideOnContentScrollEnabled(a.d);
        a.a = null;
    }

    public void d()
    {
        if (a.a != this)
        {
            return;
        }
        c.g();
        d.b(this, c);
        c.h();
        return;
        Exception exception;
        exception;
        c.h();
        throw exception;
    }

    public boolean e()
    {
        c.g();
        boolean flag = d.a(this, c);
        c.h();
        return flag;
        Exception exception;
        exception;
        c.h();
        throw exception;
    }

    public CharSequence f()
    {
        return android.support.v7.internal.a.i.i(a).getTitle();
    }

    public CharSequence g()
    {
        return android.support.v7.internal.a.i.i(a).getSubtitle();
    }

    public boolean h()
    {
        return android.support.v7.internal.a.i.i(a).d();
    }

    public View i()
    {
        if (e != null)
        {
            return (View)e.get();
        } else
        {
            return null;
        }
    }
}
