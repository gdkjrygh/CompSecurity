// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            t

public final class u
{

    private t a;
    private t b;
    private List c;

    public u(t t1, t t2)
    {
        a = t1;
        b = t2;
    }

    public u(List list)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(list);
        for (list = list.iterator(); list.hasNext();)
        {
            t t1 = (t)list.next();
            if (t1.d())
            {
                b = t1;
            } else
            {
                a = t1;
            }
        }

    }

    private List h()
    {
        if (c == null)
        {
            LinkedList linkedlist = new LinkedList();
            if (a != null)
            {
                linkedlist.add(a);
            }
            if (b != null)
            {
                linkedlist.add(b);
            }
            c = linkedlist;
        }
        return c;
    }

    public final t a()
    {
        return a;
    }

    public final t b()
    {
        return b;
    }

    public final FormatStream c()
    {
        if (a != null && a.g())
        {
            return a.a();
        } else
        {
            return null;
        }
    }

    public final FormatStream d()
    {
        if (b != null && b.g())
        {
            return b.a();
        } else
        {
            return null;
        }
    }

    public final boolean e()
    {
        return h().isEmpty();
    }

    public final long f()
    {
        Iterator iterator = h().iterator();
        long l;
        for (l = 0L; iterator.hasNext(); l += ((t)iterator.next()).e()) { }
        return l;
    }

    public final long g()
    {
        Iterator iterator = h().iterator();
        long l;
        for (l = 0L; iterator.hasNext(); l += ((t)iterator.next()).f()) { }
        return l;
    }
}
