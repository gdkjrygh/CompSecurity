// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util.exit;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.vladium.util.exit:
//            ExitHookManager

private static final class  extends ExitHookManager
{

    private final Map m_exitThreadMap = new HashMap();

    public boolean addExitHook(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        if (runnable == null) goto _L2; else goto _L1
_L1:
        if (m_exitThreadMap.containsKey(runnable)) goto _L2; else goto _L3
_L3:
        Thread thread = new Thread(runnable, "EMMA shutdown handler thread");
        Runtime.getRuntime().addShutdownHook(thread);
        m_exitThreadMap.put(runnable, thread);
        boolean flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
        runnable;
        System.out.println("exception caught while adding a shutdown hook:");
        runnable.printStackTrace(System.out);
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        runnable;
        throw runnable;
    }

    public boolean removeExitHook(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        if (runnable == null) goto _L2; else goto _L1
_L1:
        Thread thread = (Thread)m_exitThreadMap.get(runnable);
        if (thread == null) goto _L2; else goto _L3
_L3:
        Runtime.getRuntime().removeShutdownHook(thread);
        m_exitThreadMap.remove(runnable);
        boolean flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
        runnable;
        System.out.println("exception caught while removing a shutdown hook:");
        runnable.printStackTrace(System.out);
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        runnable;
        throw runnable;
    }

    ()
    {
    }
}
