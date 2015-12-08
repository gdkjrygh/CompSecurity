// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Supplier, Suppliers, Function, Objects

private static class supplier
    implements Supplier, Serializable
{

    private static final long serialVersionUID = 0L;
    final Function function;
    final Supplier supplier;

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof supplier)
        {
            obj = (supplier)obj;
            flag = flag1;
            if (function.equals(((function) (obj)).function))
            {
                flag = flag1;
                if (supplier.equals(((supplier) (obj)).supplier))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public Object get()
    {
        return function.apply(supplier.get());
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            function, supplier
        });
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(function));
        String s1 = String.valueOf(String.valueOf(supplier));
        return (new StringBuilder(s.length() + 21 + s1.length())).append("Suppliers.compose(").append(s).append(", ").append(s1).append(")").toString();
    }

    (Function function1, Supplier supplier1)
    {
        function = function1;
        supplier = supplier1;
    }
}
