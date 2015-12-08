// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.a.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public final class aw extends a
{

    private final a a;
    private final HashSet b = new HashSet();

    public aw(a a1)
    {
        a = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
    }

    public final void a()
    {
        b.clear();
        a.a();
        notifyDataSetChanged();
    }

    protected final void a(int i, Object obj)
    {
        if (!b.contains(obj))
        {
            b.add(obj);
            a.c(i, obj);
        }
    }

    protected final void a(Iterable iterable)
    {
        LinkedList linkedlist = new LinkedList();
        iterable = iterable.iterator();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            Object obj = iterable.next();
            if (!b.contains(obj))
            {
                b.add(obj);
                linkedlist.add(obj);
            }
        } while (true);
        a.b(linkedlist);
    }

    protected final void a(Object obj)
    {
        if (!b.contains(obj))
        {
            b.add(obj);
            a.d(obj);
        }
    }

    public final void a(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean areAllItemsEnabled()
    {
        return a.areAllItemsEnabled();
    }

    protected final void b(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final void b(Object obj)
    {
        b.remove(obj);
        a.b(obj);
        notifyDataSetChanged();
    }

    public final boolean c(Object obj)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (!b.contains(obj)) goto _L2; else goto _L1
_L1:
        int i = 0;
_L7:
        flag = flag1;
        if (i >= a.getCount()) goto _L2; else goto _L3
_L3:
        if (a.getItem(i) != obj) goto _L5; else goto _L4
_L4:
        a.b(obj);
        b.remove(obj);
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final int getCount()
    {
        return a.getCount();
    }

    public final Object getItem(int i)
    {
        return a.getItem(i);
    }

    public final long getItemId(int i)
    {
        return a.getItemId(i);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        return a.getView(i, view, viewgroup);
    }

    public final boolean isEmpty()
    {
        return a.isEmpty();
    }

    public final boolean isEnabled(int i)
    {
        return a.isEnabled(i);
    }
}
