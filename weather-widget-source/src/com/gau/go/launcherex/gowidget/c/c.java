// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.c;

import android.os.Handler;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.c:
//            a, d, b, e

public class c
    implements a
{

    private final SparseArray a = new SparseArray();
    private final Handler b = new Handler();
    private final SparseArray c = new SparseArray();

    public c()
    {
    }

    static void a(c c1, int i)
    {
        c1.c(i);
    }

    private List b(int i)
    {
        List list = (List)a.get(i);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            a.put(i, obj);
        }
        return ((List) (obj));
    }

    private void c(int i)
    {
        c.delete(i);
    }

    private void d(int i)
    {
        d d1 = (d)c.get(i);
        if (d1 != null)
        {
            b.removeCallbacks(d1);
            c.delete(i);
        }
    }

    public void a(int i)
    {
        d(i);
    }

    public void a(int i, Object obj)
    {
        b b1 = new b();
        b1.a = i;
        b1.b = obj;
        obj = (List)a.get(i);
        if (obj != null)
        {
            for (obj = (new ArrayList(((java.util.Collection) (obj)))).iterator(); ((Iterator) (obj)).hasNext(); ((e)((Iterator) (obj)).next()).a(b1)) { }
        }
    }

    public void a(int i, Object obj, long l, boolean flag)
    {
        if (flag)
        {
            a(i);
        }
        if (l > 0L)
        {
            obj = new d(this, i, obj);
            c.put(i, obj);
            b.postDelayed(((Runnable) (obj)), l);
            return;
        } else
        {
            a(i, obj);
            return;
        }
    }

    public void a(e e1)
    {
        int i1 = a.size();
        ArrayList arraylist = new ArrayList();
        int i = 0;
        int k;
        int l;
        for (k = 0; i < i1; k = l)
        {
            List list = (List)a.valueAt(i);
            l = k;
            if (list.remove(e1))
            {
                l = k + 1;
            }
            if (list.size() == 0)
            {
                arraylist.add(Integer.valueOf(a.keyAt(i)));
            }
            i++;
        }

        if (k == 0)
        {
            throw new IllegalStateException("you have never register receiver here, do not call unregisterReceiver casually...");
        }
        int j;
        for (e1 = arraylist.iterator(); e1.hasNext(); a.remove(j))
        {
            j = ((Integer)e1.next()).intValue();
        }

    }

    public transient void a(e e1, int ai[])
    {
        if (ai.length < 1)
        {
            throw new IllegalArgumentException("you must define the messages you want to receiver!");
        }
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            List list = b(ai[i]);
            if (list.contains(e1))
            {
                throw new IllegalStateException("receiver already exists, do you forget to unregister it?");
            }
            list.add(e1);
        }

    }
}
