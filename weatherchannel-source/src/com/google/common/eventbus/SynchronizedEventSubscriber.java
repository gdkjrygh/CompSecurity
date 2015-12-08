// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.eventbus;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.google.common.eventbus:
//            EventSubscriber

final class SynchronizedEventSubscriber extends EventSubscriber
{

    public SynchronizedEventSubscriber(Object obj, Method method)
    {
        super(obj, method);
    }

    public void handleEvent(Object obj)
        throws InvocationTargetException
    {
        this;
        JVM INSTR monitorenter ;
        super.handleEvent(obj);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }
}
