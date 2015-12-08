// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v7.a.h;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ad, n, ExpandedMenuView, ae, 
//            aj, r, o, af, 
//            s

public final class m
    implements ad, android.widget.AdapterView.OnItemClickListener
{

    Context a;
    LayoutInflater b;
    o c;
    ExpandedMenuView d;
    int e;
    int f;
    n g;
    private int h;
    private ae i;

    public m(int j, int k)
    {
        f = j;
        e = k;
    }

    static int a(m m1)
    {
        return m1.h;
    }

    public final af a(ViewGroup viewgroup)
    {
        if (g == null)
        {
            g = new n(this);
        }
        if (!g.isEmpty())
        {
            if (d == null)
            {
                d = (ExpandedMenuView)b.inflate(h.l, viewgroup, false);
                d.setAdapter(g);
                d.setOnItemClickListener(this);
            }
            return d;
        } else
        {
            return null;
        }
    }

    public final ListAdapter a()
    {
        if (g == null)
        {
            g = new n(this);
        }
        return g;
    }

    public final void a(Context context, o o1)
    {
        if (e == 0) goto _L2; else goto _L1
_L1:
        a = new ContextThemeWrapper(context, e);
        b = LayoutInflater.from(a);
_L4:
        c = o1;
        if (g != null)
        {
            g.notifyDataSetChanged();
        }
        return;
_L2:
        if (a != null)
        {
            a = context;
            if (b == null)
            {
                b = LayoutInflater.from(a);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(ae ae1)
    {
        i = ae1;
    }

    public final void a(o o1, boolean flag)
    {
        if (i != null)
        {
            i.a(o1, flag);
        }
    }

    public final boolean a(aj aj1)
    {
        if (!aj1.hasVisibleItems())
        {
            return false;
        }
        (new r(aj1)).a(null);
        if (i != null)
        {
            i.b(aj1);
        }
        return true;
    }

    public final boolean b(s s)
    {
        return false;
    }

    public final void c(boolean flag)
    {
        if (g != null)
        {
            g.notifyDataSetChanged();
        }
    }

    public final boolean c(s s)
    {
        return false;
    }

    public final boolean h()
    {
        return false;
    }

    public final void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
        c.a(g.a(j), 0);
    }
}
