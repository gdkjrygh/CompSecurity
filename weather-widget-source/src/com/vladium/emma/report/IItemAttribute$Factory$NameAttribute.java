// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import java.util.Comparator;

// Referenced classes of package com.vladium.emma.report:
//            IItemAttribute, IItem

private static final class t> extends t>
    implements IItemAttribute
{
    private static final class NameComparator
        implements Comparator
    {

        public int compare(Object obj, Object obj1)
        {
            obj = (IItem)obj;
            obj1 = (IItem)obj1;
            return ((IItem) (obj)).getName().compareTo(((IItem) (obj1)).getName());
        }

        private NameComparator()
        {
        }

        NameComparator(IItemAttribute._cls1 _pcls1)
        {
            this();
        }
    }


    private final Comparator m_comparator = new NameComparator(null);

    public Comparator comparator()
    {
        return m_comparator;
    }

    public void format(IItem iitem, StringBuffer stringbuffer)
    {
        stringbuffer.append(iitem.getName());
    }

    public boolean passes(IItem iitem, int i)
    {
        return true;
    }

    NameComparator(String s)
    {
        super(s);
    }
}
