// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Function, Functions, Preconditions, Supplier

private static class <init>
    implements Function, Serializable
{

    private static final long serialVersionUID = 0L;
    private final Supplier supplier;

    public Object apply(Object obj)
    {
        return supplier.get();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof supplier)
        {
            obj = (supplier)obj;
            return supplier.equals(((supplier) (obj)).supplier);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return supplier.hashCode();
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(supplier));
        return (new StringBuilder(s.length() + 13)).append("forSupplier(").append(s).append(")").toString();
    }

    private (Supplier supplier1)
    {
        supplier = (Supplier)Preconditions.checkNotNull(supplier1);
    }

    supplier(Supplier supplier1, supplier supplier2)
    {
        this(supplier1);
    }
}
