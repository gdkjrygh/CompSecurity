// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;

// Referenced classes of package com.google.common.collect:
//            FluentIterable

private static class 
    implements Function
{

    public FluentIterable apply(Iterable iterable)
    {
        return FluentIterable.from(iterable);
    }

    public volatile Object apply(Object obj)
    {
        return apply((Iterable)obj);
    }

    private ()
    {
    }
}
