// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.core.a:
//            a, k

public final class j extends BaseAdapter
    implements WrapperListAdapter
{

    private final a a;
    private final View b;
    private final boolean c = false;
    private boolean d;

    private j(a a1, boolean flag, View view, boolean flag1)
    {
        a = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1, "target cannot be null");
        b = (View)com.google.android.apps.youtube.common.fromguava.c.a(view, "paddingView cannot be null");
        a1.registerDataSetObserver(new k(this, (byte)0));
        if (flag1)
        {
            b();
            return;
        } else
        {
            c();
            return;
        }
    }

    private int a(int i)
    {
        int l = i;
        if (d)
        {
            l = i;
            if (c)
            {
                l = i - 1;
            }
        }
        return l;
    }

    public static j a(a a1, View view, boolean flag)
    {
        return new j(a1, false, view, false);
    }

    private boolean b(int i)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (d)
        {
            int l;
            if (c)
            {
                l = 0;
            } else
            {
                l = a.getCount();
            }
            flag = flag1;
            if (i == l)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final void a()
    {
        a.a();
    }

    public final void a(int i, Object obj)
    {
        a.c(0, obj);
    }

    public final void a(Iterable iterable)
    {
        a.b(iterable);
    }

    public final boolean areAllItemsEnabled()
    {
        return !d && a.areAllItemsEnabled();
    }

    public final void b()
    {
        boolean flag = d;
        d = true;
        if (!flag)
        {
            notifyDataSetChanged();
        }
    }

    public final void c()
    {
        boolean flag = d;
        d = false;
        if (flag)
        {
            notifyDataSetChanged();
        }
    }

    public final int getCount()
    {
        int l = a.getCount();
        int i;
        if (d)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + l;
    }

    public final Object getItem(int i)
    {
        if (b(i))
        {
            return null;
        } else
        {
            return a.getItem(a(i));
        }
    }

    public final long getItemId(int i)
    {
        if (b(i))
        {
            return -1L;
        } else
        {
            return a.getItemId(a(i));
        }
    }

    public final int getItemViewType(int i)
    {
        if (b(i))
        {
            return a.getViewTypeCount();
        } else
        {
            return a.getItemViewType(a(i));
        }
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (b(i))
        {
            return b;
        } else
        {
            return a.getView(a(i), view, viewgroup);
        }
    }

    public final int getViewTypeCount()
    {
        return a.getViewTypeCount() + 1;
    }

    public final ListAdapter getWrappedAdapter()
    {
        return a;
    }

    public final boolean hasStableIds()
    {
        return a.hasStableIds();
    }

    public final boolean isEnabled(int i)
    {
        if (b(i))
        {
            return false;
        } else
        {
            return a.isEnabled(a(i));
        }
    }
}
