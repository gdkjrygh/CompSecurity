// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;


// Referenced classes of package com.vladium.emma.report:
//            Item, IItemVisitor, IItem, IItemMetadata

public final class PackageItem extends Item
{

    private static final Item.ItemMetadata METADATA = new Item.ItemMetadata(1, "package", 31L);
    private final String m_VMname;
    private final String m_name;

    public PackageItem(IItem iitem, String s, String s1)
    {
        super(iitem);
        m_name = s;
        m_VMname = s1;
    }

    public static IItemMetadata getTypeMetadata()
    {
        return METADATA;
    }

    public void accept(IItemVisitor iitemvisitor, Object obj)
    {
        iitemvisitor.visit(this, obj);
    }

    public volatile int getAggregate(int i)
    {
        return super.getAggregate(i);
    }

    public final IItemMetadata getMetadata()
    {
        return METADATA;
    }

    public String getName()
    {
        return m_name;
    }

    public String getVMName()
    {
        return m_VMname;
    }

}
