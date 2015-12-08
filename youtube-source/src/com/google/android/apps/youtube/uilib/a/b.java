// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.uilib.a;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.uilib.a:
//            c, d, e

public final class b extends BaseAdapter
{

    private final List a = new ArrayList();
    private final LinkedHashSet b = new LinkedHashSet();
    private final DataSetObserver c = new c(this);
    private int d;

    public b()
    {
        d = 0;
    }

    static void a(b b1)
    {
        b1.c();
    }

    private d b(int i)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            d d1 = (d)iterator.next();
            if (com.google.android.apps.youtube.uilib.a.d.a(d1, i))
            {
                return d1;
            }
        }

        return null;
    }

    private void c()
    {
        Iterator iterator = a.iterator();
        d d1;
        int i;
        for (i = 0; iterator.hasNext(); i = d1.a.getCount() + i)
        {
            d1 = (d)iterator.next();
            d1.b = i;
        }

        d = i;
    }

    public final int a()
    {
        return a.size() - 1;
    }

    public final void a(int i)
    {
        ((d)a.get(i)).a.unregisterDataSetObserver(c);
        a.remove(i);
    }

    public final void a(e e1)
    {
        a.add(new d(e1, (byte)0));
        e1.registerDataSetObserver(c);
        c();
        b.addAll(e1.a());
        notifyDataSetChanged();
    }

    public final void b()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((d)iterator.next()).a.unregisterDataSetObserver(c)) { }
        a.clear();
        b.clear();
        c();
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return d;
    }

    public final Object getItem(int i)
    {
        d d1 = b(i);
        return d1.a.getItem(com.google.android.apps.youtube.uilib.a.d.c(d1, i));
    }

    public final long getItemId(int i)
    {
        d d1 = b(i);
        return d1.a.getItemId(com.google.android.apps.youtube.uilib.a.d.c(d1, i));
    }

    public final int getItemViewType(int i)
    {
        Object obj = b(i);
        if (!com.google.android.apps.youtube.uilib.a.d.b(((d) (obj)), i)) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
label0:
        {
            obj = ((d) (obj)).a.getItem(com.google.android.apps.youtube.uilib.a.d.c(((d) (obj)), i));
            if (obj == null)
            {
                return -1;
            }
            obj = obj.getClass();
            if (!b.contains(obj))
            {
                break label0;
            }
            Iterator iterator = b.iterator();
            i = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                j = i;
                if ((Class)iterator.next() == obj)
                {
                    break;
                }
                i++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        d d1 = b(i);
        return d1.a.getView(com.google.android.apps.youtube.uilib.a.d.c(d1, i), view, viewgroup);
    }

    public final int getViewTypeCount()
    {
        return Math.max(b.size(), 1);
    }
}
