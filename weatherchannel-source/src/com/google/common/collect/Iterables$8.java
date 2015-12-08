// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            FluentIterable, Iterables, Iterators

static final class le extends FluentIterable
{

    final Iterable val$fromIterable;
    final Function val$function;

    public Iterator iterator()
    {
        return Iterators.transform(val$fromIterable.iterator(), val$function);
    }

    le(Iterable iterable, Function function1)
    {
        val$fromIterable = iterable;
        val$function = function1;
        super();
    }
}
