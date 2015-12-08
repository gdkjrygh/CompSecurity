// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.a;

import com.vividsolutions.jts.b.b;
import com.vividsolutions.jts.b.c;
import com.vividsolutions.jts.b.d;
import com.vividsolutions.jts.b.o;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

// Referenced classes of package com.vividsolutions.jts.g.a:
//            j

public final class e
    implements Comparable
{

    private j a;
    private List b;
    private List c;
    private Coordinate d;
    private h e;

    public e()
    {
        b = new ArrayList();
        c = new ArrayList();
        d = null;
        e = null;
        a = new j();
    }

    private static void a(b b1)
    {
        b b2 = b1.f();
        b2.a(1, b1.a(2));
        b2.a(2, b1.a(1));
    }

    private void a(o o1, Stack stack)
    {
        o1.d(true);
        c.add(o1);
        o1 = ((c)o1.b()).f();
        do
        {
            if (!o1.hasNext())
            {
                break;
            }
            Object obj = (b)o1.next();
            b.add(obj);
            obj = ((b) (obj)).f().q();
            if (!((o) (obj)).q())
            {
                stack.push(obj);
            }
        } while (true);
    }

    private void b(o o1)
    {
        Object obj = null;
        Iterator iterator = ((c)o1.b()).f();
        b b1;
        do
        {
            b1 = obj;
            if (!iterator.hasNext())
            {
                break;
            }
            b1 = (b)iterator.next();
        } while (!b1.c() && !b1.f().c());
        if (b1 == null)
        {
            throw new w((new StringBuilder("unable to find edge to compute depths at ")).append(o1.a()).toString());
        }
        ((c)o1.b()).a(b1);
        b b2;
        for (o1 = ((c)o1.b()).f(); o1.hasNext(); a(b2))
        {
            b2 = (b)o1.next();
            b2.b(true);
        }

    }

    public final List a()
    {
        return b;
    }

    public final void a(int i)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((b)iterator.next()).b(false)) { }
        b b1 = a.a();
        b1.q();
        b1.l();
        b1.b(2, i);
        a(b1);
        HashSet hashset = new HashSet();
        LinkedList linkedlist = new LinkedList();
        o o1 = b1.q();
        linkedlist.addLast(o1);
        hashset.add(o1);
        b1.b(true);
        while (!linkedlist.isEmpty()) 
        {
            Object obj = (o)linkedlist.removeFirst();
            hashset.add(obj);
            b(((o) (obj)));
            obj = ((c)((o) (obj)).b()).f();
            while (((Iterator) (obj)).hasNext()) 
            {
                Object obj1 = ((b)((Iterator) (obj)).next()).f();
                if (!((b) (obj1)).c())
                {
                    obj1 = ((b) (obj1)).q();
                    if (!hashset.contains(obj1))
                    {
                        linkedlist.addLast(obj1);
                        hashset.add(obj1);
                    }
                }
            }
        }
    }

    public final void a(o o1)
    {
        Stack stack = new Stack();
        stack.add(o1);
        for (; !stack.empty(); a((o)stack.pop(), stack)) { }
        a.a(b);
        d = a.b();
    }

    public final List b()
    {
        return c;
    }

    public final h c()
    {
        if (e == null)
        {
            h h1 = new h();
            for (Iterator iterator = b.iterator(); iterator.hasNext();)
            {
                Coordinate acoordinate[] = ((b)iterator.next()).a().b();
                int i = 0;
                while (i < acoordinate.length - 1) 
                {
                    h1.a(acoordinate[i]);
                    i++;
                }
            }

            e = h1;
        }
        return e;
    }

    public final int compareTo(Object obj)
    {
        obj = (e)obj;
        if (d.x < ((e) (obj)).d.x)
        {
            return -1;
        }
        return d.x <= ((e) (obj)).d.x ? 0 : 1;
    }

    public final Coordinate d()
    {
        return d;
    }

    public final void e()
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            b b1 = (b)iterator.next();
            if (b1.a(2) > 0 && b1.a(1) <= 0 && !b1.k())
            {
                b1.a(true);
            }
        } while (true);
    }
}
