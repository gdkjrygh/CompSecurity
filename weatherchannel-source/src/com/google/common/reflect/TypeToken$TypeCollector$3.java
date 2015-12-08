// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;

// Referenced classes of package com.google.common.reflect:
//            TypeToken

class rwardingTypeCollector extends rwardingTypeCollector
{

    final d this$0;

    ImmutableList collectTypes(Iterable iterable)
    {
        com.google.common.collect.rwardingTypeCollector rwardingtypecollector = ImmutableList.builder();
        iterable = iterable.iterator();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            Object obj = iterable.next();
            if (!getRawType(obj).isInterface())
            {
                rwardingtypecollector.getRawType(obj);
            }
        } while (true);
        return super.collectTypes(rwardingtypecollector.d());
    }

    Iterable getInterfaces(Object obj)
    {
        return ImmutableSet.of();
    }

    rwardingTypeCollector(rwardingTypeCollector rwardingtypecollector1)
    {
        this$0 = this._cls0.this;
        super(rwardingtypecollector1);
    }
}
