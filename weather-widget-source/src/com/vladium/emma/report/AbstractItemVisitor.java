// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;


// Referenced classes of package com.vladium.emma.report:
//            IItemVisitor, AllItem, ClassItem, MethodItem, 
//            PackageItem, SrcFileItem

public abstract class AbstractItemVisitor
    implements IItemVisitor
{

    public AbstractItemVisitor()
    {
    }

    public Object visit(AllItem allitem, Object obj)
    {
        return obj;
    }

    public Object visit(ClassItem classitem, Object obj)
    {
        return obj;
    }

    public Object visit(MethodItem methoditem, Object obj)
    {
        return obj;
    }

    public Object visit(PackageItem packageitem, Object obj)
    {
        return obj;
    }

    public Object visit(SrcFileItem srcfileitem, Object obj)
    {
        return obj;
    }
}
