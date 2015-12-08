// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.rt;

import com.vladium.emma.data.ICoverageData;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.StringTokenizer;

// Referenced classes of package com.vladium.emma.rt:
//            RTCoverageDataPersister

final class RTExitHook
    implements Runnable
{

    private static final String CLOSURE_RESOURCE = "RTExitHook.closure";
    private Class m_RT;
    private ICoverageData m_cdata;
    private final boolean m_merge;
    private final File m_outFile;

    RTExitHook(Class class1, ICoverageData icoveragedata, File file, boolean flag)
    {
        m_RT = class1;
        m_cdata = icoveragedata;
        m_outFile = file;
        m_merge = flag;
    }

    public static void createClassLoaderClosure()
    {
        Object obj;
        Object obj2;
        obj = null;
        obj2 = null;
        Object obj1 = com/vladium/emma/rt/RTExitHook.getResourceAsStream("RTExitHook.closure");
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj2 = obj1;
        obj = obj1;
        Properties properties = new Properties();
        try
        {
            properties.load(((InputStream) (obj1)));
            break MISSING_BLOCK_LABEL_33;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2) { }
        finally
        {
            obj = obj1;
            obj1 = obj2;
        }
          goto _L3
_L2:
        obj2 = obj1;
        obj = obj1;
        try
        {
            throw new Error("packaging failure: closure resource not found");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj1 = obj2;
        }
        finally { }
        obj2 = obj;
_L3:
        obj = obj1;
        ((Exception) (obj2)).printStackTrace(System.out);
        obj = obj1;
        throw new Error((new StringBuilder()).append("packaging failure: ").append(((Exception) (obj2)).toString()).toString());
_L4:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw obj1;
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        obj1 = properties.getProperty("closure");
        if (obj1 == null)
        {
            throw new Error("packaging failure: no closure mapping");
        }
        obj = com/vladium/emma/rt/RTExitHook.getClassLoader();
        for (obj2 = new StringTokenizer(((String) (obj1)), ","); ((StringTokenizer) (obj2)).hasMoreTokens();)
        {
            obj1 = ((StringTokenizer) (obj2)).nextToken();
            try
            {
                Class.forName(((String) (obj1)), true, ((ClassLoader) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new Error((new StringBuilder()).append("packaging failure: class [").append(((String) (obj1))).append("] not found {").append(((Exception) (obj)).toString()).append("}").toString());
            }
        }

        return;
        if (true) goto _L4; else goto _L3
    }

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        if (m_cdata != null)
        {
            RTCoverageDataPersister.dumpCoverageData(m_cdata, true, m_outFile, m_merge);
            m_RT = null;
            m_cdata = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
