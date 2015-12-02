// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

public final class ied
    implements icc
{

    final Iterable a;

    public ied(Iterable iterable)
    {
        if (iterable == null)
        {
            throw new NullPointerException("iterable must not be null");
        } else
        {
            a = iterable;
            return;
        }
    }

    private void a(ick ick1)
    {
        Iterator iterator = a.iterator();
        if (!iterator.hasNext() && !ick1.c())
        {
            ick1.a();
            return;
        } else
        {
            ick1.a(new iee(ick1, iterator, (byte)0));
            return;
        }
    }

    public final void call(Object obj)
    {
        a((ick)obj);
    }
}
