// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.analytics:
//            Logger, p, GoogleAnalytics

public class ae
{

    private static GoogleAnalytics BL;
    private static volatile boolean BM = false;
    private static Logger BN;

    private ae()
    {
    }

    public static void T(String s)
    {
        Logger logger = getLogger();
        if (logger != null)
        {
            logger.error(s);
        }
    }

    public static void V(String s)
    {
        Logger logger = getLogger();
        if (logger != null)
        {
            logger.verbose(s);
        }
    }

    static Logger getLogger()
    {
        int i = y.a.a;
        com/google/android/gms/analytics/ae;
        JVM INSTR monitorenter ;
        Logger logger;
        if (!BM)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        if (BN == null)
        {
            BN = new p();
        }
        logger = BN;
        com/google/android/gms/analytics/ae;
        JVM INSTR monitorexit ;
        return logger;
        if (BL == null)
        {
            BL = GoogleAnalytics.eY();
        }
        if (BL == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        logger = BL.getLogger();
        com/google/android/gms/analytics/ae;
        JVM INSTR monitorexit ;
        return logger;
        Exception exception;
        exception;
        com/google/android/gms/analytics/ae;
        JVM INSTR monitorexit ;
        throw exception;
        com/google/android/gms/analytics/ae;
        JVM INSTR monitorexit ;
        if (jx.a != 0)
        {
            y.a.a = i + 1;
        }
        return null;
    }

}
