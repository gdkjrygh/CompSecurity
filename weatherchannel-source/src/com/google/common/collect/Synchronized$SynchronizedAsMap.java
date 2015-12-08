// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Synchronized

private static class nit> extends nit>
{

    private static final long serialVersionUID = 0L;
    transient Set asMapEntrySet;
    transient Collection asMapValues;

    public boolean containsValue(Object obj)
    {
        return values().contains(obj);
    }

    public Set entrySet()
    {
        Set set;
        synchronized (mutex)
        {
            if (asMapEntrySet == null)
            {
                asMapEntrySet = new ntries(_mthdelegate().entrySet(), mutex);
            }
            set = asMapEntrySet;
        }
        return set;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public volatile Object get(Object obj)
    {
        return get(obj);
    }

    public Collection get(Object obj)
    {
        Object obj1 = mutex;
        obj1;
        JVM INSTR monitorenter ;
        obj = (Collection)super.t(obj);
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        obj1;
        JVM INSTR monitorexit ;
        return ((Collection) (obj));
_L2:
        obj = Synchronized.access$400(((Collection) (obj)), mutex);
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Collection values()
    {
        Collection collection;
        synchronized (mutex)
        {
            if (asMapValues == null)
            {
                asMapValues = new alues(_mthdelegate().values(), mutex);
            }
            collection = asMapValues;
        }
        return collection;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    alues(Map map, Object obj)
    {
        super(map, obj);
    }
}
