// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.Logger;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzs, zzaf, zzy

public class zzae
{

    private static volatile Logger zzMk;

    public static Logger getLogger()
    {
        return zzMk;
    }

    public static void setLogger(Logger logger)
    {
        zzMk = logger;
    }

    public static boolean zzL(int i)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (getLogger() != null)
        {
            flag = flag1;
            if (getLogger().getLogLevel() <= i)
            {
                flag = true;
            }
        }
        return flag;
    }

    public static void zzaA(String s)
    {
        zzaf zzaf1 = zzaf.zzkc();
        if (zzaf1 == null) goto _L2; else goto _L1
_L1:
        zzaf1.zzaV(s);
_L4:
        Logger logger = zzMk;
        if (logger != null)
        {
            logger.info(s);
        }
        return;
_L2:
        if (zzL(1))
        {
            Log.i((String)zzy.zzLb.get(), s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void zzaB(String s)
    {
        zzaf zzaf1 = zzaf.zzkc();
        if (zzaf1 == null) goto _L2; else goto _L1
_L1:
        zzaf1.zzaT(s);
_L4:
        Logger logger = zzMk;
        if (logger != null)
        {
            logger.verbose(s);
        }
        return;
_L2:
        if (zzL(0))
        {
            Log.v((String)zzy.zzLb.get(), s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void zzaC(String s)
    {
        zzaf zzaf1 = zzaf.zzkc();
        if (zzaf1 == null) goto _L2; else goto _L1
_L1:
        zzaf1.zzaW(s);
_L4:
        Logger logger = zzMk;
        if (logger != null)
        {
            logger.warn(s);
        }
        return;
_L2:
        if (zzL(2))
        {
            Log.w((String)zzy.zzLb.get(), s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void zzf(String s, Object obj)
    {
        zzaf zzaf1 = zzaf.zzkc();
        if (zzaf1 == null) goto _L2; else goto _L1
_L1:
        zzaf1.zze(s, obj);
_L4:
        obj = zzMk;
        if (obj != null)
        {
            ((Logger) (obj)).error(s);
        }
        return;
_L2:
        if (zzL(3))
        {
            if (obj != null)
            {
                obj = (new StringBuilder()).append(s).append(":").append(obj).toString();
            } else
            {
                obj = s;
            }
            Log.e((String)zzy.zzLb.get(), ((String) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        setLogger(new zzs());
    }
}
