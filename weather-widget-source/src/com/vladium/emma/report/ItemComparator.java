// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import java.util.Comparator;

// Referenced classes of package com.vladium.emma.report:
//            IItemAttribute

public interface ItemComparator
    extends Comparator
{
    public static abstract class Factory
    {

        public static ItemComparator create(int ai[], int i)
        {
            if (ai == null)
            {
                throw new IllegalArgumentException("null input: attributeIDsWithDir");
            }
            if (ai.length == 0)
            {
                return ItemComparator.NULL_COMPARATOR;
            }
            Comparator acomparator[] = new Comparator[ai.length >> 1];
            for (int j = 0; j < ai.length; j += 2)
            {
                Comparator comparator = IItemAttribute.Factory.getAttribute(ai[j], i).comparator();
                Object obj = comparator;
                if (ai[j + 1] < 0)
                {
                    obj = new ReverseComparator(comparator);
                }
                acomparator[j >> 1] = ((Comparator) (obj));
            }

            return new CompositeComparator(acomparator);
        }

        public Factory()
        {
        }
    }

    private static final class Factory.CompositeComparator
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

        Factory.CompositeComparator(Comparator acomparator[])
        {
            m_comparators = acomparator;
        }
    }

    private static final class Factory.NullComparator
        implements ItemComparator
    {

        public int compare(Object obj, Object obj1)
        {
            return 0;
        }

        private Factory.NullComparator()
        {
        }

    }

    private static final class Factory.ReverseComparator
        implements ItemComparator
    {

        private final Comparator m_comparator;

        public int compare(Object obj, Object obj1)
        {
            return m_comparator.compare(obj1, obj);
        }

        Factory.ReverseComparator(Comparator comparator)
        {
            m_comparator = comparator;
        }
    }


    public static final ItemComparator NULL_COMPARATOR = new Factory.NullComparator();

}
