// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public final class dut
{

    private final int a = 50;
    private Queue b;
    private TreeSet c;

    public dut()
    {
        b = new LinkedList();
        c = new TreeSet();
    }

    static TreeSet a(dut dut1)
    {
        return dut1.c;
    }

    private void d()
    {
        duv duv1 = (duv)b.poll();
        c.remove(duv1);
    }

    public final Iterator a()
    {
        return new duu(this);
    }

    public final void a(Comparable comparable)
    {
        if (a > 0 && b.size() == a)
        {
            d();
        }
        comparable = new duv(this, comparable, (byte)0);
        c.add(comparable);
        b.add(comparable);
    }

    public final int b()
    {
        return b.size();
    }

    public final Comparable c()
    {
        if (c.size() - 1 < 0)
        {
            return null;
        } else
        {
            return ((duv)c.iterator().next()).a();
        }
    }
}
