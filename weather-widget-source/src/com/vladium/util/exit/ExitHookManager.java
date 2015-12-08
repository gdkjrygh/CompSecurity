// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util.exit;

import com.vladium.util.IJREVersion;
import com.vladium.util.Property;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public abstract class ExitHookManager
    implements IJREVersion
{
    private static final class JRE13ExitHookManager extends ExitHookManager
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

        JRE13ExitHookManager()
        {
        }
    }


    private static ExitHookManager s_singleton;

    protected ExitHookManager()
    {
    }

    public static ExitHookManager getSingleton()
    {
        com/vladium/util/exit/ExitHookManager;
        JVM INSTR monitorenter ;
        ExitHookManager exithookmanager;
        if (s_singleton == null)
        {
            if (!JRE_1_3_PLUS)
            {
                break MISSING_BLOCK_LABEL_34;
            }
            s_singleton = new JRE13ExitHookManager();
        }
        exithookmanager = s_singleton;
        com/vladium/util/exit/ExitHookManager;
        JVM INSTR monitorexit ;
        return exithookmanager;
        throw new UnsupportedOperationException((new StringBuilder()).append("no shutdown hook manager available [JVM: ").append(Property.getSystemFingerprint()).append("]").toString());
        Exception exception;
        exception;
        com/vladium/util/exit/ExitHookManager;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public abstract boolean addExitHook(Runnable runnable);

    public abstract boolean removeExitHook(Runnable runnable);
}
