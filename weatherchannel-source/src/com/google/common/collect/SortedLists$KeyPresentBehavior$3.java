// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            SortedLists

static final class nit> extends nit>
{

    int resultIndex(Comparator comparator, Object obj, List list, int i)
    {
        int j;
        for (j = 0; j < i;)
        {
            int k = j + i >>> 1;
            if (comparator.compare(list.get(k), obj) < 0)
            {
                j = k + 1;
            } else
            {
                i = k;
            }
        }

        return j;
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
