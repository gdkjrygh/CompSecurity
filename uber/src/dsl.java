// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class dsl extends dsu
{

    protected Context a;
    private final List b;
    private final List c;
    private final Set d = new HashSet();
    private final LayoutInflater e;

    public dsl(Context context, List list, List list1)
    {
        super(context);
        a = context;
        e = LayoutInflater.from(context);
        c = list;
        b = list1;
        context = new dsm(this, (byte)0);
        for (list = c.iterator(); list.hasNext(); ((ListAdapter)list.next()).registerDataSetObserver(context)) { }
        notifyDataSetChanged();
    }

    private dsn d(int i)
    {
        int i1 = c.size();
        int k = 0;
        for (int j = 0; j < i1; j++)
        {
            ListAdapter listadapter = (ListAdapter)c.get(j);
            int l = listadapter.getCount() + k;
            if (i < l)
            {
                return new dsn(listadapter, i - k);
            }
            k = l;
        }

        return null;
    }

    public final int a(int i)
    {
        int j = 0;
        int k = 0;
        for (; j < c.size(); j++)
        {
            k += ((ListAdapter)c.get(j)).getCount();
            if (i < k)
            {
                return j;
            }
        }

        return -1;
    }

    public final View a(int i, View view, ViewGroup viewgroup)
    {
        dsn dsn1 = d(i);
        return dsn.b(dsn1).getView(dsn.a(dsn1), view, viewgroup);
    }

    public final void a(ListAdapter listadapter)
    {
        d.add(listadapter);
        notifyDataSetChanged();
    }

    public boolean areAllItemsEnabled()
    {
        Iterator iterator = c.iterator();
        boolean flag;
        for (flag = true; iterator.hasNext(); flag = ((ListAdapter)iterator.next()).areAllItemsEnabled() & flag) { }
        return flag;
    }

    public View b(int i, View view, ViewGroup viewgroup)
    {
        if (b == null || b.isEmpty() || d.contains(c.get(i)))
        {
            return null;
        }
        View view1 = view;
        if (view == null)
        {
            view1 = e.inflate(0x7f030089, viewgroup, false);
        }
        ((TextView)view1.findViewById(0x1020014)).setText((CharSequence)b.get(i));
        return view1;
    }

    public final boolean b(int i)
    {
        return c.isEmpty() || c.size() <= i || ((ListAdapter)c.get(i)).isEmpty();
    }

    public final volatile void c(int i)
    {
        super.c(i);
    }

    public int getCount()
    {
        Iterator iterator = c.iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = ((ListAdapter)iterator.next()).getCount() + i) { }
        return i;
    }

    public Object getItem(int i)
    {
        dsn dsn1 = d(i);
        if (dsn1 == null)
        {
            return null;
        } else
        {
            return dsn.b(dsn1).getItem(dsn.a(dsn1));
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        dsn dsn1 = d(i);
        Iterator iterator = c.iterator();
        i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ListAdapter listadapter = (ListAdapter)iterator.next();
            if (listadapter == dsn.b(dsn1))
            {
                break;
            }
            i = listadapter.getViewTypeCount() + i;
        } while (true);
        int k = dsn.b(dsn1).getItemViewType(dsn.a(dsn1));
        int j = k;
        if (k >= 0)
        {
            j = k + i;
        }
        return j;
    }

    public int getViewTypeCount()
    {
        Iterator iterator = c.iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = ((ListAdapter)iterator.next()).getViewTypeCount() + i) { }
        return i;
    }

    public boolean isEnabled(int i)
    {
        dsn dsn1 = d(i);
        return dsn.b(dsn1).isEnabled(dsn.a(dsn1));
    }
}
