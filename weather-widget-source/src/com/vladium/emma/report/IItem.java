// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import java.util.Iterator;

// Referenced classes of package com.vladium.emma.report:
//            IItemVisitor, IItemAttribute, ItemComparator, IItemMetadata

public interface IItem
{

    public static final int COVERAGE_BLOCK_COUNT = 0;
    public static final int COVERAGE_BLOCK_INSTR = 2;
    public static final int COVERAGE_CLASS_COUNT = 5;
    public static final int COVERAGE_LINE_COUNT = 1;
    public static final int COVERAGE_LINE_INSTR = 3;
    public static final int COVERAGE_METHOD_COUNT = 4;
    public static final int NUM_OF_AGGREGATES = 13;
    public static final int PRECISION = 100;
    public static final int TOTAL_BLOCK_COUNT = 6;
    public static final int TOTAL_BLOCK_INSTR = 8;
    public static final int TOTAL_CLASS_COUNT = 11;
    public static final int TOTAL_LINE_COUNT = 7;
    public static final int TOTAL_METHOD_COUNT = 10;
    public static final int TOTAL_SRCFILE_COUNT = 12;

    public abstract void accept(IItemVisitor iitemvisitor, Object obj);

    public abstract int getAggregate(int i);

    public abstract IItemAttribute getAttribute(int i, int j);

    public abstract int getChildCount();

    public abstract Iterator getChildren();

    public abstract Iterator getChildren(ItemComparator itemcomparator);

    public abstract IItemMetadata getMetadata();

    public abstract String getName();

    public abstract IItem getParent();
}
