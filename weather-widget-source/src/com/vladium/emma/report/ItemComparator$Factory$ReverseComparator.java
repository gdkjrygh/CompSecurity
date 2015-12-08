// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import java.util.Comparator;

// Referenced classes of package com.vladium.emma.report:
//            ItemComparator

private static final class m_comparator
    implements ItemComparator
{

    private final Comparator m_comparator;

    public int compare(Object obj, Object obj1)
    {
        return m_comparator.compare(obj1, obj);
    }

    (Comparator comparator)
    {
        m_comparator = comparator;
    }
}
