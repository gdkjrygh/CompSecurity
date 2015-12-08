// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;

// Referenced classes of package com.google.common.util.concurrent:
//            Striped

private static class <init> extends ed
{

    private final Object array[];

    public Object getAt(int i)
    {
        return array[i];
    }

    public int size()
    {
        return array.length;
    }

    private ed(int i, Supplier supplier)
    {
        super(i);
        boolean flag;
        if (i <= 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Stripes must be <= 2^30)");
        array = new Object[mask + 1];
        for (i = 0; i < array.length; i++)
        {
            array[i] = supplier.get();
        }

    }

    array(int i, Supplier supplier, array array1)
    {
        this(i, supplier);
    }
}
