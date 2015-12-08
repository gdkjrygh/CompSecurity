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

    private static volatile Logger zzOk;

    public static Logger getLogger()
    {
        return zzOk;
    }

    public static void setLogger(Logger logger)
    {
        zzOk = logger;
    }

    public static void v(String s)
    {
        zzaf zzaf1 = zzaf.zzkq();
        if (zzaf1 == null) goto _L2; else goto _L1
_L1:
        zzaf1.zzaY(s);
_L4:
        Logger logger = zzOk;
        if (logger != null)
        {
            logger.verbose(s);
        }
        return;
_L2:
        if (zzM(0))
        {
            Log.v((String)zzy.zzNa.get(), s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean zzM(int i)
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

    public static void zzaD(String s)
    {
        zzaf zzaf1 = zzaf.zzkq();
        if (zzaf1 == null) goto _L2; else goto _L1
_L1:
        zzaf1.zzba(s);
_L4:
        Logger logger = zzOk;
        if (logger != null)
        {
            logger.info(s);
        }
        return;
_L2:
        if (zzM(1))
        {
            Log.i((String)zzy.zzNa.get(), s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void zzaE(String s)
    {
        zzaf zzaf1 = zzaf.zzkq();
        if (zzaf1 == null) goto _L2; else goto _L1
_L1:
        zzaf1.zzbb(s);
_L4:
        Logger logger = zzOk;
        if (logger != null)
        {
            logger.warn(s);
        }
        return;
_L2:
        if (zzM(2))
        {
            Log.w((String)zzy.zzNa.get(), s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void zzf(String s, Object obj)
    {
        zzaf zzaf1 = zzaf.zzkq();
        if (zzaf1 == null) goto _L2; else goto _L1
_L1:
        zzaf1.zze(s, obj);
_L4:
        obj = zzOk;
        if (obj != null)
        {
            ((Logger) (obj)).error(s);
        }
        return;
_L2:
        if (zzM(3))
        {
            if (obj != null)
            {
                obj = (new StringBuilder()).append(s).append(":").append(obj).toString();
            } else
            {
                obj = s;
            }
            Log.e((String)zzy.zzNa.get(), ((String) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        setLogger(new zzs());
    }
}
