// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableTable, Lists, RegularImmutableTable, SingletonImmutableTable, 
//            Iterables, Table

public static final class 
{

    private final List cells = Lists.newArrayList();
    private Comparator columnComparator;
    private Comparator rowComparator;

    public ImmutableTable build()
    {
        switch (cells.size())
        {
        default:
            return RegularImmutableTable.forCells(cells, rowComparator, columnComparator);

        case 0: // '\0'
            return ImmutableTable.of();

        case 1: // '\001'
            return new SingletonImmutableTable(()Iterables.getOnlyElement(cells));
        }
    }

    public cells orderColumnsBy(Comparator comparator)
    {
        columnComparator = (Comparator)Preconditions.checkNotNull(comparator);
        return this;
    }

    public  orderRowsBy(Comparator comparator)
    {
        rowComparator = (Comparator)Preconditions.checkNotNull(comparator);
        return this;
    }

    public  put( )
    {
        if ( instanceof )
        {
            Preconditions.checkNotNull(.());
            Preconditions.checkNotNull(.());
            Preconditions.checkNotNull(.());
            cells.add();
            return this;
        } else
        {
            put(.put(), .(), .());
            return this;
        }
    }

    public  put(Object obj, Object obj1, Object obj2)
    {
        cells.add(ImmutableTable.cellOf(obj, obj1, obj2));
        return this;
    }

    public cells putAll(Table table)
    {
        for (table = table.cellSet().iterator(); table.hasNext(); put((put)table.next())) { }
        return this;
    }

    public ()
    {
    }
}
