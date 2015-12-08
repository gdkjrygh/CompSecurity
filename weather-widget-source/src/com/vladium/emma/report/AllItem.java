// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;


// Referenced classes of package com.vladium.emma.report:
//            Item, IItemVisitor, IItemMetadata

public final class AllItem extends Item
{

    private static final Item.ItemMetadata METADATA = new Item.ItemMetadata(0, "all", 31L);

    public AllItem()
    {
        super(null);
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
        return "all classes";
    }

}
