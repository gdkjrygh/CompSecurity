// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class iiy
    implements icl
{

    private Set a;
    private volatile boolean b;

    public iiy()
    {
    }

    private static void a(Collection collection)
    {
        if (collection == null)
        {
            return;
        }
        Object obj = null;
        Iterator iterator = collection.iterator();
        collection = obj;
        while (iterator.hasNext()) 
        {
            icl icl1 = (icl)iterator.next();
            try
            {
                icl1.b();
            }
            catch (Throwable throwable)
            {
                if (collection == null)
                {
                    collection = new ArrayList();
                }
                collection.add(throwable);
            }
        }
        icw.a(collection);
    }

    public final void a()
    {
        if (b)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        this;
        JVM INSTR monitorenter ;
        if (!b && a != null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Set set;
        set = a;
        a = null;
        this;
        JVM INSTR monitorexit ;
        a(((Collection) (set)));
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(icl icl1)
    {
        if (icl1.c())
        {
            return;
        }
        if (b) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (b)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        if (a == null)
        {
            a = new HashSet(4);
        }
        a.add(icl1);
        this;
        JVM INSTR monitorexit ;
        return;
        icl1;
        this;
        JVM INSTR monitorexit ;
        throw icl1;
        this;
        JVM INSTR monitorexit ;
_L2:
        icl1.b();
        return;
    }

    public final void b()
    {
        if (b)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        this;
        JVM INSTR monitorenter ;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Set set;
        b = true;
        set = a;
        a = null;
        this;
        JVM INSTR monitorexit ;
        a(set);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(icl icl1)
    {
        if (b)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        this;
        JVM INSTR monitorenter ;
        if (!b && a != null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        boolean flag = a.remove(icl1);
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            icl1.b();
            return;
        }
        break MISSING_BLOCK_LABEL_55;
        icl1;
        this;
        JVM INSTR monitorexit ;
        throw icl1;
    }

    public final boolean c()
    {
        return b;
    }

    public final boolean d()
    {
        boolean flag1;
        flag1 = false;
        if (b)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        this;
        JVM INSTR monitorenter ;
        boolean flag = flag1;
        if (b)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        flag = flag1;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        flag = flag1;
        if (!a.isEmpty())
        {
            flag = true;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        return false;
    }
}
