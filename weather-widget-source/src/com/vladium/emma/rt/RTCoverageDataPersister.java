// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.rt;

import com.vladium.emma.data.DataFactory;
import com.vladium.emma.data.ICoverageData;
import com.vladium.logging.Logger;
import java.io.File;

abstract class RTCoverageDataPersister
{

    RTCoverageDataPersister()
    {
    }

    static void dumpCoverageData(ICoverageData icoveragedata, boolean flag, File file, boolean flag1)
    {
        if (icoveragedata == null) goto _L2; else goto _L1
_L1:
        Logger logger;
        boolean flag2;
        logger = Logger.getLogger();
        flag2 = logger.atINFO();
        if (!flag2) goto _L4; else goto _L3
_L3:
        long l = System.currentTimeMillis();
_L7:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        icoveragedata = icoveragedata.shallowCopy();
        java/lang/Object;
        JVM INSTR monitorenter ;
        DataFactory.persist(icoveragedata, file, flag1);
        java/lang/Object;
        JVM INSTR monitorexit ;
        if (!flag2) goto _L2; else goto _L5
_L5:
        StringBuilder stringbuilder;
        long l1;
        l1 = System.currentTimeMillis();
        stringbuilder = (new StringBuilder()).append("runtime coverage data ");
        if (flag1)
        {
            icoveragedata = "merged into";
        } else
        {
            icoveragedata = "written to";
        }
        logger.info(stringbuilder.append(icoveragedata).append(" [").append(file.getAbsolutePath()).append("] {in ").append(l1 - l).append(" ms}").toString());
_L2:
        return;
_L4:
        l = 0L;
        if (true) goto _L7; else goto _L6
_L6:
        icoveragedata;
        java/lang/Object;
        JVM INSTR monitorexit ;
        try
        {
            throw icoveragedata;
        }
        // Misplaced declaration of an exception variable
        catch (ICoverageData icoveragedata)
        {
            icoveragedata.printStackTrace();
        }
        throw new RuntimeException((new StringBuilder()).append("EMMA failed to dump coverage data: ").append(icoveragedata.toString()).toString());
    }
}
