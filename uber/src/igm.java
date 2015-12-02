// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class igm
    implements icl
{

    private LinkedList a;
    private volatile boolean b;

    public igm()
    {
    }

    public igm(icl icl1)
    {
        a = new LinkedList();
        a.add(icl1);
    }

    public transient igm(icl aicl[])
    {
        a = new LinkedList(Arrays.asList(aicl));
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
        LinkedList linkedlist1;
        if (b)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        linkedlist1 = a;
        LinkedList linkedlist;
        linkedlist = linkedlist1;
        if (linkedlist1 != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        linkedlist = new LinkedList();
        a = linkedlist;
        linkedlist.add(icl1);
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
        LinkedList linkedlist;
        b = true;
        linkedlist = a;
        a = null;
        this;
        JVM INSTR monitorexit ;
        a(linkedlist);
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
            break MISSING_BLOCK_LABEL_52;
        }
        this;
        JVM INSTR monitorenter ;
        LinkedList linkedlist = a;
        if (!b && linkedlist != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        boolean flag = linkedlist.remove(icl1);
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            icl1.b();
            return;
        }
        break MISSING_BLOCK_LABEL_52;
        icl1;
        this;
        JVM INSTR monitorexit ;
        throw icl1;
    }

    public final boolean c()
    {
        return b;
    }
}
