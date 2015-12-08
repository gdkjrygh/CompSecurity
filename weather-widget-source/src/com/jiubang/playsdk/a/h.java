// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.a;

import com.android.a.p;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.jiubang.playsdk.a:
//            l, d

class h
{

    final d a;
    private final p b;
    private final LinkedList c = new LinkedList();

    public h(d d, p p1, l l1)
    {
        a = d;
        super();
        b = p1;
        c.add(l1);
    }

    static LinkedList a(h h1)
    {
        return h1.c;
    }

    static p b(h h1)
    {
        return h1.b;
    }

    private boolean b(l l1)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            if (((l)iterator.next()).a == l1.a)
            {
                return true;
            }
        }

        return false;
    }

    public String a()
    {
        return b.b().toString();
    }

    public void a(l l1)
    {
        if (!b(l1))
        {
            c.add(l1);
        }
    }

    public boolean a(Object obj)
    {
        if (obj.equals(b.b()))
        {
            b.g();
            return true;
        } else
        {
            return false;
        }
    }
}
