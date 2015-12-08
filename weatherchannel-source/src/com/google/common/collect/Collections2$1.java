// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Collection;

// Referenced classes of package com.google.common.collect:
//            Collections2

static final class val.collection
    implements Function
{

    final Collection val$collection;

    public Object apply(Object obj)
    {
        Object obj1 = obj;
        if (obj == val$collection)
        {
            obj1 = "(this Collection)";
        }
        return obj1;
    }

    (Collection collection1)
    {
        val$collection = collection1;
        super();
    }
}
