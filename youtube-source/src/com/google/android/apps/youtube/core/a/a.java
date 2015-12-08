// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.a;

import android.widget.BaseAdapter;
import com.google.android.apps.youtube.common.fromguava.d;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class a extends BaseAdapter
{

    final ArrayList c = new ArrayList();

    public a()
    {
    }

    public void a()
    {
        if (!c.isEmpty())
        {
            c.clear();
            notifyDataSetChanged();
        }
    }

    protected void a(int i, Object obj)
    {
        c.add(i, obj);
    }

    public final void a(d d1)
    {
        boolean flag = false;
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (d1.a(iterator.next()))
            {
                iterator.remove();
                flag = true;
            }
        } while (true);
        if (flag)
        {
            notifyDataSetChanged();
        }
    }

    protected void a(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); a(iterable.next())) { }
    }

    protected void a(Object obj)
    {
        c.add(obj);
    }

    public void a(Object obj, Object obj1)
    {
        int i = c.indexOf(obj);
        if (i != -1)
        {
            c.set(i, obj1);
            notifyDataSetChanged();
        }
    }

    protected void b(int i, Object obj)
    {
        c.set(i, obj);
    }

    public void b(Iterable iterable)
    {
        a(iterable);
        notifyDataSetChanged();
    }

    public void b(Object obj)
    {
        if (c.remove(obj))
        {
            notifyDataSetChanged();
        }
    }

    public void c(int i, Object obj)
    {
        a(i, obj);
        notifyDataSetChanged();
    }

    public boolean c(Object obj)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            if (iterator.next() == obj)
            {
                iterator.remove();
                notifyDataSetChanged();
                return true;
            }
        }

        return false;
    }

    public final void d(Object obj)
    {
        a(obj);
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return c.size();
    }

    public Object getItem(int i)
    {
        if (i < c.size())
        {
            return c.get(i);
        } else
        {
            throw new IndexOutOfBoundsException((new StringBuilder("index ")).append(i).append("should be < than ").append(c.size()).toString());
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }
}
