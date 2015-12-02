// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.TreeSet;

final class duu
    implements Iterator
{

    final dut a;
    private Iterator b;

    public duu(dut dut1)
    {
        a = dut1;
        super();
        b = dut.a(dut1).iterator();
    }

    private Comparable a()
    {
        return ((duv)b.next()).a();
    }

    public final boolean hasNext()
    {
        return b.hasNext();
    }

    public final Object next()
    {
        return a();
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }
}
