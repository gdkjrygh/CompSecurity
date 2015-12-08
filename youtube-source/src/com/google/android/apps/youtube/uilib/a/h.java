// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.uilib.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.fromguava.d;
import com.google.android.youtube.a.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.uilib.a:
//            e, f, j, g

public final class h extends BaseAdapter
    implements e
{

    private final Map a = new LinkedHashMap();
    private final LinkedHashSet b = new LinkedHashSet();
    private final List c = new ArrayList();
    private final Map d = new HashMap();

    public h()
    {
    }

    private void a(int i, Object obj)
    {
        b(i, obj);
        notifyDataSetChanged();
    }

    private void a(int i, Collection collection)
    {
        collection = collection.iterator();
        while (collection.hasNext()) 
        {
            int k;
            if (b(i, collection.next()))
            {
                k = 1;
            } else
            {
                k = 0;
            }
            i += k;
        }
        notifyDataSetChanged();
    }

    private boolean b(int i)
    {
        return getItemViewType(i) == -1;
    }

    private boolean b(int i, Object obj)
    {
        if (a.containsKey(obj.getClass()))
        {
            c.add(i, obj);
            return true;
        } else
        {
            L.b((new StringBuilder("Missing presenter for ")).append(obj.getClass().getSimpleName()).toString());
            return false;
        }
    }

    public final Object a(int i)
    {
        Object obj = c.remove(i);
        notifyDataSetChanged();
        return obj;
    }

    public final Set a()
    {
        return Collections.unmodifiableSet(b);
    }

    public final void a(d d1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(d1);
        LinkedList linkedlist = new LinkedList();
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = iterator.next();
            if (d1.a(obj))
            {
                linkedlist.add(obj);
            }
        } while (true);
        if (linkedlist.size() > 0)
        {
            c.removeAll(linkedlist);
            notifyDataSetChanged();
        }
    }

    public final void a(Class class1, j j1)
    {
        a.put(class1, j1);
        b.add(class1);
    }

    public final void a(Object obj)
    {
        a(getCount(), obj);
    }

    public final void a(Object obj, d d1)
    {
        int i = getCount();
        com.google.android.apps.youtube.common.fromguava.c.a(d1);
        if (d1.a(obj))
        {
            a(i, obj);
        }
    }

    public final void a(Collection collection)
    {
        a(getCount(), collection);
    }

    public final void a(Collection collection, d d1)
    {
        int i = getCount();
        com.google.android.apps.youtube.common.fromguava.c.a(d1);
        LinkedList linkedlist = new LinkedList();
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            Object obj = collection.next();
            if (d1.a(obj))
            {
                linkedlist.add(obj);
            }
        } while (true);
        if (linkedlist.size() > 0)
        {
            a(i, ((Collection) (linkedlist)));
        }
    }

    public final void b()
    {
        c.clear();
        notifyDataSetChanged();
    }

    public final void b(Class class1, j j1)
    {
        a.put(class1, j1);
    }

    public final int getCount()
    {
        return c.size();
    }

    public final Object getItem(int i)
    {
        return c.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final int getItemViewType(int i)
    {
        Class class1 = getItem(i).getClass();
        if (b.contains(class1))
        {
            Iterator iterator = b.iterator();
            for (i = 0; iterator.hasNext(); i++)
            {
                if ((Class)iterator.next() == class1)
                {
                    return i;
                }
            }

        }
        return -1;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj = getItem(i);
        View view1 = view;
        if (b(i))
        {
            view1 = (View)d.get(obj);
        }
        view = null;
        if (view1 != null)
        {
            view = (f)view1.getTag(b.a);
        }
        if (view == null)
        {
            view = new f();
        }
        view.c(viewgroup.getWidth() - viewgroup.getPaddingLeft() - viewgroup.getPaddingRight());
        view.a(i);
        view.b(getCount());
        if (view1 == null)
        {
            viewgroup = obj.getClass();
            viewgroup = ((j)a.get(viewgroup)).a();
            view1 = viewgroup.a(view, obj);
            view1.setTag(b.b, viewgroup);
            view1.setTag(b.a, view);
            if (b(i))
            {
                d.put(obj, view1);
            }
            return view1;
        } else
        {
            com.google.android.apps.youtube.common.fromguava.c.a(view1);
            return ((g)view1.getTag(b.b)).a(view, obj);
        }
    }

    public final int getViewTypeCount()
    {
        return b.size();
    }
}
