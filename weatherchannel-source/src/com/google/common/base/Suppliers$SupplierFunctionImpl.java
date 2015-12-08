// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Suppliers, Supplier

private static final class  extends Enum
    implements 
{

    private static final INSTANCE $VALUES[];
    public static final INSTANCE INSTANCE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/common/base/Suppliers$SupplierFunctionImpl, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public Object apply(Supplier supplier)
    {
        return supplier.get();
    }

    public volatile Object apply(Object obj)
    {
        return apply((Supplier)obj);
    }

    public String toString()
    {
        return "Suppliers.supplierFunction()";
    }

    static 
    {
        INSTANCE = new <init>("INSTANCE", 0);
        $VALUES = (new .VALUES[] {
            INSTANCE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
