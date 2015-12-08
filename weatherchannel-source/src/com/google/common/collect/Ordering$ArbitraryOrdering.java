// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.common.collect:
//            Ordering, MapMaker, Platform

static class _cls1.apply extends Ordering
{

    private Map uids;

    public int compare(Object obj, Object obj1)
    {
        byte byte0 = -1;
        int i;
        if (obj == obj1)
        {
            i = 0;
        } else
        {
            i = byte0;
            if (obj != null)
            {
                if (obj1 == null)
                {
                    return 1;
                }
                int k = identityHashCode(obj);
                int l = identityHashCode(obj1);
                if (k != l)
                {
                    i = byte0;
                    if (k >= l)
                    {
                        return 1;
                    }
                } else
                {
                    int j = ((Integer)uids.get(obj)).compareTo((Integer)uids.get(obj1));
                    if (j == 0)
                    {
                        throw new AssertionError();
                    } else
                    {
                        return j;
                    }
                }
            }
        }
        return i;
    }

    int identityHashCode(Object obj)
    {
        return System.identityHashCode(obj);
    }

    public String toString()
    {
        return "Ordering.arbitrary()";
    }

    _cls1.this._cls0()
    {
        uids = Platform.tryWeakKeys(new MapMaker()).makeComputingMap(new Function() {

            final AtomicInteger counter = new AtomicInteger(0);
            final Ordering.ArbitraryOrdering this$0;

            public Integer apply(Object obj)
            {
                return Integer.valueOf(counter.getAndIncrement());
            }

            public volatile Object apply(Object obj)
            {
                return apply(obj);
            }

            
            {
                this$0 = Ordering.ArbitraryOrdering.this;
                super();
            }
        });
    }
}
