// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Supplier, Suppliers

static class delegate
    implements Supplier, Serializable
{

    private static final long serialVersionUID = 0L;
    final Supplier _flddelegate;
    volatile transient boolean initialized;
    transient Object value;

    public Object get()
    {
        if (initialized) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (initialized)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        obj = _flddelegate.get();
        value = obj;
        initialized = true;
        this;
        JVM INSTR monitorexit ;
        return obj;
        this;
        JVM INSTR monitorexit ;
_L2:
        return value;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(_flddelegate));
        return (new StringBuilder(s.length() + 19)).append("Suppliers.memoize(").append(s).append(")").toString();
    }

    (Supplier supplier)
    {
        _flddelegate = supplier;
    }
}
