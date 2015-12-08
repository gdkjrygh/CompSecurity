// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            Iterables

static final class 
    implements Function
{

    public volatile Object apply(Object obj)
    {
        return apply((Iterable)obj);
    }

    public Iterator apply(Iterable iterable)
    {
        return iterable.iterator();
    }

    ()
    {
    }
}
