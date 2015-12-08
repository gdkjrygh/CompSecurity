// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.a:
//            f, e, g

public final class i extends BaseAdapter
    implements f
{

    private final Map a;
    private final boolean b;
    private e c;
    private boolean d;

    public i()
    {
        this(false);
    }

    private i(boolean flag)
    {
        a = new HashMap();
        a.put(e.a, Integer.valueOf(-1));
        b = false;
    }

    private void a(Set set)
    {
        boolean flag;
        if (!d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag, "setViewTypes called after view types are finalized");
        set = set.iterator();
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            g g1 = (g)set.next();
            if (g1 != null && !a.containsKey(g1))
            {
                a.put(g1, Integer.valueOf(a.size() - 1));
            }
        } while (true);
        d = true;
    }

    public final void a(e e1)
    {
        if (c == e1)
        {
            notifyDataSetChanged();
        }
    }

    public final boolean areAllItemsEnabled()
    {
        return false;
    }

    public final void b(e e1)
    {
        if (e1 != null)
        {
            HashSet hashset;
            boolean flag;
            if (!b || e1.c())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.apps.youtube.common.fromguava.c.a(flag, "outline must have stable IDs as required by this OutlinerAdapter");
            hashset = new HashSet();
            e1.a(hashset);
            if (d)
            {
                com.google.android.apps.youtube.common.fromguava.c.a(a.keySet().containsAll(hashset), "outline must not use unknown view types");
            } else
            {
                a(hashset);
            }
            e1.a(this);
        }
        if (c != null)
        {
            c.a(null);
        }
        c = e1;
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        if (c == null)
        {
            return 0;
        } else
        {
            return c.g();
        }
    }

    public final Object getItem(int j)
    {
        return c.a(j);
    }

    public final long getItemId(int j)
    {
        if (j >= getCount())
        {
            return -1L;
        } else
        {
            return c.f(j);
        }
    }

    public final int getItemViewType(int j)
    {
        g g1 = c.e(j);
        Integer integer = (Integer)a.get(g1);
        if (integer == null)
        {
            throw new IllegalStateException((new StringBuilder("Unknown view type \"")).append(g1).append("\" at position ").append(j).toString());
        } else
        {
            return integer.intValue();
        }
    }

    public final View getView(int j, View view, ViewGroup viewgroup)
    {
        return c.a(j, view, viewgroup);
    }

    public final int getViewTypeCount()
    {
        com.google.android.apps.youtube.common.fromguava.c.b(d, "OutlinerAdapter used before view types are known");
        return Math.max(1, a.size() - 1);
    }

    public final boolean hasStableIds()
    {
        return b || c != null && c.c();
    }

    public final boolean isEnabled(int j)
    {
        return c.b(j);
    }
}
