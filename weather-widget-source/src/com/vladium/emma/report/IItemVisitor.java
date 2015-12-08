// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;


// Referenced classes of package com.vladium.emma.report:
//            AllItem, ClassItem, MethodItem, PackageItem, 
//            SrcFileItem

public interface IItemVisitor
{

    public abstract Object visit(AllItem allitem, Object obj);

    public abstract Object visit(ClassItem classitem, Object obj);

    public abstract Object visit(MethodItem methoditem, Object obj);

    public abstract Object visit(PackageItem packageitem, Object obj);

    public abstract Object visit(SrcFileItem srcfileitem, Object obj);
}
