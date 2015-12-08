// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import java.util.Comparator;

// Referenced classes of package com.vladium.emma.report:
//            ItemComparator

private static final class m_comparators
    implements ItemComparator
{

    private final Comparator m_comparators[];

    public int compare(Object obj, Object obj1)
    {
        for (int i = 0; i < m_comparators.length; i++)
        {
            int j = m_comparators[i].compare(obj, obj1);
            if (j != 0)
            {
                return j;
            }
        }

        return 0;
    }

    (Comparator acomparator[])
    {
        m_comparators = acomparator;
    }
}
