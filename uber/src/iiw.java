// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class iiw
    implements icg
{

    final icg a;
    boolean b;
    boolean c;
    List d;
    boolean e;

    public iiw(icg icg1)
    {
        b = true;
        a = icg1;
    }

    private void a(List list, Object obj)
    {
        boolean flag;
        boolean flag2;
        boolean flag3;
        flag2 = true;
        flag3 = false;
        flag = true;
_L5:
        if (list == null) goto _L2; else goto _L1
_L1:
        for (list = list.iterator(); list.hasNext(); d(list.next())) { }
          goto _L2
        list;
        flag = flag3;
_L6:
        if (flag) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorenter ;
        c = false;
        this;
        JVM INSTR monitorexit ;
_L4:
        throw list;
_L2:
        boolean flag1;
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        d(obj);
        flag1 = false;
        this;
        JVM INSTR monitorenter ;
        list = d;
        d = null;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        c = false;
        flag1 = flag2;
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        flag = flag1;
          goto _L5
        list;
        flag = false;
_L7:
        flag1 = flag;
        this;
        JVM INSTR monitorexit ;
        throw list;
        list;
          goto _L6
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        list;
        flag = flag1;
          goto _L7
    }

    private void d(Object obj)
    {
        if (obj != null)
        {
            idv.a(a, obj);
        }
    }

    public final void a()
    {
        a.a();
    }

    public final void a(Object obj)
    {
        a.a(obj);
    }

    public final void a(Throwable throwable)
    {
        a.a(throwable);
    }

    protected final void b(Object obj)
    {
        if (e)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        this;
        JVM INSTR monitorenter ;
        b = false;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (d == null)
        {
            d = new ArrayList();
        }
        d.add(obj);
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        e = true;
        idv.a(a, obj);
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    protected final void c(Object obj)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (b && !c)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        b = false;
        if (obj != null)
        {
            flag = true;
        }
        c = flag;
        this;
        JVM INSTR monitorexit ;
        if (obj != null)
        {
            a(null, obj);
            return;
        } else
        {
            return;
        }
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }
}
