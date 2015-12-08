// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.rt;

import com.vladium.emma.EMMAProperties;
import com.vladium.emma.IAppConstants;
import com.vladium.emma.data.DataFactory;
import com.vladium.emma.data.ICoverageData;
import com.vladium.logging.Logger;
import com.vladium.util.IProperties;
import com.vladium.util.Property;
import com.vladium.util.exit.ExitHookManager;
import java.io.File;

// Referenced classes of package com.vladium.emma.rt:
//            RTSettings, RTCoverageDataPersister, RTExitHook

public abstract class RT
    implements IAppConstants
{

    private static final boolean DEBUG = false;
    private static final ExitHookManager EXIT_HOOK_MANAGER;
    private static IProperties s_appProperties;
    private static ICoverageData s_cdata;
    private static Runnable s_exitHook;

    private RT()
    {
    }

    public static void dumpCoverageData(File file, boolean flag)
    {
        com/vladium/emma/rt/RT;
        JVM INSTR monitorenter ;
        if (file == null) goto _L2; else goto _L1
_L1:
        ICoverageData icoveragedata = s_cdata;
        if (!flag) goto _L4; else goto _L3
_L3:
        s_cdata = null;
          goto _L4
_L5:
        RTCoverageDataPersister.dumpCoverageData(icoveragedata, flag, file, getCoverageOutMerge());
        com/vladium/emma/rt/RT;
        JVM INSTR monitorexit ;
        return;
_L2:
        file = getCoverageOutFile();
          goto _L1
_L7:
        flag = false;
          goto _L5
        file;
        throw file;
_L4:
        if (flag) goto _L7; else goto _L6
_L6:
        flag = true;
          goto _L5
    }

    public static void dumpCoverageData(File file, boolean flag, boolean flag1)
    {
        com/vladium/emma/rt/RT;
        JVM INSTR monitorenter ;
        if (file == null) goto _L2; else goto _L1
_L1:
        ICoverageData icoveragedata = s_cdata;
        if (!flag1) goto _L4; else goto _L3
_L3:
        s_cdata = null;
          goto _L4
_L5:
        RTCoverageDataPersister.dumpCoverageData(icoveragedata, flag1, file, flag);
        com/vladium/emma/rt/RT;
        JVM INSTR monitorexit ;
        return;
_L2:
        file = getCoverageOutFile();
          goto _L1
_L7:
        flag1 = false;
          goto _L5
        file;
        throw file;
_L4:
        if (flag1) goto _L7; else goto _L6
_L6:
        flag1 = true;
          goto _L5
    }

    public static IProperties getAppProperties()
    {
        com/vladium/emma/rt/RT;
        JVM INSTR monitorenter ;
        IProperties iproperties = s_appProperties;
        com/vladium/emma/rt/RT;
        JVM INSTR monitorexit ;
        return iproperties;
        Exception exception;
        exception;
        throw exception;
    }

    public static ICoverageData getCoverageData()
    {
        com/vladium/emma/rt/RT;
        JVM INSTR monitorenter ;
        ICoverageData icoveragedata = s_cdata;
        com/vladium/emma/rt/RT;
        JVM INSTR monitorexit ;
        return icoveragedata;
        Exception exception;
        exception;
        throw exception;
    }

    private static File getCoverageOutFile()
    {
        IProperties iproperties = getAppProperties();
        if (iproperties != null)
        {
            return new File(iproperties.getProperty("coverage.out.file", "coverage.ec"));
        } else
        {
            return new File("coverage.ec");
        }
    }

    private static boolean getCoverageOutMerge()
    {
        IProperties iproperties = getAppProperties();
        if (iproperties != null)
        {
            return Property.toBoolean(iproperties.getProperty("coverage.out.merge", EMMAProperties.DEFAULT_COVERAGE_DATA_OUT_MERGE.toString()));
        } else
        {
            return EMMAProperties.DEFAULT_COVERAGE_DATA_OUT_MERGE.booleanValue();
        }
    }

    public static void r(boolean aflag[][], String s, long l)
    {
        ICoverageData icoveragedata = getCoverageData();
        if (icoveragedata != null)
        {
            synchronized (icoveragedata.lock())
            {
                icoveragedata.addClass(aflag, s, l);
            }
            return;
        } else
        {
            return;
        }
        aflag;
        obj;
        JVM INSTR monitorexit ;
        throw aflag;
    }

    public static ICoverageData reset(boolean flag, boolean flag1)
    {
        com/vladium/emma/rt/RT;
        JVM INSTR monitorenter ;
        Object obj2 = com/vladium/emma/rt/RT.getClassLoader();
        Object obj;
        obj = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        obj = ClassLoader.getSystemClassLoader();
        obj2 = null;
        obj = EMMAProperties.getAppProperties(((ClassLoader) (obj)));
_L1:
        s_appProperties = ((IProperties) (obj));
        if (EXIT_HOOK_MANAGER != null && s_exitHook != null)
        {
            EXIT_HOOK_MANAGER.removeExitHook(s_exitHook);
            s_exitHook = null;
        }
        obj = s_cdata;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        obj = DataFactory.newCoverageData();
        s_cdata = ((ICoverageData) (obj));
_L2:
        if (EXIT_HOOK_MANAGER == null || !flag1 || obj == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        obj2 = new RTExitHook(com/vladium/emma/rt/RT, ((ICoverageData) (obj)), getCoverageOutFile(), getCoverageOutMerge());
        RTExitHook.createClassLoaderClosure();
        if (EXIT_HOOK_MANAGER.addExitHook(((Runnable) (obj2))))
        {
            s_exitHook = ((Runnable) (obj2));
        }
        com/vladium/emma/rt/RT;
        JVM INSTR monitorexit ;
        return ((ICoverageData) (obj));
        Object obj1;
        obj1;
        ((Throwable) (obj1)).printStackTrace(System.out);
        obj1 = obj2;
          goto _L1
        obj1;
        throw obj1;
        s_cdata = null;
          goto _L2
    }

    static 
    {
        ExitHookManager exithookmanager = null;
        ExitHookManager exithookmanager1 = ExitHookManager.getSingleton();
        exithookmanager = exithookmanager1;
_L1:
        EXIT_HOOK_MANAGER = exithookmanager;
        Throwable throwable;
        if (RTSettings.isStandaloneMode())
        {
            reset(true, true);
            Logger logger = Logger.getLogger();
            if (logger.atINFO())
            {
                logger.info("collecting runtime coverage data ...");
            }
            return;
        } else
        {
            reset(false, false);
        }
        throwable;
        throwable.printStackTrace(System.out);
          goto _L1
    }
}
