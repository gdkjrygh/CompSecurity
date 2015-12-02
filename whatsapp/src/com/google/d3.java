// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.LinkedHashMap;

// Referenced classes of package com.google:
//            c3

class d3
{

    private int a;
    private LinkedHashMap b;

    public d3(int i)
    {
        a = i;
        b = new c3(this, (i * 4) / 3 + 1, 0.75F, true);
    }

    static int a(d3 d3_1)
    {
        return d3_1.a;
    }

    public Object a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        obj = b.get(obj);
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        throw obj;
    }

    public void a(Object obj, Object obj1)
    {
        this;
        JVM INSTR monitorenter ;
        b.put(obj, obj1);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }
}
