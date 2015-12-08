// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vladium.emma.report:
//            IItem, IItemMetadata, IItemAttribute, ItemComparator

abstract class Item
    implements IItem
{
    protected static final class ItemMetadata
        implements IItemMetadata
    {

        private final long m_attributeIDs;
        private final int m_typeID;
        private final String m_typeName;

        public long getAttributeIDs()
        {
            return m_attributeIDs;
        }

        public int getTypeID()
        {
            return m_typeID;
        }

        public String getTypeName()
        {
            return m_typeName;
        }

        ItemMetadata(int i, String s, long l)
        {
            m_typeID = i;
            m_typeName = s;
            m_attributeIDs = l;
        }
    }


    protected final int m_aggregates[] = new int[13];
    private final List m_children = new ArrayList();
    protected final IItem m_parent;

    Item(IItem iitem)
    {
        m_parent = iitem;
        for (int i = 0; i < m_aggregates.length; i++)
        {
            m_aggregates[i] = -1;
        }

    }

    protected void addChild(IItem iitem)
    {
        if (iitem == null)
        {
            throw new IllegalArgumentException("null input: item");
        } else
        {
            m_children.add(iitem);
            return;
        }
    }

    public int getAggregate(int i)
    {
        int ai[] = m_aggregates;
        int j = ai[i];
        if (j < 0)
        {
            j = 0;
            for (Iterator iterator = m_children.iterator(); iterator.hasNext();)
            {
                j += ((IItem)iterator.next()).getAggregate(i);
            }

            ai[i] = j;
            return j;
        } else
        {
            return j;
        }
    }

    public final IItemAttribute getAttribute(int i, int j)
    {
        if ((getMetadata().getAttributeIDs() & (long)(1 << i)) == 0L)
        {
            return null;
        } else
        {
            return IItemAttribute.Factory.getAttribute(i, j);
        }
    }

    public final int getChildCount()
    {
        return m_children.size();
    }

    public final Iterator getChildren()
    {
        return m_children.iterator();
    }

    public final Iterator getChildren(ItemComparator itemcomparator)
    {
        if (itemcomparator == null)
        {
            return getChildren();
        } else
        {
            IItem aiitem[] = new IItem[m_children.size()];
            m_children.toArray(aiitem);
            Arrays.sort(aiitem, itemcomparator);
            return Arrays.asList(aiitem).iterator();
        }
    }

    public final IItem getParent()
    {
        return m_parent;
    }
}
