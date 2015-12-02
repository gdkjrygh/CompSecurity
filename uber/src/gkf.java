// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gkf
{

    private final List a = new ArrayList();

    public gkf()
    {
    }

    private gkf a(Iterator iterator)
    {
        for (; iterator.hasNext(); a(iterator.next())) { }
        return this;
    }

    public final gke a()
    {
        return new gke(a, (byte)0);
    }

    public final gkf a(Iterable iterable)
    {
        a(iterable.iterator());
        return this;
    }

    public final gkf a(Object obj)
    {
        gjz.a(obj);
        a.add(obj);
        return this;
    }

    public final transient gkf a(Object aobj[])
    {
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            a(aobj[i]);
        }

        return this;
    }
}
