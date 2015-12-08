// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;


// Referenced classes of package com.vladium.util:
//            IntObjectMap

public abstract class IntegerFactory
{

    private static final IntObjectMap s_values = new IntObjectMap(16661);

    private IntegerFactory()
    {
    }

    public static Integer getInteger(int i)
    {
        IntObjectMap intobjectmap = s_values;
        intobjectmap;
        JVM INSTR monitorenter ;
        Object obj = s_values.get(i);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        obj = new Integer(i);
        s_values.put(i, obj);
        intobjectmap;
        JVM INSTR monitorexit ;
        return ((Integer) (obj));
        obj = (Integer)obj;
        intobjectmap;
        JVM INSTR monitorexit ;
        return ((Integer) (obj));
        Exception exception;
        exception;
        intobjectmap;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
