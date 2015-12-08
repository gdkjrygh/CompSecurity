// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.util.Comparator;

// Referenced classes of package com.vladium.emma.report:
//            IItemAttribute, IItem

private static final class m_nFormat extends m_nFormat
    implements IItemAttribute
{
    private final class FractionComparator
        implements Comparator
    {

        final IItemAttribute.Factory.FractionAttribute this$0;

        public int compare(Object obj, Object obj1)
        {
            obj = (IItem)obj;
            obj1 = (IItem)obj1;
            double d = ((IItem) (obj)).getAggregate(m_numeratorAggregateID);
            double d1 = ((IItem) (obj)).getAggregate(m_denominatorAggregateID);
            double d2 = ((IItem) (obj1)).getAggregate(m_numeratorAggregateID);
            d = d * (double)((IItem) (obj1)).getAggregate(m_denominatorAggregateID) - d2 * d1;
            if (d > 0.0D)
            {
                return 1;
            }
            return d >= 0.0D ? 0 : -1;
        }

        private FractionComparator()
        {
            this$0 = IItemAttribute.Factory.FractionAttribute.this;
            super();
        }

        FractionComparator(IItemAttribute._cls1 _pcls1)
        {
            this();
        }
    }


    private final Comparator m_comparator = new FractionComparator(null);
    final int m_denominatorAggregateID;
    private final FieldPosition m_fieldPosition = new FieldPosition(0);
    private final DecimalFormat m_format = (DecimalFormat)NumberFormat.getPercentInstance();
    private final DecimalFormat m_nFormat = (DecimalFormat)NumberFormat.getInstance();
    final int m_numeratorAggregateID;
    private final int m_scale;

    public Comparator comparator()
    {
        return m_comparator;
    }

    public void format(IItem iitem, StringBuffer stringbuffer)
    {
        double d = (double)iitem.getAggregate(m_numeratorAggregateID) / (double)m_scale;
        int k = iitem.getAggregate(m_denominatorAggregateID);
        int i = stringbuffer.length();
        int l;
        if (k == 0)
        {
            m_format.format(1.0D, stringbuffer, m_fieldPosition);
        } else
        {
            m_format.format(d / (double)k, stringbuffer, m_fieldPosition);
        }
        l = Math.max(1, (5 - stringbuffer.length()) + i);
        for (int j = 0; j < l; j++)
        {
            stringbuffer.append(' ');
        }

        stringbuffer.append('(');
        m_nFormat.format(d, stringbuffer, m_fieldPosition);
        stringbuffer.append('/');
        stringbuffer.append(k);
        stringbuffer.append(')');
    }

    public boolean passes(IItem iitem, int i)
    {
        int j = iitem.getAggregate(m_numeratorAggregateID);
        int k = iitem.getAggregate(m_denominatorAggregateID);
        return (double)j * 100D >= (double)k * (double)m_scale * (double)i;
    }

    FractionComparator(String s, int i, int j, int k, int l)
    {
        super(s);
        m_numeratorAggregateID = i;
        m_denominatorAggregateID = j;
        m_scale = k;
        m_format.setMaximumFractionDigits(0);
        m_nFormat.setGroupingUsed(false);
        m_nFormat.setMaximumFractionDigits(l);
    }
}
