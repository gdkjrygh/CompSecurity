// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            TransformedIterator, Iterators

static final class terator extends TransformedIterator
{

    final Function val$function;

    Object transform(Object obj)
    {
        return val$function.apply(obj);
    }

    terator(Iterator iterator, Function function1)
    {
        val$function = function1;
        super(iterator);
    }
}
