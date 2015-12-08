// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            AbstractIterator, Collections2, ImmutableList

private static class j extends AbstractIterator
{

    final int c[];
    int j;
    final List list;
    final int o[];

    void calculateNextPermutation()
    {
        int i;
        j = list.size() - 1;
        i = 0;
        if (j != -1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k;
label0:
        do
        {
label1:
            {
                k = c[j] + o[j];
                if (k < 0)
                {
                    switchDirection();
                    continue;
                }
                if (k != j + 1)
                {
                    break label1;
                }
                if (j == 0)
                {
                    break label0;
                }
                i++;
                switchDirection();
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        Collections.swap(list, (j - c[j]) + i, (j - k) + i);
        c[j] = k;
        return;
    }

    protected volatile Object computeNext()
    {
        return computeNext();
    }

    protected List computeNext()
    {
        if (j <= 0)
        {
            return (List)endOfData();
        } else
        {
            ImmutableList immutablelist = ImmutableList.copyOf(list);
            calculateNextPermutation();
            return immutablelist;
        }
    }

    void switchDirection()
    {
        o[j] = -o[j];
        j = j - 1;
    }

    (List list1)
    {
        list = new ArrayList(list1);
        int i = list1.size();
        c = new int[i];
        o = new int[i];
        Arrays.fill(c, 0);
        Arrays.fill(o, 1);
        j = 0x7fffffff;
    }
}
