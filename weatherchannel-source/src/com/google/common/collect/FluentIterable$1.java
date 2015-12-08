// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            FluentIterable

static final class nit> extends FluentIterable
{

    final Iterable val$iterable;

    public Iterator iterator()
    {
        return val$iterable.iterator();
    }

    (Iterable iterable1, Iterable iterable2)
    {
        val$iterable = iterable2;
        super(iterable1);
    }
}
