// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.a;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.a:
//            e, g, d

public final class c extends e
{

    private final ListAdapter b;
    private final g c[];
    private final DataSetObserver d = new d(this);

    public transient c(ListAdapter listadapter, boolean flag, g ag[])
    {
        boolean flag1 = true;
        super();
        b = (ListAdapter)com.google.android.apps.youtube.common.fromguava.c.a(listadapter);
        if (ag == null || ag.length == 0)
        {
            listadapter = new g[listadapter.getViewTypeCount()];
            int i = 0;
            do
            {
                ag = listadapter;
                if (i >= listadapter.length)
                {
                    break;
                }
                listadapter[i] = new g((new StringBuilder("Auto ")).append(i).toString());
                i++;
            } while (true);
        } else
        {
            if (ag.length == listadapter.getViewTypeCount())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.apps.youtube.common.fromguava.c.a(flag, "viewTypes array size must match adapter's view type count");
            if (!Arrays.asList(ag).contains(null))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            com.google.android.apps.youtube.common.fromguava.c.a(flag, "viewTypes must not contain null");
        }
        c = ag;
        b.registerDataSetObserver(d);
    }

    public final View a(int i, View view, ViewGroup viewgroup)
    {
        return b.getView(i, view, viewgroup);
    }

    public final ListAdapter a()
    {
        return b;
    }

    public final Object a(int i)
    {
        return b.getItem(i);
    }

    protected final void a(Set set)
    {
        for (int i = 0; i < c.length; i++)
        {
            set.add(c[i]);
        }

    }

    public final int b()
    {
        return b.getCount();
    }

    public final boolean b(int i)
    {
        return b.isEnabled(i);
    }

    public final boolean c()
    {
        return b.hasStableIds();
    }

    protected final void d()
    {
        f();
    }

    public final g e(int i)
    {
        i = b.getItemViewType(i);
        if (i < 0)
        {
            return a;
        } else
        {
            return c[i];
        }
    }

    protected final void e()
    {
        f();
    }

    public final long f(int i)
    {
        return b.getItemId(i);
    }
}
