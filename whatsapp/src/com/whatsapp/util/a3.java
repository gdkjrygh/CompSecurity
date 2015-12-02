// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.util.HashMap;

public class a3
{

    private long a;
    private HashMap b;

    public a3(long l)
    {
        a = l;
        b = new HashMap();
    }

    public boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b.isEmpty();
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        Long long1 = (Long)b.get(obj);
        if (long1 == null) goto _L2; else goto _L1
_L1:
        long l;
        long l1;
        long l2;
        l = long1.longValue();
        l1 = a;
        l2 = System.currentTimeMillis();
        if (l + l1 <= l2) goto _L2; else goto _L3
_L3:
        boolean flag = false;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        b.put(obj, Long.valueOf(System.currentTimeMillis()));
        flag = true;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        throw obj;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        b.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean b(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        obj = b.remove(obj);
        boolean flag;
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        throw obj;
    }
}
