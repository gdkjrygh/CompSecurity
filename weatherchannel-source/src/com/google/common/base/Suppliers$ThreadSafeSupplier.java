// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Supplier, Suppliers

private static class delegate
    implements Supplier, Serializable
{

    private static final long serialVersionUID = 0L;
    final Supplier _flddelegate;

    public Object get()
    {
        Object obj;
        synchronized (_flddelegate)
        {
            obj = _flddelegate.get();
        }
        return obj;
        exception;
        supplier;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(_flddelegate));
        return (new StringBuilder(s.length() + 32)).append("Suppliers.synchronizedSupplier(").append(s).append(")").toString();
    }

    _cls9(Supplier supplier)
    {
        _flddelegate = supplier;
    }
}
